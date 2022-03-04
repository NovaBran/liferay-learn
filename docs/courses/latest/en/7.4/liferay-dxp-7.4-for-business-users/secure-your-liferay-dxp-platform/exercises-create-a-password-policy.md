<a href="#" id="1a"></a>

## Create a Password Policy

<div class="ahead">

#### Exercise Goals

- Create a New Password Policy for Mondego Employees
- Create a New User and Change their Password to fit the Policy

</div>

#### Create a New Password Policy
1. **Sign In** to the Mondego platform as an Administrator.
* **Open** the _Global Menu_. 
* **Go to** _`Control Panel > Security`_.
* **Click** _Password Policies_.
* **Click** the _Add_ button in the top right.
* **Type** `Employee Password Policy` for the _Name_. 
* **Type** `The password policy for all Mondego employees` for the description.  

#### Manage Password Changes
1. **Click** _Password Changes_ to expand the menu. 
* **Click** the toggle beside _Changeable_ to allow password changes. 
* **Click** _Eternal_ under _Reset Ticket Max Age_. 
	- This is the amount of time a Password Reset link is valid. 
* **Choose** _1 Hour_.

#### Enable and Manage Syntax Checking
1. **Click** _Password Syntax Checking_ to expand the section. 
* **Click** the toggle to _Enable Syntax Checking_. 
* **Type** `1` under _Minimum Alpha Numeric_. 
* **Type** `10` under _Minimum Length_.
* **Type** `1` under _Minimum Lower Case_. 
* **Type** `1` under _Minimum Numbers_. 
* **Type** `1` under _Minimum Symbols_.
* **Type** `1` under _Minimum Upper Case_. 

#### Enable and Manage Password History 
1. **Click** _Password History_ to expand the section. 
* **Click** the toggle to _Enable History_. 
* **Click** the _History Count_ drop-down. 
* **Choose** _8_.
	- The platform will save 8 previous passwords to prevent Users from reusing old passwords. 

#### Set a Password Expiration and Grace Limit
1. **Click** _Password Expiration_ to expand the section. 
* **Click** the toggle to _Enable Expiration_. 
* **Click** the _Maximum Age_ drop-down. 
* **Choose** _26 Weeks_.
* **Click** the _Warning Time_ drop-down. 
* **Choose** _2 Weeks_. 
* **Click** the _0_ under _Grace Limit_. 
* **Type** `10`.
	- This will allow a User to log in 10 times after their password is expired before requiring them to change passwords. 

#### Enable Password Lockout
1. **Click** _Lockout_ to expand the section. 
* **Click** the toggle to _Enable Lockout_. 
* **Type** `5` under _Maximum Failure_.
* **Click** the _Lockout Duration_ drop-down. 
* **Choose** _30 Minutes_. 
* **Click** _Save_. 

#### Assign the Employee Password Policy to Users
1. **Click** the _Options_ (three dots) icon next to _Employee Password Policy_. 
* **Click** _Assign Members_.
* **Click** the _Add_ button at the top right. 
* **Click** the checkbox beside _Filter and Order_ to select all Users. 
* **Click** _Add_. 

#### Assign the Employee Password Policy to an Organization
1. **Click** the _Organizations_ tab to the right of _Users_.
* **Click** the _Add_ button at the top right. 
	- You should see three Organizations, Mondego Investments and its two Sub-Organizations, Investment Advisors and Investment Marketing. 
* **Click** the checkbox next to _Mondego Investments_ to select. 
* **Click** _Add_. 

#### Create a New User
1. **Open** the _Global Menu_. 
* **Click** _Users and Organizations_ under _Control Panel > Users_. 
* **Click** the _Add_ button. 
* **Type** `evie.calhoun` for the _Screen Name_. 
* **Type** `evie.calhoun@mondego.com` for the _Email Address_. 
* **Type** `Evie` for the _First Name_. 
* **Type** `Calhoun` for the _Last Name_. 
* **Click** _Save_ at the bottom of the page. 

#### Give Evie Calhoun a Password
1. **Click** _Password_ in the menu on the left. 
* **Type** `test` for the _New Password_. 
* **Type** `test` once more for _Enter Again_. 
* **Click** _Save_. 

#### Add Evie Calhoun to the Mondego Investments Organization
1. **Click** _Organizations_ in the menu on the left. 
* **Click** _Select_ beside _Organizations_. 
* **Click** _Choose_ beside _Mondego Investments_. 
* **Click** _Save_. 

#### Sign In as Evie Calhoun and Set a New Password
1. **Open** the _Personal Menu_. 
* **Click** _Sign Out_. 
* **Click** _Sign In_. 
* **Sign In** using the email and password we just set. 
	- Email: `evie.calhoun@mondego.com`
	- Password: `test`
* **Click** _I Agree_ to the _Terms of Use_. 
* **Type** `t3st` as the _New Password_ and _Enter Again_. 
* **Click** _Save_. 
	- You should get an error informing you that the password is too short. 
* **Type** `investment` as the _New Password_ and _Enter Again_.
* **Click** _Save_.
	- You should get an error informing you that the password needs at least 1 number. 
* **Type** `1Nvestment!` as the _New Password_ and _Enter Again_.
	- This password should meet all of the requirements established in the Employee Password Policy. Feel free to continue experimenting with invalid passwords to preview the error messages before saving a valid one.
* **Click** _Save_. 
* **Choose** a _Password Reminder_ question. 
* **Type** an answer.
* **Click** _Save_. 

---

#### Bonus Exercise
1. Add another Password Policy for Mondego Customers. Set syntax requirements, a password expiration, and enable password history and account lockout. Assign an existing User to this policy instead of the Employee Policy. 