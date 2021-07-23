package com.tyss.demo.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.WebActionUtil;

public class NewProject_Page {
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public NewProject_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
	/*Task Module*/
	@FindBy(id="container_tasks")
	private WebElement taskModule;
	
	/*Add New Button*/
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addNewBtn;
	
	/*New Project Link*/
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newProject;
	
	/*Enter project name textfielf*/
	@FindBy(xpath="//input[@tabindex='1']")
	private WebElement enterProjectNameTF;
	
	
	/*Customer dropdown*/
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customerNameDD;
	
	
//	/*Selecting the new customer*/
//	@FindBy(xpath="//div[text()='-- New Customer --']")
//	private WebElement newCustomer;
//	
	/*Select Customer*/
	@FindBy(xpath="//div[@style='display: block;']/div//div[@class='inputPlaceholder']//input[@type='text']")
	private WebElement newCustomerTF;
	
//	/*New customer name textfield*/
//	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
//	private WebElement newCustomerTF;
//	
	/*Clicking the Selected customer*/
	@FindBy(xpath="//div[@class='itemRow cpItemRow ']")
	private WebElement clkCustomer;
	
	
	/*Description textfield*/
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement descriptionTF;
	
	
	/*Enter task name textfield*/
	@FindBy(xpath="(//tbody/tr//td[@class='nameCell first']//input[@placeholder='Enter task name'])[1]")
	private WebElement enterTaskNameTF;
	
	
	/* Click New Task Description Button */
	@FindBy(id = "descriptionElement")
	private WebElement clickNewTaskDescBtn;
	
	/* Enter New Task Description */
	@FindBy(id = "editDescriptionPopupText")
	private WebElement enterNewTaskDescription;
	
	/* Click Save Button of Description */
	@FindBy(id = "scbutton")
	private WebElement clickDescSaveBtn;
	
	/*Estimate textfield*/
	@FindBy(xpath="(//input[@placeholder='not needed'])[1]")
	private WebElement estimateTF;
	
	
	/*Set deadline button*/
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement setDeadlineBtn;
	
//	/*Today's Date*/
//	@FindBy(id="ext-gen138")
//	private WebElement todayBtn;
//	
	
	@FindBy(xpath="//table[@class='x-date-inner']/tbody//tr//td[contains(@class,'x-date-active')]//a/em/span[text()='18']")
	private WebElement selectDate;
	
	/* Type of work button*/
	@FindBy(xpath="//div[@class='typeOfWorkButton editable']/parent::td")
	private WebElement typeOfWorkPopup;
	
	/* Type of work field*/
	@FindBy(xpath="(//div[@class='taskTable']/div/table/tbody/tr/td/div/div/div/div/div/div)[3]/div[@class='typeLabel ellipsis']")
	private WebElement management;
	
	/*Go to AssignedUser*/
	@FindBy(xpath="//div[@class='assignedUsers']/span[text()='ASSIGNED USERS (3)']")
	private WebElement assignedUserField;
	
	
	/*Assign button*/
	@FindBy(xpath="//div[@class='loadingContainer assignedUsersTab']//div[text()='Assign']")
	private WebElement assignBtn;
	
	/*Select the user from the popup*/
	@FindBy(xpath="//div[contains(@class,'ChildrenMatchingFilterCriteria ')][2]/div[2]/div[3]/div")
	private WebElement selectUser;
	
	/*Close button*/
	@FindBy(id="ext-comp-1079")
	private WebElement closeBtnAssign;
	
	/*Go to managers*/
	@FindBy(xpath="//span[text()='MANAGERS (3)']")
	private WebElement managerField;
	
	/* Add manager button */
	@FindBy(xpath="//div[@class='loadingContainer managersTab']//div[@class='assignUserButton components_button withPlusIcon']")
	private WebElement addManagerBtn;
	
