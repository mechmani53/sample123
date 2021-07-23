package com.tyss.demo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.WebActionUtil;

public class Tasks_Page {

	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Tasks_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
	/* Common */
	
	/* Click  on Task Menu button */
	@FindBy(xpath = "//a[@href='/tasks/tasklist.do']")
	private WebElement tasksMenu;
	
	/* Click on +Add New button */
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement ddAddNew;
	
	/* Click on  Assigned Users tab */
	@FindBy(xpath = "//span[text()='ASSIGNED USERS']")														
	private WebElement tabAssignedUsers;
	
	/* Click on +Assign button */
	@FindBy(xpath = "//div[@class='loadingContainer assignedUsersTab']//div[text()='Assign']")
	private WebElement btnAssign;
	
	/* Click on  User checkbox */
	@FindBy(xpath = "//div[@class='content']/a/span[text()='Alvarez, Daniel']")																
	private WebElement clkOnUserCheckBox;

	/* Click on Close button */
	@FindBy(xpath = "//div[@class='loadingContainer assignedUsersTab']//span[text()='Close']")
	private WebElement btnClose;
	
	/* Click on Managers tab */
	@FindBy(xpath = "//span[text()='MANAGERS']")
	private WebElement tabManagers;

	/* Click on +AddManagers button */
	@FindBy(xpath = "//div[@class='loadingContainer managersTab']//div[@class='assignUserButton components_button withPlusIcon']")
	private WebElement btnAddManagers;

	/* Click on checkbox of Manager*/
	@FindBy(xpath = "//span[text()='Womack, Ashley']")																						
	private WebElement chkBoxManager;

	/* Click on close button for Add Manager*/
	@FindBy(xpath="//div[@class='loadingContainer managersTab']//span[text()='Close']")
	private WebElement closeAddManagers;
	
	/* Enter task name textfield */
	@FindBy(xpath="(//tbody/tr//td[@class='nameCell first']//input[@placeholder='Enter task name'])")
	private WebElement enterTaskNameTF;
	
	/* Estimate textfield */
	@FindBy(xpath="(//input[@placeholder='not needed'])")
	private WebElement estimateTF;
	
	/* Set deadline button */
	@FindBy(xpath="(//button[@type='button'])")
	private WebElement setDeadlineBtn;
	
	/* Today's Date */
	@FindBy(xpath = "//table[@class='x-date-inner']/tbody//tr//td[contains(@class,'x-date-active')]//a/em/span[text()='30']")				// Call From Excel
	private WebElement selectDate;
	
//	/* Click Type of Work */
//	@FindBy(xpath = "//div[@class='typeOfWorkButton editable']/parent::td")
//	private WebElement clickTypeOfWorkbtn;
//	
//	/* Select Type of Work */
//	@FindBy(xpath = "(//div[@class='taskTableContainer']//tbody/tr[1]/td[@class='billingTypeCell']//div[@class='typeOfWorkList']//div[contains(@class,'typeOfWorkRow')]/div[text()='manufacturing']")
//	private WebElement selectTypeOfWork;
//	
//	/* Click New Task Description Button */
//	@FindBy(id = "descriptionElement")
//	private WebElement clickNewTaskDescBtn;
//	
//	/* Enter New Task Description */
//	@FindBy(id = "editDescriptionPopupText")
//	private WebElement enterNewTaskDescription;
//	
//	/* Click Save Button of Description */
//	@FindBy(id = "scbutton")
//	private WebElement clickDescSaveBtn;
//	
	
	/* New Customer */
	
	
	/* Click on New Customer link */
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement lnkNewCustomer;

	/* Enter customer name */
	@FindBy(xpath = "//div[@class='customerNameDiv']/input[@placeholder='Enter Customer Name']")							// Excel
	private WebElement customerNameField;

