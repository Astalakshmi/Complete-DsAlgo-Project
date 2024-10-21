@Array
Feature: DsPortal Array Page Functionality

  Background: Successful login with valid credentials
   Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"
    

  @Array_GetStarted @Array_TC_001
  Scenario: Validating Array Module
    Given the user is in homepage and logged in 
    When the User clicks Get Started button in the Array section
    Then the User should get navigated to the Array Module  Page

  @AIP @Array_TC_002
  Scenario: Validating the Arrays in Python link in Array Module Page
    Given the User is on the Array Module page
    When the User clicks Arrays in Python link in the Array Module Page
    Then the User should get navigated to the Arrays in Python Page

  @AIPTryEditor @Array_TC_003
  Scenario: Validating Try here button in Arrays in Python
    Given the User is on the Arrays in Python page
    When the User clicks the Try here in Arrays in Python Page
    Then the User should get navigated to the Try Editor Page through the Arrays in Python Page


  @AIPTryEditorPagePositive @Array_TC_004
  Scenario: Validating Try here Page for positive input through the Arrays in Python Page
    Given the User is on the Try Editor page through the Arrays in Python Page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

      
  @AIPTryEditorPageNegative @Array_TC_005
  Scenario Outline: Validating Try here Page for negative input through the Arrays in Python Page
    Given the User is on the Try Editor page through the Arrays in Python Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code             | error                                           |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |

  @AIPPracQns @Array_TC_006
  Scenario: Validating Practice Questions link in Array in Python Page
    Given the User is on the Arrays in Python page
    When the User clicks Practice Questions link in the Python Page
    Then the User should get navigated to the Practice Questions Page from the Array in Python Page

  @AIPPracQns1 @Array_TC_007
  Scenario: Validating Search the Array in Array in Python Page
    Given the User is on the Practice Questions page
    When the User clicks the Search the array link in Practice Questions Page
    Then the User should get navigated to the Search the Array Page

  @AIPPracQns2 @AIPPracQns2TC_008
  Scenario: Validating the Max Consecutive Ones in Array in Python Page
    Given the User is on the Practice Questions page
    When the User clicks the Max Consecutive Ones link in Practice Questions Page
    Then the User should get navigated to the Max Consecutive Ones Page

  @AIPPracQns3 @AIPPracQns3TC_009
  Scenario: Validating the Find Numbers with Even Number of Digits in Array in Python Page
    Given the User is on the Practice Questions page
    When the User clicks the Find Numbers with Even Number of Digits link in Practice Questions Page
    Then the User should get navigated to the Find Numbers with Even Number of Digits Page

  @AIPPracQns4 @AIPPracQns4TC_010
  Scenario: Validating the Squares of a Sorted Array in Array in Python Page
    Given the User is on the Practice Questions page
    When the User clicks the Squares of a Sorted Array link in Practice Questions Page
    Then the User should get navigated to the Squares of a Sorted Array Page

  @AUL @AULTC_011
  Scenario: Validating the Arrays using List link in Array Module Page
    Given the User is on the Array Module page
    When the User clicks Arrays using List link in the Array Module Page
    Then the User should get navigated to the Arrays using List Page

  @AULTryEditor @AULEditorTC_012
  Scenario: Validating Try here button in Arrays using List Page
    Given the User is on the Arrays using List page
    When the User clicks the Try here in Arrays using List Page
    Then the User should get navigated to the Try Editor Page from Arrays using List
                                           |
  @AULTryEditorPagePositive @Array_TC_013
  Scenario: Validating Try here Page for positive input through the Arrays using List Page
    Given the User is on the Try Editor page through the Arrays using List
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

    
  @AULTryEditorPageNegative @Array_TC_014
  Scenario Outline: Validating Try here Page for negative input through the Arrays using List Page
    Given the User is on the Try Editor page through the Arrays using List
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code             | error                                           |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |  

  @AULPracQns @AULPracQnsTC_015
  Scenario: Validating Practice Questions link in Arrays using List Page
    Given the User is on the Arrays using List page
    When the User clicks Practice Questions link in the Arrays using List Page
    Then the User should get navigated to the Practice Questions Page from Arrays using List

  @BOL @BOLTC_016
  Scenario: Validating the Basic Operations in Lists link in Array Module Page
    Given the User is on the Array Module page
    When the User clicks Basic Operations in Lists link in the Array Module Page
    Then the User should get navigated to the Basic Operations in Lists Page

  @BOLTryEditor @BOLEditorTC_017
  Scenario: Validating Try here button in Basic Operations in Lists Page
    Given the User is on the Basic Operations in Lists page
    When the User clicks the Try here in Basic Operations in Lists Page
    Then the User should get navigated to the Try Editor Page from the Basic Operations in Lists
                                           |
  @BOLTryEditorPagePositive @Array_TC_018
  Scenario: Validating Try here Page for positive input through the Basic Operations in Lists Page
    Given the User is on the Try Editor page through the Basic Operations in Lists Page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

	@BOLTryEditorPageNegative @Array_TC_019
  Scenario Outline: Validating Try here Page for negative input through the Arrays using List Page
    Given the User is on the Try Editor page through the Basic Operations in Lists Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code             | error                                           |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            | 
       
  @BOLPracQns @BOLPracQnsTC_020
  Scenario: Validating Practice Questions link in Basic Operations in Lists Page
    Given the User is on the Basic Operations in Lists page
    When the User clicks Practice Questions link in the Basic Operations in Lists Page
    Then the User should get navigated to the Practice Questions Page from the Basic Operations in Lists

  @AOA @AOATC_021
  Scenario: Validating the Applications of Array link in Array Module Page
    Given the User is on the Array Module page
    When the User clicks Applications of Array link in the Array Module Page
    Then the User should get navigated to the Applications of Array Page

  @AOATryEditor @AOAEditorTC_022
  Scenario: Validating Try here button in Applications of Array Page
    Given the User is on the Applications of Array page
    When the User clicks the Try here in Applications of Array Page
    Then the User should get navigated to the Try Editor Page from Applications of Array

  @AOATryEditorPagePositive @Array_TC_023
  Scenario: Validating Try here Page for positive input through the Applications of Array Page
    Given the User is on the Try Editor page through the Applications of Array Page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

      
  @AOATryEditorPageNegative @Array_TC_024
  Scenario Outline: Validating Try here Page for negative input through the Applications of Array Page
    Given the User is on the Try Editor page through the Applications of Array Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code             | error                                           |
      | print hello      | NameError: name 'hello' is not defined on line 1 |
      | aer234@$         | SyntaxError: bad token T_OP on line 1            |  
      
  @AOAPracQns @AOAPracQnsTC_025
  Scenario: Validating Practice Questions link in Applications of Array Page
    Given the User is on the Applications of Array page
    When the User clicks Practice Questions link in the Applications of Array Page
    Then the User should get navigated to the Practice Questions Page from the Applications of Array

  #----------------------------PracQns----------------------------
  @PracQns1RunButton @Array_TC_026
  Scenario Outline: Validating Run button with valid and invalid code in Search the Array Page
    Given the User is on the Search the Array Page
    When the User enters code from "<sheetName>" in <rowNumber> in the Editor section and click Run
    Then the User should vaidate the expected output in the Practice Questions Output section

    Examples: 
      | sheetName   | rowNumber |
      | PracticeQns |  0        |
      | PracticeQns |  1        |
         
  @PracQns1SubmitButton @Array_TC_027
  Scenario Outline: Validating Submit button with valid and invalid code in Search the Array Page
    Given the User is on the Search the Array Page
    When the User enters code from "<sheetName>" in <rowNumber> in the Editor section and click Submit
    Then the User should vaidate the expected output in the Practice Questions Output section

    Examples: 
      | sheetName   | rowNumber |
      | PracticeQns | 9         |
     

