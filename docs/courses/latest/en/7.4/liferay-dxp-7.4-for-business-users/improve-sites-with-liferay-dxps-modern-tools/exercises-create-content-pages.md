<a href="#" id="1"></a>

## Create Content Pages

<div class="ahead">

#### Exercise Goals

- Create the Mondego Community Site
- Add a Content Page to the Mondego Community Site
- Edit the Content Page using the Site Content Creator Role

</div>

#### Create the Mondego Community Site 
1. **Sign In** as your Mondego Administrator. 
	- If you followed the steps in the Add Users and Manage Permissions module, this will be Elliot Quinn. If not, the default admin, Test Test, works as well.
* **Open** the _Global Menu_.
* **Go to** _`Control Panel > Sites > Sites`_. 
* **Click** _Add_. 
* **Choose** the _Blank_ Site Template. 
* **Type** `Mondego Community` as the _Name_. 
* **Click** _Save_. 

#### Add a Content Page to the Mondego Community Site
1. **Open** the _Site Menu_.
* **Go to** _`Site Builder > Pages`_.
* **Click** the _Add_ button. 
* **Choose** _Public Page_. 
* **Click** _Blank_. 
* **Type** _`Welcome`_ as the _Name_. 
* **Click** _Add_. 

#### Add Fragments and Widgets to the Content Page
1. **Click** the _Fragments and Widgets_ icon (+) in the sidebar.
* **Go to** _Basic Components_ on the _Fragments_ tab. 
* **Drag and Drop** a _Slider_ Fragment onto the page. 
* **Go to** _Featured Content_ on the _Fragments_ tab. 
* **Drag and Drop** a _Highlights_ Fragment onto the page. 
* **Go to** the _Widgets_ tab. 
* **Drag and Drop** an _Asset Publisher_ Widget onto the page. 

#### Configure the Slider Fragment
1. **Click** the _Slider_ Fragment.
* **Go to** the _General_ tab of the _Browser_.
* **Type** `2` for the _Number of Slides_.
* **Click** _`01-01-image`_ under _Page Elements_. 
* **Click** _Select Image_ under the _Image Source_ tab. 
* **Click** _Select File_. 
* **Select** `mondego-slider-1.jpg` from your exercise file folder. 
* **Click** _Open_. 
* **Click** _Add_.
	- You should see the Mondego Group banner. 
* **Click** _`02-01-image`_.
* **Click** _Select Image_ under the _Image Source_ tab. 
* **Click** _Select File_. 
* **Select** `mondego-slider-2.jpg` from your exercise file folder.
* **Click** _Open_. 
* **Click** _Add_.

#### Configure the Highlights Fragment
1. **Click** the _Container_ Fragment below the _Slider_ in the _Browser_. 
* **Click** the _Plus_ (+) sign beside _Container_ to expand all the sub-sections if it is not already expanded. 
* **Click** the _Grid_ fragment. 
* **Click** the _Styles_ tab. 
	- Take note of the current Layout. It should read 3 Modules per Row. 
* **Click** the _Tablet_ icon in the _Device Display_ at the top center of the page. 
	- Notice how the Layout changes to 1 Module per Row. 
* **Click** _1 Module per Row_ under _Layout_. 
* **Choose** _3 Modules per Row_. 
* **Click** _Landscape Phone_ in the _Device Display_. 
	- The Layout should be set to 1 Module per Row. 
* **Click** _Portrait Phone_ in _Device Display_. 
	- The Layout should be set to 1 Module per Row. 

#### Hide the Slider Fragment in Landscape and Portrait Phone View
1. **Click** the _Slider_ Fragment. 
* **Check** the _Hide Fragment_ checkbox in the _Styles_ tab. 
	- The slider should disappear in this view, moving the next Fragment to the top of the page. 
* **Click** _Landscape Phone_ in the _Device Display_. 
* **Check** the _Hide Fragment_ checkbox in the _Styles_ tab. 
* **Click** _Tablet_ in the _Device Display_ to view the slider in that view. 
* **Click** _Desktop_ in the _Device Display_ to return to the Default view. 

#### Configure the Asset Publisher Widget
1. **Click** the _Asset Publisher_ Widget to select.
* **Click** the _Options_ icon (three dots) in the top right corner of the widget. 
* **Click** _Configuration_. 
* **Go to** the _Source_ section under _Setup > Asset Selection_.  
* **Click** _Any_ under _Asset Type_ to open the drop-down. 
* **Choose** _Blogs Entry_. 
* **Click** the _Display Settings_ tab. 
* **Click** the _20_ under _Number of Items to Display_. 
* **Type** `5`. 
* **Click** _Save_. 
	- Since we have not yet added any Blog Entries, the Asset Publisher widget will read "There are no results."
* **Close** the pop-up.

#### Add a Comment to the Slider Fragment
1. **Click** the _Comments_ icon in the sidebar.
* **Click** the _Slider_ Fragment.
* **Type** `@naomi.engel Please add a Header to the second slide.` in the comment box. 
* **Click** _Comment_. 
* **Click** the first image in the grid fragment.  
* **Type** `@naomi.engel Add images and headers for these cards.` in the comment box. 
* **Click** _Comment_. 
* **Click** _Publish_. 

