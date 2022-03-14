<a href="#" id="1"></a>

## Creating Workflow Definitions

<div class="ahead">

#### Exercise Goals
* Create a Workflow definition
* Activate the Workflow and go through a review process

</div>

#### Create a New Workflow with Kaleo Designer
1. **Sign In** as your Marvin Robotics Administrator
  - If you followed the prerequisites, this will be with the test@marvinrobotics.com account. 
* **Open** the _Global Menu_.
* **Go to** _`Applications > Workflow > Process Builder`_. 
* **Click** the _Add_ button to add a new Workflow.  
* **Type** `Marketing Content Review` for the _Title_.  
* **Click** on the _Connector_ to highlight it.
  - The transition connector is the line between the StartNode and EndNode.
* **Delete** the _Connector_.
  - This can be done by pressing the _Delete_ key on your keyboard.
* **Click** _OK_ on the pop-up.
* **Drag** the _StartNode_ to the left-middle of the editor.
* **Drag** the _EndNode_ to the right-middle of the editor.
* **Click** the _StartNode_. 
* **Double-click** the _Name_ value in the _Properties_ tab that opens. 
* **Type** `Submitted` for the _Name_. 
* **Click** the _Save_ button. 
* **Click** the _EndNode_. 
* **Double-click** the _Name_ value in the _Properties_ tab that opens. 
* **Type** `Approved` for the _Name_.
* **Click** the _Save_ button. 


#### Add the Review and Update Task Nodes
1. **Click** the _Nodes_ tab. 
* **Drag** a _Task_ node to the right of the _StartNode_.  
* **Click** the new node.
* **Double-click** the _Name_ value in the _Properties_ tab to the left of the editor.
* **Type** `Manager Review` for the _Name_.
* **Click** the _Save_ button. 
* **Click** the _Nodes_ tab.   
* **Drag** a _Task_ node onto the editor between the _Manager Review_ and _EndNode_.  
* **Click** the new node. 
* **Double-click** the _Name_ value in the _Properties_ tab to edit it.
* **Type** `Final Review` for _Name_.   
* **Click** the _Save_ button. 
* **Click** the _Nodes_ tab.   
* **Drag** a _Task_ node to the top left of the editor above the _StartNode_ and _Manager Review_.
* **Click** the new node. 
* **Double-click** the _Name_ value in the _Properties_ tab to edit it.
* **Type** `Update Content` for _Name_.   
* **Click** the _Save_ button. 

#### Connect All of the Nodes with Transitions
1. **Drag** a _Transition_ arrow from the _Submitted_ node to the _Manager Review_ Task.
  - To drag a transition, place your cursor on the edge of the node so that you see a thin plus (+) sign. When it appears, click and drag the arrow to the next node, connecting it by positioning it to see the orange circle.
* **Drag** a _Transition_ arrow from the _Manager Review_ Task to the _Update Content_ Task.
* **Drag** a _Transition_ arrow from the _Update Content_ Task to the _Manager Review_ Task.
* **Drag** a _Transition_ arrow from the _Manager Review_ Task to the _Final Review_ Task.
* **Drag** a _Transition_ arrow from the _Final Review_ Task to the _Update Content_ Task.
* **Drag** a _Transition_ arrow from the _Final Review_ Task to the _Approved_ node.

#### Name the New Transitions
1. **Click** the first Transition from _Submitted_ to _Manager Review_.
* **Double-click** the _Name_ value in the _Properties_ tab to edit it.
* **Type** `Submit for Review` for the _Name_.  
* **Click** the _Save_ button. 
* **Click** the Transition going from _Manager Review_ to _Update Content_.
* **Double-click** the _Name_ value in the _Properties_ tab to edit it.
* **Type** `Reject` for the _Name_.  
* **Click** the _Save_ button. 
* **Click** the Transition going from _Update Content_ to _Manager Review_.
* **Double-click** the _Name_ value to edit it.
* **Type** `Resubmit` for the _Name_.  
* **Click** the _Save_ button. 
* **Click** the Transition between _Manager Review_ and _Final Review_.
* **Double-click** the _Name_ value to edit it.
* **Type** `Initial Approval` for the _Name_.  
* **Click** the _Save_ button. 
* **Click** the Transition going from _Final Review_ to _Update Content_.
* **Double-click** the _Name_ value to edit it.
* **Type** `Reject` for the _Name_.  
* **Click** the _Save_ button. 
* **Click** the last Transition from _Final Review_ to _Approved_.
* **Double-click** the _Name_ value to edit it.
* **Type** `Final Approval` for the _Name_.  
* **Click** the _Save_ button. 

