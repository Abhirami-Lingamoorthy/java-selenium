Feature: Functionality of page


@Smoke @Regression
Scenario Outline: Login with Positive Credentials
And enter the username as <username>
And enther the password as <password>
When clicking the Login Button
Then Verifying the Landing page

Examples:
|username|password|
|'DemosalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


@Sanity
Scenario: Login with Negative Credentials

When enter the username as 'DemosalesManager'
When enther the password as 'crmsfa1'
When clicking the Login Button
But Error message should be displayed