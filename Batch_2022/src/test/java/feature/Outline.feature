Feature: Scenario Outline
Scenario Outline: Log in to facebook
Given The Facebook website is brought up
When The username textbox is visible
And The password textbox is visible
Then Enter Username as "<username>" and Enter Password as "<password>"
And Click on Log in

| username | password |
| username1 | password1 |
| username2 | password2 |
