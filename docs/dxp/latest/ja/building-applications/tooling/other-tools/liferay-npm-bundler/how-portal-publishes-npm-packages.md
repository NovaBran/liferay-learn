# バンドラーがnpmパッケージを公開する方法

指定された [構造](./the-structure-of-osgi-bundles-containing-npm-packages.md)でOSGiバンドルをデプロイすると、そのモジュールは正規URLを通じて使用できるようになります。 解決されたモジュールをわかりやすく説明するために、以下のサンプル構造は、liferay-npm-bundler 1.xが生成する標準構造です。 2.xバージョンが生成する名前空間付きパッケージはありません。 以下で説明するように、liferay-npm-bundler 2.0は、この重複除外メカニズムをオーバーライドして、独立した依存関係とインポートを実装します。

- `my-bundle/`
    - `META-INF/`
        - `リソース/`
            - `package.json`
                - name: my-bundle-package
                - バージョン：1.0.0
                - main: lib/index
                - 依存関係:
                    - isarray：2.0.0
                    - isobject: 2.1.0
                - ...
            - `lib/`
                - `index.js`
                - ...
            - ...
            - `node_modules/`
                - `isobject@2.1.0/`
                    - `package.json`
                        - name: isobject
                        - バージョン：2.1.0
                        - main: lib/index
                        - 依存関係:
                            - isarray: 1.0.0
                        - ...
                    - ...
                - `isarray@1.0.0/`
                    - `package.json`
                        - name: isarray
                        - バージョン：1.0.0
                        - ...
                    - ...
                - `isarray@2.0.0/`
                    - `package.json`
                        - name: isarray
                        - バージョン：2.0.0
                        - ...
                    - ...

上記のサンプルOSGiバンドルをデプロイすると、以下のURLが使用可能になります（モジュールごとに1つ）。

