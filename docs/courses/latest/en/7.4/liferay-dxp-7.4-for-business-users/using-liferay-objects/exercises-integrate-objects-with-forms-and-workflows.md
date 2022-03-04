<a href="#" id="2"></a>
## Integrate Objects with Forms and Workflows

<div class="ahead">

#### Exercise Goals

- Integrate the New Accounts Object with a Form
- Create a Workflow for Approving the Integrated Form Entries
- Display the Integrated Form Entries Using a Collection

</div>

#### Create a New Accounts Application Form
1. **Go to** _`Content & Data > Forms`_ in the _Site Administration Menu_.
2. **Click** the _Add_ icon.
3. **Type** `New Account Application` where it reads _Untitled Form_.
4. **Type** `A form for processing applications for new accounts` where it reads _Add a short description for this form_. 
5. **Click** the _Settings_ icon.

#### Integrate the New Accounts Application Form with the New Accounts Object
1. **Choose** _Object_ under _Select a Storage Type_.
* **Choose** _New Account_ under _Select Object_.
* **Click** _Done_. 
* **Drag and Drop** a _Text_ field onto the first page of the form.
* **Type** `Name` for _Label_.
* **Click** the slider next to _Required Field_.
* **Click** the _Advanced_ tab.
* **Choose** _Account Holder_ under _Object Field_.
* **Click** the _Back_ arrow.
* **Drag and Drop** a _Text_ field onto the form.
* **Type** `Email` for _Label_.
* **Click** the slider next to _Required Field_.
* **Click** the _Advanced_ tab.
* **Choose** _Email_ under _Object Field_.
* **Click** the _Back_ arrow.
* **Drag and Drop** a _Numeric_ field onto the form.
* **Type** `Phone Number` for _Label_.
* **Click** the slider next to _Required Field_.
* **Click** the _Advanced_ tab.
* **Choose** _Phone Number_ under _Object Field_.
* **Click** the _Back_ arrow.

#### Add Remaining Fields to the New Accounts Application Form
1. **Drag and Drop** a _Select from List_ field onto the form.
* **Type** `Account Type` for _Label_.
* **Click** the slider next to _Required Field_.
* **Click** the _Advanced_ tab.
* **Choose** _Account Type_ under _Object Field_.
* **Click** the _Back_ arrow.
* **Drag and Drop** a _Numeric_ field onto the first page of the form.
* **Type** `Initial Balance` for _Label_.
* **Click** the slider next to _Required Field_.
* **Select** _Decimal_ under _My numeric type is:_.
* **Click** the _Advanced_ tab.
* **Choose** _Initial Balance_ under _Object Field_.
* **Click** the _Back_ arrow.
* **Drag and Drop** a _Date_ field onto the first page of the form.
* **Type** `Date of Request` for _Label_.
* **Click** the slider next to _Required Field_.
* **Click** the _Advanced_ tab.
* **Choose** _Date of Request_ under _Object Field_.
* **Click** the _Back_ arrow.
* **Click** _Publish_.

#### Create a Workflow for the New Accounts Application Form 
1. **Go to** _`Applications > Workflow > Process Builder`_ in the _Global Menu_.
* **Click** the _Add_ icon.
* **Type** `Account Approval Process` where it reads _Untitled Workflow_.
* **Click** on the _End Node_.
* **Delete** the default connector by clicking on the _x_ next to the End Node.
* **Drag and Drop** a _Task_ node into the workspace.
* **Double-click** the newly added _Task_ node.
* **Type** `Review 1` for _Name_.
* **Click** _Save_.
* **Choose** _Role_ under _Assignment Type_ next to _Assignments_.
* **Choose** _Site Content Reviewer_ under _Role_.
* **Click** _Save_.
* **Drag and Drop** a _Task_ node into the workspace.
* **Double-click** the newly added _Task_ node.
* **Type** `Review 2` for _Name_.
* **Click** _Save_.
* **Choose** _Role_ under _Assignment Type_ next to _Assignments_.
* **Choose** _Site Administrator_ under _Role_.
* **Click** _Save_.
* **Click** the _StartNode_. 
* **Double-click** the _Name_ value in the _Properties_ tab that opens. 
* **Type** `Submitted` for the _Name_. 
* **Click** the _Save_ button. 
* **Click** the _EndNode_. 
* **Double-click** the _Name_ value in the _Properties_ tab that opens. 
* **Type** `Approved` for the _Name_.
* **Click** the _Save_ button. 

