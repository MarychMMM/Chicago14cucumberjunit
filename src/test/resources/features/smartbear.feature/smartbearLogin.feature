@sm
Feature: Smartbear login feature verifications
  Agile Story: When user is on the login page of SmartBear app user should
  be able to login using correct test data
  A/C:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
  1- Only authenticated user should be able to login
  Link:
  Authenticated test data:
  Username: Test
  Password: tester
  2- User should see "Welcome, Tester!" displayed when logged in.

  @positiveLogin
  Scenario: As a user I should be able to login using authenticated test data
    Given Smartbear login home page
    When User enters valid credentials
    Then User should be able to login
    And User should see Weclome, Tester! when he login.


  @negativeLogin
  Scenario: When user enters correct username and incorrect password user should see error message
    Given Smartbear login home page
    When User enters valid username
    And User enters not valid password
    Then User should be able to login
    And User should see error message when he login.