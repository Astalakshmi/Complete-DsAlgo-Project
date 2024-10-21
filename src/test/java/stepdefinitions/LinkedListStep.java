package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ConfigFileReader;
import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;

public class LinkedListStep {
	
	WebDriver driver =  WebdriverManager.getDriver();
	LinkedListPage linkedListObject = new LinkedListPage();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	
	

	@When("the user clicks the get started button under linked list section")
	public void the_user_clicks_the_get_started_button_under_linked_list_section() {
		linkedListObject.clickGetStartedBtn();
	    
	}

	@Then("the user views the linked list page")
	public void the_user_views_the_linked_list_page() {
		
		String linkedListPageTitle = linkedListObject.getActualTitle();
		
		
	    Assert.assertEquals(linkedListPageTitle,configFileReader.getPageTitle("linkedListPage"));
	    
	}

	@Given("the user is in linked list page")
	public void the_user_is_in_linked_list_page() {
		
		linkedListObject.clickGetStartedBtn();
		//LoggerLoad.info("You are in" +driver.getTitle());
	    
	}

	@When("the user clicks the Introduction link under the topics covered section")
	public void the_user_clicks_the_introduction_link_under_the_topics_covered_section() {
		linkedListObject.clickIntroductionLink();
	}

	@Then("the user views the Introduction page")
	public void the_user_views_the_introduction_page() {
		
		String introductionPageTitle = linkedListObject.getActualTitle();
	    Assert.assertEquals(introductionPageTitle,configFileReader.getPageTitle("introduction"));
	    
	}

	@Given("the User is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickIntroductionLink();
		//LoggerLoad.info("You are in" +driver.getTitle());
	}

	@When("the User clicks the Try here in Introduction Page")
	public void the_user_clicks_the_try_here_in_introduction_page() {
		
		linkedListObject.clicktryEditor();
	    
	}

//	@Then("the User should get navigated to the Try Editor Page")
//	public void the_user_should_get_navigated_to_the_try_editor_page() {
//		String tryEditorPageTitle = BrowserDriver.getTitle();
//	    Assert.assertEquals("Assessment", tryEditorPageTitle);
//	    
//	}

