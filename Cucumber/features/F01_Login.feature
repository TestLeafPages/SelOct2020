Feature: Leaftaps login functionality

#Background:
#Given launch the Chrome Browser
#And load the application url

Scenario Outline: Test the login with positve credential
Given Enter the username as <username>
And Enter the password as <password>
When click on login button
Then Homepage should be displayed 

Examples:
|username|password|
|demosalesmanager|crmsfa|
|democsr|crmsfa|

Scenario: Test the login with negative credential
Given Enter the username as demosalesmanager
And Enter the password as crmsfa123
When click on login button
But Error message should be displayed