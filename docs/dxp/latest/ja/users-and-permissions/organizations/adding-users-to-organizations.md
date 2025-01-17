# 組織へのユーザーの追加

Liferayの [組織](./understanding-organizations.md)では、ユーザーとパーミッションを管理して実際の組織階層をモデル化し、 [組織サイト](./organization-sites.md) に素早く実装することができます。 既存のポータルユーザーを組織に割り当てることも、特定の組織に所属するユーザーを新規に作成することもできます。

```{note}
   ポータル管理者は、既存のユーザーを任意の組織に割り当てたり、任意の組織に所属する新しいユーザーを作成したりすることができます。 一方、組織のオーナーや管理者は、既存のポータルユーザーがすでに親組織に所属している場合にのみ、子組織に割り当てることができます。 また、自分の組織または子組織の中でのみ、新しいポータルユーザーを作成することができます。
```

<a name="assigning-existing-portal-users-to-an-organization" />

## 既存のポータルユーザーの組織への割り当て

既存のユーザーを組織に割り当てるには、以下の手順に従ってください。

1. ［**グローバルメニュー**］ を開き、 ［**コントロールパネル**］ &rarr; ［**ユーザー**］ &rarr; ［**ユーザーと組織**］ に行きます。 そして、 ［**組織**］ タブをクリックします。

    ```{note}
       これらのオプションにアクセスするには、ポータル管理権限のない組織管理者とオーナーは、 **個人用メニュー** の **自分の組織** にアクセスします。
    ```

1. 既存の組織の ［**アクション**］ ボタン（![Actions Button](../../images/icon-actions.png)）をクリックし、 ［**ユーザを割り当てる**］ を選択します。

    ![［ユーザーを割り当てる］を選択します。](./adding-users-to-organizations/images/01.png)

1. **チェックボックス** を使って、組織に割り当てたいユーザーを選択します。

1. 終了したら ［**完了**］ をクリックします。 これにより、選択した組織のページに自動的に移動します。このページでは、すべてのアクティブな組織ユーザーと既存のサブ組織を確認できます。

    ![組織に割り当てたいユーザーを選択し、完了したら［完了］をクリックします。](./adding-users-to-organizations/images/02.png)

組織に追加されたユーザーには、基本的な組織ユーザーのロールがに暗黙的に割り当てられますが、必要に応じて組織の範囲内で追加のロールを割り当てることができます。 詳しくは、 [組織ロール](./organization-roles.md) をご覧ください。

<a name="adding-new-portal-users-to-an-organization" />

## 組織に新しいポータルユーザーを追加する

以下の手順で、組織に新しいポータルユーザーを追加します。

1. ［**グローバルメニュー**］ を開き、 ［**コントロールパネル**］ &rarr; ［**ユーザー**］ &rarr; ［**ユーザーと組織**］ に行きます。 そして、 ［**組織**］ タブをクリックします。

    ```{note}
       これらのオプションにアクセスするには、ポータル管理権限のない組織管理者とオーナーは、 **個人用メニュー** の **自分の組織** にアクセスします。
    ```

1. 既存の組織の ［**アクション**］ ボタン（![Actions Button](../../images/icon-actions.png)）をクリックし、 ［**ユーザーの追加**］ を選択します。

    ![［ユーザを追加する］を選択します。](./adding-users-to-organizations/images/03.png)

1. 新規ユーザーの場合は、 **情報** を入力し、完了したら ［**保存**］ をクリックします。

これにより、選択した組織に既に割り当てられ、暗黙的にに基本的な組織ユーザーのロールを与えられた新しいポータルユーザーが作成されます。 必要に応じて、組織を対象としたロールを追加で割り当てることができます。 詳しくは、 [組織ロール](./organization-roles.md) をご覧ください。

<a name="additional-information" />

## 追加情報

* [組織について](./understanding-organizations.md)
* [組織の作成と管理](./creating-and-managing-organizations.md)
* [組織ロール](./organization-roles.md)
* [組織サイト](organization-sites.md)
