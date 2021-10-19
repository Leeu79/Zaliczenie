Feature: MyStore - add user new address after login

  Scenario Outline: Add User  new address
    Given User is on the MyStore Website
    When User logged in by email <email> and password <password> MyStore Website and go to address page
    And User adds his new address data: alias <alias>, address <address> , city <city>, zip <zip>, country <country>, phone <phone> and saves new address data
    Then New address data added successfully
    And close browser

    Examples:
      | alias | address | city   | zip    | country | phone     | email                | password |
      | mlody | balzaka | Warsaw | 01-922 | Poland  | 501100100 | maksym1979@gmail.com | kapsel   |