* [http://localhost/o/js/module/598/my-bundle-package@1.0.0/lib/index.js](http://localhost/o/js/module/598/my-bundle-package@1.0.0/lib/index.js)

* [http://localhost/o/js/module/598/isobject@2.1.0/index.js](http://localhost/o/js/module/598/isobject@2.1.0/index.js)

* [http://localhost/o/js/module/598/isarray@1.0.0/index.js](http://localhost/o/js/module/598/isarray@1.0.0/index.js)

* [http://localhost/o/js/module/598/isarray@2.0.0/index.js](http://localhost/o/js/module/598/isarray@2.0.0/index.js)

```{note}
OSGiバンドルID（598）は異なる場合があります。
```

<a name="package-de-duplication" />

## パッケージの重複除外

2つ以上のOSGiモジュールが同じパッケージとバージョンの複数のコピーをエクスポートする可能性があるため、Liferayポータルは、 **解決モジュール** と呼ばれる新しい概念を使用して、このような競合を重複排除する必要があります。

解決されたモジュールは、同じパッケージとバージョンのコピーが複数存在する場合に、Liferayポータルのフロントエンドにエクスポートされる参照パッケージです。 パッケージの同じコピーをエクスポートするいくつかのバンドルの1つからランダムに参照されます。

上記の例を使用すると、異なるOSGiバンドル内の同じモジュールを参照する正規URLのグループごとに、解決されたモジュールの別の正規URLがあります。 構造例には、以下に示す解決済みのモジュールURLがあります。

* [http://localhost/o/js/resolved-module/my-bundle-package@1.0.0/lib/index.js](http://localhost/o/js/resolved-module/my-bundle-package@1.0.0/lib/index.js)

* [http://localhost/o/js/resolved-module/my-bundle-package$isobject@2.1.0/index.js](http://localhost/o/js/resolved-module/my-bundle-package$isobject@2.1.0/index.js)

* [http://localhost/o/js/resolved-module/my-bundle-package$isarray@1.0.0/index.js](http://localhost/o/js/resolved-module/my-bundle-package$isarray@1.0.0/index.js)

* [http://localhost/o/js/resolved-module/my-bundle-package$isarray@2.0.0/index.js](http://localhost/o/js/resolved-module/my-bundle-package$isarray@2.0.0/index.js)

```{note}
OSGiバンドルID（例では598）は削除され、モジュールは「resolved-module」に置き換えられます。
```

次に、バンドラー（バージョン2.0.0以降）がパッケージの依存関係を分離する方法を学びます。 この変更が行われた理由の詳細については、[What Changed Between liferay-npm-bundler 1.x and 2.x](./changes-between-bundler-1.x-and-2.x.md)参照してください。

<a name="isolated-package-dependencies" />

## 分離されたパッケージの依存関係

liferay-npm-bundler 2.xで生成された典型的なOSGiバンドル構造を以下に示します。

- `my-bundle/`
    - `META-INF/`
        - `リソース/`
            - `package.json`
                - name: my-bundle-package
                - バージョン：1.0.0
                - main: lib/index
                - 依存関係:
                    - my-bundle-package$isarray: 2.0.0
                    - my-bundle-package$isobject: 2.1.0
                - ...
            - `lib/`
                - `index.js`
                - ...
            - ...
            - `node_modules/`
                - `my-bundle-package$isobject@2.1.0/`
                    - `package.json`
                        - name: my-bundle-package$isobject
                        - バージョン：2.1.0
                        - main: lib/index
                        - 依存関係:
                            - my-bundle-package$isarray: 1.0.0
                        - ...
                    - ...
                - `my-bundle-package$isarray@1.0.0/`
                    - `package.json`
                        - name: my-bundle-package$isarray
                        - バージョン：1.0.0
                        - ...
                    - ...
                - `my-bundle-package$isarray@2.0.0/`
                    - `package.json`
                        - name: my-bundle-package$isarray
                        - バージョン：2.0.0
                        - ...
                    - ...

各パッケージの依存関係は、バンドルの名前（例の構造では`my-bundle-package $`）で名前空間になっていることに注意してください。 これにより、各プロジェクトは独自の依存関係をロードし、同じパッケージをエクスポートするプロジェクトとの潜在的な競合を回避できます。 たとえば、以下の2つのウィジェットプロジェクトについて考えてみます。

- `my-widget`
    - package.json
        - 依存関係:
            - a-library 1.0.0
            - a-helper 1.0.0
    - node_modules
        - a-library
            - バージョン：1.0.0
            - 依存関係:
                - a-helper ^1.0.0
        - a-helper
            - バージョン：1.0.0

- `another-widget`
    - package.json
        - 依存関係:
            - a-library 1.0.0
            - a-helper 1.2.0
    - node_modules
        - a-library
            - バージョン：1.0.0
            - 依存関係:
                - a-helper ^1.0.0
        - a-helper
            - バージョン：1.2.0

この例では、 `a-library` はバージョン1.0.0以降の `a-helper` 依存しています（依存関係のキャレット^式に注意してください）。 バンドラはバンドルの名前をモジュールに先行することによって分離された依存関係を実装します。そのため、`my-widget`は1.0.0で`a-helper`を取得します。 `another-widget`は1.2.0で`a-helper`を取得します。

依存関係の分離は、バンドル間の衝突を回避するだけでなく、開発時に各ウィジェットが `node_modules` フォルダー内にあったものを取得するため、ピアの依存関係を確定的に動作させます。

名前空間モジュールがバンドルの依存関係を分離して衝突を回避する方法を理解したので、次に重複除外について学習できます。

<a name="de-duplication-through-importing" />

## インポートによる重複除外

分離された依存関係は便利ですが、モジュール間で同じパッケージを共有する方が有益な場合があります。 これを行うために、liferay-npm-bundlerは、独自のパッケージを使用する代わりに、外部OSGiバンドルからパッケージをインポートできます。 これで、共有された依存関係を1つのプロジェクトに配置して、残りのプロジェクトから参照できます。

例えば、3つのウィジェット、`my-toolbar`、`my-menu`、および`my-content`の場合、サイトのホームページを作成します。 これらのウィジェットは、偽物に依存しますが、素晴らしいUIコンポーネント(WUI)フレームワークです。 この非常に制限されたフレームワークには、3つのパッケージしか含まれていません。

1.  `component-core`
1.  `ボタン`
1.  `textfield`

バンドラーはデフォルトでウィジェットの名前を使用して各依存パッケージに名前空間を付けるので、ページ上のWUIパッケージの名前空間付きコピーが3つになります。 これはあなたが望むものではありません。 それらは同じパッケージを共有するため、WUIパッケージを含む4番目のバンドルを作成し、3つのウィジェットにWUIパッケージをインポートできます。 これにより、以下の構造になります。

- `my-toolbar/`
    - `.npmbundlerrc`
        - 構成：
            - インポート:
                - wui-provider:
                    - component-core: ^1.0.0
                    - button: ^1.0.0
                    - textfield: ^1.0.0
- `my-menu/`
    - `.npmbundlerrc`
        - 構成：
            - インポート:
                - wui-provider:
                    - component-core: ^1.0.0
                    - button: ^1.0.0
                    - textfield: ^1.0.0
- `my-content/`
    - `.npmbundlerrc`
        - 構成：
            - インポート:
                - wui-provider:
                    - component-core: ^1.0.0
                    - button: ^1.0.0
                    - textfield: ^1.0.0
- `wui-provider/`
    - `.package.json`
        - name: wui-provider
        - 依存関係:
            - component-core: 1.0.0
            - button: 1.0.0
            - textfield: 1.0.0

バンドラーは、特定のパッケージの名前空間を切り替えて、外部バンドルを指すようにします。 `my-toolbar` ウィジェットに次のコードがあるとします。

```javascript
var Button = require('button');
```

デフォルトでは、別のバンドルからインポートされない場合、bundler 2.xはこれを次のように変換します。

```javascript
var Button = require('my-toolbar$button');
```

ただし、 `ボタン` は `wui-provider`からインポートされるため、代わりに以下の値に変更されます。

```javascript
var Button = require('wui-provider$button');
```

また、ローダーが正しいバージョンを見つけることができるように、バージョン `^ 1.0.0` `wui-provider$button` への依存関係が `my-toolbar`の `package.json` ファイルに含まれています。 必要なのはそれだけです。 実行時に `wui-provider$button` が必要になると、コードは `my-toolbar`から実行された場合でも、 `wui-provider`のコンテキストにジャンプし、そこからサブ依存関係をロードします。 これが機能するのは、ご想像のとおり、 `wui-provider`のモジュールにも名前空間があり、そこからモジュールをロードすると、 `wui-provider $` 接頭辞付きモジュールがずっと必要になるためです。

<a name="strategies-when-importing-packages" />

## パッケージをインポートするときの戦略

インポートによる重複除外は強力なツールですが、エラーが発生しないようにバージョン管理戦略を設計する必要があります。

最初に、インポートされた依存関係を `.npmbundlerrc` ファイルでのみ宣言するか、 `package.json` でも宣言するかを決定する必要があります。 インポートされた依存関係を `.npmbundlerrc` リストするだけで十分です。 `node_modules` フォルダーにない場合でも、ローダーは実行時にそれを見つけます。 インポートされた依存関係を `.npmbundlerrc` リストするだけで十分です。 `node_modules` フォルダーに存在しない場合でも、ローダーは実行時にそれを見つけます。 標準オペレーティングシステムでのダイナミックリンクサポートの経験がある場合は、DLLまたは共有オブジェクトと考えてください。

テストに依存関係を使用する場合、またはコンパイルに必要なタイプが含まれている場合（Typescriptなど）、依存関係を `node_modules` もインストールする必要がある場合があります。 その場合は、 `package.json`の `依存関係` または `devDependencies` セクションに配置できます。 それらを後者の下にリストすると、liferay-npm-bundlerによって出力バンドルから自動的に除外されます。 それ以外の場合は、 `.npmbundlerrc` ファイルでそれらを除外して、出力に重複して表示されないようにする必要があります。

依存関係を両方とも `package.json` および `.npmbundlerrc`にリストする場合は、バージョンの同期を保つ方法を決定します。 両方のファイルで同じバージョンの制約を使用することをお勧めしますが、必要な場合は使用しないこともできます。 たとえば、実行時にテストを実行するために、依存関係の1つを別のバンドルからインポートするとします。 バージョンの制約^ 1.5.1を使用しているとします。 バージョン >=1.5.1 と <2.0.0 (^1.5.1 の意味) でコードをテストした場合、ランタイム中に互換性のあるバージョンが得られることが望ましいです。そのため、 `.npmbundlerrc` でも^1.5.1で依存関係を宣言します。

ただし、より緩やかにしたい場合があり、^ 1.5.1に対して開発している場合でも、実行時に低いバージョン（1.4.0など）を取得する必要がある場合があります。 その場合、`.npmbundlerc`の`package.json`と^1.0.0で^1.5.1 を宣言できます。

最終的には、依存関係をどのように扱うかは、あなた次第です。

1. `package.json` (開発中)
1. `.npmbundlerrc` (実行中)

実行時に依存関係が満たされていることを確認するために、バージョン管理の戦略を選んでください。 
