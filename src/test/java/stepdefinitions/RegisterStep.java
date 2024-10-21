package stepdefinitions;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.WebdriverManager;
import io.cucumber.java.en.*;
import pageObjects.HomePage;

import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utilities.ConfigFileReader;
import utilities.ExcelFileReader;
import utilities.LoggerLoad;

public class RegisterStep {
	
	WebDriver driver = WebdriverManager.getDriver();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	RegisterPage registerObj = new RegisterPage();
	LoginPage loginObj = new LoginPage();
	HomePage homeObj = new HomePage();
	


	ExcelFileReader reader = new ExcelFileReader();
	
	
//	String excelFilePath= "./src/test/resources/Excel/userData.xlsx";

	String excelFilePath= "./src/test/resources/Excel/TestData.xlsx";
	
	String username,password,confirmPassword;
	String expectedOutput,invalidExpectedOutput;
	String unameValidateMsg,pwdValidateMsg, confirmPwdValidateMsg;
	int tempRow;
	int rowNumber;
	public static final int maxLengthOfRow = 8; 
	
	@Given("The User navigates to the Registration page")
	public void the_user_navigates_to_the_registration_page() {
	//	indexObj.getStarted();
		homeObj.getStartedhomeclickwithoutlogin();
		registerObj.registerLink();
	//	System.out.println("file path:"+ excelFilePath);
		
	}
	@When("The User enter valid username and password then confirmPassword from sheet {string}")
	public void the_user_enter_valid_username_and_password_then_confirm_password_from_sheet(String RegisterPage) throws EncryptedDocumentException, IOException {
		
		List <Map <String, String>> userData = reader.getData(excelFilePath,RegisterPage);		
	
		
			  System.out.println("Size of userData: " + userData);
			  LoggerLoad.info("Size of userData: " + userData.size());
			  username=userData.get(0).get("username");
			  password= userData.get(0).get("password");
			  confirmPassword =userData.get(0).get("password confirmation");
			  expectedOutput=userData.get(0).get("Expected Output");
		
			  
			   if(username != null || password != null || confirmPassword != null)
			   {
				   registerObj.setUsername(username);
				   registerObj.setPassword(password);
				   registerObj.setConfirmPassword(confirmPassword);	   
				   registerObj.registerBtn();
			   }
			   else {
				   LoggerLoad.warn("Invalid data in sheet for username, password, or confirm password");
			   }
	
			 }
			

		@Then("The User should get navigated to Login Page")
		public void the_user_should_get_navigated_to_Login_page() {
			
			String actualMessage=registerObj.setExpectedOutPut();
			Assert.assertEquals(actualMessage,expectedOutput);
			LoggerLoad.info("New Account Created. You are logged in as " + username);
			
		}


	
	@When("The User enter Invalid username and password then confirmPassword from sheet {string} and {int} and click register button")
	public void the_user_enter_invalid_username_and_password_then_confirm_password_from_sheet_and_and_click_register_button(String sheetName, int rowNumber) throws EncryptedDocumentException, IOException {
	  	
		
		List <Map <String, String>> userData = reader.getData(excelFilePath,sheetName);
		System.out.println("Size of userData: " + userData);
	
		
		 username= userData.get(rowNumber).get("username");
		 password= userData.get(rowNumber).get("password");
		 confirmPassword = userData.get(rowNumber).get("password confirmation");
		 invalidExpectedOutput=userData.get(rowNumber).get("Expected Output");
		
		  unameValidateMsg= registerObj.setUsernameMsgAttribute();
		  pwdValidateMsg= registerObj.setPasswordMsgAttribute();
		  confirmPwdValidateMsg= registerObj.setConfirmPwdMsgAttribute();
	//	 System.out.println("rownumber:"+ rowNumber);
		 
		 if(rowNumber==maxLengthOfRow) {
			 tempRow=rowNumber+1;
		//	 System.out.println("TESTING tempRow : "+tempRow);
		 }
	
		if(username != null || password != null || confirmPassword != null) 
		{
			registerObj.setUsername(username);
			registerObj.setPassword(password);
			registerObj.setConfirmPassword(confirmPassword);	
			registerObj.registerBtn();		
		
		try
			{
				Alert alert = driver.switchTo().alert();
		        String actualAlertText = alert.getText();
		        System.out.println("The alert message: " + actualAlertText);
		        Assert.assertEquals(actualAlertText ,invalidExpectedOutput);
			}
			catch(NoAlertPresentException e)
			{
		        System.out.println("No alert was present during the Register process.");
		     }
		
		 }

	}
		 


	@Then("The User validate the Excepted Output for Registration Page")
	public void the_user_validate_the_excepted_output_for_registration_page() {
		

		
		if(password.isBlank() && confirmPassword.isBlank()) {
			
			Assert.assertEquals(unameValidateMsg, invalidExpectedOutput);             //Assert.assertEquals(validationMessage, "Please fill out this field");
			LoggerLoad.error("Password and confirmPassword field are Blank- "+ invalidExpectedOutput);	
			
		}
		else if(username.isBlank() && confirmPassword.isBlank()) {
			
			Assert.assertEquals(pwdValidateMsg, invalidExpectedOutput);
			LoggerLoad.error("Username and confirmPassword field are Blank- " + invalidExpectedOutput);	
		}
		else if(username.isBlank() && password.isBlank()) {
			
			Assert.assertEquals(confirmPwdValidateMsg, invalidExpectedOutput);
			LoggerLoad.error("Username and Password field are Blank- " +invalidExpectedOutput);	
		}
		else if(username.isBlank() && password.isBlank() && confirmPassword.isBlank()) {
			Assert.assertEquals(unameValidateMsg, invalidExpectedOutput);
			LoggerLoad.error("Username,Password and ConfirmPassword field are Blank- "+invalidExpectedOutput);	
		}
		else {
			String failureMessage=registerObj.setMismatchExpOutput();
			Assert.assertEquals(failureMessage,invalidExpectedOutput);
			LoggerLoad.error("password_mismatch:The two password fields didn’t match.");	
		}
		
		//Loginlink and Signin Navigation
		 if(tempRow>maxLengthOfRow)
			
		 {
			 
			 registerObj.clickLoginLink();
			 System.out.println("clicked login link");
			 LoggerLoad.info("clicked login link");
			 driver.navigate().back();
			 LoggerLoad.info("Back to Register page");
			 loginObj.signInclick();
			 System.out.println("clicked sign in  nav link");
			 LoggerLoad.info("We are in Register Page ,Navigate to login page using Menubar 'Sign-in' link");
	      }

	}
	
}
	

	
 