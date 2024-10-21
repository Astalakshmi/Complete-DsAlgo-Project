@Registration
Feature: DS Portal Register Functionality

  @RegisterValidCredentials @RegistrationTest001
  Scenario: Successful Register with valid Credential
    Given The User navigates to the Registration page
    When The User enter valid username and password then confirmPassword from sheet "RegisterPage"
    Then The User should get navigated to Login Page

  @RegisterInvalidCredentials @RegistrationTest002
  Scenario Outline: Unsuccessful Register with Invalid Credentials
    Given The User navigates to the Registration page
    When The User enter Invalid username and password then confirmPassword from sheet "<sheetName>" and <rowNumber> and click register button
    Then The User validate the Excepted Output for Registration Page

    Examples: 
      | sheetName    | rowNumber |
      | RegisterPage |         1 |
      | RegisterPage |         2 |
      | RegisterPage |         3 |
      | RegisterPage |         4 |
      | RegisterPage |         5 |
      | RegisterPage |         6 |
      | RegisterPage |         7 |
      | RegisterPage |         8 |