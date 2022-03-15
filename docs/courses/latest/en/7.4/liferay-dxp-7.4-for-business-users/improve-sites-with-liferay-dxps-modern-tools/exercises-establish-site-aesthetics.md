<a href="#" id="2"></a>

## Establish Site Aesthetics

<div class="ahead">

#### Exercise Goals

- Create a Master Page Template for the Mondego Community Site
- Create a Style Book for the Mondego Community Site

</div>

#### Create a New Master Page Template
1. **Sign In** to the Mondego Platform as an Administrator. 
	- This will be Elliot Quinn if you followed along with the module _Add Users and Manage Permissions with Liferay DXP_.
* **Open** the _Site Menu_. 
* **Click** the _Site Selector_. 
* **Click** the _My Sites_ tab. 
* **Choose** the _Mondego Community_ Site.
* **Go to** _`Design > Page Templates`_ in the _Site Administration Panel_. 
* **Click** the _Add_ button on the _Masters_ tab. 
* **Type** _Community_ as the _Name_. 
* **Click** _Save_. 

#### Add a Header and Footer to the Master Page Template
1. **Open** the _Fragments and Widgets_ (+) menu.
* **Drag and Drop** an _Image_ fragment above the _Drop Zone_. 
* **Type** `Header` into the _Search_ bar. 
* **Drag and Drop** a _Header Light_ above the _Drop Zone_ and below the _Image_. 
* **Type** `Footer` into the _Search_ bar. 
* **Drag and Drop** a _Footer Nav Light_ below the _Drop Zone_. 
	- The Drop Zone is where Fragments and Widgets will appear for any Content Page that uses this Master Page Template. 

#### Add Images to the Header and Footer 
1. **Select** the _Image_ fragment at the top of the page. 
* **Double-click** the _Image_ fragment. 
* **Click** _Select File_. 
* **Choose** `mondego-community-header.jpg` from your unzipped exercise file folder. 
* **Click** _Open_. 
* **Click** _Add_. 
* **Select** the _Header Light_ fragment in the Browser.
* **Click** the `01-logo` element. 
* **Click** the _Add_ (+) button beside _Select Image_ under _Image Source > Image_. 
* **Click** _Select File_. 
* **Choose** `mondego-logo.jpg` from your unzipped exercise file folder onto the _Drag & Drop to Upload_ box.
* **Click** _Add_. 
* **Click** the _Footer Nav Light_ fragment. 
* **Click** the `01-logo` element. 
* **Click** _Select Image_ under _Image Source > Image_.
* **Click** _Select File_.
* **Choose** the `mondego-logo.jpg` file from _Documents and Media_. 

#### Update the Copyright in the Footer
1. **Click** the _Footer Nav Light_ fragment. 
* **Click** the `02-copy` element to highlight the element. 
* **Double-click** the text box. 
* **Delete** the placeholder text.
* **Type** `2022 Mondego Group` after the Copyright symbol. 

#### Configure the Allowed Fragments for the Master Page Template
1. **Click** the _Configure Allowed Fragments_ button in the center of the Drop Zone. 
* **Click** the box beside _Footers_ to deselect. 
* **Click** the box beside _Navigation Bars_ to deselect.
* **Click** _Save_. 
* **Click** _Publish Master_ at the top right. 

#### Make the Community Master Page Template the Default
1. **Click** the _Options_ (three dots) icon beside _Community_ on the _Masters_ tab.
* **Choose** _Mark as Default_ from the menu. 
* **Click** _OK_ when the pop-up asks if you want to replace _Blank_ as the default. 
	- You should now see a blue checkmark on the Community Master Page Template. 

#### Apply the Community Master Page Template to Pages
1. **Open** the _Site Menu_. 
* **Click** _Home_ to go to the main _Welcome_ page.
* **Click** the _Edit_ (pencil) icon in the top corner. 
* **Click** the _Page Design Options_ (paint roller) icon in the sidebar.
* **Choose** _Community_ instead of _Blank_. 
* **Click** _Publish_. 
	- You should now see the Header and Footer we defined in our Master applied to the Welcome page we created in the last exercise.

#### Create a New Style Book for the Mondego Community Site
1. **Open** the _Site Menu_. 
* **Go to** _`Design > Style Books`_. 
* **Click** the _Add_ button. 
* **Type** `Community Main` as the _Name_.
* **Click** _Save_.

#### Change the Color System Colors
1. **Go to** _Brand Colors_ under _Color System_. 
* **Type** `#100455` as _Brand Color 1_. 
* **Type** `#0DADBD` as _Brand Color 2_. 
* **Go to** _Theme Colors_ under _Color System_. 
* **Type** `#100455` as _Primary_. 
* **Type** `#0DADBD` as _Secondary_.

#### Change the Button Colors
1. **Click** _Color System_ to open the drop-down menu. 
* **Choose** _Buttons_. 
* **Go to** _Button Outline Primary_. 
* **Type** `#100455` as _Border Color_. 
* **Type** `#100455` as _Color_. 
* **Type** `#B3E1E6` as _Hover Background Color_. 
* **Type** `#100482` as _Hover Border Color_. 
* **Type** `#100482` as _Hover Color_.
* **Click** _Publish_. 
* **Click** _OK_ in the pop-up. 

#### Make the Community Main Style Book the Default and View Changes
1. **Click** the _Options_ (three dots) icon beside _Community Main_. 
* **Choose** _Mark as Default_. 
* **Open** the _Site Menu_. 
* **Click** _Home_ at the top. 
* **Click** the _Slider_ to view the second page. 
	- You should see that the color of the header has changed. 
* **Hover** your mouse over the _Go Somewhere_ button under _Ask an Expert_. 
	- You should see the background color and text color of the button change. 

---
#### Bonus Exercise
1. Update the Header and Footer Master Page Template we created on the Mondego Group Site in the Build New Sites Module. Add the Mondego logo to the Header and Footer. Add one more fragment to either the Header or Footer. View the changes on Pages that use the template.  
2. Add a New Style Book to the Mondego Group Site. Adjust the Color System colors to match those on the Mondego Community Site. Adjust Spacing, Layout, or Typography settings. Apply the Style Book to only one page on the Site and view the changes. (You may need to add more content to pages to view some changes.)