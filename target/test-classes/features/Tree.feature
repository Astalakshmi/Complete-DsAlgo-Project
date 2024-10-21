@Tree
Feature: Ds Portal Tree Page Functionality

  Background: Successful login with valid credentials
    Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"

  @TreeGetStarted @TreeTC_001
  Scenario: Validate the Tree Module page by clicking Get Started
    Given the user is in homepage and logged in
    When user clicked on the Tree Get Started link button
    Then user is able to view the Tree Module Page

  @TreeOverviewtrees @TreeTC_002
  Scenario: Validate the Tree Module Page Overview of Trees link
    Given user is on the Tree module page
    When user clicked the overview of Trees link

  @OverviewTreesTryhere @TreeTC_003
  Scenario: Validate  the Overview of Trees Try here
    Given user is on the Overview of Trees Page
    When user clicked the Try here link from the Overview of Trees Page
    Then the User should get navigated to the Try Editor Page

  @OverviewTreesTryeditor @TreeTC_004
  Scenario: validate the Try editor for positive input from Overview of Trees page
    Given the User is on the Try Editor page from Overview of Trees link
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @OverviewTreesTryeditorNegative @TreeTC_005
  Scenario Outline: validate the Try editor for negative input from Overview of Trees page
    Given the User is on the Try Editor page from Overview of Trees link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @OverviewTreesPracques @TreeTC_006
  Scenario: Validate the Overview of Trees page Practice Questions
    Given user is on the Overview of Trees Page
    When user clicked the Practice Questions from Overview of Trees page
    Then user should view the Practice Questions of Tree

  @TreeTerminologies @TreeTC_007
  Scenario: Validate the Tree Module Page Terminologies link
    Given user is on the Tree module page
    When user clicked Terminologies link on the Tree Module page
    Then user is able to view the Terminologies linked page

  @TerminologiesTryhere @TreeTC_008
  Scenario: Validate the Terminologies Try here
    Given user is on the Terminologies page
    When user clicked the Try here on the Terminologies page
    Then the User should get navigated to the Try Editor Page

   @TerminologiesTryEditor @TreeTC_009
  Scenario: validate the Try editor for positive input from Terminologies page
    Given the User is on the Try Editor page from Terminologies link
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @TerminologiesTryEditorNegative @TreeTC_010
  Scenario Outline: validate the Try editor for negative input from Terminologies page
    Given the User is on the Try Editor page from Terminologies link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @TerminologiesPracQues @TreeTC_011
  Scenario: Validate the Terminologies page Practice Questions
    Given user is on the Terminologies page
    When user clicked the Practice Questions from Terminologies page
    Then user should view the Practice Questions of Tree

  @TreeTypesTrees @TreeTC_012
  Scenario: Validate the Tree Module Page Types of Trees link
    Given user is on the Tree module page
    When user clicked Types of Trees link in the Tree Modulepage
    Then user is able to view the Types of Trees linked page

  @TypeTreesTryhere @TreeTC_013
  Scenario: Validate the  Type of Trees Try here
    Given user is on the Type of Trees page
    When user clicked the Try here on the Types of Trees page
    Then the User should get navigated to the Try Editor Page

 @TypesTreesTryEditor @TreeTC_014
  Scenario: Validate the Try editor for positive input from Type of Trees page
    Given the User is on the Try Editor page from Type of Trees link
     When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @TypesTreesTryEditorNegative @TreeTC_015
  Scenario Outline: validate the Try editor for negative input from Type of Trees page
    Given the User is on the Try Editor page from Type of Trees link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @TypeTreesPracQues @TreeTC_016
  Scenario: Validate the Type of Trees page Practice Questions
    Given user is on the Type of Trees page
    When user clicked the Practice Questions from Type of Trees page
    Then user should view the Practice Questions of Tree

  @TreeTraversals @TreeTC_017
  Scenario: Validate the Tree Module Page Tree Traversals link
    Given user is on the Tree module page
    When user clicked Tree Traversals link in the Tree Module page
    Then user is able to view the Tree Traversals linked page

  @TraversalsTryhere @TreeTC_018
  Scenario: Validate the  Tree Traversals Try here
    Given user is on the Tree Traversals page
    When user clicked the Try here on the Tree Traversals page
    Then the User should get navigated to the Try Editor Page

  @TreeTraversalsTryEditor @TreeTC_019
  Scenario: Validate the Try editor for positive input from Tree Traversals page
    Given the User is on the Try Editor page from Tree Traversals link
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @TreeTraversalsTryEditorNegative @TreeTC_020
  Scenario Outline: validate the Try editor for negative input from Tree Traversals page
    Given the User is on the Try Editor page from Tree Traversals link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @TreeTraversalsPracQues @TreeTC_021
  Scenario: Validate the Tree Traversals page Practice Questions
    Given user is on the Tree Traversals page
    When user clicked the Practice Questions from Tree Traversals page
    Then user should view the Practice Questions of Tree

  @TraversalsIllustration @TreeTC_022
  Scenario: Validate the Tree Module Page Traversals Illustration link
    Given user is on the Tree module page
    When user clicked Traversals Illustration link in the Tree Module page
    Then user is able to view the Traversals Illustration linked page

  @IllustrationTryhere @TreeTC_023
  Scenario: Validate the Traversals Illustration Try here
    Given user is on the Traversals Illustration
    When user clicked the Try here on the Traversals Illustration page
    Then the User should get navigated to the Try Editor Page

  @IllustrationTryEditor @TreeTC_024
  Scenario: Validate the Try editor for positive input from Traversals Illustration page
    Given the User is on the Try Editor page from Traversals Illustration link
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @IllustrationTryEditorNegative @TreeTC_025
  Scenario Outline: validate the Try editor for negative input from Traversals Illustration page
    Given the User is on the Try Editor page from Traversals Illustration link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @IllustrationPracQues @TreeTC_026
  Scenario: Validate the Traversals Illustration page Practice Questions
    Given user is on the Traversals Illustration page
    When user clicked the Practice Questions from Traversals Illustration page
    Then user should view the Practice Questions of Tree

  @Tree_BinaryTrees @TreeTC_027
  Scenario: Validate the Tree Module Page-Binary Trees link
    Given user is on the Tree module page
    When user clicked Binary Trees link in the Tree Module page
    Then user is able to view the Binary Trees page

  @BinaryTreesTryhere @TreeTC_028
  Scenario: Validate the Binary Trees Try here
    Given user is on the Binary Trees page
    When user clicked the Try here on the Binary Trees page
    Then the User should get navigated to the Try Editor Page

  @BinaryTreesTryEditor @TreeTC_029
  Scenario: Validate the Try editor for positive input from BinaryTrees page
    Given the User is on the Try Editor page from BinaryTrees link
     When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @BinaryTreesTryEditorNegative @TreeTC_030
  Scenario Outline: validate the Try editor for negative input from BinaryTrees page
    Given the User is on the Try Editor page from BinaryTrees link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @BinaryTreesPracQues @TreeTC_031
  Scenario: Validate the BinaryTrees page Practice Questions
    Given user is on the Binary Trees page
    When user clicked the Practice Questions from BinaryTrees page
   Then user should view the Practice Questions of Tree

  @TypesBinaryTrees @TreeTC_032
  Scenario: Validate the Tree Module Page Types of Binary Trees link
    Given user is on the Tree module page
    When user clicked Types of Binary Trees link in the Tree Module page
    Then user is able to view the  Types of Binary Tree linked page

  @TypesBinaryTryhere @TreeTC_033
  Scenario: Validate the Types of Binary Trees Try here
    Given user is on the Types of Binary Trees page
    When user clicked the Try here on the Types of Binary Trees page
    Then the User should get navigated to the Try Editor Page

   @TypesBinaryTryEditor @TreeTC_034
  Scenario: Validate the Try editor for positive input from Types of Binary Trees page
    Given the User is on the Try Editor page from Types of Binary Trees link
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @TypesBinaryTryEditorNegative @TreeTC_035
  Scenario Outline: validate the Try editor for negative input from Types of Binary Trees page
    Given the User is on the Try Editor page from Types of Binary Trees link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @TypesBinaryPracQues @TreeTC_036
  Scenario: Validate the Types of Binary Trees page Practice Questions
    Given user is on the Types of Binary Trees page
    When user clicked the Practice Questions from Types of Binary Trees page
    Then user should view the Practice Questions of Tree

  @ImpPython @TreeTC_037
  Scenario: Validate the Tree Module Page Implementations in Python link
    Given user is on the Tree module page
    When user clicked Implementations in Python link in the Tree Module page
    Then user is able to view the  Implementations in Python link page

  @ImpPythonTryhere @TreeTC_038
  Scenario: Validate the Implementations in Python Try here
    Given user is on the Implementations in Python page
    When user clicked the Try here on the Implementations in Python Tree page
    Then the User should get navigated to the Try Editor Page

  @ImpPythonTryEditor @TreeTC_039
  Scenario: Validate the Try editor for positive input from Implementations in Python page
    Given the User is on the Try Editor page from Implementations in Python link
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @ImpPythonTryEditorNegative @TreeTC_40
  Scenario Outline: validate the Try editor for negative input from Implementations in Python page
    Given the User is on the Try Editor page from Implementations in Python link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @ImpPythonPracQues @TreeTC_041
  Scenario: Validate the Implementations in Python page Practice Questions
    Given user is on the Implementations in Python page
    When user clicked the Practice Questions from Implementations in Python page
    Then user should view the Practice Questions of Tree

  @TreeBinaryTraversals @TreeTC_042
  Scenario: Validate the Tree Module Page Binary Tree Traversals link
    Given user is on the Tree module page
    When user clicked Binary Tree Traversals link in the Tree Module page
    Then user is able to view the Binary Tree Traversals linked page

  @BinaryTraversals_Tryhere @TreeTC_043
  Scenario: Validate the Binary Tree Traversals Try here
    Given user is on the Binary Tree Traversals page
    When user clicked the Try here on the Binary Tree Traversals page
    Then the User should get navigated to the Try Editor Page

   @BinaryTraversalsTryEditor @TreeTC_044
  Scenario: Validate the Try editor for positive input from Binary Tree Traversals page
    Given the User is on the Try Editor page from Binary Tree Traversals link
     When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @BinaryTraversalsTryEditorNegative @TreeTC_45
  Scenario Outline: validate the Try editor for negative input from Binary Tree Traversals page
    Given the User is on the Try Editor page from Binary Tree Traversals link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @BinaryTraversalsPracQues @TreeTC_046
  Scenario: Validate the Binary Tree Traversals page Practice Questions
    Given user is on the Binary Tree Traversals page
    When user clicked the Practice Questions from Binary Tree Traversals page
    Then user should view the Practice Questions of Tree

  @ImpBinaryTrees @TreeTC_047
  Scenario: Validate the Tree Module Page Implementation of Binary Trees link
    Given user is on the Tree module page
    When user clicked Implementation of Binary Trees link in the Tree Module page
    Then user is able to view the Implementation of Binary Trees link page

  @ImpBinaryTreesTryhere @TreeTC_048
  Scenario: Validate the Implementation of Binary Trees Try here
    Given user is on the Implementation of Binary Trees
    When user clicked the Try here on theImplementation of Binary Trees page
    Then the User should get navigated to the Try Editor Page

  @ImpBinaryTreesTryEditor @TreeTC_049
  Scenario: Validate the Try editor for positive input from Implementation of Binary Trees page
    Given the User is on the Try Editor page from Implementation of Binary Trees link
     When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @ImpBinaryTreesTryEditorNegative @TreeTC_50
  Scenario Outline: validate the Try editor for negative input from Implementation of Binary Trees page
    Given the User is on the Try Editor page from Implementation of Binary Trees link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @ImpBinaryTreesPracQues @TreeTC_051
  Scenario: Validate the Implementation of Binary Trees page Practice Questions
    Given user is on the Implementation of Binary Trees
    When user clicked the Practice Questions from Implementation of Binary Treespage
   Then user should view the Practice Questions of Tree

  @TreeAppBinarytrees @TreeTC_052
  Scenario: Validate the Tree Module Page Applications of Binary trees link
    Given user is on the Tree module page
    When user clicked Applications of Binary trees link in the Tree Module page
    Then user is able to view the Applications of Binary trees link page

  @AppBinary_Tryhere @TreeTC_053
  Scenario: Validate the Applications of Binary trees Try here
    Given user is on the Applications of Binary trees
    When user clicked the Try here on the Applications of Binary trees page
    Then the User should get navigated to the Try Editor Page

  @AppBinaryTryEditor @TreeTC_054
  Scenario: Validate the Try editor for positive input from Applications of Binary trees page
    Given the User is on the Try Editor page from Applications of Binary trees link
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @AppBinaryTryEditorNegative @TreeTC_055
  Scenario Outline: validate the Try editor for negative input from Applications of Binary trees page
    Given the User is on the Try Editor page from Applications of Binary trees link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @AppBinaryPracQues @TreeTC_056
  Scenario: Validate the Applications of Binary trees page Practice Questions
    Given user is on the Applications of Binary trees
    When user clicked the Practice Questions from Applications of Binary trees page
    Then user should view the Practice Questions of Tree

  @BinarySearchTrees @TreeTC_057
  Scenario: Validate the Tree Module Page Binary Search Trees link
    Given user is on the Tree module page
    When user clicked Binary Search Trees link in the Tree Module page
    Then user is able to view the  Binary Search Trees linked page

  @BinarySearchTrees_Tryhere @TreeTC_058
  Scenario: Validate the Binary Search Trees Try here
    Given user is on the Binary Search Trees
    When user clicked the Try here on the Binary Search Trees page
    Then the User should get navigated to the Try Editor Page

  @BinarySearchTreesTryEditor @TreeTC_059
  Scenario: Validate the Try editor for positive input from Binary Search Trees page
    Given the User is on the Try Editor page from Binary Search Trees link
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @BinarySearchTreesTryEditorNegative @TreeTC_060
  Scenario Outline: validate the Try editor for negative input from Binary Search Trees page
    Given the User is on the Try Editor page from Binary Search Trees link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @BinarySearchTreesPracQues @TreeTC_061
  Scenario: Validate the Binary Search Trees Practice Questions
    Given user is on the Binary Search Trees
    When user clicked the Practice Questions from Binary Search Trees page
    Then user should view the Practice Questions of Tree

  @ImpBST @TreeTC_062
  Scenario: Validate the Tree Module Page Implementation Of BST link
    Given user is on the Tree module page
    When user clicked Implementation Of BST link in the Tree Module page
    Then user is able to view the  Implementation Of BST linked page

  @ImpBSTTryhere @TreeTC_063
  Scenario: Validate the Implementation Of BST Try here
    Given user is on the Implementation Of BST
    When user clicked the Try here on the Implementation Of BST page
    Then the User should get navigated to the Try Editor Page

 @ImpBSTTryEditor @TreeTC_064
  Scenario: Validate the Try editor for positive input from Implementation Of BST page
    Given the User is on the Try Editor page from Implementation Of BST link
    When the User enters the following code in the Editor section and clicks Run
      | code           | output |
      | print("Hello") | Hello  |
      | print(1234)    | 1234   |
    Then the User should get the correct output on the screen


  @ImpBSTTryEditorNegative @TreeTC_065
  Scenario Outline: validate the Try editor for negative input from Implementation Of BST page
    Given the User is on the Try Editor page from Implementation Of BST link
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<error>" in the alert

    Examples: 
      | code        | error                                            |
      | print hello | NameError: name 'hello' is not defined on line 1 |
      | aer234@$    | SyntaxError: bad token T_OP on line 1            |

  @ImpBSTPracQues @TreeTC_066
  Scenario: Validate the Implementation Of BST Practice Questions
    Given user is on the Implementation Of BST
    When user clicked the Practice Questions from Implementation Of BST page
    Then user should view the Practice Questions of Tree