#### Connect All of the Nodes with Transitions
1. **Drag** a _Transition_ arrow from the _Submitted_ node to the _Review 1_ Task.
  - To drag a transition, place your cursor on the edge of the node so that you see a thin plus (+) sign. When it appears, click and drag the arrow to the next node, connecting it by positioning it to see the orange circle.
* **Drag** a _Transition_ arrow from the _Review 1_ Task to the _Review 2_ Task.
* **Drag** a _Transition_ arrow from the _Review 2_ Task to the _Approved_ node.

#### Name the New Transitions
1. **Click** the first Transition from _Submitted_ to _Review 1_.
* **Double-click** the _Name_ value in the _Properties_ tab to edit it.
* **Type** `Submit for Review` for the _Name_.  
* **Click** the _Save_ button. 
* **Click** the Transition going from _Review 1_ to _Review 2_.
* **Double-click** the _Name_ value in the _Properties_ tab to edit it.
* **Type** `Initial Approval` for the _Name_.  
* **Click** the _Save_ button. 
* **Click** the last Transition from _Review 2_ to _Approved_.
* **Double-click** the _Name_ value to edit it.
* **Type** `Final Approval` for the _Name_.  
* **Click** the _Save_ button.
* **Click** _Publish_.

#### Add the Account Approval Process Workflow to New Account Entries
1. **Open** the Global Menu.
* **Click** on the _Mondego Group_ site.
* **Go to** _`Configuration > Workflow`_ in the _Site Administration Menu_.
* **Click** _Edit_ next to _New Account_.
* **Choose** _Account Approval Process_.
* **Click** _Save_.

#### Add the New Account Application Form to a Page
1. **Click** _Home_ in the _Site Administration Panel_
* **Click** the _Edit_ (small pencil) icon.
* **Click** the _+_ icon to open the Fragments and Widgets sidebar.
* **Drag and Drop** a _Container_ layout element onto the page.
* **Click** _Widgets_.
* **Drag and Drop** a _Form_ widget into the _Container_ element. 
* **Click** the _Options_ icon in the _Form_ widget.
* **Click** _Configuration_. 
* **Choose** _New Account Application_.
* **Click** _Save_.
* **Close** the pop-up.
* **Click** _Publish_.

#### Submit an Entry for the New Account Application Form
1. **Fill out** the fields of the New Account Application Form.
	- The exact details here don't really matter so feel free to fill the form out as yourself, a friend, or your Administrative User.
* **Click** _Submit_.

#### Approve the New Account Submission as a Site Content Reviewer
1. **Sign out** as your administrator.
	- Before you do this, be sure that you have created two additional Users, added them as members of the Mondego Group Site, and assigned them the Roles of Site Content Reviewer and Site Administrator, respectively.
* **Sign in** as your Site Content Reviewer.
* **Open** the _Personal Menu_.
* **Click** _My Workflow Tasks_.
* **Click** the _Assigned to My Role_ tab.
* **Click** the _Options_ icon.
* **Choose** _Assign to Me_.
* **Click** _Done_.
* **Click** the _Options_ icon.
* **Choose** _Initial Approval_.
* **Click** _Done_.

#### Approve the New Account Submission as a Site Administrator
1. **Sign out** as your Site Content Reviewer.
* **Sign in** as your Site Administrator.
* **Open** the _Personal Menu_.
* **Click** _My Workflow Tasks_.
* **Click** the _Assigned to My Role_ tab.
* **Click** the _Options_ icon.
* **Choose** _Assign to Me_.
* **Click** _Done_.
* **Click** the _Options_ icon.
* **Choose** _Final Approval_.
* **Click** _Done_.

