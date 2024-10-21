@Stack
Feature: DS Portal Stack Page Functionality
  
    Background: Successful login with valid credentials
     Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"


  @StackGetStarted @StackTC_001
  Scenario: validate the stack page
    Given the user is in homepage and logged in
    When user clicks the get started button under stack section
    Then user views the stack page
    
  @StackOperationsInStack @StackTC_002  
  Scenario: validate the Operations in stack page
    Given the user is in stack page
    When user clicks the Operations in Stack link under the topics covered section
    Then user views the Operations in stack page
  
  @TryHereOperationsInStack @StackTC_003
  Scenario: validate the Try here page from Operations in stack page
    Given the User is on the Operations in stack page
    When the User clicks the Try here in Operations in stack Page
    Then the User should get navigated to the Try Editor Page
  
  @TryEditorOperationsInStackPositive @StackTC_004  
  Scenario: validate the Try editor for positive input from Operations in stack page
    Given the User is on the Try Editor page through the operations in stack page
     When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

      
   @TryEditorOperationsInStackNegative @StackTC_005  
  Scenario Outline: validate the Try editor for negative input from Operations in stack page
    Given the User is on the Try Editor page through the operations in stack page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert
    
   Examples: 
      | code             | error                                            |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |
      
   
  @StackImplementationInStack @StackTC_006   
  Scenario: validate the Implementation in stack page
    Given the user is in stack page
    When user clicks the Implementation in Stack link under the topics covered section
    Then user views the Implementation in stack page
  
  @TryHereImplementationInStack @StackTC_007  
  Scenario: validate the Try here page from Implementation in stack page
    Given the User is on the Implementation in stack page
    When the User clicks the Try here in Implementation in stack Page
    Then the User should get navigated to the Try Editor Page
  
  @TryEditorImplementationInStackPositive @StackTC_008   
  Scenario: validate the Try editor for positive input from Implementation in stack page
    Given the User is on the Try Editor page through the implementation in stack page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

      
  @TryEditorImplementationInStackNegative @StackTC_009   
  Scenario Outline: validate the Try editor for negative input from Implementation in stack page
    Given the User is on the Try Editor page through the implementation in stack page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert
    
   Examples: 
      | code             | error                                            |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |
      
    
  @StackApplicationsInStack @StackTC_010   
  Scenario: validate the Applications in stack page
    Given the user is in stack page
    When user clicks the Applications in Stack link under the topics covered section
    Then user views the Applications in stack page
  
  @TryHereApplicationsInStack @StackTC_011  
  Scenario: validate the Try here page from Applications in stack page
    Given the User is on the Applications in stack page
    When the User clicks the Try here in Applications in stack Page
    Then the User should get navigated to the Try Editor Page
  
  @TryEditorApplicationsInStackPositive @StackTC_012  
  Scenario: validate the Try editor for positive input from Applications in stack page
    Given the User is on the Try Editor page through the applications in stack page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

      
  @TryEditorApplicationsInStackNegative @StackTC_013  
  Scenario Outline: validate the Try editor for negative input from Applications in stack page
    Given the User is on the Try Editor page through the applications in stack page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert
    
   Examples: 
      | code             | error                                            |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |
      
   @PracticeOperations @StackTC_014 
   Scenario: validate the Stack practice questions page from Operations in stack page
    Given the User is on the Operations in stack page
    When the User clicks the Practice Questions link in Operations in stack Page
    Then the User should get navigated to the Stack Practice Questions Page
    
    @PracticeImplementation @StackTC_015 
   Scenario: validate the Stack practice questions page from Implementation in stack page
    Given the User is on the Implementation in stack page
    When the User clicks the Practice Questions link in Implementation in stack Page
    Then the User should get navigated to the Stack Practice Questions Page
    
    @PracticeApplication @StackTC_016 
   Scenario: validate the Stack practice questions page from Applications of stack page
    Given the User is on the Applications in stack page
    When the User clicks the Practice Questions link in Applications in stack Page
    Then the User should get navigated to the Stack Practice Questions Page
    
    @PracticeQuestionsStackFromOperations @StackTC_017 
   Scenario: validate the practice questions in Stack practice page through Operations in stack page
    Given the User is on the Operations in stack page
    When the User clicks the Practice Questions link in Operations in stack Page
    Then the User should view the practice questions of stack
    
    @PracticeQuestionsStackFromImplementation @StackTC_018 
   Scenario: validate the practice questions in Stack practice page through Implementation in stack page
    Given the User is on the Implementation in stack page
    When the User clicks the Practice Questions link in Implementation in stack Page
    Then the User should view the practice questions of stack
    
    @PracticeQuestionsStackFromApplication @StackTC_019 
   Scenario: validate the practice questions in Stack practice page through Applications in stack page
    Given the User is on the Applications in stack page
    When the User clicks the Practice Questions link in Applications in stack Page
    Then the User should view the practice questions of stack
    
    
    
    
    