Feature: Payment Details Functionality

Scenario Outline: User wants to Register DebitCard Details in Payment Details
Given User is on payment Details Page
When user enter All Fields "<FirstName>","<LastName>","<DebitCardNumber>","<CVV>","<Expirationmonth>","<ExpirationYear>" with valid data
And user click on Register Button
Then user validate "Registarion successful!!!" message should dispalyed

Examples:
|FirstName|LastName|DebitCardNumber|CVV|Expirationmonth|ExpirationYear|
|sandhyaRani|Thumma|123456|4456|8|2025|


