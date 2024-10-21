package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPage;
import utilities.ConfigFileReader;

public class StackStep {
	
	WebDriver driver =  WebdriverManager.getDriver();
	StackPage stackPageObj = new StackPage();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	
	@When("user clicks the get started button under stack section")
	public void user_clicks_the_get_started_button_under_stack_section() {
	    stackPageObj.clickGetStartedBtn();
	}

	@Then("user views the stack page")
	public void user_views_the_stack_page() {
		String stackPageTitle = stackPageObj.getActualTitle();
	    Assert.assertEquals(configFileReader.getPageTitle("stackPage"), stackPageTitle);
	    
	}

	@Given("the user is in stack page")
	public void the_user_is_in_stack_page() {
		stackPageObj.clickGetStartedBtn();
	    
	}

	@When("user clicks the Operations in Stack link under the topics covered section")
	public void user_clicks_the_operations_in_stack_link_under_the_topics_covered_section() {
		stackPageObj.clickOperationsLink();
	    
	}

	@Then("user views the Operations in stack page")
	public void user_views_the_operations_in_stack_page() {
		String operationsTitle = stackPageObj.getActualTitle();
	    Assert.assertEquals(configFileReader.getPageTitle("operInStack"), operationsTitle);
	    
	}

	@Given("the User is on the Operations in stack page")
	public void the_user_is_on_the_operations_in_stack_page() {
		stackPageObj.clickGetStartedBtn();
		stackPageObj.clickOperationsLink();
		
	    
	}

	@When("the User clicks the Try here in Operations in stack Page")
	public void the_user_clicks_the_try_here_in_operations_in_stack_page() {
		stackPageObj.clicktryEditor();
	    
	}

	@Given("the User is on the Try Editor page through the operations in stack page")
	public void the_user_is_on_the_try_editor_page_through_the_operations_in_stack_page() {
		stackPageObj.clickGetStartedBtn();
		stackPageObj.clickOperationsLink();
		stackPageObj.clicktryEditor();
		
	    
	}

	@When("user clicks the Implementation in Stack link under the topics covered section")
	public void user_clicks_the_implementation_in_stack_link_under_the_topics_covered_section() {
		stackPageObj.clickImplementationLink();
	    
	}

	@Then("user views the Implementation in stack page")
	public void user_views_the_implementation_in_stack_page() {
		String implementStackTitle = stackPageObj.getActualTitle();
	    Assert.assertEquals(configFileReader.getPageTitle("implementationStack"), implementStackTitle);
	    
	}

	@Given("the User is on the Implementation in stack page")
	public void the_user_is_on_the_implementation_in_stack_page() {
		stackPageObj.clickGetStartedBtn();
		stackPageObj.clickImplementationLink();
	}

	@When("the User clicks the Try here in Implementation in stack Page")
	public void the_user_clicks_the_try_here_in_implementation_in_stack_page() {
		stackPageObj.clicktryEditor();
	}

	@Given("the User is on the Try Editor page through the implementation in stack page")
	public void the_user_is_on_the_try_editor_page_through_the_implementation_in_stack_page() {
		stackPageObj.clickGetStartedBtn();
		stackPageObj.clickImplementationLink();
		stackPageObj.clicktryEditor();
	}

	@When("user clicks the Applications in Stack link under the topics covered section")
	public void user_clicks_the_applications_in_stack_link_under_the_topics_covered_section() {
		stackPageObj.clickApplicationsLink();
	    
	}

	@Then("user views the Applications in stack page")
	public void user_views_the_applications_in_stack_page() {
		String applicationTitle = stackPageObj.getActualTitle();
	    Assert.assertEquals(configFileReader.getPageTitle("applicationsStack"), applicationTitle);
	    
	}

	@Given("the User is on the Applications in stack page")
	public void the_user_is_on_the_applications_in_stack_page() {
		stackPageObj.clickGetStartedBtn();
		stackPageObj.clickApplicationsLink();
	}

	@When("the User clicks the Try here in Applications in stack Page")
	public void the_user_clicks_the_try_here_in_applications_in_stack_page() {
		stackPageObj.clicktryEditor();
	}

	@Given("the User is on the Try Editor page through the applications in stack page")
	public void the_user_is_on_the_try_editor_page_through_the_applications_in_stack_page() {
		stackPageObj.clickGetStartedBtn();
		stackPageObj.clickApplicationsLink();
		stackPageObj.clicktryEditor();
	}

	@When("the User clicks the Practice Questions link in Operations in stack Page")
	public void the_user_clicks_the_practice_questions_link_in_operations_in_stack_page() {
		stackPageObj.clickPracticeLink();
	    
	}
	
	@When("the User clicks the Practice Questions link in Implementation in stack Page")
	public void the_user_clicks_the_practice_questions_link_in_implementation_in_stack_page() {
		stackPageObj.clickPracticeLink();
	    
	}
	
	@When("the User clicks the Practice Questions link in Applications in stack Page")
	public void the_user_clicks_the_practice_questions_link_in_applications_in_stack_page() {
		stackPageObj.clickPracticeLink();
	    
	}

	@Then("the User should get navigated to the Stack Practice Questions Page")
	public void the_user_should_get_navigated_to_the_stack_practice_questions_page() {
		String practiceTitle = stackPageObj.getActualTitle();
	    Assert.assertEquals(configFileReader.getPageTitle("practiceQuestions"), practiceTitle);
	    
	}
	
	@Then("the User should view the practice questions of stack")
	public void the_user_should_view_the_practice_questions_of_stack() {
		int practiceCount = stackPageObj.getPracticeQuestionsCount();
		if(practiceCount < 1) {
			Assert.fail("No questions found");
		}
		
	    
	}


}