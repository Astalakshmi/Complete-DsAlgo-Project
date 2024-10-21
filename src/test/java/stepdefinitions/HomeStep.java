package stepdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.ConfigFileReader;
import utilities.LoggerLoad;

public class HomeStep {
	WebDriver driver = WebdriverManager.getDriver();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	HomePage homeObj = new HomePage();
	LoginPage loginObj = new LoginPage();
	WebElement link;
	String alert;

	@When("The User should clicks Logo NumpyNinja")
	public void the_user_should_clicks_logo_numpy_ninja() {
		homeObj.numpyLogoclick();
	}

	@Then("The User get navigated to HomePage and able to see the NumpyNinja Logo")
	public void the_user_get_navigated_to_home_page_and_able_to_see_the_NumpyNinja_Logo() {
		Assert.assertEquals(homeObj.getActualLogoMessage(), configFileReader.getFunctionalityMessage("logo"));
		LoggerLoad.info("The user is able to see the " + driver.getTitle() + " Logo.");
	}

	@When("The User clicked the Data Structure dropdown from home page")
	public void the_user_clicked_the_data_structure_dropdown_from_home_page() {
		homeObj.dataStructureclick();
	}

	@Then("The user should able to view the dropdown list")
	public void the_user_should_able_to_view_the_dropdown_list() {
		Assert.assertEquals(homeObj.getDatastrucActualString(),
				configFileReader.getFunctionalityMessage("dataStructuredropdown"));
		LoggerLoad.info(
				"The user is able to view the Data Structure dropdown List from " + driver.getTitle() + " home page.");
	}

	@Given("The User is on the Data Structure dropdown from home page")
	public void the_user_is_on_the_data_structure_dropdown_from_home_page() {
		homeObj.dataStructureclick();
		LoggerLoad.info("The user clicked the Array from Data Structure dropdown list.");
	}

	@When("The User clicked the Arrays from dropdown list in home page")
	public void the_user_clicked_the_arrays_from_dropdown_list_in_home_page() {
		homeObj.dropDownarraysclick();

	}

	@Then("The user should able to view the Arrays from dropdown list")
	public void the_user_should_able_to_view_the_arrays_from_dropdown_list() {
		Assert.assertEquals(homeObj.getActualTitle(), configFileReader.getPageTitle("arrayPage"));
		LoggerLoad.info("The user is able to view the " + driver.getTitle() + " page.");
	}

	@Given("The User is on the Data Structure dropdown to click Linked List")
	public void the_user_is_on_the_data_structure_dropdown_to_click_Linked_List() {
		homeObj.dataStructureclick();
		LoggerLoad.info("The user clicked the Linked List from Data Structure dropdown list.");
	}

	@When("The User clicked the Linked List from dropdown list in home page")
	public void the_user_clicked_the_linked_list_from_dropdown_list_in_home_page() {
		homeObj.dropDownlinkedclick();
	}

	@Then("The user should able to view the Linked List from dropdown list")
	public void the_user_should_able_to_view_the_linked_list_from_dropdown_list() {
		Assert.assertEquals(homeObj.getActualTitle(), configFileReader.getPageTitle("linkedListPage"));
		LoggerLoad.info("The user is able to view the " + driver.getTitle() + " page.");
	}

	@Given("The User is on the Data Structure dropdown to click Stack")
	public void the_user_is_on_the_data_structure_dropdown_to_click_Stack() {
		homeObj.dataStructureclick();
		LoggerLoad.info("The user clicked the Stack from Data Structure dropdown list.");
	}

	@When("The User clicked the Stack from dropdown list in home page")
	public void the_user_clicked_the_stack_from_dropdown_list_in_home_page() {
		homeObj.dropDownstackclick();
	}

	@Then("The user should able to view the Stack from dropdown list")
	public void the_user_should_able_to_view_the_stack_from_dropdown_list() {
		Assert.assertEquals(homeObj.getActualTitle(), configFileReader.getPageTitle("stackPage"));
		LoggerLoad.info("The user is able to view the " + driver.getTitle() + " page.");
	}

	@Given("The User is on the Data Structure dropdown to click Queue")
	public void the_user_is_on_the_data_structure_dropdown_to_click_Queue() {
		homeObj.dataStructureclick();
		LoggerLoad.info("The user clicked the Queue from Data Structure dropdown list.");
	}

