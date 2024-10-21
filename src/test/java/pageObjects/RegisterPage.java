package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;
import utilities.ConfigFileReader;

public class RegisterPage {
	WebDriver driver = WebdriverManager.getDriver();

	ConfigFileReader configFileReader = WebdriverManager.configReader();
	
	boolean isRequired ;
	
	
	// locators
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement registerLink;
	@FindBy(xpath="//input[@id='id_username']")
	WebElement username;
	@FindBy(xpath="//input[@id='id_password1']")
	WebElement password;
	@FindBy(xpath="//input[@id='id_password2']")
	WebElement confirmPassword;
	@FindBy(xpath="//input[@value='Register']")
	WebElement registerBtn;
	@FindBy(xpath="//*[contains(text(),'New Account')]")
	WebElement successTextOfRegister;
	@FindBy(xpath="//div[contains(text(),'password_mismatch')]")
	WebElement failureTextOfRegister;
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement clickLoginLink;
	//After signin password 
	@FindBy(xpath ="//input[@id='id_password']")
	WebElement signInPassword;
	
	//Action Methods
	
	public void registerLink() {
	
	registerLink.click();
	}
	public boolean setUsername(String Username) {
	
	//username.clear();
	username.sendKeys(Username);
	
	if (Username.isBlank()) {
		JavascriptExecutor js_user = (JavascriptExecutor) driver;
		isRequired = (Boolean)js_user.executeScript("return arguments[0].required;",username);
		return isRequired;
	}
	
	return isRequired;
	
	}
	public String setUsernameMsgAttribute() {
	return username.getAttribute("validationMessage");
	}
	
	public boolean setPassword(String Password) {
	
	//	password.clear();
	password.sendKeys(Password);	
	
	if (Password.isBlank()) {
		JavascriptExecutor js_password = (JavascriptExecutor) driver;
		isRequired = (Boolean)js_password.executeScript("return arguments[0].required;",password);
		return isRequired;
	}
	
	return isRequired;
	
	
	}
	public String setPasswordMsgAttribute() {
	
	return password.getAttribute("validationMessage");
	}
	
	public boolean setConfirmPassword(String ConfirmPwd) {
	
	//	confirmPassword.clear();
	confirmPassword.sendKeys(ConfirmPwd);	
	
	if (ConfirmPwd.isBlank()) {
		JavascriptExecutor js_confirmpassword = (JavascriptExecutor) driver;
		isRequired = (Boolean)js_confirmpassword.executeScript("return arguments[0].required;",confirmPassword);
		return isRequired;
	}
	
	return isRequired;
	
	
	}
	public String setConfirmPwdMsgAttribute() {
	
	return confirmPassword.getAttribute("validationMessage");
	}
	
	public void registerBtn() {
	
	registerBtn.click();
	}
	public void clickLoginLink() {
	clickLoginLink.click();
	}
	
	public void signInPassword() {
	signInPassword.sendKeys("Dre@mTe@m123");
	}
	public String actualTitle() {
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	return actualTitle;
	}
	
	public String setExpectedOutPut() {
	return successTextOfRegister.getText();     //"New Account Created. You are logged in as " + username
	
	}
	
	public String setMismatchExpOutput() {
	return failureTextOfRegister.getText();		//password_mismatch:The two password fields didn’t match.
	}
	
	public RegisterPage() {
	PageFactory.initElements(driver, this);
	}
	
	}