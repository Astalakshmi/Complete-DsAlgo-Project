package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.LinkedListPage;
import utilities.ConfigFileReader;
import utilities.ExcelFileReader;
//import utilities.ExcelFileReader;
import utilities.LoggerLoad;


public class ArrayStep {

	
	public WebDriver driver=WebdriverManager.getDriver();
	public ArrayPage ap=new ArrayPage();
	public LinkedListPage lp=new LinkedListPage();
	
	ConfigFileReader configFileReader= new ConfigFileReader();
	ExcelFileReader reader = new ExcelFileReader();
	
	String excelFilePath= "./src/test/resources/Excel/testData.xlsx";
	String input;
	String expectedOutput;
	String pythonCode;	
//---------@Array_GetStarted @Array_TC_001-------------
	@When("the User clicks Get Started button in the Array section")
	public void the_user_clicks_get_started_button_in_the_array_section() {
		ap.clickArrGetStartedBtn();
	}

	@Then("the User should get navigated to the Array Module  Page")
	public void the_user_should_get_navigated_to_the_array_module_page() {
		  Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("arrayPage"));
	}
	
//----------------@AIP @Array_TC_002----------------	
	@Given("the User is on the Array Module page")
	public void the_user_is_on_the_array_module_page() {
		ap.clickArrGetStartedBtn();
	}

	@When("the User clicks Arrays in Python link in the Array Module Page")
	public void the_user_clicks_arrays_in_python_link_in_the_array_module_page() {
	  ap.clickArrAIPLink();
	}

	@Then("the User should get navigated to the Arrays in Python Page")
	public void the_user_should_get_navigated_to_the_arrays_in_python_page() {
	   Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("arraysInPython"));
	}

//--------------@AIPTryEditor @Array_TC_003---------------
	@Given("the User is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		ap.clickArrGetStartedBtn();
		ap.clickArrAIPLink();
	}

	@When("the User clicks the Try here in Arrays in Python Page")
	public void the_user_clicks_the_try_here_in_arrays_in_python_page() {
	  ap.clickArrTryHereBtn();
	}
	
	@Then("the User should get navigated to the Try Editor Page through the Arrays in Python Page")
	public void the_user_should_get_navigated_to_the_try_editor_page_through_the_arrays_in_python_page() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("tryEditor"));  
	}

//-----------------@AIPPracQns @Array_TC_004-------------------
	@Given("the User is on the Try Editor page through the Arrays in Python Page")
	public void the_user_is_on_the_try_editor_page_through_the_arrays_in_python_page() {
		   ap.clickArrGetStartedBtn();
		   ap.clickArrAIPLink();
		   ap.clickArrTryHereBtn();
	}
	
	@When("the User clicks Practice Questions link in the Python Page")
	public void the_user_clicks_practice_questions_link_in_the_python_page() {
	    ap.clickArrPracticeQnsLink();
	}

	@Then("the User should get navigated to the Practice Questions Page from the Array in Python Page")
	public void the_user_should_get_navigated_to_the_practice_questions_page_from_the_array_in_python_page() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("practiceQuestions"));
	}

	

//-----------------@AIPPracQns1 -----------------------
	@Given("the User is on the Practice Questions page")
	public void the_user_is_on_the_practice_questions_page() {
		ap.clickArrGetStartedBtn();
		ap.clickArrAIPLink();
		ap.clickArrPracticeQnsLink();
	}
//-------------------@AIPPracQns1 @Array_TC_006----------
	@When("the User clicks the Search the array link in Practice Questions Page")
	public void the_user_clicks_the_search_the_array_link_in_practice_questions_page() {
	    ap.clickArrPracQnsQn1();
	}

	@Then("the User should get navigated to the Search the Array Page")
	public void the_user_should_get_navigated_to_the_search_the_array_page() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("tryEditor"));   
	}

//---------------@AIPPracQns2 @AIPPracQns2TC_007----------------
	@When("the User clicks the Max Consecutive Ones link in Practice Questions Page")
	public void the_user_clicks_the_max_consecutive_ones_link_in_practice_questions_page() {
		ap.clickArrPracQnsQn2();
	   
	}

	@Then("the User should get navigated to the Max Consecutive Ones Page")
	public void the_user_should_get_navigated_to_the_max_consecutive_ones_page() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("tryEditor"));
	}
//------------------@AIPPracQns3 @AIPPracQns3TC_008-----------------	
	
	@When("the User clicks the Find Numbers with Even Number of Digits link in Practice Questions Page")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link_in_practice_questions_page() {
	    ap.clickArrPracQnsQn3();
	}

	@Then("the User should get navigated to the Find Numbers with Even Number of Digits Page")
	public void the_user_should_get_navigated_to_the_find_numbers_with_even_number_of_digits_page() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("tryEditor"));
	}

