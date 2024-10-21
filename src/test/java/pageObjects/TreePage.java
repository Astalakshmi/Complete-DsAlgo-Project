package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driverManager.WebdriverManager;

public class TreePage {

	WebDriver driver = WebdriverManager.getDriver();

	@FindBy(xpath = "//h5[text()='Tree']/../a[text()='Get Started']")
	WebElement getStarted;

	@FindBy(xpath = "//h4[@class='bg-secondary text-white']/../ul/a[text()='Overview of Trees']")
	WebElement overviewTrees;

	@FindBy(xpath = "//div[@class='container']/div/form/div/div/div/textarea")
	WebElement editorText;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHere;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement run;

	@FindBy(xpath = "//a[text()='Terminologies']")
	WebElement terminologies;

	@FindBy(xpath = "//a[text()='Types of Trees']")
	WebElement typesOfTrees;

	@FindBy(xpath = "//a[text()='Tree Traversals']")
	WebElement treeTraversals;

	@FindBy(xpath = "//a[text()='Traversals-Illustration']")
	WebElement traversalsIllustrations;

	@FindBy(xpath = "//a[text()='Binary Trees']")
	WebElement binaryTrees;

	@FindBy(xpath = "//a[text()='Types of Binary Trees']")
	WebElement typesOfBinaryTrees;

	@FindBy(xpath = "//a[text()='Implementation in Python']")
	WebElement impInpython;

	@FindBy(xpath = "//a[contains(text(),'Binary Tree Traversals')]")
	WebElement binTreestraversal;

	@FindBy(xpath = "//a[text()='Implementation of Binary Trees']")
	WebElement impBinaryTrees;

	@FindBy(xpath = "//a[text()='Applications of Binary trees']")
	WebElement appBinTree;

	@FindBy(xpath = "//a[text()='Binary Search Trees']")
	WebElement binarySearchTrees;

	@FindBy(xpath = "//a[text()='Implementation Of BST']")
	WebElement impBst;

	@FindBy(xpath = "//div[@align='left']/pre[@id='output']")
	WebElement runOutputvalue;
	
	@FindBy (partialLinkText = "Practice Questions")
	WebElement treePracticeLink;
	
	@FindAll (value = { @FindBy (className = "list-group") })
	List<WebElement> practiceQuestions;

	public void getStartedclick() {
		getStarted.click();
	}

	public void overviewTreesclick() {
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.elementToBeClickable(overviewTrees)).click();
	}

	public void editorText(String inputCode) {
		editorText.sendKeys(inputCode);
	}

	public void tryHereclick() {
		tryHere.click();
	}

	public void runClick() {
		run.click();
	}

	public void terminologiesClick() {
		terminologies.click();
	}

	public void typesOfTreesclick() {
		typesOfTrees.click();
	}

	public void treeTraversalsclick() {
		treeTraversals.click();
	}

	public void traIllustrationsclick() {
		traversalsIllustrations.click();
	}

	public void binTreesclick() {
		binaryTrees.click();
	}

	public void typesofBintreesclick() {
		typesOfBinaryTrees.click();
	}

	public void impInpythonclick() {
		impInpython.click();
	}

	public void bintreesTraversalclick() {
		binTreestraversal.click();
	}

	public void impBintreesclick() {
		impBinaryTrees.click();
	}

	public void appBintreeclick() {
		appBinTree.click();
	}

	public void binarySearchtreesclick() {
		binarySearchTrees.click();
	}

	public void impBstclick() {
		impBst.click();
	}

	public void practiceQuestionslink() {
		treePracticeLink.click();
	}

	public void backward() {
		driver.navigate().back();
	}

	public int getPracticeQuestionsCount() {
		return practiceQuestions.size();
	}

	public String getActualTitle() {
		return driver.getTitle();
	}

	public TreePage() {
		PageFactory.initElements(driver, this);
	}

	
}