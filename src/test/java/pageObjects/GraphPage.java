package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

import driverManager.WebdriverManager;

public class GraphPage {
	WebDriver driver = WebdriverManager.getDriver();
	
	//locator
	
				//Get_Started_Graph
	
	@FindBy(xpath="//a[@href='graph']")
	WebElement graphStarted;
	
	     //Topic covered Graph
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Graph']")
	WebElement graphLink;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement graphTryHere;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement graphRunbtn;
	
	  			//Topic covered Graph Representation
	@FindBy(xpath="//a[normalize-space()='Graph Representations']")
	WebElement graphRepresent;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement graphRepresentTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement graphRepresentEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement graphRepresentRunbtn;
			   //Practice Questions
	@FindBy(xpath="//a[normalize-space()='Practice Questions']")
//	@FindBy(linkText="Practice Questions")
	WebElement graphPracticeQuestion;
	
	
	@FindAll (value = { @FindBy (className = "list-group") })
	List<WebElement> practiceQuestions;
	         
	           //Action Methods
	public void clickGraphStarted() 
	{
		graphStarted.click();
		
	}
	public boolean clickGraphLink() //1
	{
		graphLink.click();
		return true;
	}	
	public void clickGraphTryHereBtn()
	{
		graphTryHere.click();
	}

	public boolean clickGraphRepresent() //2
	{
		 graphRepresent.click();
		 return true;
	}	
	public void clickGraphRepresentTryHereBtn()
	{
		graphRepresentTryHere.click();
	}

	public void clickHandleGraphPracticeQuestion() {
		graphPracticeQuestion.click();
	}
	
	public int getPracticeQuestionsCount() {
		return practiceQuestions.size();
	}
	//consructor
	public GraphPage() 
	{ 
		PageFactory.initElements(driver, this);
	}
	
}