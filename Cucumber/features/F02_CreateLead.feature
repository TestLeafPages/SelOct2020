Feature: Leaftaps Create Lead functionality

@functional @regression
Scenario: Test the create lead with mandatory fields
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
When click on login button
Then Homepage should be displayed
When click on crmsfa link
Then MyHome page should be displayed