	/* Enter customer description */
	@FindBy(xpath = "//div[@class='inputContainer']/textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionField;

	/* Click on Select customer drop down */
	@FindBy(xpath = "//div[@class='selectedItem']/div[text()='- Select Customer -']")
	private WebElement ddSelectCustomer;

	/* Select any customer name  */
	@FindBy(xpath = "//div[@class='searchItemList']//div[@class='itemRow cpItemRow ']")
	private WebElement selectCustomerName;

	/* Select one customer name from drop down */
	@FindBy(xpath = "//div[@class='searchItemList']//div[text()='Big Bang Company']")										// Excel
	private WebElement TxtCustomerName;

	/* actual ele */
	@FindBy(xpath = "//div[@class='selectedItem' and text()='Big Bang Company']")											// Excel
	private WebElement actualWebele;

	/* Select any checkboxes from copyWith option*/
	@FindBy(xpath = "//div[@class='components_copySettingsBlock copyProject']/div[@class='settingsPlaceholder']//div//label//input[@type='checkbox']")
	private WebElement checkBoxCopyWith;

	/* Click on CreateCustomer button */
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement btnCreateCustomer;

	/* Click on CreateCustomer button */
	@FindBy(xpath = "//div[@title='TY-MQAS']")
	private WebElement verifyActualCustomer;
	
	/**
	 * description: method to click on Tasks Menu
	 * @author sushmita
	 * 
	 */
		public synchronized void clkTasksMenu() 
		{
			try {

				WebActionUtil.waitForElement(tasksMenu, "Tasks", 20);
				WebActionUtil.clickOnWebElement(tasksMenu, "Tasks Menu", "Unable to Click on Tasks Menu");
			}	
			catch(Exception e)
			{
				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("-Unable to Click on Tasks Menu");
				Assert.fail("Unable to Click on Tasks Menu");
			}
		}
	

	/**
	 * description: method to click on AddNewBtn
	 * @author sushmita
	 * 
	 */
	public synchronized void clkAddNewBtn() 
	{
		try {
			WebActionUtil.waitForElement(ddAddNew, "+Add New", 30);
			WebActionUtil.clickOnWebElement(ddAddNew, "+ Add new", "Unable to Click on +AddNew Dropdown");
		}
		catch(Exception e)
		{
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to Click on +AddNew Dropdown");
			Assert.fail("Unable to Click on +AddNew Dropdown");
		}

	}

	/**
	 * 
	 * Description: method to click NewCustome
	 * @author sushmita
	 */
	public synchronized void clkNewCustomer() 
	{
		try {
			WebActionUtil.waitForElement(lnkNewCustomer, "New Customer", 20);
			WebActionUtil.clickOnWebElement(lnkNewCustomer, "New Customer", "unable to Click on New Customer");
		}
		catch(Exception e)
		{
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to click New Customer");
			Assert.fail("Unable to click New Customer");
		}

	}

	/**
	 * 
	 * Description: method to enter Customer name
	 * @author sushmita
	 */

	public synchronized void enterCustomerName() 
	{
		try {
			WebActionUtil.waitForElement(customerNameField, "Customer Name txt field", 20);

			WebActionUtil.typeText(customerNameField, "TY-MQAS", "Unable to enter Customer name");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to enter Customer name");
			Assert.fail("Unable to enter Customer name");
		}
	}

	/**
	 * 
	 * Description: method to enter CustomerDescription 
	 * @author sushmita
	 */
	public synchronized void enterCustomerDescription() 
	{
		try {
			WebActionUtil.waitForElement(customerDescriptionField, "Customer Description", 10);

			WebActionUtil.typeText(customerDescriptionField, "TY-MQAS Is new customer", "Unable to enter customer Description");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to enter customer Description");
			Assert.fail("Unable to enter customer Description");
		}
	}

	/**
	 * 
	 * Description: method to click select customers dropdown
	 * @author sushmita
	 */

	public synchronized void clkSelectCustomersDropdown() {
		try {

			WebActionUtil.waitForElement(ddSelectCustomer, "Select existing Customer dropdown", 10);

			WebActionUtil.clickOnWebElement(ddSelectCustomer, "Select customer Dropdown", "UnAble to click on Select customer Dropdown");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to select customer from the list");
			Assert.fail("Unable to select customer from the list");
		}
	}

	/**
	 * 
	 * Description: method to select customers
	 * @author sushmita
	 */
	public synchronized void selectCustomers() {
		try {

			WebActionUtil.waitForElement(TxtCustomerName, "Select existing Customer Name", 10);

			WebActionUtil.selectNameFromList(TxtCustomerName, "Customer Name" );
		}	
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to select customer from the list");
			Assert.fail("Unable to select customer from the list");
		}
	}

	/**
	 * 
	 * Description: method to verify selected customers
	 * @author sushmita
	 */
	public synchronized void verifySelectedCustomer() {
		try {

			WebActionUtil.waitForElement(actualWebele, "Actual selected Customer Name", 10);

			WebActionUtil.verifytext("Big Bang Company", actualWebele, "customer Name");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to select customer from the list");
			Assert.fail("Unable to select customer from the list");
		}
	}

