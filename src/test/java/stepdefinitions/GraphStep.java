package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.*;
import pageObjects.GraphPage;
import pageObjects.RegisterPage;
import utilities.ConfigFileReader;
import utilities.LoggerLoad;

public class GraphStep {

	WebDriver driver = WebdriverManager.getDriver();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	GraphPage graphObj = new GraphPage ();
	RegisterPage registerObj =new RegisterPage();
	

	@When("The User clicks Get Started button in the Graph section")
	public void the_user_clicks_get_started_button_in_the_graph_section() {
	   graphObj.clickGraphStarted();

	}
	
	@Then("The User should get navigated to the DsAlgo Portal Graph Page")
	public void the_user_should_get_navigated_to_the_ds_algo_portal_graph_page() {
	   
		 Assert.assertEquals(registerObj.actualTitle(),configFileReader.getPageTitle("graphPage"));
		 LoggerLoad.info("You are navigated to "+ driver.getTitle() +" Page.");
	}
	
	@Given("The User is on the Graph Page")
	public void the_user_is_on_the_graph_page() {
		graphObj.clickGraphStarted();
	    
	}
	
	@When("The User clicks Graph link")
	public void the_user_clicks_graph_link() {
	//	graphObj.graphStarted();
		graphObj.clickGraphLink();
	}
	
	@Then("The User should get navigated to first Topic Graph Page")
	public void the_user_should_get_navigated_to_first_topic_graph_page() {
	   
		Assert.assertEquals(registerObj.actualTitle(),configFileReader.getPageTitle("graph"));
		LoggerLoad.info("You are navigated to first link of "+ driver.getTitle() +" Page.");
	}
	
	@Given("The User is on the first Topic Graph Page")
	public void the_user_is_on_the_first_topic_graph_page() {
	   
		graphObj.clickGraphStarted();
		graphObj.clickGraphLink();
		
	}
	
	@When("The User clicks Try Here button in the first topic Graph Page")
	public void the_user_clicks_try_here_button_in_the_first_topic_graph_page() {
	//	graphObj.graphLink();
		graphObj.clickGraphTryHereBtn();
		
	}
	
	@Given("the User is on the Try Editor page through the first Topic Graph Page")
	public void the_user_is_on_the_try_editor_page_through_the_first_topic_graph_page() {
	   
		graphObj.clickGraphStarted();
		graphObj.clickGraphLink();
		graphObj.clickGraphTryHereBtn();
	}

	
	@When("The User clicks Graph Representations link")
	public void the_user_clicks_graph_representations_link() {
		//graphObj.graphStarted();
		graphObj.clickGraphRepresent();
	   
	}
	
	@Then("The User should get navigated to Graph Representation Page")
	public void the_user_should_get_navigated_to_graph_representation_page() {
	   
		Assert.assertEquals(registerObj.actualTitle(),configFileReader.getPageTitle("graphRep"));
		LoggerLoad.info("You are navigated to "+ driver.getTitle() +" Page.");
	   
	}
	
	@Given("The User is on the Graph Representation Page")
	public void the_user_is_on_the_graph_representation_page() {
		graphObj.clickGraphStarted();
		graphObj.clickGraphRepresent();
	   
	}
	
	@When("The User clicks Try Here button in the Graph Representation Page")
	public void the_user_clicks_try_here_button_in_the_graph_representation_page() {
		graphObj.clickGraphRepresentTryHereBtn();
		
	}
	
	@Given("the User is on the Try Editor page through the Graph Representation Page")
	public void the_user_is_on_the_try_editor_page_through_the_graph_representation_page() {
		graphObj.clickGraphStarted();
		graphObj.clickGraphRepresent();
		graphObj.clickGraphRepresentTryHereBtn();
	}

	
	
	@When("The User clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
			
	   if (graphObj.clickGraphRepresent() || graphObj.clickGraphLink()) 
	   {
		   graphObj.clickHandleGraphPracticeQuestion();
	   }
	  
	}
	
	@Then("The User should navigate to Practice Question Page")
	public void the_user_should_navigate_to_practice_question_page() {
	   
		int practiceCount = graphObj.getPracticeQuestionsCount();
		if(practiceCount < 1) {
		Assert.fail("No questions found");
	}
	
	}

}