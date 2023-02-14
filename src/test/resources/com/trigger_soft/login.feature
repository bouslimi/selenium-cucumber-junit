Feature: User Login
  As a User, I can login to Trigger-Soft Webapp with my correct credentials.

  Scenario: Login with correct credentials
    Given I have a Trigger-Soft account
      | First Name | Last Name | Email                  | Password   |
      | Amine      | Ben       | amine@trigger-soft.com | qwerty@123 |
    When I visit Trigger-Soft Webapp
    And I login with my credentials
      | Login                  | Password   |
      | amine@trigger-soft.com | qwerty@123 |
    Then Trigger-Soft Homepage is displayed

  Scenario Outline: Login with wrong credentials
    Given I do not have a Trigger-Soft account
    When I visit Trigger-Soft Webapp
    And I enter wrong <Login> and or wrong <Password>
    Then An alert popup is displayed "Wrong Login and/or Password!"

    Examples:
      | Login                      | Password   |
      | wrong6152@trigger-soft.com | qwerty@123 |
      | amine@trigger-soft.com     | wrong@129  |