#### Set the Assignments for the Review Tasks
1. **Click** the _Manager Review_ task.
* **Double-click** the _Assignments_ value in the _Properties_ tab to edit it.
* **Click** the drop-down to select _Assignment Type_.  
* **Choose** _Role Type_. 
* **Choose** _Site_ from the _Role Type_ drop-down options. 
* **Click** the _Role Name_ box. 
* **Choose** _Site Content Reviewer_ from the options. 
* **Click** the _Save_ button. 
* **Click** the _Final Review_ task.
* **Double-click** the _Assignments_ value to edit it.
* **Click** the drop-down.  
* **Choose** _Role Type_. 
* **Choose** _Site_ from the _Role Type_ drop-down options. 
* **Click** the _Role Name_ box. 
* **Choose** _Site Administrator_ from the options. 
* **Click** the _Save_ button.

#### Set the Notification for the Manager Review Task
1. **Click** the _Manager Review_ task.
* **Double-click** the _Notifications_ value to edit it.
* **Type** _`Manager Review Notification`_ for the _Name_.  
* **Choose** _Text_ from the _Template Language_ drop-down.  
* **Type** _`There is an item ready for Managerial Review`_ for the _Template_.
* **Choose** _User Notification_ for the _Notification Type_.  
* **Click** to open the _Recipient Type_ drop-down. 
* **Choose** _Task Assignees_. 
* **Click** the _Save_ button.

#### Set the Notification for the Final Review Task
1. **Click** the _Final Review_ task.
* **Double-click** the _Notifications_ value to edit it.
* **Type** _`Final Review Notification`_ for the _Name_.  
* **Choose** _Text_ from the _Template Language_ drop-down.
* **Type** _`There is an item ready for final review`_ for the _Template_.
* **Choose** _User Notification_ for the _Notification Type_.
* **Click** to open the _Recipient Type_ drop-down.
* **Choose** _Task Assignees_.
* **Click** the _Save_ button.

#### Set the Notification for the Update Content Task
1. **Click** the _Update Content_ task.
* **Double-click** the _Notifications_ value to edit it.
* **Type** _`Update Content Notification`_ for the _Name_.  
* **Choose** _Text_ from the _Template Language_ drop-down.
* **Type** _`There is an item that needs updated`_ for the _Template_.
* **Choose** _User Notification_ for the _Notification Type_.
* **Click** to open the _Recipient Type_ drop-down.
* **Choose** _Task Assignees_.
  - The Task Assignee should be the default value, _Asset Creator_. 
* **Click** the _Save_ button.

#### Add a 3 Day Review Timer for the Manager Review Task
1. **Click** on the _Manager Review_ task.
* **Double-click** on the _Timers_ value box to edit it.
* **Type** _`Review Timer`_ for the _Name_.
* **Type** `3` for the duration.
* **Choose** _Day_ from the _Scale_ drop-down menu.
* **Click** the _Blocking_ checkbox.
* **Choose** _Notification_ for the _Type_ drop-down.
* **Type** _`IMMEDIATE ACTION REQUIRED`_ for the _Name_.
* **Choose** _Text_ for the _Template Language_ drop-down.
* **Type** _`It has been 3 days since the item was submitted for review. Please review immediately.`_ for the _Template_.
* **Choose** _User Notification_ for the _Notification Type_.
* **Click** to open the _Recipient Type_ drop-down.
* **Choose** _Role Type_.
* **Choose** _Site_ from the _Role Type_ drop-down options.
* **Click** the _Role Name_ box. 
* **Choose** _Site Content Reviewer_ from the options. 
* **Click** the _Save_ button. 

#### Add a 3 Day Review Timer for the Final Review Task
1. **Click** on the _Final Review_ task.
* **Double-click** on the _Timers_ value box to edit it.
* **Type** _`Review Timer`_ for the _Name_.
* **Type** `3` for the duration.
* **Choose** _Day_ from the _Scale_ drop-down menu.
* **Click** the _Blocking_ checkbox. 
* **Choose** _Notification_ for the _Type_ drop-down. 
* **Type** _`IMMEDIATE ACTION REQUIRED`_ for the _Name_.
* **Choose** _Text_ for the _Template Language_ drop-down.
* **Type** _`It has been 3 days since the item was submitted for Final Review. Please review immediately.`_ for the _Template_.
* **Choose** _User Notification_ for the _Notification Type_.
* **Click** to open the _Recipient Type_ drop-down.
* **Choose** _Role Type_.
* **Choose** _Site_ from the _Role Type_ drop-down options.
* **Click** the _Role Name_ box.
* **Choose** _Site Administrator_ from the options.
* **Click** the _Save_ button.
* **Click** _Publish_ at the bottom left.