#### Create a Display Page Template for New Account Entries
1. **Sign out** as your Site Administrator.
* **Sign in** as your Platform Administrator.
* **Go to** _`Design > Page Templates`_ in the _Site Administration Menu_.
* **Click** the _Display Page Templates_ tab.
* **Click** the _Add_ icon.
* **Choose** _Blank_ for the Master Page.
* **Type** `New Accounts` for _Name_.
* **Choose** _New Account_ for _Content Type_.
* **Click** _Save_.

#### Design the New Accounts Display Page Template
1. **Drag and Drop** a _Container_ element onto the page.
* **Drag and Drop** a _Heading_ component into the _Container_.
* **Click** the _Heading_.
* **Click** _element-text_ in the sidebar.
* **Choose** _Account Holder_ under _Field_.
* **Click** the _+_ icon to open the Fragments and Widgets sidebar.
* **Drag and Drop** a _Grid_ element onto the page underneath the _Heading_.
* **Click** the _Grid_.
* **Choose** _2_ for _Number of Modules_.
* **Click** the box to uncheck _Show Gutter_.
* **Click** the _+_ icon to open the Fragments and Widgets sidebar.
* **Drag and Drop** a _Paragraph_ component into the left section of the _Grid_.
* **Click** the _Paragraph_.
* **Click** _element-text_ in the sidebar.
* **Choose** _Account Type_ under _Field_.
* **Drag and Drop** a _Paragraph_ component into the right section of the _Grid_.
* **Click** the _Paragraph_.
* **Click** _element-text_ in the sidebar.
* **Choose** _Initial Balance_ under _Field_.
* **Click** the _+_ icon to open the Fragments and Widgets sidebar.
* **Drag and Drop** a _Separator_ component beneath the _Grid_.
* **Drag and Drop** a _Grid_ element onto the page underneath the _Separator_.
* **Click** the _Grid_.
* **Choose** _2_ for _Number of Modules_.
* **Click** the box next to _Show Gutter_.
* **Click** the _+_ icon to open the Fragments and Widgets sidebar.
* **Drag and Drop** a _Paragraph_ component into the left section of the _Grid_.
* **Click** the _Paragraph_.
* **Click** _element-text_ in the sidebar.
* **Choose** _Email_ under _Field_.
* **Click** the _+_ icon to open the Fragments and Widgets sidebar.
* **Drag and Drop** a _Paragraph_ component into the right section of the _Grid_.
* **Click** the _Paragraph_.
* **Click** _element-text_ in the sidebar.
* **Choose** _Phone Number_ under _Field_.
* **Click** the _+_ icon to open the Fragments and Widgets sidebar.
* **Drag and Drop** a _Separator_ component beneath the _Grid_.
* **Drag and Drop** a _Container_ element onto the page beneath the _Separator_.
* **Drag and Drop** a _Paragraph_ component into the _Container_.
* **Click** the _Paragraph_.
* **Click** _element-text_ in the sidebar.
* **Choose** _Date of Request_ under _Field_.
* **Click** _Publish_.

#### Add a Private Page for Displaying New Account Entries
1. **Go to** _`Site Builder > Pages`_ in the _Site Administration Menu_.
* **Click** _Pages_ where it reads _Pages > Public Pages_.
* **Click** the _Add_ icon.
* **Choose** _Private Page_.
* **Click** _Blank_ for the template.
* **Type** `New Account Applications` for _Name_.
* **Click** the _+_ icon to open the Fragments and Widgets sidebar.
* **Drag and Drop** a _Collection Display_ fragment onto the page.
* **Click** the _Collection Display_.
* **Click** the _Add_ icon next to _Select Collection_.
* **Click** the _Collection Providers_ tab.
* **Choose** _New Accounts_.
* **Choose** _Table_ under _List Style_.
* **Click** _Publish_.

---

#### Bonus Exercise
1. Create a workflow for reviewing PTO requests that includes at least two different reviewers. Submit a request and go through the approval process using the newly created workflow.
	

