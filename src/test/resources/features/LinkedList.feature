@LinkedList
Feature: DS Portal Linked List Page Functionality

  Background: Successful login with valid credentials
    Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"

  @LikedListGetStarted @LinkedListTC_001
  Scenario: validate linked list page
    Given the user is in homepage and logged in
    When the user clicks the get started button under linked list section
    Then the user views the linked list page

  @LinkedListIntroduction @LinkedListTC_002
  Scenario: validate the Introduction page
    Given the user is in linked list page
    When the user clicks the Introduction link under the topics covered section
    Then the user views the Introduction page

  @TryHereIntroduction @LinkedListTC_003
  Scenario: validate the Try here page from Introduction page
    Given the User is on the Introduction page
    When the User clicks the Try here in Introduction Page
    Then the User should get navigated to the Try Editor Page

  @TryEditorIntroductionPositive @LinkedListTC_004
  Scenario: Validate the Try editor for positive input from Introduction page
    Given the User is on the Try Editor page through the introduction page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

  @TryEditorIntroductionNegative @LinkedListTC_005
  Scenario Outline: validate the Try editor for negative input from Introduction page
    Given the User is on the Try Editor page through the introduction page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @CreatingLinkedList @LinkedListTC_006
  Scenario: validate the Creating linked list page
    Given the user is in linked list page
    When user clicks the creating linked list link under the topics covered section
    Then user views the creating linked list page

  @TryHereCreatingLinkedList @LinkedListTC_007
  Scenario: validate the Try here page from Creating Linked list page
    Given the User is on the Creating Linked list page
    When the User clicks the Try here in Creating Linked list Page
    Then the User should get navigated to the Try Editor Page

  @TryEditorCreatingLinkedListPositive @LinkedListTC_008
  Scenario Outline: validate the Try editor for positive input from Creating Linked list page
    Given the User is on the Try Editor page through the creating linked list page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

  @TryEditorCreatingLinkedListNegative @LinkedListTC_009
  Scenario Outline: validate the Try editor for negative input from Creating Linked list page
    Given the User is on the Try Editor page through the creating linked list page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @TypesOfLinkedList @LinkedListTC_010
  Scenario: validate the Types of linked list page
    Given the user is in linked list page
    When user clicks the Types of linked list link under the topics covered section
    Then user views the types of linked list page

  @TryHereTypesOfLinkedList @LinkedListTC_011
  Scenario: validate the Try here page from Types of Linked List page
    Given the User is on the Types of Linked List page
    When the User clicks the Try here in Types of Linked List Page
    Then the User should get navigated to the Try Editor Page

  @TryEditorTypesOfLinkedListPositive @LinkedListTC_012
  Scenario Outline: validate the Try editor for positive input from Types of Linked List page
    Given the User is on the Try Editor page through the types of linkedlist page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234 |
    Then the User should get the correct output on the screen

  @TryEditorTypesOfLinkedListNegative @LinkedListTC_013
  Scenario Outline: validate the Try editor for negative input from Types of Linked List page
    Given the User is on the Try Editor page through the types of linkedlist page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @ImplementLinkedList @LinkedListTC_014
  Scenario: validate the implement linked list in python page
    Given the user is in linked list page
    When user clicks the implement linked list in python  link under the topics covered section
    Then user views the implement linked list in python  page

  @TryHereImplementLinkedList @LinkedListTC_015
  Scenario: validate the Try here page from Implement Linked List in python page
    Given the User is on the Implement linked list in python page
    When the User clicks the Try here in Implement linked list in python Page
    Then the User should get navigated to the Try Editor Page

  @TryHereImplementLinkedListPositive @LinkedListTC_016
  Scenario Outline: validate the Try editor for positive input from Implement linked list in python page
    Given the User is on the Try Editor page through the implement linked list in python page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

  @TryHereImplementLinkedListNegative @LinkedListTC_017
  Scenario Outline: validate the Try editor for negative input from Implement linked list in python page
    Given the User is on the Try Editor page through the implement linked list in python page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @Traversal @LinkedListTC_018
  Scenario: validate the traversal page
    Given the user is in linked list page
    When user clicks the traversal link under the topics covered section
    Then user views the traversal page

  @TryHereTraversal @LinkedListTC_019
  Scenario: validate the Try here page from Traversal page
    Given the User is on the Traversal page
    When the User clicks the Try here in Traversal Page
    Then the User should get navigated to the Try Editor Page

  @TryEditorTraversalPositive @LinkedListTC_020
  Scenario Outline: validate the Try editor for positive input from Traversal page
    Given the User is on the Try Editor page through the traversal page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

  @TryEditorTraversalNegative @LinkedListTC_021
  Scenario Outline: validate the Try editor for negative input from Traversal page
    Given the User is on the Try Editor page through the traversal page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @Insertion @LinkedListTC_022
  Scenario: validate the insertion page
    Given the user is in linked list page
    When user clicks the insertion link under the topics covered section
    Then user views the insertion page

  @TryHereInsertion @LinkedListTC_023
  Scenario: validate the Try here page from Insertion page
    Given the User is on the Insertion page
    When the User clicks the Try here in Insertion Page
    Then the User should get navigated to the Try Editor Page

  @TryEditorInsertionPositive @LinkedListTC_024
  Scenario Outline: validate the Try editor for positive input from Insertion page
    Given the User is on the Try Editor page through the insertion page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

  @TryEditorInsertionNegative @LinkedListTC_025
  Scenario Outline: validate the Try editor for negative input from Insertion page
    Given the User is on the Try Editor page through the insertion page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @Deletion @LinkedListTC_026
  Scenario: validate the deletion page
    Given the user is in linked list page
    When user clicks the deletion link under the topics covered section
    Then user views the deletion page

  @TryHereDeletion @LinkedListTC_027
  Scenario: validate the Try here page from Deletion page
    Given the User is on the Deletion page
    When the User clicks the Try here in Deletion Page
    Then the User should get navigated to the Try Editor Page

  @TryEditorDeletionPositive @LinkedListTC_028
  Scenario Outline: validate the Try editor for positive input from Deletion page
    Given the User is on the Try Editor page through the deletion page
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen

  @TryEditorDeletionNegative @LinkedListTC_029
  Scenario Outline: validate the Try editor for negative input from Deletion page
    Given the User is on the Try Editor page through the deletion page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @PracticeIntroduction @LinkedListTC_030
  Scenario: validate the Linked list practice questions page from Introduction page
    Given the User is on the Introduction page
    When the User clicks the Practice Questions link in Introduction Page
    Then the User should get navigated to the Linked List Practice Questions Page

  @PracticeCreatingList @LinkedListTC_031
  Scenario: validate the Linked list practice questions page from Introduction page
    Given the User is on the Creating Linked list page
    When the User clicks the Practice Questions link in Creating Linked list Page
    Then the User should get navigated to the Linked List Practice Questions Page

  @PracticeImplementList @LinkedListTC_032
  Scenario: validate the Linked list practice questions page from Introduction page
    Given the User is on the Implement linked list in python page
    When the User clicks the Practice Questions link in Implement linked list Page
    Then the User should get navigated to the Linked List Practice Questions Page

  @PracticeTypesOfList @LinkedListTC_033
  Scenario: validate the Linked list practice questions page from Introduction page
    Given the User is on the Types of Linked List page
    When the User clicks the Practice Questions link in Types of Linked List Page
    Then the User should get navigated to the Linked List Practice Questions Page

  @PracticeTraversal @LinkedListTC_034
  Scenario: validate the Linked list practice questions page from Introduction page
    Given the User is on the Traversal page
    When the User clicks the Practice Questions link in Traversal Page
    Then the User should get navigated to the Linked List Practice Questions Page

  @PracticeInsertion @LinkedListTC_035
  Scenario: validate the Linked list practice questions page from Introduction page
    Given the User is on the Insertion page
    When the User clicks the Practice Questions link in Insertion Page
    Then the User should get navigated to the Linked List Practice Questions Page

  @PracticeDeletion @LinkedListTC_036
  Scenario: validate the Linked list practice questions page from Introduction page
    Given the User is on the Deletion page
    When the User clicks the Practice Questions link in Deletion Page
    Then the User should get navigated to the Linked List Practice Questions Page

  @PracticeQuestionsListIntroduction @LinkedListTC_037
  Scenario: validate the practice questions in Linked list practice page through Introduction page
    Given the User is on the Introduction page
    When the User clicks the Practice Questions link in Introduction Page
    Then the User should view the practice questions of Linked List

  @PracticeQuestionsListCreating @LinkedListTC_038
  Scenario: validate the practice questions in Linked list practice page through Creating Linked list page
    Given the User is on the Creating Linked list page
    When the User clicks the Practice Questions link in Creating Linked list Page
    Then the User should view the practice questions of Linked List

  @PracticeQuestionsListImplement @LinkedListTC_039
  Scenario: validate the practice questions in Linked list practice page through Implement linked lis page
    Given the User is on the Implement linked list in python page
    When the User clicks the Practice Questions link in Implement linked list Page
    Then the User should view the practice questions of Linked List

  @PracticeQuestionsListTypes @LinkedListTC_040
  Scenario: validate the practice questions in Linked list practice page through Types of Linked List page
    Given the User is on the Types of Linked List page
    When the User clicks the Practice Questions link in Types of Linked List Page
    Then the User should view the practice questions of Linked List

  @PracticeQuestionsListTraversal @LinkedListTC_041
  Scenario: validate the practice questions in Linked list practice page through Traversal page
    Given the User is on the Traversal page
    When the User clicks the Practice Questions link in Traversal Page
    Then the User should view the practice questions of Linked List

  @PracticeQuestionsListInsertion @LinkedListTC_042
  Scenario: validate the practice questions in Linked list practice page through Insertion page
    Given the User is on the Insertion page
    When the User clicks the Practice Questions link in Insertion Page
    Then the User should view the practice questions of Linked List

  @PracticeQuestionsListDeletion @LinkedListTC_043
  Scenario: validate the practice questions in Linked list practice page through Deletion page
    Given the User is on the Deletion page
    When the User clicks the Practice Questions link in Deletion Page
    Then the User should view the practice questions of Linked List
