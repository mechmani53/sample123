package com.tyss.actitime.scripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
import com.tyss.demo.dataproviders.CreateCustomer;
import com.tyss.demo.dataproviders.CreateUsersDataProvider;

public class Actitime_TasksModule_CreateNewCustomer extends BaseTest {
	@Test(description = "Create Users", dataProvider = "DataProvider", dataProviderClass = CreateCustomer.class)

	public void createRequisition(String managerName) throws Exception
	{
		String username = prop.getProperty("UserName");
		String password = prop.getProperty("Password");

		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);
		pages.loginPage.loginToApplication(username, password);
		
		/*Clicking task menu*/		
		pages.newCustomerPage.clkTasksMenu();
		
		/*Clicking  Add new button*/
		pages.newCustomerPage.clkAddNewBtn();
		
		/*Clicking  NewCustomer*/
		pages.newCustomerPage.clkNewCustomer();

		/*EnterCustomer name*/
		pages.newCustomerPage.enterCustomerName();
		
		/*Enter NewCustomer description*/
		pages.newCustomerPage.enterCustomerDescription();
		
		/*Clicking  select Customer dropdown*/
		pages.newCustomerPage.clkSelectCustomersDropdown();
		
		/* select Customers*/
		pages.newCustomerPage.selectCustomers();

		/* verify selected Customers*/
		pages.newCustomerPage.verifySelectedCustomer();
		
		/* click copy with checkboxes*/
		pages.newCustomerPage.clkCopyWithCheckboxes();
		
		/* click AssignedUsersTab*/
		pages.newCustomerPage.clkAssignedUsersTab();

		/* click assign button*/
		pages.newCustomerPage.clkAssignBtn();
		
		/* click user checkbox*/
		pages.newCustomerPage.clkUserCheckbox();
		
		/* click close button*/
		pages.newCustomerPage.closebtn();
		/* click ManagersTab*/
		pages.newCustomerPage.clkManagersTab(managerName);
		
		/* click add Managers btn*/
		pages.newCustomerPage.clkAddManagers();
		
		/*selectManagerChkBox*/
		pages.newCustomerPage.selectManagerChkBox();
		
		/*click closeButton*/
		pages.newCustomerPage.clkcloseButton();
		
		/*click CreateCustomerButton*/
		pages.newCustomerPage.clkCreateCustomerButton();
		

	}
		
}
