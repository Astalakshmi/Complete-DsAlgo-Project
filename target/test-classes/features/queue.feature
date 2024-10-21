@Queue
Feature: DS Portal Queue Page Functionality

  Background: Successful login with valid credentials
    Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"

  @QueuePage @QueueTest_001
  Scenario: Validate the Queue Page
    Given the user is in homepage and logged in
    When The User clicks Get Started button in the Queue section
    Then The User should get navigated to the DsAlgo Portal Queue Page

  @QueueList @QueueListTest_002
  Scenario: Validate the Implementation of the lists page
    Given The User is on the Queue Page
    When The User clicks Implementation of Queue in Python link
    Then The User should get navigated to Implementation lists

  @QueueListTryHere @QueueListTryHereTest_003
  Scenario: Validate the navigation from the Implementation Lists page to the Try Editor page
    Given The User is on the Implementation lists Page
    When The User clicks Try Here button in Queue Implementation List Page
    Then the User should get navigated to the Try Editor Page

  @QueueListTryEditorPositive @QueueListEditorTest_004
  Scenario: validate the Try editor for positive input from the Implementation Lists page
    Given the User is on the Try Editor page through the Implementation Lists page
     When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen
     
   @QueueListTryEditorNegative @QueueListEditorTest_018
   Scenario Outline: validate the Try editor for negative input from the Implementation Lists page
    Given the User is on the Try Editor page through the Implementation Lists page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code             | error                                            |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |
       

  @QueuePracticeQuestionLink1 @QueueQuestionlinkTest_014
  Scenario: Validate the Practice Questions
    Given The User is on the Implementation lists Page
    When The User clicks Practice Questions
    Then The User should navigate to queue Practice Page

  @DeQueue @DeQueueTest_005
  Scenario: Validate the Implementation Using Collections Dequeue
    Given The User is on the Queue Page
    When The User clicks Implementation Using Collections Dequeue link
    Then The User should get navigated to Implementation collection Page

  @DeQueueTryHere @DeQueueTryHereTest_006
  Scenario: Validate the navigation from the Implementation collection Page to the Try Editor page
    Given The User is on the Implementation collection Page
    When The User clicks Try Here button in the Implementation collection Page
    Then the User should get navigated to the Try Editor Page

  @DeQueueTryEditorPositive @DeQueueEditorTest_007
  Scenario: validate the Try editor for positive input from the Implementation collection Page
    Given the User is on the Try Editor page through the Implementation collection Page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen
    
  @DeQueueTryEditorNegative @DeQueueEditorTest_019
  Scenario Outline: validate the Try editor for negative input from the Implementation collection Page
    Given the User is on the Try Editor page through the Implementation collection Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

     Examples: 
      | code             | error                                            |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |
       
      
  @QueuePracticeQuestionLink2 @QueueQuestionTest_015
  Scenario: Validate the Practice Questions
    Given The User is on the Implementation collection Page
    When The User clicks Practice Questions
    Then The User should navigate to queue Practice Page

  @QueueArray @QueueArrayTest_008
  Scenario: Validate the Implementation using array
    Given The User is on the Queue Page
    When The User clicks Implementation using array link
    Then The User should get navigated to Implementation Array

  @QueueArrayTryHere @QueueArrayTryHereTest_009
  Scenario: Validate the navigation from the Implementation Array Page to the Try Editor page
    Given The User is on the Implementation collection Array Page
    When The User clicks Try Here button in the Implementation Array Page
    Then the User should get navigated to the Try Editor Page

  @QueueArrayTryEditorPositive @QueueArrayEditorTest_010
  Scenario: validate the Try editor for positive input from the Implementation Array Page
    Given the User is on the Try Editor page through the Implementation Array Page
     When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen
    
	@QueueArrayTryEditorNegative @QueueArrayEditorTest_020
  Scenario Outline: validate the Try editor for negative input from the Implementation Array Page
    Given the User is on the Try Editor page through the Implementation Array Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

     Examples: 
      | code             | error                                            |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |
      
  @QueuePracticeQuestionLink3 @QueueQuestionTest_016
  Scenario: Validate the Practice Questions
    Given The User is on the Implementation collection Array Page
    When The User clicks Practice Questions
    Then The User should navigate to queue Practice Page

  @QueueOperation @QueueOperationTest_011
  Scenario: Validate the Queue Operations
    Given The User is on the Queue Page
    When The User clicks Queue Operations link
    Then The User should get navigated to Queue Operation Page

  @QueueOperationTryHere @QueueOperTryHereTest_012
  Scenario: Validate the navigation from the Queue Operation Page to the Try Editor page
    Given The User is on the Queue Operation Page
    When The User clicks Try Here button in the Queue Operation Page
    Then the User should get navigated to the Try Editor Page

  @QueueOperationTryEditorPositive @QueueOperEditorTest_013
  Scenario: validate the Try editor for positive input from the Queue Operation Page
    Given the User is on the Try Editor page through Queue Operation Page
     When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen
      
   @QueueOperationTryEditorNegative @QueueOperEditorTest_021
   Scenario Outline: validate the Try editor for negative input from the Queue Operation Page
    Given the User is on the Try Editor page through Queue Operation Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code             | error                                            |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |

  @QueuePracticeQuestionLink4 @QueueQuestionTest_017
  Scenario: Validate the Practice Questions
    Given The User is on the Queue Operation Page
    When The User clicks Practice Questions
    Then The User should navigate to queue Practice Page