//---------------@AIPPracQns4 @AIPPracQns4TC_009--------------------
	
	@When("the User clicks the Squares of a Sorted Array link in Practice Questions Page")
	public void the_user_clicks_the_squares_of_a_sorted_array_link_in_practice_questions_page() {
	    ap.clickArrPracQnsQn4();
	}

	@Then("the User should get navigated to the Squares of a Sorted Array Page")
	public void the_user_should_get_navigated_to_the_squares_of_a_sorted_array_page() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("tryEditor"));
	}
	
	
	

//-----------------@AUL @AULTC_010----------------
	@When("the User clicks Arrays using List link in the Array Module Page")
	public void the_user_clicks_arrays_using_list_link_in_the_array_module_page() {
	    ap.clickArrAULLink();
	}

	@Then("the User should get navigated to the Arrays using List Page")
	public void the_user_should_get_navigated_to_the_arrays_using_list_page() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("arraysUsingList"));
	}

//--------------@AULTryEditor @AULEditorTC_011------------
	
	@Given("the User is on the Arrays using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
	    ap.clickArrGetStartedBtn();
	    ap.clickArrAULLink();
	}

	@When("the User clicks the Try here in Arrays using List Page")
	public void the_user_clicks_the_try_here_in_arrays_using_list_page() {
	   ap.clickArrTryHereBtn();
	}
	
	@Then("the User should get navigated to the Try Editor Page from Arrays using List")
	public void the_user_should_get_navigated_to_the_try_editor_page_from_arrays_using_list() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("tryEditor"));
	}

//--------------@AULTryEditorPage @Array_TC_012-----------
	@Given("the User is on the Try Editor page through the Arrays using List")
	public void the_user_is_on_the_try_editor_page_through_the_arrays_using_list() {
		ap.clickArrGetStartedBtn();
		   ap.clickArrAULLink();
		   ap.clickArrTryHereBtn(); 
	}

	
//----------------@AULPracQns @AULPracQnsTC_013-----------
	
	@When("the User clicks Practice Questions link in the Arrays using List Page")
	public void the_user_clicks_practice_questions_link_in_the_arrays_using_list_page() {
	    ap.clickArrPracticeQnsLink();
	}
	
	@Then("the User should get navigated to the Practice Questions Page from Arrays using List")
	public void the_user_should_get_navigated_to_the_practice_questions_page_from_arrays_using_list() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("practiceQuestions"));
	}

	
//----------------Basic Operations in Lists_TryHere-------------------
//----------------@BOL @BOLTC_014-----------------------------------
	@When("the User clicks Basic Operations in Lists link in the Array Module Page")
	public void the_user_clicks_basic_operations_in_lists_link_in_the_array_module_page() {
		ap.clickArrBOLLink();
	}

	@Then("the User should get navigated to the Basic Operations in Lists Page")
	public void the_user_should_get_navigated_to_the_basic_operations_in_lists_page() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("basicOperInList"));
	}

//----------------@BOLTryEditor @BOLEditorTC_015-----------------------------------
	@When("the User clicks the Try here in Basic Operations in Lists Page")
	public void the_user_clicks_the_try_here_in_basic_operations_in_lists_page() {
	    ap.clickArrTryHereBtn();
	}

	@Then("the User should get navigated to the Try Editor Page from the Basic Operations in Lists")
	public void the_user_should_get_navigated_to_the_try_editor_page_from_the_basic_operations_in_lists() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("tryEditor"));
	}
//------------@BOLTryEditorPage @Array_TC_016-----------------
	@Given("the User is on the Try Editor page through the Basic Operations in Lists Page")
	public void the_user_is_on_the_try_editor_page_through_the_basic_operations_in_lists_page() {
		ap.clickArrGetStartedBtn();
		   ap.clickArrBOLLink();
		   ap.clickArrTryHereBtn();   
	}


	
//----------------Basic Operations in Lists_Search the Array---------------------	
	//----------------@BOLPracQns @BOLPracQnsTC_017-----------------------------------
	@Given("the User is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
	   ap.clickArrGetStartedBtn();
	   ap.clickArrAULLink();
	}

	@When("the User clicks Practice Questions link in the Basic Operations in Lists Page")
	public void the_user_clicks_practice_questions_link_in_the_basic_operations_in_lists_page() {
	   ap.clickArrPracticeQnsLink();
	}

	@Then("the User should get navigated to the Practice Questions Page from the Basic Operations in Lists")
	public void the_user_should_get_navigated_to_the_practice_questions_page_from_the_basic_operations_in_lists() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("practiceQuestions"));  
	}


//----------------Applications of Array_TryHere---------------------
//----------------@AOA @AOATC_018-----------------------------------	
	
	@When("the User clicks Applications of Array link in the Array Module Page")
	public void the_user_clicks_applications_of_array_link_in_the_array_module_page() {
	    ap.clickArrAOALink();
	}

	@Then("the User should get navigated to the Applications of Array Page")
	public void the_user_should_get_navigated_to_the_applications_of_array_page() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("appOfArray"));
	}
	