@PracQns2RunButton @Array_TC_028
  Scenario Outline: Validating Run button with valid and invalid code in Max Consecutive Ones Page
    Given the User is on the Max Consecutive Ones Page
    When the User enters code from "<sheetName>" in <rowNumber> in the Editor section and click Run
    Then the User should vaidate the expected output in the Practice Questions Output section

    Examples: 
      | sheetName   | rowNumber |
      | PracticeQns |  3        |
      | PracticeQns |  4        |
         
  @PracQns2SubmitButton @Array_TC_029
  Scenario Outline: Validating Submit button with valid and invalid code in Max Consecutive Ones Page
    Given the User is on the Max Consecutive Ones Page
    When the User enters code from "<sheetName>" in <rowNumber> in the Editor section and click Submit
    Then the User should vaidate the expected output in the Practice Questions Output section

    Examples: 
      | sheetName   | rowNumber |
      | PracticeQns | 10        |
     

   @PracQns3RunButton @Array_TC_030
  Scenario Outline: Validating Run button with valid and invalid code in Find Numbers with Even Number of Digits Page
    Given the User is on the Find Numbers with Even Number of Digits Page
    When the User enters code from "<sheetName>" in <rowNumber> in the Editor section and click Run
    Then the User should vaidate the expected output in the Practice Questions Output section

     Examples: 
      | sheetName   | rowNumber |
      | PracticeQns |   5       |
      | PracticeQns |   6       |
      
  @PracQns3SubmitButton @Array_TC_031
  Scenario Outline: Validating Submit button with valid and invalid code in Find Numbers with Even Number of Digits Page
    Given the User is on the Find Numbers with Even Number of Digits Page
    When the User enters code from "<sheetName>" in <rowNumber> in the Editor section and click Submit
    Then the User should vaidate the expected output in the Practice Questions Output section

    Examples: 
      | sheetName   | rowNumber|output                  |
      | PracticeQns | 11       |findNumbersSubmitOutput1|
      
  @PracQns4RunButton @Array_TC_032
  Scenario Outline: Validating Run button with valid and invalid code in Squares of a Sorted Array Page
    Given the User is on the Squares of a Sorted Page
    When the User enters code from "<sheetName>" in <rowNumber> in the Editor section and click Run
    Then the User should vaidate the expected output in the Practice Questions Output section

     Examples: 
      | sheetName   | rowNumber |
      | PracticeQns |   7       |
      | PracticeQns |   8       |
      
  @PracQns4SubmitButton @Array_TC_0233
  Scenario Outline: Validating Submit button with valid and invalid code in Squares of a Sorted Array Page
    Given the User is on the Squares of a Sorted Page
    When the User enters code from "<sheetName>" in <rowNumber> in the Editor section and click Submit
    Then the User should vaidate the expected output in the Practice Questions Output section

    Examples: 
      | sheetName   | rowNumber |output                  |
      | PracticeQns |  12       |sortedArraySubmitOutput1|
    
 