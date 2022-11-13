Feature: Calculate BMI
Scenario: Validate title of page
When Launch website https://www.calculator.net
Then Validate title of the current page

Scenario Outline: Measure BMI
Given Open website https://www.calculator.net
When Click on BMI Calculator
And Enter age as "<Age>"
And Enter height as "<Height>"
And Enter weight as "<Weight>"
And Click on Calculate
Then Capture the BMI Result and Print

Examples:
| Age | Height | Weight |
|15|180|65|
|30|156|70|
|25|152|55|
|20|160|45|
|35|160|70|