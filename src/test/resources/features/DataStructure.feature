@DataStructure
Feature: Ds Portal DataStructure-Introduction Page Functionality

  Background: Successful login with valid credentials
    Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"

  @DataIntro @DataTC_001
  Scenario: Validate the DataStructure module page by clicking Get Started
    Given the user is in homepage and logged in
    When user clicked on the Data Structure Get Started link button
    Then user is able view the Data Structure Introduction Page

  @DataTimecomp @DataTC_002
  Scenario: Validate the DataStructure Introduction page Timecomplexity link
    Given user is on the DataStructure Introduction page
    When user clicked the Time complexity link from the DataStructure page
    Then user is able to view the Time Complexity Page

  @TimeCompTryhere @DataTC_003
  Scenario: Validate the Time Complexity page	Try here
    Given user is on the time complexity page
    When user clicked the Try here link from the time complexity Page
    Then the User should get navigated to the Try Editor Page

   @TimeCompTryEditor @DataTC_004
  Scenario: Validate the Try editor for positive input from Time Complexity page
    Given the User is on the Try Editor page from Time Complexity page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @TimeCompTryEditorNegative @TreeTC_005
  Scenario Outline: validate the Try editor for negative input from Time Complexity page
    Given the User is on the Try Editor page from Time Complexity page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @DataTimecompPracQues @DataTC_006
  Scenario: Validate the Time Complexity page Practice Questions
    Given user is on the time complexity page
    When user clicked the Practice Questions from the time complexity Page
   # Then user is get navigated to the Time Complexity link Practice Questions Page
    Then user should view the Practice Questions of DataStructure