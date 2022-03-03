<a href="#" id="4"></a>

## Present Content with Display Page Templates

<div class="ahead">

#### Exercise Goals

- Create Display Page Templates for:
	- Web Content Articles
	- Categories
- Preview the Display Page Layouts Using Published Content


 </div>

#### Create a Display Page Template for Product Highlights
1. **Sign In** to your Liferay platform as an Administrator if you are not already. 
* **Open** the _Global Menu_. 
* **Select** _Marvin Robotics Store_ on the _Sites_ tab. 
* **Go to** _`Design > Page Templates`_ in the _Site Menu_. 
* **Click** the _Display Page Templates_ tab.
* **Click** the _Add_ button at the top right. 
* **Type** `Product Highlights` for the _Name_.
* **Choose** _Web Content Article_ from the _Content Type_ drop down.
* **Choose** _Basic Web Content_ from the _Subtype_ drop down.
* **Click** _Save_.

#### Add Fragments to the Product Highlights Display Page Template
1. **Open** the _Fragments and Widgets_ menu (the plus sign) in the sidebar at the right.
* **Go to** _`Fragments > Basic Components`_. 
* **Drop** a _Heading_ fragment onto the page. 
* **Go to** _`Fragments > Layout`_. 
* **Drop** a _Grid_ fragment onto the page below the _Heading_. 
* **Click** the _Grid_ element. 
* **Go to** _Number of Modules_ under _`Browser > General`_. 
* **Select** _2_. 
* **Open** the _Fragments and Widgets_ menu.
* **Go to** _`Fragments > Basic Components`_. 
* **Drop** an _Image_ fragment into the left column of the _Grid_. 
* **Drop** a _Paragraph_ fragment into the right column of the _Grid_. 

#### Map Basic Web Content Articles to the Fragments 
1. **Open** the _Browser_ (arrow icon). 
* **Select** the _Title_ element under the _Heading_ fragment. 
* **Go to** _Field_ under the _Mapping_ tab. 
* **Choose** _Title_ under _Basic Information_ from the drop-down menu. 
* **Click** the _Image_ fragment. 
* **Select** the _image-square_ element in the _Browser_. 
* **Go to** the _Image Source_ tab. 
* **Choose** _Mapping_ from the drop-down menu under _Source Selection_. 
* **Go to** _Field_. 
* **Choose** _Small Image_ under _Featured Image_ in the drop-down menu. 
* **Click** the _Paragraph_ fragment. 
* **Select** the _element-text_ element in the _Browser_. 
* **Go to** _Field_ under the _Mapping_ tab. 
* **Choose** _Content_ under _Content (Basic Web Content)_ from the drop-down menu. 
* **Click** _Publish_ at the top right. 

#### Set Product Highlights as the Default Template
1. **Open** the _Options_ menu (three dots) beside _Product Highlights_.
* **Click** _Mark as Default_. 

#### Create a Web Content Article
1. **Open** the _Site Menu_. 
* **Go to** _Content & Data > Web Content_. 
* **Click** the _Add_ button.
* **Choose** _Basic Web Content_. 
* **Type** `TS2-100 Robotic Machine` for the _Title_.
* **Copy & Paste** the text from _`TS2-100 Product Highlights.txt`_ into the _Content_ box.
	- You should find the _TS2-100 Product Highlights.txt_ file in your unzipped module exercise files.
* **Go to** _Featured Image_ in the _Properties_ sidebar on the right. 
* **Choose** _From URL_ from the drop-down menu. 
* **Open** the _Global Menu_.
* **Right Click** _Asset Libraries_ under `Applications > Content` and _Open Link in New Tab_.
* **Go to** `Product Assets > Documents and Media > Product Images`. 
* **Click** on the _TS2-100 Robotic Machine_ image. 
* **Click** the _Info_ icon. 
* **Copy** the _Latest Version URL_. 
* **Go to** the _New Web Content Article_ tab in your browser. 
* **Paste** the URL link into the box below _Featured Image_. 
* **Click** _Publish_. 

#### Preview the Web Content Article
1. **Open** the _Options_ menu beside the _TS2-100 Robotic Machine_ Web Content. 
* **Click** _Preview_. 
	- You should see that the Web Content Article we just created now has the format we established in the template: the heading at the top, an image on the left, and the text on the right. 
	- Note: You can also preview different types of content on your Display Page Template while you are editing the Display Page Template. This is done using the _Preview With_ option at the top right and selecting the Item you want to preview. 

