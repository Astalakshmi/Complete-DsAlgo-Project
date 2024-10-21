package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.WebdriverManager;

public class QueuePage {
	
	WebDriver driver = WebdriverManager.getDriver();
	
	
	//locator
	
				//Get_Started_Queue
	@FindBy(xpath="//a[@href='queue']")
	WebElement queueStarted;
	
				//Topic covered queueInPython
	@FindBy(xpath="//a[normalize-space()='Implementation of Queue in Python']")
	WebElement queueInPython;
	
	@FindBy(linkText="Try here>>>")
	WebElement queueInPythonTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement queueInPythonEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement queueInPythonRunbtn;
	
	@FindBy(xpath="//pre[@id='output']")
	WebElement outputQueueInPython;
	             //Topic covered collection.deque
	@FindBy(xpath="//a[normalize-space()='Implementation using collections.deque']")
	WebElement deque;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement dequeTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement dequeEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement dequeRunbtn;
	
					//Topic covered collection in Array
	@FindBy(xpath="//a[normalize-space()='Implementation using array']")
	WebElement queueImplArray;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement queueImplArrayTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement queueImplArrayEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement queueImplArrayRunbtn;
			//Topic covered Queue Operation
	@FindBy(xpath="//a[normalize-space()='Queue Operations']")
	WebElement queueOperation;
	
	@FindBy(xpath="//a[normalize-space()='Try here>>>']")
	WebElement queueOpsTryHere;
	
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement queueOpsEditor;
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement queueOpsRunbtn;
				//Practice Question
	@FindBy(xpath="//a[normalize-space()='Practice Questions']")
	WebElement  queuePracticeQuestion;
	
	@FindAll (value = { @FindBy (className = "list-group") })
	List<WebElement> practiceQuestions;
	
	//Action Methods
	
	public void clickQueueStarted()
	{
		 queueStarted.click();
	}
	public boolean clickQueueInPythonLink() //1
	{
		queueInPython.click();
		return true;
	}
	public void clickQueueInPythonTryHere()
	{
		queueInPythonTryHere.click();
	}

	public boolean clickDequeLink()   //2
	{
		deque.click();
		return true;
	}
	public void clickDequeTryHere()
	{
		dequeTryHere.click();
	}

	public boolean clickQueueImplArrayLink()  //3
	{
		queueImplArray.click();
		return true;
	}
	public void clickQueueImplArrayTryHere()
	{
		queueImplArrayTryHere.click();
	}
	public boolean clickQueueOperationLink() //4
	{
		queueOperation.click();
		return true;
	}
	public void clickQueueOpsTryHere()
	{
		queueOpsTryHere.click();
	}	
	public void handlePracticeQuestionClick() {
 
		queuePracticeQuestion.click();
	
	}
	public int getPracticeQuestionsCount() {
		return practiceQuestions.size();
	}
	
	//consructor
	public QueuePage() {
		PageFactory.initElements(driver, this);
	}
}