	/*Select the manager*/
	@FindBy(xpath="(//span[@title='Smith, Brett'])[2]")
	private WebElement selectManager;
	
	
	/* close button*/
	@FindBy(id="ext-gen308")
	private WebElement closeBtnManager;
	
	
	/*Create poject button*/
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//div[@class='leftContainer']/div/div")
	private WebElement projectNameVerify;



	/**
	 * Description Method Click on task module
	 * @author Akash Jhariya
	 */
	public synchronized void createNewProject()
	{
		try {
		WebActionUtil.waitForElement(taskModule, "TaskModule", 20);
		WebActionUtil.clickOnWebElement(taskModule, "Taskmodule", "Unable to click task module");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click task module");
			Assert.fail("Unable to click task module");
		}
		
	}
	
	/**
	 * Description Method Click on Add New button
	 * @author Akash Jhariya
	 */
	public synchronized void addNewButton()
	{
		try {
		WebActionUtil.waitForElement(addNewBtn, "AddNewButton", 20);
		WebActionUtil.clickOnWebElement(addNewBtn, "Add new button", "Unable to click add new button");
		}
		catch(Exception e){

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click add new button");
			Assert.fail("Unable to click add new button");
		}
	}
	
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
	 * Description Method Selecting the new customer
	 * @author Akash Jhariya
	 */
//	public synchronized void selectCustomer()
//	{
//		try {
//		WebActionUtil.waitForElement(newCustomer, "New Customer", 20);
//		WebActionUtil.clickOnWebElement(newCustomer, "Select new customer", "Customers not visible");
//		}
//		catch (Exception e) {
//
//			WebActionUtil.error(e.getMessage());
//			WebActionUtil.fail("Customers not visible");
//			Assert.fail("Customers not visible ");
//		}
//	}
//	
	/**
	 * Description Method is for giving the new customer name
	 * @author Akash Jhariya
	 */
	public synchronized void customerName()
	{
		try {
		WebActionUtil.waitForElement(newCustomerTF, "Customer Name", 20);
		WebActionUtil.typeText(newCustomerTF, "Big Bang company", "Customer name text field");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Customer name text field not found");
			Assert.fail("Customer name text field not found");
		}
	}
	
	/**
	 * Description Method is for giving the new customer name
	 * @author Akash Jhariya
	 */
	public synchronized void clickingCustomer()
	{
		try {
		WebActionUtil.waitForElement(clkCustomer, "SelectCustomer", 20);
		WebActionUtil.clickOnWebElement(clkCustomer, "SelectCustomer", "Customer is not clicked");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Customer is not clicked");
			Assert.fail("Customer is not clicked");
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
	
	
	public synchronized void clickNewTaskDescButton() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickNewTaskDescBtn, "NewTaskDescriptionButton", 30);
			WebActionUtil.clickOnWebElement(clickNewTaskDescBtn, "Description", "Unable to Click Task Description Button");	
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Click Task Description Button");
			Assert.fail("Unable to Click Task Description Button");
		}	
	}
	
	
	public synchronized void enterNewTaskDescrip() 
	{
		try 
		{
			WebActionUtil.waitForElement(enterNewTaskDescription, "NewTaskDescription", 30);
			WebActionUtil.switchToTab(1);
			WebActionUtil.typeText(enterNewTaskDescription, "Welcome Everyone", "Unable to Enter Task Description");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Enter Task Description");
			Assert.fail("Unable to Enter Task Description");
		}
	}