#### Create a Display Page Template for Categories
1. **Open** the _Site Menu_. 
* **Go to** _Design > Page Templates_. 
* **Click** the _Display Page Templates_ tab.
* **Click** the _Add_ button at the top right. 
* **Type** `Product Bundles` for the _Name_.
* **Choose** _Categories_ from the _Content Type_ drop down.
* **Click** _Save_. 

#### Add Fragments to the Product Bundles Display Page Template
1. **Open** the _Fragments and Widgets_ menu (the plus sign) in the sidebar at the right.
* **Go to** _`Fragments > Basic Components`_. 
* **Drop** a _Heading_ fragment onto the page. 
* **Drop** an _Image_ fragment below the _Heading_.
* **Go to** _`Fragments > Layout`_. 
* **Drop** a _Grid_ fragment onto the page below the _Heading_. 
* **Click** the _Grid_ element. 
* **Go to** _Number of Modules_ under _`Browser > General`_. 
* **Select** _2_. 
* **Drag** the divider to resize the modules and make the left side smaller.
* **Open** the _Fragments and Widgets_ menu.
* **Go to** _`Fragments > Basic Components`_. 
* **Drop** a _Button_ fragment into the left column of the _Grid_. 
* **Drop** a _Paragraph_ fragment into the right column of the _Grid_. 

#### Map Category Basic Information to the Fragments 
1. **Open** the _Browser_ (arrow icon). 
* **Select** the _Title_ element under the _Heading_ fragment. 
* **Go to** _Field_ under the _Mapping_ tab. 
* **Choose** _Vocabulary_ under _Basic Information_ in the drop-down menu. 
* **Click** the _Image_ fragment. 
* **Select** the _image-square_ element in the _Browser_. 
* **Go to** the _Image Source_ tab. 
* **Choose** _Mapping_ from the drop-down menu under _Source Selection_. 
* **Go to** _Field_. 
* **Choose** _Main Image_ in the drop-down menu. 
* **Click** the _Button_ fragment. 
* **Click** the _link_ element. 
* **Go to** _Field_ under the _Mapping_ tab. 
* **Choose** _Name_ from the drop-down menu. 
* **Click** the _Paragraph_ fragment. 
* **Select** the _element-text_ element in the _Browser_. 
* **Go to** _Field_ under the _Mapping_ tab. 
* **Choose** _Description_ from the drop-down menu. 
* **Click** _Publish_ at the top right. 

#### Set Product Bundles as the Default Template
1. **Open** the _Options_ menu (three dots) beside _Product Bundles.
* **Click** _Mark as Default_. 

#### Create a Product Bundles Vocabulary
1. **Open** the _Site Menu_. 
* **Go to** _`Categorization > Categories`_. 
* **Click** the _Add_ button beside _Vocabularies_. 
* **Type** `Product Bundles` for the _Name_. 
* **Click** _Save_. 
* **Click** _OK_ on the pop-up notification.

#### Add a Multi-Product Bundles Category
1. **Click** the _Add_ button at the right to create a new Category. 
* **Type** `Multi-Product Bundles` for the _Name_. 
* **Copy & Paste** the text from the _`Multi-Product Bundles Description.txt`_ file into the _Description_. 
	- You should have this file unzipped in your module exercise folder. 
* **Click** _Save_. 
* **Open** the _Options_ menu (three dots) to the right of the _Multi-Product Bundles_ category.
* **Choose** _Edit_. 
* **Click** on the _Images_ tab. 
* **Click** the _Add_ button in the top right. 
* **Drag & Drop** the _Multi-Product Bundles Title Card.jpeg_ from your exercise files folder. 
* **Click** _Publish_. 

#### Preview the Product Bundles Category Display Page
1. **Click** _Product Bundles_ to view the _Categories_. 
* **Click** the _Options_ menu beside _Multi-Product Bundles_. 
* **Choose** _View Display Page_. 

---
#### Bonus Exercise
1. Create another Display Page Template. Choose any Content Type you want. Add Fragments to the page and map content elements to the Fragments. Preview the Display Page Template using the Preview feature in the top right corner.