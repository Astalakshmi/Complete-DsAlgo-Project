package hooks;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverManager.WebdriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigFileReader;


public class HooksBase {
	ConfigFileReader configFileReader = new ConfigFileReader();

	
	@Before
	public void launchBrowser() {
		
		String browserType = ConfigFileReader.getBrowserType();
		WebDriver driver = WebdriverManager.initializeDriver(browserType);
		//ConfigFileReader configFileReader = WebdriverManager.configReader();
			//driver.get("https://dsportalapp.herokuapp.com");
			driver.get(configFileReader.getIndexUrl());
		}
	 
	 @AfterStep
	 public void getScreenshot(Scenario scenario) {
		 if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) WebdriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName());   
	        }  
	 }

	@After
	public void quitbrowser(Scenario scenario) {

		WebdriverManager.closeDriver();

	}
	
}