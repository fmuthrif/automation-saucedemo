Feature: Filter Product
  @Test
  Scenario: User can filter product
    Given User is in login page
    When User input username
    And User input password
    And User click button login
    When User redirect to homepage
    And User click filter icon
    Then User see result filter