Feature: Functionality of page
#Background:

#Given Open the browser
#Given load the url
@regression
Scenario: Login with positive Credentials


When enter the username as 'DemosalesManager'
When enter the password as 'crmsfa'
When Clicking the Login button
When Clicking the CRMSFA link	
When Clicking the Leads link
When Clicking the FindLeads link
When Clicking the Lead ID
When Clicking Edit button
When clear the companyname
Given the important note
Then clicking the submit button