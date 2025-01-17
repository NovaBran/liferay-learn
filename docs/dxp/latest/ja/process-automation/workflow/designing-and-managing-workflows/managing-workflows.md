# ワークフローの管理

ワークフローフレームワークを使用して、ユーザーはカスタムメイドのワークフロープロセスでアセット公開を管理することができます。 コントロールパネルのワークフロープロセス定義にアクセスする権限を持つユーザーは、新しいワークフロー定義のアップロード、既存の定義の編集、使用されなくなったプロセスの定義の削除ができます。

<a name="workflow-definition-publication-permissions" />

## ワークフロー定義の公開権限

ワークフロー定義を編集または公開する権限を持つユーザーは、ワークフローに [Groovyスクリプト](../../../system-administration/using-the-script-engine/using-the-script-engine.md) を追加できます。 スクリプトエンジンへのアクセスとは、サーバーのJava仮想マシン（JVM）へのアクセスを意味します。 したがって、公開（または編集）の権限を持つユーザーは、Liferay DXPの個別の [仮想インスタンス](../system-administration/../../../system-administration/configuring-liferay/virtual-instances/understanding-virtual-instances.md) に含まれているデータなど、JVMの到達範囲内の任意のデータにアクセスできます。

この広範囲にわたるアクセスのため、ワークフロー定義を作成または編集する権限は、デフォルトの仮想インスタンスの通常の管理者に制限されています。 Liferay DXPのお客様の場合、ユーザー（サイト管理者など）はKaleo DesignerおよびKaleo Form管理アプリケーションにアクセスしてワークフローを編集および公開することもできます。

これらのロールを持つユーザーに、追加の仮想インスタンスでのワークフローパブリケーションアクセスを許可するには、

1. [これらの管理者にアクセスを付与する ](../../../users-and-permissions/roles-and-permissions/understanding-roles-and-permissions.md)を理解していることを確認してください。
1. ［コントロールパネル］&rarr;［システム設定］&rarr;［ワークフロー］&rarr;［ワークフローの定義］へ行きます。
1. **管理者が公開を許可し、編集ワークフロー** を設定するにはチェックボックスにチェックを入れます。

![管理者がワークフロー定義を公開および編集するには、事前に明示的なアクセス権を付与する必要があります。](./managing-workflows/images/06.png)

これは、システムに追加された仮想インスタンスにのみ適用されます。 デフォルトの仮想インスタンスは、［コントロールパネル］ &rarr;［ワークフロー］&rarr;［プロセスビルダー］を介して通常の管理者に、Kaleo Form管理アプリケーションを介してLiferay DXPサブスクライバーに、そのままのワークフローパブリケーションアクセスを提供します。

<a name="uploading-a-new-workflow-definition" />

## 新しいワークフロー定義のアップロード

ワークフロープロセスの定義は、[Liferayで作成](./building-workflows.md)するか、`XML`形式でアップロードできます。 DXPワークフローの定義は`XML`形式で記述されています。 詳細は、[XML ワークフロー定義の作成の概要](../developer-guide/crafting-xml-workflow-definitions.md)を参照してください。

新しい定義をアップロードするには：

1. ［**コントロールパネル**］ &rarr; ［**ワークフロー**］ &rarr; ［**プロセスビルダー**］ へ行きます。
1. ［**新規ワークフロー**］ ボタン（![Add](../../../images/icon-add.png)）をクリックします。
1. 埋め込みワークフローに基づくローカルのXML定義ファイルがある場合は、DXPにアップロードできます。 ［**Source**］ タブをクリックします。
1. 新しい定義の名前を入力します。
1. XMLファイルの内容をコピーしてサンプルコードを上書きするか、 ［**ファイルをインポート**］ をクリックしてファイルをアップロードします。

    ![新しい定義をアップロードして追加する](./managing-workflows/images/01.png)

1. ［**保存**］ ボタンをクリックします。
1. ［**公開**］ ボタンをクリックします。

新しく追加された定義をワークフロープロセスとして使用する準備ができました。

<a name="editing-a-workflow-definition" />

## ワークフロー定義の編集

ワークフローを編集するには：

1. ［**コントロールパネル**］ &rarr; ［**ワークフロー**］ &rarr; ［**プロセスビルダー**］ へ行きます。
1. ワークフローの **アクション** ボタン（![Actions](../../../images/icon-actions.png)）をクリックし、 ［**編集**］ をクリックします。

    ![定義の編集](./managing-workflows/images/03.png)

ワークフロー定義への変更は、 ［**Details**］ メニューと ［**Revision History**］ メニューで追跡されます。

### ワークフローリビジョンの表示と復元

ワークフロー定義の詳細とリビジョン履歴を表示するには：

1. **情報** ボタン（![Information](../../../images/icon-information.png)）をクリックします。
1. ［**改訂履歴**］ タブの前のバージョンの横にある **アクション** ボタン（![Actions](../../../images/icon-actions.png)）をクリックし、 ［**プレビュー**］ または ［**復元**］ を選択します。

    ![ワークフローの以前のバージョンを表示および復元します。](./managing-workflows/images/02.png)

1. ［**復元**］ をクリックして成功メッセージが表示された場合、以前のバージョンがワークフローの現在のバージョンです。 これで、復元されたバージョンのワークフローを編集できます。
1. 編集が必要な場合は、編集して ［**Update**］ をクリックします。 これにより、ワークフローの別のバージョンが作成されます。

<a name="deleting-a-workflow-definition" />

## ワークフロー定義の削除

ワークフローには2つのステータスがあります。

***Published：** 検証が完了し、ワークフローをアセットに割り当てることができます。
***Unpublished：** 検証は非公開ワークフローでは実行されず、公開されるまでアセットに割り当てることはできません。

［**Unpublished**］ ワークフローのみ削除可能です。

［**Published**］ ワークフローの定義は、現在アセットタイプに関連付けられている場合は削除できません。 ユーザーは、最初にワークフロープロセスを非アクティブ化してから、ワークフローを ［**Unpublished**］ ステータスにする必要があります。

1. アセットタイプのワークフローを非アクティブ化するには、各アセットタイプの [ワークフローのアクティブ化](../using-workflows/activating-workflow.md) の記事にある手順を逆にして、 ［**No Workflow**］ を選択します。
1. ［**コントロールパネル**］ &rarr; ［**ワークフロー**］ &rarr; ［**プロセスビルダー**］ へ行きます。
1. ワークフローの **アクション** ボタン（![Actions](../../../images/icon-actions.png)）をクリックし、 ［**Unpublish**］ をクリックします。

    ![ワークフローを非公開にする](./managing-workflows/images/04.png)

1. 選択した定義が ［**Unpublished**］ セクションに表示されます。 ワークフローの **アクション** ボタン（![Actions](../../../images/icon-actions.png)）をクリックし、 ［**Delete**］ をクリックします。

    ![ワークフローの削除](./managing-workflows/images/05.png)

<a name="additional-information" />

## 追加情報

* [XMLワークフロー定義の作成](../developer-guide/crafting-xml-workflow-definitions.md)
* [ワークフローデザイナの概要（サブスクリプション）](./workflow-designer/workflow-designer-overview.md)
