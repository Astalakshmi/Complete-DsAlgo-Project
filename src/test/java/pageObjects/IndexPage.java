package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.WebdriverManager;

public class IndexPage {

	WebDriver driver = WebdriverManager.getDriver();
	

	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement getStarted;

	public void getStarted() {
		 WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.elementToBeClickable(getStarted)).click();
	}

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
}
