package com.tyss.actitime.scripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
import com.tyss.demo.dataproviders.CreateUsersDataProvider;

public class Tasks_Module extends BaseTest{

	@Test(description = "Create Users", dataProvider = "TestUsersDataProvider", dataProviderClass = CreateUsersDataProvider.class)

	public void createRequisition(String customerName,String projectName,String taskName) throws Exception {

		String username = prop.getProperty("UserName");
		String password = prop.getProperty("Password");

		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);
		pages.loginPage.loginToApplication(username, password);
		/*Clicking task menu*/		
		pages.tasksPage.clkTasksMenu();
		
		/*Clicking  Add new button*/
		pages.tasksPage.clkAddNewBtn();
		
		/*Clicking  NewCustomer*/
		pages.tasksPage.clkNewCustomer();

		/*EnterCustomer name*/
		pages.tasksPage.enterCustomerName();
		
		/*Enter NewCustomer description*/
		pages.tasksPage.enterCustomerDescription();
		
		/*Clicking  select Customer dropdown*/
		pages.tasksPage.clkSelectCustomersDropdown();
		
		/* select Customers*/
		pages.tasksPage.selectCustomers();

		/* verify selected Customers*/
		pages.tasksPage.verifySelectedCustomer();
		
		/* click copy with checkboxes*/
		pages.tasksPage.clkCopyWithCheckboxes();
		
		/* click AssignedUsersTab*/
//		pages.tasksPage.clkAssignedUsersTab();
//
//		/* click assign button*/
//		pages.tasksPage.clkAssignBtn();
//		
//		/* click user checkbox*/
//		pages.tasksPage.clkUserCheckbox();
//		
//		/* click close button*/
//		pages.tasksPage.closebtn();
//		/* click ManagersTab*/
//		pages.tasksPage.clkManagersTab();
//		
//		/* click add Managers btn*/
//		pages.tasksPage.clkAddManagers();
//		
//		/*selectManagerChkBox*/
//		pages.tasksPage.selectManagerChkBox();
//		
//		/*click closeButton*/
//		pages.tasksPage.clkcloseButton();
//		
//		/*click CreateCustomerButton*/
//		pages.tasksPage.clkCreateCustomerButton();
		
		/*Clicking  Add new button*/
		pages.tasksPage.clkAddNewBtn();
		
		pages.tasksPage.newProjectLink();
		pages.tasksPage.giveProjectName();
		pages.tasksPage.giveCustomerName();
		pages.tasksPage.customerName();
		pages.tasksPage.giveDescription();
		pages.tasksPage.enterTasksDetails();
		pages.tasksPage.estimateTime();
		pages.tasksPage.setDeadline();		
		pages.tasksPage.selectDate();
		pages.tasksPage.createProjectButton();
		pages.tasksPage.verify();
		pages.tasksPage.selectDate();


		}
}