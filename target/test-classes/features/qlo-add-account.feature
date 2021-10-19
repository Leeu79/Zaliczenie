
Feature: Google search

  Scenario: create new account in QLO
    Given an open browser and https://qloapps.coderslab.pl/en/
    When I click sign In
    And I enter email superb15@gamil.com
    And I enter first Jacek second Brzuch password 123456
    Then see info  Your account has been created
    And close browsers