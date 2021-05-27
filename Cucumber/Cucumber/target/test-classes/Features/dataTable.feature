Feature: LogIn into application

  Scenario: LogIn into application
    Given Open application
    And I enter the following details for login
      | Username | password |
      | Kishan    | abc123    |
    And click on submit
    Then user should navigate to homepage