	/**
	 * 
	 * Description: method to select copyWith options
	 * @author sushmita
	 */
	public synchronized void clkCopyWithCheckboxes() 
	{
		try {
			WebActionUtil.waitForElement(checkBoxCopyWith, " CopyWith checkBox", 10);

			WebActionUtil.clickCheckBox(checkBoxCopyWith, "CopyWith all Checkboxes");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to select checkboxes for copywith");
			Assert.fail("Unable to select checkboxes for copywith");
		}
	}

//	/**
//	 * 
//	 * Description: method to click Assigned users tab
//	 * @author sushmita
//	 */
//
//	public synchronized void clkAssignedUsersTab() 
//	{
//		try {
//			WebActionUtil.waitForElement(tabAssignedUsers, " CopyWith checkBox", 10);
//
//			WebActionUtil.clickOnWebElement(tabAssignedUsers, "AssignedUsers Tab", "UnAble to click Assignedusers tab");
//		}
//		catch(Exception e) {
//			WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("-Unable to click assign users tab");
//			Assert.fail("Unable to click assign users tab");
//		}
//	}

//	/**
//	 * 
//	 * Description: method to click  Assign button
//	 * @author sushmita
//	 */
//
//	public synchronized void clkAssignBtn() 
//	{
//		try {
//			WebActionUtil.waitForElement(btnAssign, " Assign button", 10);
//
//			WebActionUtil.clickOnWebElement(btnAssign, "Assign", "UnAble to click on Assign button");
//		}
//		catch(Exception e) {
//			WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("-Unable to click on Assign button");
//			Assert.fail("Unable to click on Assign button");
//		}
//	}	
//
//	/**
//	 * 
//	 * Description: method to click UserCheckbox
//	 * @author sushmita
//	 */
//
//	public synchronized void clkUserCheckbox() 
//	{
//		try {
//			WebActionUtil.waitForElement(clkOnUserCheckBox, "UserCheckbox", 10);
//			WebActionUtil.clickCheckBox(clkOnUserCheckBox, "User");
//			//			WebActionUtil.clickOnWebElement(btnClose, "close", "Able to clk on close btn");
//
//		}
//		catch(Exception e) {
//			WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("-Unable to click on Assign button");
//			Assert.fail("Unable to click on Assign button");
//		}
//	}
//
//	/**
//	 * 
//	 * Description: method to click close button
//	 * @author sushmita
//	 */
//
//	public synchronized void closebtn() 
//	{
//		try {
//			WebActionUtil.waitForElement(btnClose, "Close Button", 10);
//
//			//			WebActionUtil.scrollToElement(btnClose, "able to scroll element");
//
//			WebActionUtil.clickOnWebElement(btnClose, "close", "UnAble to clk on close btn");
//		}
//		catch(Exception e) {
//			WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("-Unable to close the btn");
//			Assert.fail("Unable to close the btn");
//		}
//	}
//
//	/**
//	 * 
//	 * Description: method to click managers tab 
//	 * @author sushmita
//	 */
//	public synchronized void clkManagersTab() 
//	{
//		try {
//			WebActionUtil.waitForElement(tabManagers, "Managers Tab", 10);
//
//			WebActionUtil.clickOnWebElement(tabManagers, "Managers Tab", "UnAble to click managers tab");
//		}
//		catch(Exception e) {
//			WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("-Unable to click managers");
//			Assert.fail("Unable to click managers");
//		}
//	}	
//
//	/**
//	 * 
//	 * Description: method to click Add managers button
//	 * @author sushmita
//	 */
//	public synchronized void clkAddManagers() 
//	{
//		try {
//			WebActionUtil.waitForElement(btnAddManagers, "ADD Managers ", 10);
//			WebActionUtil.clickOnWebElement(btnAddManagers, "Add managers", "UnAble to click on ADD Managers button");
//		}
//		catch(Exception e) {
//			WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("-Unable to add managers Button");
//			Assert.fail("Unable to add managers button");
//		}
//	}
//
//	/**
//	 * 
//	 * Description: method to click Manager chkBox
//	 * @author sushmita
//	 */
//	public synchronized void selectManagerChkBox() 
//	{
//		try {
//			WebActionUtil.waitForElement(chkBoxManager, "chkBoxManager ", 10);
//			WebActionUtil.clickCheckBox(chkBoxManager, "manager checkbox");
//		}
//		catch(Exception e) {
//			WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("-Unable to clck manager chkbox");
//			Assert.fail("Unable to clck manager chkbox");
//		}
//	}
//	/**
//	 * 
//	 * Description: method to click close button
//	 * @author sushmita
//	 */	
//	public synchronized void clkcloseButton() 
//	{
//		try {
//			WebActionUtil.waitForElement(closeAddManagers, "close btn ", 10);
//
//			WebActionUtil.clickOnWebElement(closeAddManagers, "close", "UnAble to clk close button");
//		}
//		catch(Exception e) {
//			WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("-Unable to click close button");
//			Assert.fail("Unable to click close button");
//		}
//	}
//
	/**
	 * description: method to click CreateCustomerButton
	 * @author sushmita
	 */

