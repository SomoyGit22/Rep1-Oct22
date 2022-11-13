Feature: to sign up and edit profile in ElearningUpskills

Scenario: sign up in elearningupskills and edit profile
    Given: The elearningupskills website is opened
    When click on Sign up button
    And fill up required fields and click on Register button
    Then After successsful registeration is done, verify that the next button is visible
    And Click on Next button
    And Click on your name dropdwon
    And Click on Profile option
    And Click on Edit profile
    And Enter first name, last name, phone
    And Click on Save settings
