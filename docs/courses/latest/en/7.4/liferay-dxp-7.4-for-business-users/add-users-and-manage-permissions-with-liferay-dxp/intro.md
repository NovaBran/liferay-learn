<div class="page"></div>

# Add Users and Manage Permissions with Liferay DXP

<div class="ahead">

#### Learning Objectives

* Learn how to create new Users and bring in existing Users without losing data
* Understand how Liferay DXP can organize Users into hierarchical structures and individual groups
* Learn how how to grant and limit access to Users by creating Roles that reflect real-world job functions 
* Understand how to control permissions for different resources on the platform

#### Tasks to Accomplish
* Get Users set up on the Mondego platform
    * Create User Accounts
    * Create a Hierarchy for Mondego Investments
    * Create User Groups for the Mondego Credit Card tiers
    * Create a new Dashboard page for Mondego Platinum Card holders
* Create a new Role and define the permissions
* Give the Role to a User and test access
* Control access to Site resources with Site Teams

#### Exercise Prerequisites

* Unzipped module exercise files in the following folder structure:
	- Windows: <code>C:\liferay</code>
	- Unix Systems: <code>[user-home]/liferay</code>
* Liferay DXP 7.4 set up and running
    - If you have not started your instance yet, first, make sure you have downloaded Docker, then use the following commands to get and start the Liferay Docker Image: 
        * docker pull liferay/[product]:[version]
        * docker run -it -m 8g -p 8080:8080 liferay/[product]:[version]
    - Once started, set up the instance with the following basic configuration:
        * Portal Name: Mondego
        * First Name: Test
        * Last Name: Test
        * Email: test@modego.com
    - Check out the Liferay Foundations: Introduction to Liferay DXP course if you have questions on starting a new instance of Liferay DXP
* Uncheck _Require strangers to verify their email address_ in the User Authentication section of the Control Panel under Instance Settings

</div>

<h2> Table of Contents </h2>

TABLE OF CONTENTS