	public synchronized void clkCreateCustomerButton() 
	{
		try {
			WebActionUtil.waitForElement(btnCreateCustomer, "chkBoxManager ", 10);

			WebActionUtil.clickOnWebElement(btnCreateCustomer, "Managers Tab", "UnAble to click the tab");
			WebActionUtil.verifytext("TY-MQAS", verifyActualCustomer, "customer Name");
		}catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to click CreateCustomerButton");
			Assert.fail("Unable to click CreateCustomerButton");
		}
	}
	
	
	/* New Project */
	
	/* New Project Link */
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newProject;
	
	/* Enter project name textfield */
	@FindBy(xpath="//input[@tabindex='1']")
	private WebElement enterProjectNameTF;
	
	/* Customer dropdown */
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customerNameDD;
	
	/*Select Customer*/
	@FindBy(xpath="//div[@style='display: block;']/div//div[@class='inputPlaceholder']//input[@type='text']")
	private WebElement newCustomerTF;
	
	/* Description textfield */
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement descriptionTF;
	
	/* Create poject button */
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	/* Project Name Validation */
	@FindBy(xpath="//div[@class='leftContainer']/div/div")
	private WebElement projectNameVerify;
	
	
	/**
	 * Description Method Click on New Project link
	 * @author Akash Jhariya
	 */
	public synchronized void newProjectLink()
	{
		try {
		WebActionUtil.waitForElement(newProject, "NewProjectLink", 20);
		WebActionUtil.clickOnWebElement(newProject, "New project button", "Unable to click add new button");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click add new button");
			Assert.fail("Unable to click add new button");
		}
	}


	/**
	 *Description Method Performing action on enter project name textfield
	 * @author Akash Jhariya
	 */
	public synchronized void giveProjectName()
	{
		try {
		WebActionUtil.waitForElement(enterProjectNameTF, "EnterProjectName", 20);
		WebActionUtil.typeText(enterProjectNameTF, "Dummy", "Project name text field");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Project name text field not found");
			Assert.fail("Project name text field not found");
		}
		
	}
	
	
	/**
	 * Description Method Performing actions for creating a customer
	 * @author Akash Jhariya
	 */
	public synchronized void giveCustomerName()
	{
		try {
		WebActionUtil.waitForElement(customerNameDD, "Customers Dropdown", 20);
		WebActionUtil.clickOnWebElement(customerNameDD, "customer", "Customers dropdown not found");	
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Customers dropdown not found");
			Assert.fail("Customers dropdown not found");
		}
		
	}
	
	/**
	 * Description Method is for giving the new customer name
	 * @author Akash Jhariya
	 */
	public synchronized void customerName()
	{
		try {
		WebActionUtil.waitForElement(newCustomerTF, "Customer Name", 20);
		WebActionUtil.typeText(newCustomerTF, "ActiTime", "Customer name text field");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Customer name text field not found");
			Assert.fail("Customer name text field not found");
		}
	}
	
	/**
	 * Description Method is for Writing a message in a description textbox
	 * @author Akash Jhariya
	 */
	public synchronized void giveDescription()
	{
		try {
		WebActionUtil.waitForElement(descriptionTF, "Description Field", 20);
		WebActionUtil.typeText(descriptionTF, "This project is for practice purpose", "Description textfield");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Description field not visible");
			Assert.fail("Description field not visible");
		}
	}
	
	
	/**
	 * Description Method is to enter task name 
	 * @author Akash Jhariya
	 */
	public synchronized void enterTasksDetails()
	{
		try {
		WebActionUtil.waitForElement(enterTaskNameTF, "Task Name", 20);
		WebActionUtil.typeText(enterTaskNameTF, "Practice", "Task name textfield");	
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Task name text field not visible");
			Assert.fail("Task name text field not visible");
		}
	}
	
	/**
	 * Description Method is to give estimate time
	 * @author Akash Jhariya
	 */
	public synchronized void estimateTime()
	{
		try {
		WebActionUtil.waitForElement(estimateTF, "Estimate Field", 20);
		WebActionUtil.typeText(estimateTF, "8", "Estimate textfield");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Cannot find estimate textfield");
			Assert.fail("Cannot find estimate textfield");
		}
	}
	
	
	/**
	 *Description Method is for setting the deadline for the task
	 *@author Akash Jhariya
	 */
	public synchronized void setDeadline()
	{
		try {
		WebActionUtil.waitForElement(setDeadlineBtn, "SetDeadline", 20);
		WebActionUtil.clickOnWebElement(setDeadlineBtn, "Setdeadline", "Calender not visible");
		
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Calender not visible");
			Assert.fail("Calender not visible");
		}
	}
	
	/**
	 *Description Method is for selecting the date
	 *@author Akash Jhariya
	 */
	public synchronized void selectDate()
	{
		try {
		WebActionUtil.waitForElement(selectDate, "FetchDate", 20);
		WebActionUtil.clickOnWebElement(selectDate, "FetchDate", "Not able to select the date");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Not able to select the date");
			Assert.fail("Not able to select the date");
		}
	}
	
	/**
	 *Description Method is for Clicking on Create Project button
	 *@author Akash Jhariya
	 * 
	 */
	public synchronized void createProjectButton()
	{
		try {
		WebActionUtil.waitForElement(createProjectBtn, "CreateProjectButton", 20);
		WebActionUtil.clickOnWebElement(createProjectBtn, "Create Project", "Unable to click create project button");
		
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click create project button");
			Assert.fail("Unable to click create project button");
		}
		
	}
	
	/**
	 * Description Method Verify the Project name
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void verify()
	{
		try {
		WebActionUtil.waitForElement(projectNameVerify, "VerifyText", 20);
		WebActionUtil.verifytext("Dummy", projectNameVerify, "ProjectNameTextField");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Cannot find the text");
			Assert.fail("Different text found");
		}
	}


	/* Click on New Tasks Button */
	@FindBy(xpath = "//div[text()='+ New Tasks']")
	private WebElement clickNewTasksButton;
	
	/* Click on Select Customer */
	@FindBy(xpath = "//tr[@class='selectCustomerRow']/td/div/div/div/div//div[text()='- Select Customer -']")
	private WebElement clickNewCustomerButton;
	
	/* Click on New Customer Dropdown Menu */
	@FindBy(xpath = "(//div[@class='customerProjectSelectorPlaceholder']/div/table/tbody/tr/td/div/div/div/div/div/div)[3]//div[text()='Big Bang Company']")
	private WebElement selectNewCustomerMenuButton;
	
	/* Click on New Project */
	@FindBy(xpath = "//tr[@class='selectProjectRow projectSelectorRow']//div[@class='comboboxButton']")
	private WebElement clickNewProjectBtn;
	
	/* Select the New Project */
	@FindBy(xpath = "//div[@class='innerContent']//tr[@class='selectProjectRow projectSelectorRow']//div[text()='Spaceship building']")
	private WebElement selectNewProject;
	
	/* Enter New Task Name */
	@FindBy(xpath = "//table[@class='createTasksTable']//input[@placeholder='Enter task name']")
	private WebElement enterNewTaskName;
	
	/* Click New Task Description Button */
	@FindBy(id = "descriptionElement")
	private WebElement clickNewTaskDescBtn;
	
	/* Enter New Task Description */
	@FindBy(id = "editDescriptionPopupText")
	private WebElement enterNewTaskDescription;
	
	/* Click Save Button of Description */
	@FindBy(id = "scbutton")
	private WebElement clickDescSaveBtn;
	
	/* Enter in Estimate Text Field */
	@FindBy(xpath = "//table[@class='createTasksTable']//input[@placeholder='not needed']")
	private WebElement enterEstimateTextFld;
	
	/* Click Set DeadLine Date Button */
	@FindBy(xpath = "//table[@class='createTasksTable']//td/div/table//tr/td/em//button[@type='button']")
	private WebElement clickDeadLineDateBtn;
	
	/* Set DeadLine Date */
	@FindBy(xpath = "//table[@class='x-date-inner']/tbody//tr//td[contains(@class,'x-date-active')]//a/em/span[text()='30']")
	private WebElement setDeadLineDate;
	
	/* Click Type of Work */
	@FindBy(xpath = "//div[@class='typeOfWorkButton editable']/parent::td")
	private WebElement clickTypeOfWorkbtn;
	
	/* Select Type of Work */
	@FindBy(xpath = "(//div[@class='taskTable']/div/table/tbody/tr/td/div/div/div/div/div/div)[3]/div[@class='typeLabel ellipsis']")
	private WebElement selectTypeOfWork;
	
	/* Click Create Task Button */
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement clickCreateTaskBtn;
	
	/* Validation of Task Creation */
	@FindBy(xpath = "//tr[@class='taskRow noLastTrackingDate']//td[@class='names']")
	private WebElement validateTaskCreation;
	
	
	/**
 	 * Description Method Click The Tasks Module in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void clickTasksModuleBtn() 
	{
		try 
		{
			WebActionUtil.waitForElement(tasksMenu, "TasksModuleButton", 10);
			WebActionUtil.clickOnWebElement(tasksMenu, "TasksModuleButton", "Unable to click on the Tasks module button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click on the Tasks module button");
			Assert.fail("Unable to click on the Tasks module button");
		}		
	}
	
	/**
 	 * Description Method Click The Tasks Module in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void clickAddNewBtn() 
	{
		try 
		{
			WebActionUtil.waitForElement(ddAddNew, "ClickAddNewButton", 10);
			WebActionUtil.clickOnWebElement(ddAddNew, "ClickAddNewButton", "Unable to click on Add New button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click on Add New button");
			Assert.fail("Unable to click on Add New button");
		}
	}
	
	/**
 	 * Description Method Click The Tasks Module in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void clickNewTasksBtn() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickNewTasksButton, "ClickNewTasksButton", 10);
			WebActionUtil.clickOnWebElement(clickNewTasksButton, "ClickNewTasksButton", "Unable to click on New Tasks button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click on New Tasks button");
			Assert.fail("Unable to click on New Tasks button");
		}
	}
	
	/**
 	 * Description Method Click the New Customer in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void clickNewCustBtn() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickNewCustomerButton, "ClickNewCustomer", 20);
			WebActionUtil.clickOnWebElement(clickNewCustomerButton, "ClickNewCustomer", "Unable to click on New Customer button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click on New Customer button");
			Assert.fail("Unable to click on New Customer button");
		}
	}
	
	
	/**
 	 * Description Method Select the New Customer from the menu in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void selectNewCustMenuBtn() 
	{
		try 
		{
			WebActionUtil.waitForElement(selectNewCustomerMenuButton, "SelectNewCustomer", 20);
			WebActionUtil.selectNameFromList(selectNewCustomerMenuButton, "SelectNewCustomer");
			//WebActionUtil.clickOnWebElement(selectNewCustomerMenuButton, "SelectNewCustomer", "Unable to select on New Customer button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to select on New Customer button");
			Assert.fail("Unable to select on New Customer button");
		}
	}
	
	/**
 	 * Description Method CLick the New Customer Button in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void clickNewProjectButton() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickNewProjectBtn, "ClickNewProject", 20);
			WebActionUtil.selectNameFromList(clickNewProjectBtn, "ClickNewProject");
			//WebActionUtil.clickOnWebElement(selectNewCustomerMenuButton, "SelectNewCustomer", "Unable to select on New Customer button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click on New Project button");
			Assert.fail("Unable to click on New Project button");
		}
	}
	
	/**
 	 * Description Method Select the New Customer from the menu in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void selectNewProj() 
	{
		try 
		{
			WebActionUtil.waitForElement(selectNewProject, "SelectNewProject", 20);
			WebActionUtil.selectNameFromList(selectNewProject, "SelectNewProject");
			//WebActionUtil.clickOnWebElement(selectNewCustomerMenuButton, "SelectNewCustomer", "Unable to select on New Customer button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to select New Project");
			Assert.fail("Unable to select New Project");
		}
	}
	
	/**
 	 * Description Method Enter the New Task Name in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void enterNewTaskName() 
	{
		try 
		{
			WebActionUtil.waitForElement(enterNewTaskName, "NewTaskName", 20);
			WebActionUtil.typeText(enterNewTaskName, "Planning", "Unable to Enter Task Name");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Enter Task Name");
			Assert.fail("Unable to Enter Task Name");
		}
	}
	
	/**
 	 * Description Method Click the New Task Description Button in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void clickNewTaskDescButton() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickNewTaskDescBtn, "NewTaskDescriptionButton", 20);
			WebActionUtil.clickOnWebElement(clickNewTaskDescBtn, "Description", "Unable to Click Task Description Button");	
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Click Task Description Button");
			Assert.fail("Unable to Click Task Description Button");
		}	
	}
	
	/**
 	 * Description Method Enter the New Task Description in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void enterNewTaskDescrip() 
	{
		try 
		{
			WebActionUtil.waitForElement(enterNewTaskDescription, "NewTaskDescription", 20);
			//WebActionUtil.switchToTab(1);
			WebActionUtil.typeText(enterNewTaskDescription, "Welcome Everyone", "Unable to Enter Task Description");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Enter Task Description");
			Assert.fail("Unable to Enter Task Description");
		}
	}
	
	/**
 	 * Description Method Click the New Task Description Save Button in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void clickDescriptionSaveButton() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickDescSaveBtn, "SaveButton", 20);
			WebActionUtil.clickOnWebElement(clickDescSaveBtn, "SaveButton", "Unable to Click Description Save Button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Click Description Save Button");
			Assert.fail("Unable to Click Description Save Button");
		}
	}
	
	/**
 	 * Description Method Enter Estimate Text Field in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void enterEstimateText() 
	{
		try 
		{
			WebActionUtil.waitForElement(enterEstimateTextFld, "EstimateTextField", 20);
			WebActionUtil.typeText(enterEstimateTextFld, "12", "Unable to Enter Estimate in Text field");	
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Enter Estimate in Text field");
			Assert.fail("Unable to Enter Estimate in Text field");
		}
	}
	
	/**
 	 * Description Method Click Set DeadLine Button in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void clickSetDeadLineDate() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickDeadLineDateBtn, "ClickCalendar", 20);
			WebActionUtil.clickOnWebElement(clickDeadLineDateBtn, "ClickCalendar", "Unable to Click the Set Deadline Date Button");	
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Click the Set Deadline Date Button");
			Assert.fail("Unable to Click the Set Deadline Date Button");
		}
	}
	
	/**
 	 * Description Method Set DeadLine in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void settingDeadLineDate() 
	{
		try 
		{
			WebActionUtil.waitForElement(setDeadLineDate, "Calendar", 20);
			WebActionUtil.clickOnWebElement(setDeadLineDate, "Calendar", "Unable to Select the Date");	
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Select the Date");
			Assert.fail("Unable to Select the Date");
		}
	}
	
	/**
 	 * Description Method Click Type of Work in the application
 	 * @author Shashank Joshi
 	 * @param clicktypeofwork
 	 * 
 	 */
	public synchronized void clickTypeOfWorkButton() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickTypeOfWorkbtn, "TypeOfWork", 20);
			WebActionUtil.clickOnWebElement(clickTypeOfWorkbtn, "TypeOfWork", "Unable to Click the Type of Work");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Click the Type of Work");
			Assert.fail("Unable to Click the Type of Work");
		}		
	}
	
	/**
 	 * Description Method Select Type of Work in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void selectTypeOfWorkMenu() 
	{
		try 
		{
			WebActionUtil.waitForElement(selectTypeOfWork, "WorkType", 20);
			WebActionUtil.clickOnWebElement(selectTypeOfWork, "WorkType", "Unable to Select Work Type");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Select Work Type");
			Assert.fail("Unable to Select Work Type");
		}		
	}
	
	/**
 	 * Description Method Click Create Task Button in the application
 	 * 
 	 * @author Shashank Joshi
 	 * 
 	 */
	public synchronized void clickCreateTaskButton() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickCreateTaskBtn, "CreateTask", 20);
			WebActionUtil.clickOnWebElement(clickCreateTaskBtn, "CreateTask", "Unable to Click the Create Task button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Click the Create Task button");
			Assert.fail("Unable to Click the Create Task button");
		}		
	}
	
	
}


	