	@Given("the User is on the Try Editor page through the introduction page")
	public void the_user_is_on_the_try_editor_page_through_the_introduction_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickIntroductionLink();
		linkedListObject.clicktryEditor();
		//LoggerLoad.info("You are in" +driver.getTitle());
		
	    
	}



	@When("user clicks the creating linked list link under the topics covered section")
	public void user_clicks_the_creating_linked_list_link_under_the_topics_covered_section() {
		
		linkedListObject.clickCreatingLinkedListLink();
	    
	}

	@Then("user views the creating linked list page")
	public void user_views_the_creating_linked_list_page() {
		
		String creatingLinkedListTitle = linkedListObject.getActualTitle();
	    Assert.assertEquals(creatingLinkedListTitle,configFileReader.getPageTitle("creatingLinkList"));
	    
	}

	@Given("the User is on the Creating Linked list page")
	public void the_user_is_on_the_creating_linked_list_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickCreatingLinkedListLink();
	    
	}

	@When("the User clicks the Try here in Creating Linked list Page")
	public void the_user_clicks_the_try_here_in_creating_linked_list_page() {
		linkedListObject.clicktryEditor();
	    
	}

	@Given("the User is on the Try Editor page through the creating linked list page")
	public void the_user_is_on_the_try_editor_page_through_the_creating_linked_list_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickCreatingLinkedListLink();
		linkedListObject.clicktryEditor();
	    
	}

	@When("user clicks the Types of linked list link under the topics covered section")
	public void user_clicks_the_types_of_linked_list_link_under_the_topics_covered_section() {
		
		linkedListObject.clickTypesOfLinkedListLink();

	    
	}

	@Then("user views the types of linked list page")
	public void user_views_the_types_of_linked_list_page() {
		String typesOfLinkedListTitle = linkedListObject.getActualTitle();
	    Assert.assertEquals(configFileReader.getPageTitle("typesOfLinkedList"), typesOfLinkedListTitle);
	}

	@Given("the User is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickTypesOfLinkedListLink();
	    
	}

	@When("the User clicks the Try here in Types of Linked List Page")
	public void the_user_clicks_the_try_here_in_types_of_linked_list_page() {
		linkedListObject.clicktryEditor();
	    
	}
	
	@Given("the User is on the Try Editor page through the types of linkedlist page")
	public void the_user_is_on_the_try_editor_page_through_the_types_of_linkedlist_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickTypesOfLinkedListLink();
		linkedListObject.clicktryEditor();
	    
	}

	@When("user clicks the implement linked list in python  link under the topics covered section")
	public void user_clicks_the_implement_linked_list_in_python_link_under_the_topics_covered_section() {
		linkedListObject.clickImplementLinkedListLink();
	    
	}

	@Then("user views the implement linked list in python  page")
	public void user_views_the_implement_linked_list_in_python_page() {
		String implementTitle = linkedListObject.getActualTitle();
	    Assert.assertEquals(configFileReader.getPageTitle("implementLinkedList"), implementTitle);
	}

	@Given("the User is on the Implement linked list in python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickImplementLinkedListLink();
	    
	}

	@When("the User clicks the Try here in Implement linked list in python Page")
	public void the_user_clicks_the_try_here_in_implement_linked_list_in_python_page() {
		linkedListObject.clicktryEditor();
	    
	}
	
	@Given("the User is on the Try Editor page through the implement linked list in python page")
	public void the_user_is_on_the_try_editor_page_through_the_implement_linked_list_in_python_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickImplementLinkedListLink();
		linkedListObject.clicktryEditor();
	    
	}

	@When("user clicks the traversal link under the topics covered section")
	public void user_clicks_the_traversal_link_under_the_topics_covered_section() {
		linkedListObject.clicktraversalLink();
	    
	}

	@Then("user views the traversal page")
	public void user_views_the_traversal_page() {
		String traversalTitle = linkedListObject.getActualTitle();
	    Assert.assertEquals(configFileReader.getPageTitle("traversal"), traversalTitle);
	}

	@Given("the User is on the Traversal page")
	public void the_user_is_on_the_traversal_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clicktraversalLink();
	    
	}

	@When("the User clicks the Try here in Traversal Page")
	public void the_user_clicks_the_try_here_in_traversal_page() {
		linkedListObject.clicktryEditor();
	    
	}
	
	@Given("the User is on the Try Editor page through the traversal page")
	public void the_user_is_on_the_try_editor_page_through_the_traversal_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clicktraversalLink();
		linkedListObject.clicktryEditor();
	    
	    
	}

	@When("user clicks the insertion link under the topics covered section")
	public void user_clicks_the_insertion_link_under_the_topics_covered_section() {
		linkedListObject.clickinsertionLink();
	    
	}

	@Then("user views the insertion page")
	public void user_views_the_insertion_page() {
		String insertionTitle = linkedListObject.getActualTitle();
	    Assert.assertEquals(configFileReader.getPageTitle("insertion"), insertionTitle);
	}

	@Given("the User is on the Insertion page")
	public void the_user_is_on_the_insertion_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickinsertionLink();
	    
	}

	@When("the User clicks the Try here in Insertion Page")
	public void the_user_clicks_the_try_here_in_insertion_page() {
		linkedListObject.clicktryEditor();
	    
	}
	
	@Given("the User is on the Try Editor page through the insertion page")
	public void the_user_is_on_the_try_editor_page_through_the_insertion_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickinsertionLink();
		linkedListObject.clicktryEditor();
	    
	}

	@When("user clicks the deletion link under the topics covered section")
	public void user_clicks_the_deletion_link_under_the_topics_covered_section() {
		linkedListObject.clickdeletionLink();
	    
	}

	@Then("user views the deletion page")
	public void user_views_the_deletion_page() {
		String deletionTitle = linkedListObject.getActualTitle();
	    Assert.assertEquals(deletionTitle,configFileReader.getPageTitle("deletion"));
	}

	@Given("the User is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickdeletionLink();
	    
	}

	@When("the User clicks the Try here in Deletion Page")
	public void the_user_clicks_the_try_here_in_deletion_page() {
		linkedListObject.clicktryEditor();
	    
	}
	
	@Given("the User is on the Try Editor page through the deletion page")
	public void the_user_is_on_the_try_editor_page_through_the_deletion_page() {
		linkedListObject.clickGetStartedBtn();
		linkedListObject.clickdeletionLink();
		linkedListObject.clicktryEditor();
	    
	}


	@When("the User clicks the Practice Questions link in Introduction Page")
	public void the_user_clicks_the_practice_questions_link_in_introduction_page() {
		linkedListObject.clickPracticeLink();
	    
	}
	
	@When("the User clicks the Practice Questions link in Creating Linked list Page")
	public void the_user_clicks_the_practice_questions_link_in_creating_linked_list_page() {
		linkedListObject.clickPracticeLink();
	}

	@When("the User clicks the Practice Questions link in Implement linked list Page")
	public void the_user_clicks_the_practice_questions_link_in_implement_linked_list_page() {
		linkedListObject.clickPracticeLink();
	}

	@When("the User clicks the Practice Questions link in Types of Linked List Page")
	public void the_user_clicks_the_practice_questions_link_in_types_of_linked_list_page() {
		linkedListObject.clickPracticeLink();
	    
	}

	@When("the User clicks the Practice Questions link in Traversal Page")
	public void the_user_clicks_the_practice_questions_link_in_traversal_page() {
		linkedListObject.clickPracticeLink();
	}

	@When("the User clicks the Practice Questions link in Insertion Page")
	public void the_user_clicks_the_practice_questions_link_in_insertion_page() {
		linkedListObject.clickPracticeLink();
	}

	@When("the User clicks the Practice Questions link in Deletion Page")
	public void the_user_clicks_the_practice_questions_link_in_deletion_page() {
		linkedListObject.clickPracticeLink();
	}

	@Then("the User should get navigated to the Linked List Practice Questions Page")
	public void the_user_should_get_navigated_to_the_linked_list_practice_questions_page() {
		String practiceTitle = linkedListObject.getActualTitle();
	    Assert.assertEquals(practiceTitle,configFileReader.getPageTitle("practiceQuestions"));
	    
	}
	
	
	@Then("the User should view the practice questions of Linked List")
	public void the_user_should_view_the_practice_questions_of_linked_list() {
		int practiceCount = linkedListObject.getPracticeQuestionsCount();
		if(practiceCount < 1) {
			Assert.fail("No questions found");
		}
		
	    
	}

	


	
	
	
	


}