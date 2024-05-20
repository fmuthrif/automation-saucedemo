Feature: Order Product
  Scenario: As a user, I can add product to cart
    Given User is in login page
    When User input username
    And User input password
    And User click button login
    When User redirect to homepage
    And User click button add to cart
    And User click icon cart
    Then User is in cart page

    Scenario: As a user, I can buy a product
      Given User is in login page
      When User input username
      And User input password
      And User click button login
      When User redirect to homepage
      And User click button add to cart
      And User click icon cart
      When User is in cart page
      And User click button checkout
      And User input first name
      And User input last name
      And User input postal code
      And User click button continue
      When User is in checkout overview page
      And User click button finish
      Then User is in checkout complete page

      Scenario: As a user, I can see product details
        Given User is in login page
        When User input username
        And User input password
        And User click button login
        When User redirect to homepage
        And User click title product
        Then User is in product detail page


