Feature: Functionality of page


@Smoke @Regression
Scenario Outline: Login with Positive Credentials
And enter the username as <username>
And enter the password as <password>
When clicking the Login Button1
Then Verifying the Landing page

Examples:
|username|password|
|'DemosalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


@Sanity
Scenario: Login with Negative Credentials

When enter the username as 'DemosalesManager'
When enter the password as 'crmsfa1'
When clicking the Login Button1
But Error message should be displayed