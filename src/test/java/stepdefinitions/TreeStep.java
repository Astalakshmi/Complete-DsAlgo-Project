package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import driverManager.WebdriverManager;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import pageObjects.TreePage;
import utilities.ConfigFileReader;
import utilities.ExcelFileReader;
import utilities.LoggerLoad;

public class TreeStep {

	WebDriver driver = WebdriverManager.getDriver();
	ConfigFileReader configFileReader = WebdriverManager.configReader();
	TreePage treeObj = new TreePage();
	RegisterPage registerObj = new RegisterPage();
	HomePage homeObj = new HomePage();
	ExcelFileReader reader = new ExcelFileReader();

	@When("user clicked on the Tree Get Started link button")
	public void user_clicked_on_the_tree_get_started_link_button() {
		treeObj.getStartedclick();
	}

	@Then("user is able to view the Tree Module Page")
	public void user_is_able_to_view_the_Tree_module_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("treePage"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Tree module page")
	public void user_is_on_the_tree_module_page() {
		treeObj.getStartedclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");

	}

	@When("user clicked the overview of Trees link")
	public void user_clicked_the_overview_of_trees_link() {
		treeObj.overviewTreesclick();
	}

	@Then("user is able to view the overview of Trees Page")
	public void user_is_able_to_view_the_overview_of_trees_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("overviewTree"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Overview of Trees Page")
	public void user_is_on_the_overview_of_trees_page() {
		treeObj.getStartedclick();
		treeObj.overviewTreesclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here link from the Overview of Trees Page")
	public void user_clicked_the_try_here_link_from_the_overview_of_trees_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Overview of Trees link")
	public void the_user_is_on_the_try_editor_page_from_overview_of_trees_link() {
		treeObj.getStartedclick();
		treeObj.overviewTreesclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Overview of Trees page")
	public void user_clicked_the_practice_questions_from_overview_of_trees_page() {
		treeObj.practiceQuestionslink();
	}

	@Then("user should view the Practice Questions of Tree")
	public void user_should_view_the_Practice_Questions_of_Tree() {
		int practiceCount = treeObj.getPracticeQuestionsCount();
		if (practiceCount < 1) {
			Assert.fail("No questions found");
		}
	}

	@When("user clicked Terminologies link on the Tree Module page")
	public void user_clicked_terminologies_link_on_the_tree_module_page() {
		treeObj.terminologiesClick();
	}

	@Then("user is able to view the Terminologies linked page")
	public void user_is_able_to_view_the_terminologies_linked_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("terminologiesTree"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Terminologies page")
	public void user_is_on_the_terminologies_page() {
		treeObj.getStartedclick();
		treeObj.terminologiesClick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Terminologies page")
	public void user_clicked_the_try_here_on_the_terminologies_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Terminologies link")
	public void the_user_is_on_the_try_editor_page_from_terminologies_link() {
		treeObj.getStartedclick();
		treeObj.terminologiesClick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Terminologies page")
	public void user_clicked_the_practice_questions_from_terminologies_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Types of Trees link in the Tree Modulepage")
	public void user_clicked_types_of_trees_link_in_the_tree_modulepage() {

		treeObj.typesOfTreesclick();
	}

	@Then("user is able to view the Types of Trees linked page")
	public void user_is_able_to_view_the_types_of_trees_linked_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("typesOfTrees"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Type of Trees page")
	public void user_is_on_the_type_of_trees_page() {
		treeObj.getStartedclick();
		treeObj.typesOfTreesclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Types of Trees page")
	public void user_clicked_the_try_here_on_the_types_of_trees_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Type of Trees link")
	public void the_user_is_on_the_try_editor_page_from_type_of_trees_link() {
		treeObj.getStartedclick();
		treeObj.typesOfTreesclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	// -----------------@TypeTreesPractQues @TreeTC_013------------------

	@When("user clicked the Practice Questions from Type of Trees page")
	public void user_clicked_the_practice_questions_from_type_of_trees_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Tree Traversals link in the Tree Module page")
	public void user_clicked_tree_traversals_link_in_the_tree_module_page() {
		treeObj.treeTraversalsclick();
	}

	@Then("user is able to view the Tree Traversals linked page")
	public void user_is_able_to_view_the_tree_traversals_linked_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("treeTraversal"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Tree Traversals page")
	public void user_is_on_the_tree_traversals_page() {
		treeObj.getStartedclick();
		treeObj.treeTraversalsclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Tree Traversals page")
	public void user_clicked_the_try_here_on_the_tree_traversals_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Tree Traversals link")
	public void the_user_is_on_the_try_editor_page_from_tree_traversals_link() {
		treeObj.getStartedclick();
		treeObj.typesOfTreesclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Tree Traversals page")
	public void user_clicked_the_practice_questions_from_tree_traversals_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Traversals Illustration link in the Tree Module page")
	public void user_clicked_traversals_illustration_link_in_the_tree_module_page() {
		treeObj.traIllustrationsclick();
	}

	@Then("user is able to view the Traversals Illustration linked page")
	public void user_is_able_to_view_the_traversals_illustration_linked_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("traversalIllustration"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Traversals Illustration")
	public void user_is_on_the_traversals_illustration() {
		treeObj.getStartedclick();
		treeObj.traIllustrationsclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Traversals Illustration page")
	public void user_clicked_the_try_here_on_the_traversals_illustration_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Traversals Illustration link")
	public void the_user_is_on_the_try_editor_page_from_traversals_illustration_link() {
		treeObj.getStartedclick();
		treeObj.traIllustrationsclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@Given("user is on the Traversals Illustration page")
	public void user_is_on_the_traversals_illustration_page() {
		treeObj.getStartedclick();
		treeObj.traIllustrationsclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Traversals Illustration page")
	public void user_clicked_the_practice_questions_from_traversals_illustration_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Binary Trees link in the Tree Module page")
	public void user_clicked_binary_trees_link_in_the_tree_module_page() {
		treeObj.binTreesclick();
	}

	@Then("user is able to view the Binary Trees page")
	public void user_is_able_to_view_the_binary_trees_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("binaryTrees"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Binary Trees page")
	public void user_is_on_the_binary_trees_page() {
		treeObj.getStartedclick();
		treeObj.binTreesclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Binary Trees page")
	public void user_clicked_the_try_here_on_the_binary_trees_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from BinaryTrees link")
	public void the_user_is_on_the_try_editor_page_from_binary_trees_link() {
		treeObj.getStartedclick();
		treeObj.binTreesclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from BinaryTrees page")
	public void user_clicked_the_practice_questions_from_binary_trees_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Types of Binary Trees link in the Tree Module page")
	public void user_clicked_types_of_binary_trees_link_in_the_tree_module_page() {
		treeObj.typesofBintreesclick();
	}

	@Then("user is able to view the  Types of Binary Tree linked page")
	public void user_is_able_to_view_the_types_of_binary_tree_linked_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("typesBinTree"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Types of Binary Trees page")
	public void user_is_on_the_types_of_binary_trees_page() {
		treeObj.getStartedclick();
		treeObj.typesofBintreesclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Types of Binary Trees page")
	public void user_clicked_the_try_here_on_the_types_of_binary_trees_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Types of Binary Trees link")
	public void the_user_is_on_the_try_editor_page_from_types_of_binary_trees_link() {
		treeObj.getStartedclick();
		treeObj.typesofBintreesclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Types of Binary Trees page")
	public void user_clicked_the_practice_questions_from_types_of_binary_trees_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Implementations in Python link in the Tree Module page")
	public void user_clicked_implementations_in_python_link_in_the_tree_module_page() {
		treeObj.impInpythonclick();
	}

	@Then("user is able to view the  Implementations in Python link page")
	public void user_is_able_to_view_the_implementations_in_python_link_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("implementTreePython"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Implementations in Python page")
	public void user_is_on_the_implementations_in_Python_page() {
		treeObj.getStartedclick();
		treeObj.impInpythonclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Implementations in Python Tree page")
	public void user_clicked_the_try_here_on_the_implementations_in_python_tree_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Implementations in Python link")
	public void the_user_is_on_the_try_editor_page_from_implementations_in_python_link() {
		treeObj.getStartedclick();
		treeObj.impInpythonclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Implementations in Python page")
	public void user_clicked_the_practice_questions_from_implementations_in_python_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Binary Tree Traversals link in the Tree Module page")
	public void user_clicked_binary_tree_traversals_link_in_the_tree_module_page() {
		treeObj.bintreesTraversalclick();
	}

	@Then("user is able to view the Binary Tree Traversals linked page")
	public void user_is_able_to_view_the_binary_tree_traversals_linked_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("binTreeTraversal"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Binary Tree Traversals page")
	public void user_is_on_the_binary_tree_traversals_page() {
		treeObj.getStartedclick();
		treeObj.bintreesTraversalclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Binary Tree Traversals page")
	public void user_clicked_the_try_here_on_the_binary_tree_traversals_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Binary Tree Traversals link")
	public void the_user_is_on_the_try_editor_page_from_binary_tree_traversals_link() {
		treeObj.getStartedclick();
		treeObj.bintreesTraversalclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Binary Tree Traversals page")
	public void user_clicked_the_practice_questions_from_binary_tree_traversals_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Implementation of Binary Trees link in the Tree Module page")
	public void user_clicked_implementation_of_binary_trees_link_in_the_tree_module_page() {
		treeObj.impBintreesclick();
	}

	@Then("user is able to view the Implementation of Binary Trees link page")
	public void user_is_able_to_view_the_implementation_of_binary_trees_link_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("implementBinTree"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Implementation of Binary Trees")
	public void user_is_on_the_implementation_of_binary_trees() {
		treeObj.getStartedclick();
		treeObj.impBintreesclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on theImplementation of Binary Trees page")
	public void user_clicked_the_try_here_on_the_implementation_of_binary_trees_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Implementation of Binary Trees link")
	public void the_user_is_on_the_try_editor_page_from_implementation_of_binary_trees_link() {
		treeObj.getStartedclick();
		treeObj.impBintreesclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Implementation of Binary Treespage")
	public void user_clicked_the_practice_questions_from_implementation_of_binary_treespage() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Applications of Binary trees link in the Tree Module page")
	public void user_clicked_applications_of_binary_trees_link_in_the_tree_module_page() {
		treeObj.appBintreeclick();
	}

	@Then("user is able to view the Applications of Binary trees link page")
	public void user_is_able_to_view_the_applications_of_binary_trees_link_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("appBinTree"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Applications of Binary trees")
	public void user_is_on_the_applications_of_binary_trees() {
		treeObj.getStartedclick();
		treeObj.appBintreeclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Applications of Binary trees page")
	public void user_clicked_the_try_here_on_the_applications_of_binary_trees_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Applications of Binary trees link")
	public void the_user_is_on_the_try_editor_page_from_applications_of_binary_trees_link() {
		treeObj.getStartedclick();
		treeObj.appBintreeclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Applications of Binary trees page")
	public void user_clicked_the_practice_questions_from_applications_of_binary_trees_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Binary Search Trees link in the Tree Module page")
	public void user_clicked_binary_search_trees_link_in_the_tree_module_page() {
		treeObj.binarySearchtreesclick();
	}

	@Then("user is able to view the  Binary Search Trees linked page")
	public void user_is_able_to_view_the_binary_search_trees_linked_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("binSearchTree"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Binary Search Trees")
	public void user_is_on_the_binary_search_trees() {
		treeObj.getStartedclick();
		treeObj.binarySearchtreesclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Binary Search Trees page")
	public void user_clicked_the_try_here_on_the_binary_search_trees_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Binary Search Trees link")
	public void the_user_is_on_the_try_editor_page_from_binary_search_trees_link() {
		treeObj.getStartedclick();
		treeObj.binarySearchtreesclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Binary Search Trees page")
	public void user_clicked_the_practice_questions_from_binary_search_trees_page() {
		treeObj.practiceQuestionslink();
	}

	@When("user clicked Implementation Of BST link in the Tree Module page")
	public void user_clicked_implementation_of_bst_link_in_the_tree_module_page() {
		treeObj.impBstclick();
	}

	@Then("user is able to view the  Implementation Of BST linked page")
	public void user_is_able_to_view_the_implementation_of_bst_linked_page() {
		Assert.assertEquals(treeObj.getActualTitle(), configFileReader.getPageTitle("implementBst"));
		LoggerLoad.info("You are viewing the " + driver.getTitle() + " page.");
	}

	@Given("user is on the Implementation Of BST")
	public void user_is_on_the_implementation_of_bst() {
		treeObj.getStartedclick();
		treeObj.impBstclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Try here on the Implementation Of BST page")
	public void user_clicked_the_try_here_on_the_implementation_of_bst_page() {
		treeObj.tryHereclick();
	}

	@Given("the User is on the Try Editor page from Implementation Of BST link")
	public void the_user_is_on_the_try_editor_page_from_implementation_of_bst_link() {
		treeObj.getStartedclick();
		treeObj.impBstclick();
		treeObj.tryHereclick();
		LoggerLoad.info("You are in " + driver.getTitle() + " page.");
	}

	@When("user clicked the Practice Questions from Implementation Of BST page")
	public void user_clicked_the_practice_questions_from_implementation_of_bst_page() {
		treeObj.practiceQuestionslink();

	}
}