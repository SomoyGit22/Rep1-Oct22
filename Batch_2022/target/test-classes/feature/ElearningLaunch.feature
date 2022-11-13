Feature: to test ElearningUpskills

Scenario: sign up into elearningupskills and send message from there
    Given The elearningupskills website is Launched
    When click on Sign up
    And fill up the required fields and click on Register
    Then After successsful registeration , verify that the next button is visible
    And Click on Next
    And Click on name dropdwon
    And Click on Profile
    And CLick on messages
    And Click on Compose message
    And Fill up the fields  subject , message
    And Click on send message
    
 