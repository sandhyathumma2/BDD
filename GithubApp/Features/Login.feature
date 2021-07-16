Feature: GitHub Login Functionality

Scenario: User is trying to signin in GitHub account with Invalid credentials
Given User is on GitHub Login Page
When User Enter Invalid Credentials and click submit button
Then "Incorrect username or password." message should dispaly


Scenario: User is trying to signin in GitHub account with valid credentials
Given User is on GitHub Login Page
When User Enter Valid Credentials and click submit button
Then User successfully sign on his GitHub account 






