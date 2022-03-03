<a href="#" id="3"></a>

## Create Unique User Experiences 

<div class="ahead">

#### Exercise Goals

- Create an Experience for Mondego Employees
	- Create a New User Segment
	- Make Changes to the Welcome Page
- Add a Custom Navigation Bar to the Welcome Page
	- Create a Custom Navigation Menu
	- Use Grid, Dropdown, and Menu Display Fragments to Create a Navigation Bar

</div>

#### Create a New Experience on the Mondego Community Welcome Page
1. **Sign In** to the Mondego Platform as your Administrator.
* **Open** the _Site Menu_. 
* **Click** the _Site Selector_ (compass) icon. 
* **Click** the _My Sites_ tab.
* **Choose** the _Mondego Community_ Site. 
* **Click** the _Edit_ (pencil) icon on the _Welcome_ Page. 
* **Click** _Default_ beside _Experience_ at the top left of the page. 
* **Click** _New Experience_. 
* **Type** `Mondego Employees` as the _Experience Name_. 
* **Click** _New Segment_ beside _Audience_. 

#### Add Conditions to the New User Segment
1. **Type** `Mondego Employees` as the Title. 
* **Go to** the _User_ section of the _Properties_ menu. 
* **Drag and Drop** a _Site_ property onto the Conditions area. 
* **Click** the _Select_ button next to _Site equals_. 
* **Choose** _Mondego Community_. 
* **Click** the _Duplicate_ (clipboard) icon beside _Select_ to duplicate the _Site_ property. 
* **Click** the _Select_ button in the second _Site_ property. 
* **Choose** _Mondego Group_. 
* **Click** the _Duplicate_ icon again. 
* **Click** the _Select_ button in the third _Site_ property. 
* **Choose** _Mondego Publications_.
* **Go to** the _User_ section under _Properties_. 
* **Drag and Drop** an _Email Address_ property below the last _Site_ property. 
* **Click** the _equals_ drop-down. 
* **Select** _contains_. 
* **Type** `@mondego.com`. 

#### Group the Site Properties and Define the Conditions
1. **Click and Drag** the second _Site_ property onto the first to group them. 
	- A border should appear around the two properties to indicate they have been grouped.
* **Click and Drag** the third _Site_ property just below the second. 
	- The border should now appear around all three Site properties. 
* **Click** the _And_ drop-down between the first and second properties. 
* **Choose** _Or_. 
* **Click** the _And_ drop-down between the second and third properties. 
* **Choose** _Or_. 
	- Leave the default "And" between the grouped Site properties and the Email Address property to require Users in this Segment to have membership in one of the Sites AND a Mondego email address. 
* **Click** _Save_ at the top right. 
* **Click** _Save_ when you return to the _New Experience_ pop-up. 

#### Make Changes to the Welcome Page in the Mondego Employees Experience
1. **Click** the _Plus_ (+) icon to open the _Fragments and Widgets_ menu. 
* **Go to** _Featured Content_ on the _Fragments_ tab. 
* **Drag and Drop** a _Banner Center_ to the very bottom of the page above the footer. 
* **Double-click** _Banner Title Example_ to edit the title.
* **Type** `Join the Community Team`. 
* **Double-click** the _Paragraph_ component to edit. 
* **Type** `Learn how you can support the Community as an Advisor, Expert, or Moderator`. 
* **Double-click** the _Button_ component. 
* **Type** `Learn More` as the new text.
* **Click** the main _Container_ component
	- This will be the outermost Container of the _Banner Center_ fragment. 
* **Click** the _Styles_ tab in the _Browser_. 
* **Go to** _Background Image_ under _Background_. 
* **Click** _Select Image_. 
* **Click** _Select File_. 
* **Select** the `community-team-banner.jpg` from your unzipped exercise file folder. 
* **Click** _Open_. 
* **Click** _Add_. 

#### Set the Mondego Employees Experience Priority
1. **Click** the _Mondego Employees_ drop-down beside _Experience_ to open the _Experience_ menu. 
* **Click** the _Prioritize Experience_ arrow (^) beside _Mondego Employees_. 
	- This will move the Mondego Employees Experience above the Default Experience. 
