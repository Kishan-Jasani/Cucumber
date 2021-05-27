Feature: LogIn into application

  Scenario Outline: LogIn into application
    Given Open application
    And enter username as <username> and password as <password>
    And click on submit
    Then user should navigate to homepage

    Examples: 
      | username | password |
      | admin1   | admin1   |
      | admin2   | admin2   |
      | admin3   | admin3   |
