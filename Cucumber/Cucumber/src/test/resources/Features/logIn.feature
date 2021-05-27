Feature: LogIn into application

Scenario: LogIn into application
	Given Open application
	And enter username as "username" and password as "password"
	And click on submit
	Then user should navigate to homepage