* **Click** _Publish_. 

#### Preview the Mondego Employees Experience
1. **Open** the _Site Menu_. 
* **Click** _Home_ to view the home page. 
* **Click** the _Simulation_ icon (to the right of the gear icon). 
* **Go to** _Segments_. 
* **Click** the checkbox next to _Mondego Employees_. 
	- You should see the banner we added to the Mondego Employees Experience. 
* **Click** each of the screen size options to preview the differences. 
* **Close** the _Simulation_. 

#### Create a Custom Navigation Menu
1. **Open** the _Site Menu_. 
* **Go to** _`Site Builder > Navigation Menus`_.
* **Click** the _Add_ button.
* **Type** `Mondego Links` for the _Name_. 
* **Click** _Add_. 

#### Add a Submenu and URL Elements for Mondego Sites
* **Click** _New_ to add an element. 
* **Choose** _Submenu_. 
* **Type** `Mondego Sites` for the _Name_. 
* **Click** _Save_. 
* **Click** the _Add_ button at the top right to add another element. 
* **Choose** _URL_. 
* **Type** `Mondego Group` for the _Name_. 
* **Type** `http://localhost:8080/web/mondego-group` for the _URL_. 
	- The URL will be the default Friendly URL generated when the Site was created. If you do not have these Sites created, consult the Build New Sites with Liferay DXP module. 
* **Click** _Add_. 
* **Click** the _Add_ button to add another element. 
* **Choose** _URL_. 
* **Type** `Mondego Matters` for the _Name_. 
* **Type** `http://localhost:8080/web/mondego-matters` for the _URL_.
* **Click** _Add_. 
* **Click** the _Add_ button to add another element. 
* **Choose** _URL_. 
* **Type** `Mondego Publications` for the _Name_. 
* **Type** `http://localhost:8080/web/mondego-publications` for the _URL_.
* **Click** _Add_.
* **Click and Drag** the _Mondego Group_ element to the right to nest it below the _Mondego Sites_ submenu element. 
* **Click and Drag** the _Mondego Matters_ element to the right to line up with _Mondego Group_.  
* **Click and Drag** the _Mondego Publications_ element to the right to line up with _Mondego Group_ and _Mondego Matters_. 
	- You should now have three URL elements nested below the Mondego Sites Submenu element. 

#### Add a Submenu and URL Elements for Mondego Regional Banks
1. **Click** the _Add_ button at the top right.  
* **Choose** _Submenu_. 
* **Type** `Mondego Regional Banks` for the _Name_. 
* **Click** _Save_. 
* **Click** the _Add_ button to add another element. 
* **Choose** _URL_. 
* **Type** `Mondego North America` for the _Name_. 
* **Type** `http://localhost:8080/web/mondego-north-america` for the _URL_.
* **Click** _Add_.
* **Click** the _Add_ button to add another element. 
* **Choose** _URL_. 
* **Type** `Mondego UK` for the _Name_. 
* **Type** `http://localhost:8080/web/mondego-uk` for the _URL_.
* **Click** _Add_.
* **Click** the _Add_ button to add another element. 
* **Choose** _URL_. 
* **Type** `Mondego Japan` for the _Name_. 
* **Type** `http://localhost:8080/web/mondego-japan` for the _URL_.
* **Click** _Add_.
* **Click and Drag** the _Mondego North America_ element to the right to nest it below the _Mondego Regional Banks_ submenu element. 
* **Click and Drag** the _Mondego UK_ element to the right to line up with _Mondego North America_.
* **Click and Drag** the _Mondego Japan_ element to the right to line up with _Mondego North America_ and _Mondego UK_. 
	- You should now have three URL elements nested below the Mondego Regional Banks Submenu element. 

