@Graph
Feature: DS Portal Graph Page Functionality

  Background: Successful login with valid credentials
    Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"

  @GraphPage @GraphTest_001
  Scenario: Validate the Graph Page
    Given the user is in homepage and logged in
    When The User clicks Get Started button in the Graph section
    Then The User should get navigated to the DsAlgo Portal Graph Page

  @GraphList @GraphListTest_002
  Scenario: Validate the Graph page link
    Given The User is on the Graph Page
    When The User clicks Graph link
    Then The User should get navigated to first Topic Graph Page

  @GraphTryHere @GraphTryHereTest_003
  Scenario: Validate the navigation from the first Topic Graph Page to the Try Editor page
    Given The User is on the first Topic Graph Page
    When The User clicks Try Here button in the first topic Graph Page
    Then the User should get navigated to the Try Editor Page

  @GraphTryEditorPositive @GraphEditorTest_004
  Scenario: validate the Try editor for positive input from the first Topic Graph Page
    Given the User is on the Try Editor page through the first Topic Graph Page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen
      
   @GraphTryEditorNegative @GraphEditorTest_011
   Scenario Outline: validate the Try editor for negative input from the first Topic Graph Page
    Given the User is on the Try Editor page through the first Topic Graph Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

     Examples: 
      | code             | error                                            |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |
      
      
  @GraphPracticeQuestionLink1 @GraphQuestionTest_009
  Scenario: Validate the Practice Questions
    Given The User is on the first Topic Graph Page
    When The User clicks Practice Questions link
    Then The User should navigate to Practice Question Page

  @GraphRepresentations @GraphRepTest_005
  Scenario: Validate the Graph Representations page
    Given The User is on the Graph Page
    When The User clicks Graph Representations link
    Then The User should get navigated to Graph Representation Page

  @GraphReprTryHere @GraphReprTryHereTest_006
  Scenario: Validate the navigation from the Graph Representation Page to the Try Editor page
    Given The User is on the Graph Representation Page
    When The User clicks Try Here button in the Graph Representation Page
    Then the User should get navigated to the Try Editor Page

  @GraphReprTryEditorPositive @GraphReprEditorTest_007
  Scenario: validate the Try editor for positive input from the Graph Representation Page
    Given the User is on the Try Editor page through the Graph Representation Page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen
    
   @GraphReprTryEditorNegative @GraphReprEditorTest_012
   Scenario Outline: validate the Try editor for negative input from the Graph Representation Page
    Given the User is on the Try Editor page through the Graph Representation Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert
 
    Examples: 
      | code             | error                                            |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |
        
      
  @GraphPracticeQuestionLink2 @GraphQuestionTest_010
  Scenario: Validate the Practice Questions
    Given The User is on the Graph Representation Page
    When The User clicks Practice Questions link
    Then The User should navigate to Practice Question Page