package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePage;
import pageObjects.RegisterPage;
import utilities.ConfigFileReader;
import utilities.LoggerLoad;

	public class QueueStep {
		
		WebDriver driver = WebdriverManager.getDriver();
		ConfigFileReader configFileReader = WebdriverManager.configReader();
		QueuePage queueObj = new QueuePage();
		RegisterPage registerObj=new RegisterPage();
		

	
	@When("The User clicks Get Started button in the Queue section")
	
	public void the_user_clicks_get_started_button_in_the_queue_section() {
		queueObj.clickQueueStarted();   
	}
	
	@Then("The User should get navigated to the DsAlgo Portal Queue Page")
	public void the_user_should_get_navigated_to_the_ds_algo_portal_queue_page() {
	   
	    Assert.assertEquals(registerObj.actualTitle(),configFileReader.getPageTitle("queuePage"));
		LoggerLoad.info("You are navigate to " +driver.getTitle()+" Page.");
	}
	
	
	@Given("The User is on the Queue Page")
	public void the_user_is_on_the_queue_page() {
		queueObj.clickQueueStarted();
	}
	
	@When("The User clicks Implementation of Queue in Python link")
	public void the_user_clicks_implementation_of_queue_in_python_link() {
		//qp.queueStarted();
		queueObj.clickQueueInPythonLink(); 
	}
	
	@Then("The User should get navigated to Implementation lists")
	public void the_user_should_get_navigated_to_implementation_lists() {
		 
		Assert.assertEquals(registerObj.actualTitle(),configFileReader.getPageTitle("implementQueue"));
		LoggerLoad.info("You are navigated to " +driver.getTitle()+" Page.");
	}
	
	@Given("The User is on the Implementation lists Page")
	public void the_user_is_on_the_implementation_lists_page() {
		queueObj.clickQueueStarted();
		queueObj.clickQueueInPythonLink(); 
		 
	}
	
	@When("The User clicks Try Here button in Queue Implementation List Page")
	public void the_user_clicks_try_here_button_in_queue_implementation_list_page() {
		
		queueObj.clickQueueInPythonTryHere();
	    
	}
	
	
	@Given("the User is on the Try Editor page through the Implementation Lists page")
	public void the_user_is_on_the_try_editor_page_through_the_implementation_lists_page() {
	    
		queueObj.clickQueueStarted();
		queueObj.clickQueueInPythonLink();
		queueObj.clickQueueInPythonTryHere();
		
	}

	

	@When("The User clicks Implementation Using Collections Dequeue link")
	public void the_user_clicks_implementation_using_collections_dequeue_link() {
	//	qp.queueStarted();
		queueObj.clickDequeLink();
	
	}	
	
	@Then("The User should get navigated to Implementation collection Page")
	public void the_user_should_get_navigated_to_implementation_collection_page() {
	    
	    Assert.assertEquals(registerObj.actualTitle(),configFileReader.getPageTitle("implementDeque"));
	    LoggerLoad.info("You are navigated to " +driver.getTitle()+ " Page.");
	}
	
	
	
	@Given("The User is on the Implementation collection Page")
	public void the_user_is_on_the_implementation_collection_page() {
	
		queueObj.clickQueueStarted();
		queueObj.clickDequeLink();
		
	}
	
	@When("The User clicks Try Here button in the Implementation collection Page")
	public void the_user_clicks_try_here_button_in_the_implementation_collection_page() {

		queueObj.clickDequeTryHere();	 
		
	}
	
	
	@Given("the User is on the Try Editor page through the Implementation collection Page")
	public void the_user_is_on_the_try_editor_page_through_the_implementation_collection_page() {

		queueObj.clickQueueStarted();
		queueObj.clickDequeLink();
		queueObj.clickDequeTryHere();	
		
	}
	
	
	@When("The User clicks Implementation using array link")
	public void the_user_clicks_implementation_using_array_link() {
	 //   qp.queueStarted();
		queueObj.clickQueueImplArrayLink();
	    
	}
	
	@Then("The User should get navigated to Implementation Array")
	public void the_user_should_get_navigated_to_implementation_array() {
		 Assert.assertEquals(registerObj.actualTitle(),configFileReader.getPageTitle("implementUsingArr"));
		 LoggerLoad.info("You are navigated to " +driver.getTitle()+ " Page.");
	    
	}
	
	@Given("The User is on the Implementation collection Array Page")
	public void the_user_is_on_the_implementation_collection_array_page() {
		
		queueObj.clickQueueStarted();
		queueObj.clickQueueImplArrayLink();
		  
	}
	
	@When("The User clicks Try Here button in the Implementation Array Page")
	public void the_user_clicks_try_here_button_in_the_implementation_array_page() {
	    
		queueObj.clickQueueImplArrayTryHere();
	}
	
	
	
	@Given("the User is on the Try Editor page through the Implementation Array Page")
	public void the_user_is_on_the_try_editor_page_through_the_implementation_array_page() {
	    
		queueObj.clickQueueStarted();
		queueObj.clickQueueImplArrayLink();
		queueObj.clickQueueImplArrayTryHere();
		  
	}


	//---------------------@QueueOperation @QueueOperationTest_011---------
	@When("The User clicks Queue Operations link")
	public void the_user_clicks_queue_operations_link() {
	  //  qp.queueStarted();
		queueObj.clickQueueOperationLink(); 
	}
	
	@Then("The User should get navigated to Queue Operation Page")
	public void the_user_should_get_navigated_to_queue_operation_page() {
		
	    Assert.assertEquals(registerObj.actualTitle(),configFileReader.getPageTitle("QueueOper"));    
	    LoggerLoad.info("You are navigated to " +driver.getTitle()+" Page.");
	}
	
	//--------------------@QueueOperationTryHere @QueueOperTryHereTest_012-----
	@Given("The User is on the Queue Operation Page")
	public void the_user_is_on_the_queue_operation_page() {
		queueObj.clickQueueStarted();
		queueObj.clickQueueOperationLink(); 
		
	}

	@When("The User clicks Try Here button in the Queue Operation Page")
	public void the_user_clicks_try_here_button_in_the_queue_operation_page() {
		queueObj.clickQueueOpsTryHere();
	    
	}
	
	//-----------------@QueueOperationTryEditor @QueueOperEditorTest_013---------
	@Given("the User is on the Try Editor page through Queue Operation Page")
	public void the_user_is_on_the_try_editor_page_through_queue_operation_page() {
	   
		queueObj.clickQueueStarted();
		queueObj.clickQueueOperationLink(); 
		queueObj.clickQueueOpsTryHere();
		
	}

	
	//---------------@QueuePracticeQuestion @QueueQuestionTest_014----------
	@Given("The User is on the Implementation lists")
	public void the_user_is_on_the_implementation_lists() {
	
		queueObj.clickQueueStarted();
	}
	
	@When("The User clicks Practice Questions")
	public void the_user_clicks_practice_questions() {
		
		 if (queueObj.clickQueueInPythonLink() || queueObj.clickDequeLink() || queueObj.clickQueueImplArrayLink() || queueObj.clickQueueOperationLink())
		 {
			 queueObj.handlePracticeQuestionClick();
		 }
	}
	
	@Then("The User should navigate to queue Practice Page")
	public void the_user_should_navigate_to_queue_practice_page() {
	    
		int practiceCount = queueObj.getPracticeQuestionsCount();
		if(practiceCount < 1) {
		Assert.fail("No questions found");
		
		}
	
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	