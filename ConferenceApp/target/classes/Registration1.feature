Feature: Conference Registration Functionality

Scenario: User wants to Register personal Details in Conference Registration 
Given User is on Conference Registration Login Page
When  User is Click on Next Link
Then "Please fill the First Name" Error message should display
 When User Enter First Name "sandhya" cick on Next Link
Then "Please fill the Last Name" Error message should display
When User Enter LastName "thumma" cick on Next Link
Then "Please fill the Email" Error message should display
When User Enter Email "sandhyathumma2@gmail.com" cick on Next Link
Then "Please fill the Contact No." Error message should display
When User Enter Contact No "9100707016" cick on Next Link
Then "Please fill the Number of people attending" Error message should display
When User Enter No.Of people attending "2" cick on Next Link
Then "Please fill the Building & Room No" Error message should display
When User Enter AddressLine1 "Meerpet" cick on Next Link
Then "Please fill the Area name" Error message should display
When User Enter AddressLin2 "saroornagar" cick on Next Link
Then "Please select city" Error message should display
When User select city  "Hyderabad" cick on Next Link
Then "Please select state" Error message should display
When User select State  "Telangana" cick on Next Link
Then "Please Select MemeberShip status" Error message should display
When User select Conference full-Access(member)1000 Rs.cick on Next Link
Then user sucessfully validate "Personal details are validated." message should display

Scenario Outline: User wants to Register with valid data in ConferenceRegistration
Given User is on Conference Registration Login Page
When User Enter "<FirstName>" FirstName 
And User Enter  "<LastName>" LastName
When User Enter  "<Email>" Email
And User Enter  "<ContactNo>" ContactNo
When User Enter  "<No.of.people.attending>" No.of.people.attending
And User Enter  "<StreetAddressLine1>" StreetAddressLine1
When User Enter  "<StreetAddressLine2>" StreetAddressLine2
And User select  "<city>" city
When User select  "<state>" state
And User select  Conferencefull-Access(member)1000 Conferencefull-Access(member)
And User click on Next link 
Then user sucessfully validate "Personal details are validated." message should display

Examples:
|FirstName|LastName|Email|ContactNo|No.of.people.attending|StreetAddressLine1|StreetAddressLine2|city|state|
|Thumma|sandhya|sandhyathumma2@gmail.com|9100707016|5|Meerpet|Rangareddy|Hyderabad|Telangana|