#### Add a Navigation Bar to the Welcome Page for the Mondego Employees Experience
1. **Open** the _Site Menu_. 
* **Go to** _`Site Builder > Pages`_. 
* **Click** the _Options_ (three dots) icon beside _Welcome_. 
* **Choose** _Edit_. 
* **Click** _Default_ beside _Experience_ in the top editing bar. 
* **Click** _Edit Experience_ (the pencil icon) next to _Mondego Employees_ Experience.
* **Click** _Save_ in the pop-up.
* **Open** the _Fragments and Widgets_ menu sidebar (+).
* **Drag and Drop** a _Grid_ Fragment onto the page below the _Highlights_ fragment and above the _Banner Center_. 
* **Go to** the _Fragments and Widgets_ menu. 
* **Drag and Drop** a _Dropdown_ Fragment into the first module of the _Grid_ fragment.
* **Drag and Drop** a _Dropdown_ Fragment into the second module of the _Grid_ fragment.
* **Double-click** the textbox in the first _Dropdown_ to edit. 
* **Type** `Mondego Sites`. 
* **Double-click** the textbox in the second _Dropdown_ to edit. 
* **Type** `Mondego Regional Banks`. 

#### Add Menu Display Fragments to the Dropdown Fragments
1. **Click** the _Dropdown_ Fragment in the first module. 
* **Check** the _Keep Panel Open in Edit Mode_ checkbox under _General_ in the _Browser_. 
* **Open** the _Fragments and Widgets_ menu sidebar. 
* **Type** `Menu` in the search bar. 
* **Drag and Drop** a _Menu Display_ Fragment into the _Place fragments here_ box below the first _Dropdown_.  
* **Click** the _Dropdown_ Fragment in the second module. 
* **Check** the _Keep Panel Open in Edit Mode_ checkbox under _General_ in the _Browser_. 
* **Open** the _Fragments and Widgets_ menu sidebar. 
* **Type** `Menu` in the search bar. 
* **Drag and Drop** a _Menu Display_ Fragment into the _Place fragments here_ box below the second _Dropdown_.  

#### Configure the Menu Display Fragments in the Dropdown Fragments
1. **Click** the _Menu Display_ under the _Mondego Sites_ Dropdown Fragment. 
* **Go to** the _General_ tab in the _Browser_. 
* **Click** _Public Pages Hierarchy_ to select a new source. 
* **Click** _Mondego Links_. 
* **Click** _Mondego Sites_. 
* **Click** the _Select This Level_ button. 
	- You should see three elements: Mondego Group, Mondego Matters, and Mondego Publications. 
* **Click** the _Menu Display_ under the _Mondego Regional Banks_ Dropdown Fragment. 
* **Go to** the _General_ tab in the _Browser_. 
* **Click** _Public Pages Hierarchy_ to select a new source. 
* **Click** _Mondego Links_. 
* **Click** _Mondego Regional Banks_. 
* **Click** the _Select This Level_ button. 
	- You should see three elements: Mondego North America, Mondego UK, and Mondego Japan. 

#### Manage the Grid Fragment Layout for Mobile Devices
1. **Click** the first _Dropdown_ under _Page Elements_ in the _Browser_. 
* **Click** the checkbox to deselect _Keep Panel Open in Edit Mode_ on the _General_ tab. 
* **Click** the second _Dropdown_ under _Page Elements_. 
* **Click** the checkbox to deselect _Keep Panel Open in Edit Mode_ on the _General_ tab.
* **Click** the _Grid_ Fragment. 
* **Click** the _Styles_ tab next to _General_ in the _Browser_.
	- You should see that the current Styles are for Desktop view and that the Grid Layout is currently 3 Modules per Row. 
* **Click** the _Tablet_ icon in the Device Display at the top center of the page and scroll down to view the Grid Layout. 
* **Click** the _Landscape Phone_ icon to view the layout. 
* **Click** the _Portrait Phone_ icon to view the layout. 
* **Click** _3 Modules per Row_ under _Layout_ in the _Styles_ tab. 
* **Choose** _1 Module per Row_. 
* **Click** _Top_ under _Vertical Alignment_. 
* **Choose** _Middle_. 
* **Click** _Publish_. 
	- You can preview the changes on different devices and for different experiences by clicking the Simulation icon once you exit the editing mode.

---
#### Bonus Exercise
1. Add a second Experience to the Welcome Page on the Mondego Community Site. Name the New User Segment "Content Creators" and set it to include only those assigned the Site Content Creator Role. Give the Content Creators Experience priority above the Default and Mondego Employees Experiences. Add Fragments and Content to the Welcome Page for that Experience and view those changes.  
