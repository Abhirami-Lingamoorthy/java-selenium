Feature: Functionality of page
#Background:

#Given Open the browser
#Given load the url
@Sanity
Scenario Outline: Login with positive credentials

When Enter the username as <username>
When Enter the password as <password>
When clicking the login button
When clicking the CRMSFA link
When Clicking the Leads button
When Clicking the FindLeads button
When Enter the FirstName as 'Abi'
Then Clicking the FindLeads
When clicking the Lead ID
Then Clicking the Duplicate Lead
Then Clicking the Submit Button

Examples:
|username|password|
|'DemosalesManager'|'crmsfa'|







