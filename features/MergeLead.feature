Feature: Functionality of page
#Background:

#Given Open the browser
#Given load the url
@functional
Scenario Outline: Login with positive credentials

When Enter the username as <username>
When Enter the password as <password>
When clicking the login button
When clicking the CRMSFA link
When Clicking the Leads Button
When Clicking the MergeLeads
When Clicking the From Lead
When Clicking the To Lead
Then Clicking the Merge Button
Then clicking the AlertBox
Examples:
|username|password|
|'DemosalesManager'|'crmsfa'|
