@Login
Feature: DsAlgo Portal Login Functionality

  @LoginCredentials @LoginTC_001
  Scenario: Validate the login with valid credentials
    Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"
    Then The User get navigated to home page and successfully logged in

  @LoginInvalidCredentials @LoginTC_002
  Scenario Outline: Validate the login with Invalid Credentials
    Given The User is on the login page
    When The User enters the username "<sheetName>" password <rowNumber> and clicks on login button
    Then The User gets suggested to enter the valid credentials

    Examples: 
      | sheetName        | rowNumber |
      | LoginCredentials |         1 |
      | LoginCredentials |         2 |
      | LoginCredentials |         3 |
      | LoginCredentials |         4 |
      | LoginCredentials |         5 |

  @WithoutLogin @WithoutloginTC_003
  Scenario: Validate the Get Started Click button on Home page  without Login
    Given The User is on the home page without Login
    When The User clicked the any of the Get Started link in Home page
    Then The User should get the alert message

@DropdownWithoutLogin @WithoutloginTC_004
  Scenario: Validate the dropdown list from Home page without Login
    Given The User is on the home page without Login
    When The User clicked any of the dropdown list
    Then The User should get the alert message to access the dropdown list
  