	@When("The User clicked the Queue from dropdown list in home page")
	public void the_user_clicked_the_queue_from_dropdown_list_in_home_page() {
		homeObj.dropDownqueueclick();
	}

	@Then("The user should able to view the Queue from dropdown list")
	public void the_user_should_able_to_view_the_queue_from_dropdown_list() {
		Assert.assertEquals(homeObj.getActualTitle(), configFileReader.getPageTitle("queuePage"));
		LoggerLoad.info("The user is able to view the " + driver.getTitle() + " page.");
	}

	@Given("The User is on the Data Structure dropdown to click Tree")
	public void the_user_is_on_the_data_structure_dropdown_to_click_Tree() {
		homeObj.dataStructureclick();
		LoggerLoad.info("The user clicked the Tree from Data Structure dropdown list. ");
	}

	@When("The User clicked the Tree from dropdown list in home page")
	public void the_user_clicked_the_tree_from_dropdown_list_in_home_page() {
		homeObj.dropDowntreeclick();
	}

	@Then("The user should able to view the Tree from dropdown list")
	public void the_user_should_able_to_view_the_tree_from_dropdown_list() {
		Assert.assertEquals(homeObj.getActualTitle(), configFileReader.getPageTitle("treePage"));
		LoggerLoad.info("The user is able to view the " + driver.getTitle() + " page.");
	}

	@Given("The User is on the Data Structure dropdown to click Graph")
	public void the_user_is_on_the_data_structure_dropdown_to_click_Graph() {
		homeObj.dataStructureclick();
		LoggerLoad.info("The user clicked the Graph from  Data Structure dropdown list. ");
	}

	@When("The User clicked the Graph from dropdown list in home page")
	public void the_user_clicked_the_graph_from_dropdown_list_in_home_page() {
		homeObj.dropDowngraphclick();
	}

	@Then("The user should able to view the Graph from dropdown list")
	public void the_user_should_able_to_view_the_graph_from_dropdown_list() {
		Assert.assertEquals(homeObj.getActualTitle(), configFileReader.getPageTitle("graphPage"));
		LoggerLoad.info("The user is able to view the " + driver.getTitle() + " page.");
	}

	@Given("The User is on the home page")
	public void The_user_is_on_the_home_page() {
		homeObj.getStartedhomeclick();
		LoggerLoad.info(
				"The user is on the " + driver.getTitle() + " page trying to access the dropdown list without Login.");
		// loginObj.signInclick();
	}

	@When("The User clicked the any of the Get Started link in Home page")
	public void The_User_clicked_the_any_of_the_Get_Started_link_in_Home_page() {
		List<WebElement> getEachlink = homeObj.getAnylinkofGetStarted();
		// Click on all Get Started links
		for (WebElement link : getEachlink) {
			homeObj.clickspecificGetStartedlink(link);
		}
	}

	@Then("The User should get the alert message")
	public void The_User_should_get_the_alert_message() {
		// Check the alert message
		for (WebElement link : homeObj.getAnylinkofGetStarted()) {
			homeObj.clickspecificGetStartedlink(link);
			Assert.assertEquals(homeObj.getActualMessage(), configFileReader.getAlert("homepageGetStartedAlert"));
			LoggerLoad.info("The User is seeing the alert message " + homeObj.getActualMessage());
		}
	}

	@When("the user views the navigation menu")
	public void the_user_views_the_navigation_menu() {
		homeObj.accountHoldernameclick();
	}

	@Then("The account holdername should be displayed in the hompage")
	public void The_account_holdername_should_be_displayed_in_the_hompage() {
		Assert.assertEquals(homeObj.getAccountholdername(),
				configFileReader.getFunctionalityMessage("accountholdername"));
		LoggerLoad.info("The User can able to view the account hoidername  " + homeObj.getAccountholdername());
	}

	@When("The user click the sign out in home page")
	public void The_user_click_the_sign_out_in_home_page() {
			homeObj.logoutClick();
	}

	@Then("The user should logged out of the user account")
	public void The_user_should_logged_out_of_the_user_account() {
		Assert.assertEquals(homeObj.alertSignout(), configFileReader.getFunctionalityMessage("signout"));
		LoggerLoad.info("The User can succefully loggedout of the application " + homeObj.alertSignout());
	}
}