package stepdefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;
import utilities.ConfigFileReader;
import utilities.LoggerLoad;

public class CommonStepDefinitions {
	
	WebDriver driver = WebdriverManager.getDriver();

	ConfigFileReader configFileReader = WebdriverManager.configReader();

	LinkedListPage linkedlistObj = new LinkedListPage();
	String code;
	String expectedOutput; 
	String outputText ;
	String actualCodeOutput ;
	
	List<String> actualCodeOutputs = new ArrayList<>();  // To store actual outputs
	List<String> expectedOutputs = new ArrayList<>();    // To store expected outputs
	@Given("the user is in homepage and logged in")
	public void the_user_is_in_homepage_and_logged_in() {
		driver.get(configFileReader.getHomeUrl());
		LoggerLoad.info("You are in " +driver.getTitle() +"home page.");
		
		
	}
	
	@Then("the User should get navigated to the Try Editor Page")
	public void the_user_should_get_navigated_to_the_try_editor_page() {
		String tryEditorPageTitle = linkedlistObj.getActualTitle();
	    Assert.assertEquals(tryEditorPageTitle,configFileReader.getPageTitle("tryEditor"));
	    
	}
	
	@When("the User enters a sample code as {string} in the Editor section and click Run")
	public void the_user_enters_a_sample_code_as_in_the_editor_section_and_click_run(String input) {
		System.out.println(input);

		linkedlistObj.setCodeNegative(input);
		linkedlistObj.clickRunBtn();
	    
	}


	
	@Then("the User should get the {string} in the alert")
	public void the_user_should_get_the_in_the_alert(String errorOutput) {
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), errorOutput);
		LoggerLoad.info("actual error "+alert.getText());
			
	    
	}
	
	@When("the User enters the following code in the Editor section and clicks Run")
	public void the_User_enters_the_following_code_in_the_Editor_section_and_clicks_Run(DataTable dataTable) {
		
		 List<Map<String, String>> codeOutputPairs = dataTable.asMaps(String.class, String.class);

		 for (int i = 0; i < codeOutputPairs.size(); i++) {
	        	code = codeOutputPairs.get(i).get("code");
	            expectedOutput = codeOutputPairs.get(i).get("output"); 
	            linkedlistObj.setCodePositive(code);
 		    	linkedlistObj.clickRunBtn();
 		    	actualCodeOutput = linkedlistObj.getOutput();	
 		    	actualCodeOutputs.add(actualCodeOutput);
 		        expectedOutputs.add(expectedOutput);
 		    	linkedlistObj.clearFormText();
	        }
	           
	}
	
	@Then("the User should get the correct output on the screen")
	public void the_User_should_get_the_correct_output_on_the_screen()
	{
		 for (int i = 0; i < actualCodeOutputs.size(); i++) 
		 {
		        String actualCodeOutput = actualCodeOutputs.get(i);
		        String expectedOutput = expectedOutputs.get(i);
		
	   Assert.assertEquals(actualCodeOutput,expectedOutput);
	   LoggerLoad.info("Actual Output: " + actualCodeOutput + " Expected Output: " + expectedOutput);
		 }     
	       
	}

}