#### Assign a User to the Review Roles
1. **Open** the _Global Menu_. 
* **Go to** _`Control Panel > Users > Users and Organizations`_.
* **Select** your main Administrative User. 
  - This will be Test Test if you followed the prerequisites. 
* **Click** _Roles_ in the menu at the left. 
* **Click** _Select_ beside _Site Roles_. 
* **Click** _Choose_ beside _Marvin Robotics_. 
* **Choose** _Site Content Reviewer_. 
* **Click** _Select_ beside _Site Roles_. 
* **Click** _Choose_ beside _Marvin Robotics_. 
* **Choose** _Site Administrator_. 
* **Click** _Save_. 
  - Note: For simplicity, we are only using one User for this exercise. If you would like to complete the exercise using additional Users, first go to Control Panel > Configuration > Instance Settings. Open the User Authentication Settings and deselect "Require strangers to verify their email address?".Then, you can add a new Users under Users and Organizations, providing them with a username, email address, first and last name, and password. Be sure to assign new Users Membership to the Marvin Robotics Site before assigning them Roles. For more information on Users and Roles, consult the module "Add Users and Manage Permissions."

#### Activate the Marketing Content Review Workflow
1. **Open** the _Global Menu_. 
* **Click** _View All_ on the _Sites_ tab to view all Sites.
* **Click** the _My Sites_ tab.
* **Select** the _Marvin Robotics_ Site. 
* **Open** the _Site Menu_. 
* **Go to** _`Content & Data > Web Content`_. 
* **Click** the _Add_ button at the top right. 
* **Choose** _Folder_. 
* **Type** _`Marketing`_ as the _Name_. 
* **Click** _Save_. 
* **Open** the _Options_ (three dots) icon beside the new folder.
* **Select** _Edit_. 
* **Go to** the _Structure Restrictions and Workflow_ section.
  - You may need to expand this section by clicking the arrow (>). 
* **Click** _Default Workflow for This Folder (Marketing)_. 
* **Choose** _Marketing Content Review_ from the drop-down menu. 
* **Click** _Save_. 

#### Add a Web Content Article to the Marketing Folder
1. **Click** the _Marketing_ folder. 
* **Click** the _Add_ button to add content to the folder.
* **Choose** _Basic Web Content_. 
* **Type** _`New Products January 2022`_ for the _Title_. 
* **Type** _`Marvin Robotics is excited to announce the launch of three new Robotic Arms this January.`_ as the _Content_. 
* **Click** _Submit for Publication_ at the top right.
  - You should see a blue _Pending_ label underneath the title and a red notification bubble on the Personal Menu icon. 

#### Go Through the Workflow Process
1. **Open** the _Personal Menu_. 
* **Click** _Notifications_. 
  - You should see a list of all Notifications. Unread Notifications will appear in Bold. 
* **Click** the top Notification, _There is an item ready for Managerial Review_. 
* **Click** the _Options_ (three dots) icon next to _Assigned to_. 
* **Choose** _Assign to Me_. 
* **Click** _Done_ in the pop-up. 
* **Click** the _Options_ icon. 
* **Select** _Initial Approval_. 
* **Type** _`Looks good.`_ in the _Comment_ box. 
* **Click** _Done_. 
  - You should now see a list of all workflow tasks assigned to you. Additionally, you should see a new Notification bubble on the Personal Menu icon. 
* **Click** the _Assigned to My Roles_ tab next to _Assigned to Me_. 
* **Click** _New Products January 2022_.
* **Click** the _Options_ icon next to _Assigned to_. 
* **Choose** _Assign to Me_. 
* **Click** _Done_ in the pop-up. 
* **Click** the _Options_ icon.
* **Choose** _Reject_. 
* **Type** _`Needs more detail.`_ in the _Comment_ box. 
* **Click** _Done_. 
* **Open** the _Personal Menu_. 
* **Click** _Notifications_. 
  - You should now see the latest Notification is "There is an item that needs updated."

---

#### Bonus Exercises
1. Add a few more lines to the New Products January 2022 Web Content Article. Resubmit the article and go through the Marketing Content Workflow again, this time Approving it at both the Manager Review and the Final Review.
2. Create another Workflow. Use Fork and Join nodes to allow two kinds of Review, Copyedit and Content, at the same time. (The Fork node should be placed between the StartNode and two Task nodes and the Join node should be placed after the Task nodes and before the EndNode.)
