Feature: to test Facebook

Scenario: to launch facebook and log in to facebook
Given The Facebook website is launched
When The username is visible
Then Enter text ssuser
And Enter password
And Click Log in