//----------------@AOATryEditor @AOAEditorTC_019-----------------------------------
	
	@When("the User clicks the Try here in Applications of Array Page")
	public void the_user_clicks_the_try_here_in_applications_of_array_page() {
		ap.clickArrTryHereBtn();
	}

	@Then("the User should get navigated to the Try Editor Page from Applications of Array")
	public void the_user_should_get_navigated_to_the_try_editor_page_from_applications_of_array() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("tryEditor"));
	}

//-------------------@AOATryEditorPage @Array_TC_020-------------------------
	@Given("the User is on the Try Editor page through the Applications of Array Page")
	public void the_user_is_on_the_try_editor_page_through_the_applications_of_array_page() {
	   ap.clickArrGetStartedBtn();
	   ap.clickArrAOALink();
	   ap.clickArrTryHereBtn();
	}

	
//----------------Applications of Array_Search the Array---------------------
//----------------@AOAPracQns @AOAPracQnsTC_021----------------------------
	@Given("the User is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
	    ap.clickArrGetStartedBtn();
	    ap.clickArrAOALink();
	}

	@When("the User clicks Practice Questions link in the Applications of Array Page")
	public void the_user_clicks_practice_questions_link_in_the_applications_of_array_page() {
	    ap.clickArrPracticeQnsLink();
	}

	@Then("the User should get navigated to the Practice Questions Page from the Applications of Array")
	public void the_user_should_get_navigated_to_the_practice_questions_page_from_the_applications_of_array() {
		Assert.assertEquals(driver.getTitle(), configFileReader.getPageTitle("practiceQuestions"));
	}

	
//----------------------------TryEditor-------------------------------------------
	
	@Given("the User is on the Try Editor page")
	public void the_user_is_on_the_try_editor_page() {
	    ap.clickArrGetStartedBtn();
	    ap.clickArrAIPLink();
	    ap.clickArrTryHereBtn();
	}
	

//-----------------@PracQns1RunButton------------------------
	@Given("the User is on the Search the Array Page")
	public void the_user_is_on_the_search_the_array_page() {
	ap.clickArrGetStartedBtn();
	ap.clickArrAULLink();
	ap.clickArrPracticeQnsLink();
	ap.clickArrPracQnsQn1();
	}

//-----------@PracQnsRunButton---------------------
	//RUN
	@When("the User enters code from {string} in {int} in the Editor section and click Run")
	public void the_user_enters_code_from_in_in_the_editor_section_and_click_run(String sheetName, int rowNumber) throws InterruptedException, IOException {
		
		
		List <Map <String, String>> excelData = reader.getData(excelFilePath,sheetName);
		 input= excelData.get(rowNumber).get("pythonCode");
		 expectedOutput=excelData.get(rowNumber).get("output");
		 ap.enterCodePractice(input);
		 
		 LoggerLoad.info("TextEditor is not waiting till the Code to be entered");
		 ap.clickTryHereRunBtn();
		
		LoggerLoad.info("TextEditor Run");
	}
//-----------@PracQnsSubmitButton---------------------
//	SUBMIT
	@When("the User enters code from {string} in {int} in the Editor section and click Submit")
	public void the_user_enters_code_from_in_in_the_editor_section_and_click_submit(String sheetName, int rowNumber)throws IOException, InterruptedException {
	
		List <Map <String, String>> excelData1 = reader.getData(excelFilePath,sheetName);
		input= excelData1.get(rowNumber).get("pythonCode");
		expectedOutput=excelData1.get(rowNumber).get("output");
		ap.enterCodePractice(input);
		
		 LoggerLoad.info("TextEditor is not waiting till the Code to be entered");
		ap.clickSubmitBtn();
		
		LoggerLoad.info("TextEditor Submit");
	   	}
	
	@Then("the User should vaidate the expected output in the Practice Questions Output section")
	public void the_User_should_vaidate_the_expected_output_in_the_Practice_Questions_Output_section() throws InterruptedException {
	//	Thread.sleep(5000);
		Assert.assertEquals(ap.getTryHereOutputText(), expectedOutput);  
		}
//-------------@PracQns2RunButton------------------
	@Given("the User is on the Max Consecutive Ones Page")
	public void the_user_is_on_the_max_consecutive_ones_page() {
		ap.clickArrGetStartedBtn();
		ap.clickArrAIPLink();
		ap.clickArrPracticeQnsLink();
		ap.clickArrPracQnsQn2();
	}
//---------------@PracQns3RunButton-----------------
	@Given("the User is on the Find Numbers with Even Number of Digits Page")
	public void the_user_is_on_the_find_numbers_with_even_number_of_digits_page() {
		ap.clickArrGetStartedBtn();
		ap.clickArrAULLink();
		ap.clickArrPracticeQnsLink();
		ap.clickArrPracQnsQn3();
	}
//----------------@PracQns4RunButton----------------------
	@Given("the User is on the Squares of a Sorted Page")
	public void the_user_is_on_the_squares_of_a_sorted_page() {
		ap.clickArrGetStartedBtn();
		ap.clickArrAULLink();
		ap.clickArrPracticeQnsLink();
		ap.clickArrPracQnsQn4();
	}

	
}
	