public synchronized void clickDescriptionSaveButton() 
	{
		try 
		{
			WebActionUtil.waitForElement(clickDescSaveBtn, "SaveButton", 30);
			WebActionUtil.clickOnWebElement(clickDescSaveBtn, "SaveButton", "Unable to Click Description Save Button");
			
		} catch (Exception e) 
		{
		
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Click Description Save Button");
			Assert.fail("Unable to Click Description Save Button");
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
	 * Description Method is for selecting type of work
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void typeOfWork()
	{
		try {
		WebActionUtil.waitForElement(typeOfWorkPopup, "TypeOfWork", 20);
		WebActionUtil.clickOnWebElement(typeOfWorkPopup, "Type of work", "Type of work not clickable");
		
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Type of work not clickable");
			Assert.fail("Type of work not clickable");
		}
	}
	
	
	/**
	 * Description Method Select type of work  from the popup
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void selectType()
	{
		try {
		WebActionUtil.waitForElement(management, "SelectTypeOfWork", 20);
		WebActionUtil.clickOnWebElement(management, "Testing", "Type of work not clickable");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Type of work not clickable");
			Assert.fail("Type of work not clickable");
		}
	}
	
	/**
	 *Description Method is for clicking assign user link
	 *
	 *@author Akash Jhariya
	 */
	
	public synchronized void assignField()
	{
		try {
		WebActionUtil.waitForElement(assignedUserField, "AssignUserField", 20);
		WebActionUtil.clickOnWebElement(assignedUserField, "Assigned Users", "Unable to click on assigned user");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click on assigned user");
			Assert.fail("Unable to click on assigned user");
		}
	}
	
	
	/**
	 * Description Method is for clicking on assign button
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void assignButton()
	{
		try {
		WebActionUtil.waitForElement(assignBtn, "AssignButton", 20);
		WebActionUtil.clickOnWebElement(assignBtn, "Assign", "Unable to click on assign button");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click on assign button");
			Assert.fail("Unable to click on assign button");
		}
	}
	
	
	/**
	 * Description Method is to select the user
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void selectUser()
	{
		try {
		WebActionUtil.waitForElement(selectUser, "Users", 20);
		WebActionUtil.clickOnWebElement(selectUser, "Smith,Brett", "cannot locate user");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("cannot locate user");
			Assert.fail("cannot locate user");
		}
	}
	
	/**
	 * Description Method is for clicking on the close button
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void assignCloseBtn()
	{
		try {
		WebActionUtil.waitForElement(closeBtnAssign, "Close", 20);
		WebActionUtil.clickOnWebElement(closeBtnAssign, "Close", "Unable to click close button");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click close button");
			Assert.fail("Unable to click close button");
		}
	}
	
	/**
	 * Description Method is for clicking on manager link
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void managerField()
	{
		try {
		WebActionUtil.waitForElement(managerField, "ManagersField", 20);
		WebActionUtil.clickOnWebElement(managerField, "Managers", "Unable to click Managers");	
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click Managers");
			Assert.fail("Unable to click Managers");
		}
	}
	
	/**
	 * Description Method is for clicking on add manager buttton
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void addManagerButton()
	{
		try {
		WebActionUtil.waitForElement(addManagerBtn, "Add Managers Button", 20);
		WebActionUtil.clickOnWebElement(addManagerBtn, "Add Managers", "Unable to click Add managers button");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click Add managers button");
			Assert.fail("Unable to click Add managers button");
		}
	}
	
	
	/**
	 * Description Method is for selecting the manager
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void selectManager()
	{
		try {
		WebActionUtil.waitForElement(selectManager, "Managers", 20);
		WebActionUtil.clickOnWebElement(selectManager, "Smitt,Britt", "cannot locate manager");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("cannot locate manager");
			Assert.fail("cannot locate manager");
		}
	}
	
	
	/**
	 * Description Method is for clicking on the close button
	 * @author Akash Jhariya
	 * 
	 */
	public synchronized void managerCloseBtn()
	{
		try {
		WebActionUtil.waitForElement(closeBtnManager, "Close Button", 20);
		WebActionUtil.clickOnWebElement(closeBtnManager, "Close", "Unable to click close button");
		}
		catch (Exception e) {

			WebActionUtil.error(e.getMessage());
			WebActionUtil.fail("Unable to click close button");
			Assert.fail("Unable to click close button");
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
}