#### Manage Mentions for the Mondego Platform
1. **Open** the _Global Menu_
* **Go to** _`Control Panel > Configuration > Instance Settings`_. 
* **Click** _Community Tools_ under _Content and Data_. 
* **Click** _Mentions_ in the menu at the side. 
	- By default, Mentions is enabled for all Users on all Sites.
* **Click** _Define Mentions Capability for Users_. 
	- You should see two options with checkboxes: Site Members Can Mention Each Other and Friends Can Mention Each Other. 
* **Click** _All Users Can Mention Each Other_ to return to the default setting. 
* **Click** _Save_. 

#### Assign Naomi Engel the Site Content Creator Role
1. **Open** the _Global Menu_. 
* **Go to** _`Control Panel > Users > Users and Organizations`_. 
* **Click** _Naomi Engel_. 
* **Go to** _Memberships_ in the menu on the left. 
* **Click** _Select_ next to _Sites_. 
* **Choose** _Mondego Community_. 
* **Click** _Save_. 
* **Click** _Roles_ in the menu. 
* **Click** _Select_ beside _Site Roles_. 
* **Choose** _Mondego Community_. 
* **Choose** _Site Content Creator_. 
* **Click** _Save_.

#### Define the Site Content Creator Role Permissions
1. **Open** the _Global Menu_. 
* **Go to** _`Control Panel > Users > Roles`_. 
* **Click** the _Site Roles_ tab. 
* **Click** on the _Site Content Creator_ Role.
* **Click** the _Define Permissions_ tab. 
* **Open** the _Site and Asset Library Administration_ drop-down. 
* **Open** the _Site Builder_ drop-down. 
* **Click** the _Pages_ option. 
* **Check** _Access in Site and Asset Library Administration_ under _General Permissions_. 
* **Check** _View_ under _General Permissions_. 
* **Check** _View in Site and Asset Library Administration Menu_ under _Site_. 
* **Check** _Update Page Content_ under _Page_. 
* **Check** _View_ under _Page_. 
* **Click** _Save_. 

#### Sign In as Naomi Engel
1. **Open** the _Personal Menu_. 
* **Click** _Sign Out_. 
* **Click** _Sign In_. 
* **Sign In** as _Naomi Engel_. 
	- If you followed the steps in the Add Users and Manage Permissions module, you will use the email namoi.engel@mondego.com and the password _t3st_. If you have never signed in as Naomi Engel before, you will also need to complete the following steps. 
* **Click** _I Agree_ to the _Terms of Use_. 
* **Type** a _New Password_ and _Enter Again_. 
* **Click** _Save_. 
* **Choose** a _Password Reminder_ question. 
* **Type** an answer to the _Password Reminder_. 
* **Click** _Save_. 

#### Edit the Content Page as Naomi Engel
1. **Open** the _Personal Menu_. 
* **Click** _Notifications_ to view your notifications. 
	- You should see a red notification bubble on the Personal Menu icon and two unread notifications in your Notifications List. 
* **Open** the _Personal Menu_. 
* **Click** _My Sites_. 
* **Click** the _My Sites_ tab. 
* **Choose** _Mondego Community_. 
* **Click** the _Edit_ (pencil) icon at the top of the _Welcome_ page. 
* **Open** the _Browser_ sidebar. 
* **Click** the _Page Content_ tab. 
	- You will see a list of all editable content on the page, including documents and inline text. 
* **Click** the _Edit_ (pencil) icon beside _Slide 2 Title_ to edit. 
* **Type** `Mondego Makes a Difference` as the title. 
* **Double-click** the textbox to open the formatting options menu. 
* **Click** _Heading 2_. 
* **Select** _Heading 1_. 
* **Click** the _Color_ (paint bucket) icon. 
* **Choose** _Primary_. 
* **Double-click** the _Slide 2 Subtitle_ textbox to edit it.
* **Delete** the text. 

#### Add Images to the Highlights Fragment
1. **Click** the _Page Elements_ tab in the _Browser_. 
* **Click** the '+' icon next to the Container.
* **Open** all drop-downs to find the first image-square element.
* **Click** the _`image-square`_ under the first _Module_ of the _Grid_. 
* **Click** _Select Image_ under _Image Source_. 
* **Drag and Drop** `ask-an-expert.jpg` from the exercise file folder onto _Drag & Drop to Upload_.
* **Click** _Add_. 
* **Double-click** the _Heading Example_ textbox to edit. 
* **Type** `Ask an Expert`. 
* **Double-click** the image placeholder in the second module. 
* **Drag and Drop** `personal-finance.jpg` from the exercise file folder onto _Drag & Drop to Upload_.
* **Click** _Add_. 
* **Double-click** the _Heading Example_ textbox to edit.
* **Type** `Manage Your Finances`. 
* **Double-click** the image placeholder in the third module. 
* **Drag and Drop** `investment-management.jpg` from the exercise file folder onto _Drag & Drop to Upload_.
* **Click** _Add_. 
* **Double-click** the _Heading Example_ textbox to edit. 
* **Type** `Invest with Confidence`. 
* **Click** _Publish_. 

---
#### Bonus Exercises
1. Add two more Content Pages, called "Join the Community" and "FAQ." Add at least two Fragments of your choice to each page and adjust the settings for at least one fragment to Hide or Show on different devices. 
2. Grant the Site Content Creator Role to another User and edit the Fragments of the Welcome Page as that User. Add text to the three paragraph elements in the Highlights Fragment. 
