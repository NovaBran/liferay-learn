<a href="#" id="1b"></a>

## Enable CAPTCHA

<div class="ahead">

#### Exercise Goals

- Enable CAPTCHA for Message Boards
- Enable CAPTCHA for Forms

</div>

#### Enable CAPTCHA for Message Boards
1. **Sign In** as your platform Administrator.
* **Open** the _Global Menu_. 
* **Go to** _`Control Panel > Configuration`_. 
* **Click** _System Settings_. 
* **Click** _Security Tools_ in the _Security_ section.  
* **Click** the checkbox beside _Message Boards Edit Category CAPTCHA Enabled_. 
* **Click** the checkbox beside _Message Boards Edit Message CAPTCHA Enabled_. 
	- Note, that the number of Maximum Challenges is set to 1. This means that for a given portlet, a CAPTCHA is only required once.
* **Click** _Save_ at the bottom of the page. 

#### Add a New Message Board Category to the Mondego Publications Site
1. **Open** the _Personal Menu_. 
* **Click** _My Sites_. 
* **Click** the _My Sites_ tab. 
* **Choose** _Mondego Publications_.
	- Or whichever site you created that has the Mondego Community page.
* **Open** the _Site Menu_. 
* **Go to** _`Site Builder > Pages`_. 
* **Click** the _Community_ page. 
	- You should see the Message Board we added in the Add Users and Manage Permissions module.
* **Click** the _Add Category_ button on the _Message Board_ widget. 
* **Type** `Meet the Experts` as the _Name_. 
* **Type** `Introductions to the Mondego Experts` as the _Description_.
* **Click** _Save_ at the bottom. 
	- The Mailing List section should pop open to reveal that the CAPTCHA is a required field. 
* **Enter** the _Text Verification_. 
* **Click** _Save_ again. 

#### Add A New Thread to the Category
1. **Click** _Meet the Experts_. 
* **Click** _New Thread_ to add a new thread to the Category. 
* **Type** `New Members` as the _Subject_. 
* **Click** _Publish_. 
	- Note, that there is not a second CAPTCHA challenge because the maximum number of challenges for the portlet (1) has been reached.

#### Add a CAPTCHA to a Form
1. **Open** the _Site Menu_. 
* **Go to** _`Content & Data > Forms`_. 
* **Click** the _Add_ button. 
* **Type** `Suggestions` for the title. 
* **Drag and Drop** a _Text_ field onto the form. 
* **Type** `What would you like to see on the Publications Site?` for the _Label_. 
* **Click** the _Required Field_ toggle. 
* **Click** the _Settings_ icon in the top beside _Share_. 
* **Click** the _Require CAPTCHA_ toggle. 
* **Click** _Done_. 
* **Click** the _Publish_ button. 
* **Click** _Open Form_ in the pop-up success message.
	- If you do not get an _Open Form_ link, click _Share_ in the top right corner, copy the link, and open it in a new tab to complete the form. 
* **Go to** the new tab that opens and fill out the form and CAPTCHA. 

---

#### Bonus Exercise
1. Go back to the CAPTCHA Security Settings in the Control Panel. Increase the number of Maximum Challenges. Return to the Message Board and add Categories and Threads to see the changes. 
