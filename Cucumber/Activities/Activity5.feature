@activity5
Feature: Data driven test with Example

  Scenario Outline: Testing with Data from Scenario
    Given User is on LoginPage
    When User enter "<Usernames>" & "<Passwords>"
    Then Read the pageTitle and confirmation message
    And Close the Browser page

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
      | adminUser | Password  |