@BuySweter
Feature: MyStore - add user new address after login

  Scenario Outline: Add User  new address
    Given User is on the MyStore Web
    When User logged in by email <email> and password <password> MyStore Website
    And User goes to store and choose sweter
    And User defines sweter quantity <quantity> and size <size> and adds to cart
    And Check if <quantity> and <size> are correctly added
    And Proceed to checkout page
    And Pick payment method and proceed
    And User takes a screen of the order
    And The user goes to the order history
    Then User check order price <price> and information <information>
    And close shop browser


    Examples:
      | email                | password | quantity | size | price   | information            |
      | maksym1979@gmail.com | kapsel   | 5        | M    | €143.60 | Awaiting check payment |