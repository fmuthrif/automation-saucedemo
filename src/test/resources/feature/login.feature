Feature: Login
  Scenario: As a user, I can do login
    Given User is in login page
    When User input username
    And User input password
    And User click button login
    Then User redirect to homepage

    Scenario: As a user, I cannot login with invalid user
      Given User is in login page
      When User input invalid username
      And User input password
      And User click button login
      Then User will see error state
      @Test
      Scenario: As a user, I can do logout
        Given User is in login page
        When User input username
        And User input password
        And User click button login
        When User redirect to homepage
        And User click hamburger icon
        And User click logout
        Then User is in login page

