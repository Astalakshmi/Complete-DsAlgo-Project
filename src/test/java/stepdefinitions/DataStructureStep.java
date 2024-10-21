package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import driverManager.WebdriverManager;
import io.cucumber.java.en.*;
import pageObjects.DataStructurePage;
import utilities.ConfigFileReader;
import utilities.ExcelFileReader;
import utilities.LoggerLoad;

public class DataStructureStep {

	WebDriver driver = WebdriverManager.getDriver();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	DataStructurePage dataStructureObj = new DataStructurePage();
	ExcelFileReader reader = new ExcelFileReader();

	@When("user clicked on the Data Structure Get Started link button")
	public void user_clicked_on_the_data_structure_get_started_link_button() {
		dataStructureObj.getStartedclick();
	}

	@Then("user is able view the Data Structure Introduction Page")
	public void user_is_able_view_the_data_structure_introduction_page() {
		Assert.assertEquals(dataStructureObj.getActualTitle(), configFileReader.getPageTitle("dataStructures"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the DataStructure Introduction page")
	public void user_is_on_the_data_structure_introduction_page() {
		dataStructureObj.getStartedclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Time complexity link from the DataStructure page")
	public void user_clicked_the_page_time_complexity_link_from_the_DataStructure_page() {
		dataStructureObj.timeComplexclick();
	}

	@Then("user is able to view the Time Complexity Page")
	public void user_is_able_to_view_the_time_complexity_page() {
		Assert.assertEquals(dataStructureObj.getActualTitle(), configFileReader.getPageTitle("timeComplexity"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the time complexity page")
	public void user_is_on_the_time_complexity_page() {
		dataStructureObj.getStartedclick();
		dataStructureObj.timeComplexclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here link from the time complexity Page")
	public void user_clicked_the_try_here_link_from_the_time_complexity_page() {
		dataStructureObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Time Complexity page")
	public void the_User_is_on_the_Try_Editor_page_from_Time_Complexity_page() {
		dataStructureObj.getStartedclick();
		dataStructureObj.timeComplexclick();
		dataStructureObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from the time complexity Page")
	public void user_clicked_the_Practice_Questions_from_the_time_complexity_Page() {
		dataStructureObj.pracQuesclick();
	}

	@Then("user should view the Practice Questions of DataStructure")
	public void user_should_view_the_Practice_Questions_of_DataStructure() {
		int practiceCount = dataStructureObj.getPracticeQuestionsCount();
		if (practiceCount < 1) {
			Assert.fail("No questions found");
		}
	}
}