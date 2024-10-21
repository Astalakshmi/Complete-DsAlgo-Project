@Home
Feature: DsAlgo Homepage Functionality

  Background: Successful login with valid credentials
    Given The User is on the login page
    When The User enters the valid username and password "LoginCredentials"

  @HomepageLogo @logoTC_001
  Scenario: Validate the Logo of NumpyNinja in the Home page
    Given the user is in homepage and logged in
    When The User should clicks Logo NumpyNinja
    Then The User get navigated to HomePage and able to see the NumpyNinja Logo

    @HomepageDropdown @DTTC_002
  Scenario: Validating the Datastructure Introduction dropdown
    Given the user is in homepage and logged in
    When The User clicked the Data Structure dropdown from home page
    Then The user should able to view the dropdown list

  @ArrayDropdown @ArrayDDTC_003
  Scenario: Validating the Arrays page by clicking from the dropdown list
    Given The User is on the Data Structure dropdown from home page
    When The User clicked the Arrays from dropdown list in home page
    Then The user should able to view the Arrays from dropdown list
 
  @LinkedListDropdown @LinkedListDDTC_004
  Scenario: Validating the Linked List page by clicking from the dropdown list
    Given The User is on the Data Structure dropdown to click Linked List
    When The User clicked the Linked List from dropdown list in home page
    Then The user should able to view the Linked List from dropdown list

  @StackDropdown @StackDDTC_005
  Scenario: Validating the Stack page by clicking the from dropdown list
    Given The User is on the Data Structure dropdown to click Stack
    When The User clicked the Stack from dropdown list in home page
    Then The user should able to view the Stack from dropdown list

  @QueueDropdown @QueueDDTC_006
  Scenario: Validating the Queue page by clicking the from dropdown list
    Given The User is on the Data Structure dropdown to click Queue
    When The User clicked the Queue from dropdown list in home page
    Then The user should able to view the Queue from dropdown list

  @TreeDropdown @TreeDDTC_007
  Scenario: Validating the Tree page by clicking the from dropdown list
    Given The User is on the Data Structure dropdown to click Tree
    When The User clicked the Tree from dropdown list in home page
    Then The user should able to view the Tree from dropdown list

  @GraphDropdown @GraphTC_008
  Scenario: Validating the Graph page by clicking the from dropdown list
    Given The User is on the Data Structure dropdown to click Graph
    When The User clicked the Graph from dropdown list in home page
    Then The user should able to view the Graph from dropdown list
   
   @accountHolder @HomeAccountTC_009
   Scenario: Validating the account holdername in the Homepage
    Given the user is in homepage and logged in
    When the user views the navigation menu 
    Then The account holdername should be displayed in the hompage
    
    @Signout	@SignOutTC_010
    Scenario: Validating the signout of the user account
    Given the user is in homepage and logged in
    When The user click the sign out in home page
    Then The user should logged out of the user account 
    
    