# オブジェクトレイアウトの設計

オブジェクトレイアウトは、エントリーを作成または編集するときに、そのフィールドと関連がどのように編成および表示されるかを定義します。 デフォルトでは、オブジェクトポートレットで作成されたアプリケーションは、エントリーに自動生成されたレイアウトを使用します。 このレイアウトには、すべてのオブジェクトフィールドをアルファベット順に表示する単一のタブがあります。 ただし、カスタムレイアウトを設計して、要素を表示する方法と場所を決定できます。

```{important}
自動生成されたレイアウトには、オブジェクトリレーションは表示されません。 関連を表示するには、専用の関連タブを使用してカスタムレイアウトを作成する必要があります。
```

## オブジェクトエントリレイアウトの追加

1. **オブジェクト** ポートレットを開き、目的の **オブジェクト** をクリックします。

1. ［**Layouts**］ タブをクリックし、 **追加** ボタン（![Add Button](../../../images/icon-add.png)）を選択します。

   ![［Layouts］タブの追加ボタンをクリックし、新しいレイアウトの名前を入力して、［保存］をクリックします。](./designing-object-layouts/images/01.png)

1. **名前** を入力し、 ［**保存**］ をクリックします。

保存すると、新しい空白のレイアウトが作成されます。 これで、カスタムレイアウトに [タブを追加](#adding-layout-tabs) し、エントリの作成と編集のためにオブジェクトのフィールドと関連をどのように編成するかを決定できます。

## レイアウトタブの追加 <!--TASK: Add drag and drop details once implemented.--> オブジェクト要素は、次の2種類のタブに整理できます。

[**フィールド**](#fields-tabs)：オブジェクトエントリーフィールドを表示します。 これには、オブジェクトで直接作成されたフィールド、または ［**One to Many**］ の関係から継承されたフィールドが含まれます。 <!--TASK: Add in One to One after implemented--> [**関連**](#relationships-tabs)：関連テーブルを表示し、 ［**One to Many**］ の関係の親側と ［**Many to Many**］ の関係の両側を表示するために使用する必要があります。

レイアウトを設計するには、必要なすべての [フィールド](#adding-fields-tabs) と [関連](#adding-relationships-tabs) を追加するまで、次の手順を繰り返します。

```{important}
オブジェクトエントリーの作成中は、最初のタブのみが表示されます。 他のタブは、オブジェクトエントリーを編集するときにのみ表示されます。

また、レイアウトの最初のタブに関連を含めることはできません。また、［関連］タブは、［フィールド］タブが設定された後でのみレイアウトに追加できます。
```

### フィールドタブ

1. 目的のレイアウトをクリックして、 ［**レイアウト**］ タブに移動します。

   ![［レイアウト］タブには、レイアウトを作成するためのコントロールが含まれています。](./designing-object-layouts/images/02.png)

1. ［**Add Tab**］ をクリックし、 **ラベル** を入力して、 ［**Fields**］ タイプを選択し、 ［**保存**］ をクリックします。

   ラベルの値によって、Liferay UIでのタブの表示名が決定します。

   ![［Add Tab］をクリックし、ラベルを入力して、［Fields］タイプを選択し、［保存］をクリックします。](./designing-object-layouts/images/03.png)

1. ［**Add Block**］ をクリックし、 **ラベル** を入力して、 ［**保存**］ をクリックします。

   これにより、フィールドを追加できるタブサブセクションが作成されます。 ラベルの値によって、Liferay UIでのブロックの表示名が決定します。

   ```{note}
   フィールドをタブに直接追加することはできず、ブロックにまとめておく必要があります。
   ```

   ![［Add Block］をクリックし、ラベルを入力して、［保存］をクリックします。](./designing-object-layouts/images/04.png)

1. ［**フィールドを追加**］ をクリックし、目的のフィールドを選択して、フィールドが1列、2列、または3列のいずれで表示されるかを決定し、 ［**保存**］ をクリックします。

   ```{note}
   フィールドは、レイアウトで1回だけ使用できます。
   ```

   ![［フィールドを追加］をクリックしてフィールドを選択し、フィールドが表示される列の数を選択して、［保存］をクリックします。](./designing-object-layouts/images/05.png)

1. ［**フィールドを追加**］ をクリックしてさらにフィールドをブロックに追加するか、 ［**Add Block**］ をクリックして追加するフィールド用に新しいブロックをタブに追加します。

1. トグルスイッチを使用して、ブロックが **折りたたみ可能** かどうかを決定します。

   ![トグルスイッチを使用して、ブロックが折りたたみ可能かどうかを決定します。](./designing-object-layouts/images/06.png)

1. ［**保存**］ をクリックします。

### 関連タブ

1. 目的のレイアウトを選択して、 ［**レイアウト**］ タブに移動します。

   ![目的のレイアウトをクリックして、［レイアウト］タブに移動します。](./designing-object-layouts/images/07.png)

1. ［**Add Tab**］ をクリックし、 **ラベル** を入力します。 この値によって、Liferay UIでのタブの表示名が決定します。

1. タブタイプの場合は、 ［**関連**］ をクリックし、使用可能な ［**One to Many**］ または ［**Many to Many**］ の関係から選択します。 これにより、タブに表示される関連テーブルが決まります。

   ```{note}
   レイアウトに少なくとも1つの［フィールド］タブがある場合にのみ、［関連］タイプを選択できます。 エントリーの作成時に関連を設定することはできないため、［関連］タブをオブジェクトレイアウトの最初のタブにすることはできません。 エントリーを他のオブジェクトエンティティに関連付けるには、まずそのエントリーが存在していなければなりません。
   ```

   ![タブのタイプとして［関連］を選択し、［One to Many］または［Many to Many］を選択して、関連テーブルを決定します。](./designing-object-layouts/images/08.png)

1. ［**保存**］ をクリックします。

## デフォルトのレイアウトの選択

目的のフィールドと関連をカスタムレイアウトに追加したら、それをオブジェクトのデフォルトレイアウトとして設定できます。 これにより、オブジェクトのエントリーの作成と編集に確実に使用されるようになります。 デフォルトとしてカスタムレイアウトが選択されていない場合、オブジェクトは自動的に生成されたレイアウトを使用します。

```{important}
デフォルトとしてカスタムレイアウトを選択するには、必要なすべてのオブジェクトフィールドをレイアウトの最初のタブに追加する必要があります。
```

次の手順に従って、オブジェクトのデフォルトのレイアウトを選択します。

1. 目的のレイアウトをクリックします。

1. ［Basic Details］タブで、 ［**デフォルト**］ ボックスをオンにします。

   ![［デフォルト］ボックスをオンにして、［保存］をクリックします。](./designing-object-layouts/images/09.png)

1. ［**保存**］ をクリックします。

オブジェクトのエントリーを作成および編集するときに、レイアウトが使用されるようになりました。

## 追加情報

* [オブジェクトの作成](./creating-objects.md)
* [オブジェクトへのフィールドの追加](./adding-fields-to-objects.md)
* [オブジェクトリレーションの定義](./defining-object-relationships.md)
* [オブジェクトの管理](./managing-objects.md)
