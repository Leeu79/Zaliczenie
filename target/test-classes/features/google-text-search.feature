Feature: Google search

  Scenario: user can search any keyword
    Given an open browser with google.com
    When a keyword selenium is entered in input field
    Then the first one should contain selenium
    And close search browser

    Scenario Outline: user can search any keyword
    Given an open browser with google.com
    When a keyword <keyword> is entered in input field
    Then the first one should contain <expectedkeyword>
    And close search browser

    Examples:
      | keyword | expectedkeyword |
      | karol | jacek |
      | karol | jacek |
