package driverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Optional;

import utilities.ConfigFileReader;

public class WebdriverManager {
	

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public static  ConfigFileReader configFileReader = new ConfigFileReader();

	public static WebDriver initializeDriver(@Optional("CHROME") String browserName) {
		//configFileReader= new ConfigFileReader();
		//String browserName = configFileReader.getBrowserType();
		if (browserName != null && browserName.equalsIgnoreCase("CHROME")) {
			driver.set(new ChromeDriver());
			//driver = new ChromeDriver();
			
		} else if (browserName != null && browserName.equalsIgnoreCase("EDGE")) {
			driver.set(new EdgeDriver());
			
		}else if (browserName != null && browserName.equalsIgnoreCase("SAFARI")) {
			driver.set(new SafariDriver());
			
		}else if (browserName != null && browserName.equalsIgnoreCase("FIREFOX")) {
			driver.set(new FirefoxDriver());
			
		}
		
		

		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver.get();
	}

	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static ConfigFileReader configReader() {
		return configFileReader;
	}
		
	public static void closeDriver() {
			driver.get().quit();
	}
}