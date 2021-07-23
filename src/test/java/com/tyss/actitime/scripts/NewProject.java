package com.tyss.actitime.scripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
import com.tyss.demo.dataproviders.CreateUsersDataProvider;

public class NewProject extends BaseTest {
	@Test(description = "Create Users", dataProvider = "TestUsersDataProvider", dataProviderClass = CreateUsersDataProvider.class)

	public void createRequisition(String customerName,String projectName,String taskName) throws Exception {

		String username = prop.getProperty("UserName");
		String password = prop.getProperty("Password");

		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);
		pages.loginPage.loginToApplication(username, password);
		/*Clicking task menu*/		
		pages.projectPage.createNewProject();
		pages.projectPage.addNewButton();
		pages.projectPage.newProjectLink();
		pages.projectPage.giveProjectName();
		pages.projectPage.giveCustomerName();
		pages.projectPage.customerName();
		pages.projectPage.clickingCustomer();
		pages.projectPage.giveDescription();
		pages.projectPage.enterTasksDetails();
		pages.projectPage.clickNewTaskDescButton();
		pages.projectPage.enterNewTaskDescrip();
		pages.projectPage.clickDescriptionSaveButton();

		pages.projectPage.estimateTime();
		pages.projectPage.setDeadline();		
		pages.projectPage.selectDate();
		pages.projectPage.typeOfWork();

		pages.projectPage.createProjectButton();
		pages.projectPage.verify();
		pages.projectPage.selectDate();

}
}