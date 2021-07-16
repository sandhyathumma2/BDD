Feature: login Feature

Scenario Outline: Verify login functionality with valid credentials
Given User should open naukri login page
When user should enter valid credentials with "<username>" and "<password>" 
And  click on login button
Then login sucessfully message dispalyed and
Then  home page dispalyed

Examples:

|username|                password|
|sandhyathumma2@gmail.com| 9100707016|


 

