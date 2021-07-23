package com.tyss.demo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.WebActionUtil;

public class Shine {
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Shine(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}

	
		/* Enter the Name*/
		@FindBy(id = "id_name")
		private WebElement nameTxtField;
		
		/* Enter the Email Text Field */
		@FindBy(id = "id_email")
		private WebElement emailTxtField;
		
		/* Enter the Cell Phone Number Field */
		@FindBy(id = "id_cell_phone")
		private WebElement phNoTxtField;
		
		/**
		 * Description: Method to  Enter the Name in name textfield
		 * 
		 * @author Sushmita P H
		 * 
		 */
		public synchronized void enterName() {
			try 
			{
				WebActionUtil.waitForElement(nameTxtField, "NameTextField", 20);
				WebActionUtil.typeText(nameTxtField, "Deepa", "Unable to Enter the Name in Text Field");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Enter the Name in Text Field");
				Assert.fail("Unable to Enter the Name in Text Field");
			}
		}
		

		
		/**
		 * Description: Method to Enter the Email  in email Text Field
		 * 
		 * @author Sushmita P H
		 * 
		 */
		public synchronized void enterEmail() {
			try 
			{
				WebActionUtil.waitForElement(emailTxtField, "EmailTextField", 20);
				WebActionUtil.typeText(emailTxtField, "Deepa@123", "Unable to Enter the Email in Text Field");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Enter the Email in Text Field");
				Assert.fail("Unable to Enter the Email in Text Field");
			}
		}
		
		
		/**
		 * Description Method to Enter the  Phone Number 
		 * 
		 * @author Sushmita P H
		 * 
		 */
		public synchronized void enterPhoneNumber() {
			try 
			{
				WebActionUtil.waitForElement(phNoTxtField, "PhoneNumberField", 20);
				WebActionUtil.typeText(phNoTxtField, "8951134593", "Unable to Enter the Phone Number");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Enter the Phone Number");
				Assert.fail("Unable to Enter the Phone Number");
			}
		}
		
		/* Click Continue button*/
		@FindBy(id = "registerButton")
		private WebElement btnContinue;
		
		/**
		 * Description Method Click  Continue button
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickContinueButton() {
			try 
			{
				WebActionUtil.waitForElement(clickContinueBtn, "ClickContinueButton", 50);
				WebActionUtil.clickOnWebElement(enterEmailField, "ClickContinueButton", "Unable to Click the Continue/Register Button");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click the Continue/Register Button");
				Assert.fail("Unable to Click the Continue/Register Button");
			}
		}
		
		/* Click the Gender Button */
		@FindBy(id = "id_gender_1")
		private WebElement clickGenderBtn;
		
		/**
		 * Description Method Click the Gender Button in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickGenderButton() {
			try 
			{
				WebActionUtil.waitForElement(clickGenderBtn, "ClickGenderButton", 50);
				WebActionUtil.clickOnWebElement(clickGenderBtn, "ClickGenderButton", "Unable to Click the Gender Button");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click the Gender Button");
				Assert.fail("Unable to Click the Gender Button");
			}
		}
		
		/* Click the Location Button */
		@FindBy(id = "Bangalore")
		private WebElement clickLocationBtn;
		
		/**
		 * Description Method Click the Location Button in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickLocationButton() {
			try 
			{
				WebActionUtil.waitForElement(clickLocationBtn, "ClickLocationButton", 50);
				WebActionUtil.clickOnWebElement(clickLocationBtn, "ClickLocationButton", "Unable to Click the Location Button");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click the Location Button");
				Assert.fail("Unable to Click the Location Button");
			}
		}
		
		/* Click the Experience Button */
		@FindBy(id = "id_experience_experience")
		private WebElement clickExperienceBtn;
		
		/**
		 * Description Method Click the Experience Button in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickExperienceButton() {
			try 
			{
				WebActionUtil.waitForElement(clickExperienceBtn, "ClickExperienceButton", 50);
				WebActionUtil.clickOnWebElement(clickExperienceBtn, "ClickExperienceButton", "Unable to Click the Experience Button");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click the Experience Button");
				Assert.fail("Unable to Click the Experience Button");
			}
		}
		
		/* Enter the Years of Experience */
		@FindBy(id = "id_exp_years")
		private WebElement enterYearsOfExp;
		
		/**
		 * Description Method Enter the Years of Experience in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void enterYearsOfExperience() {
			try 
			{
				WebActionUtil.waitForElement(enterYearsOfExp, "EnterYearsOfExperience", 50);
				WebActionUtil.clickOnWebElement(enterYearsOfExp, "EnterYearsOfExperience", "Unable to Enter the Years of Experience");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Enter the Years of Experience");
				Assert.fail("Unable to Enter the Years of Experience");
			}
		}
		
		/* Select the Years of Experience */
		public WebElement selectYearsOfExp(String selectYears) 
		{
			String xpath = "//li[contains(text(),'"+selectYears+"')]";
			return driver.findElement(By.xpath(xpath));
		}

		/**
		 * Description Method Select the Years of Experience in the application
		 * 
		 * @author Sushmita P H
		 * 
		 */
		public synchronized void selectYearsOfExperience(String selectYears) {
			try 
			{
				WebActionUtil.waitForElement(selectYearsOfExp(selectYears), "SelectYearsOfExperience", 30);
				WebActionUtil.clickOnWebElement(selectYearsOfExp(selectYears), "SelectYearsOfExperience", "Unable to Select the Years of Experience");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Select the Years of Experience");
				Assert.fail("Unable to Select the Years of Experience");
			}
		}
		
		/* Select the Months of Experience */
		public WebElement selectMonthsOfExp(String selectMonths) 
		{
			String xpath = "//li[contains(text(),'"+selectMonths+"')]";
			return driver.findElement(By.xpath(xpath));
		}

		/**
		 * Description Method Select the Months of Experience in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void selectMonthsOfExperience(String selectMonths) {
			try 
			{
				WebActionUtil.waitForElement(selectMonthsOfExp(selectMonths), "SelectMonthsOfExperience", 30);
				WebActionUtil.clickOnWebElement(selectMonthsOfExp(selectMonths), "SelectMonthsOfExperience", "Unable to Select the Months of Experience");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Select the Months of Experience");
				Assert.fail("Unable to Select the Months of Experience");
			}
		}
		
		/* Select The Notice Period */
		public WebElement selectNoticePeriodBtn(String selectNoticePeriod) 
		{
			String xpath = "//label[contains(text(),'"+selectNoticePeriod+"')]";
			return driver.findElement(By.xpath(xpath));
		}

		/**
		 * Description Method Select The Notice Period in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void selectNoticePeriodButton(String selectNoticePeriod) {
			try 
			{
				WebActionUtil.waitForElement(selectNoticePeriodBtn(selectNoticePeriod), "SelectNoticePeriod", 30);
				WebActionUtil.clickOnWebElement(selectNoticePeriodBtn(selectNoticePeriod), "SelectNoticePeriod", "Unable to Select Notice Period");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Select Notice Period");
				Assert.fail("Unable to Select Notice Period");
			}
		}
		
		/* Enter Company Name */
		@FindBy(id = "id_company")
		private WebElement enterCompanyName;
		
		/**
		 * Description Method Enter Company Name in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void enterNameOfCompany() {
			try 
			{
				WebActionUtil.waitForElement(enterCompanyName, "EnterNameOfCompany", 20);
				WebActionUtil.typeText(enterCompanyName, "Mail Industries", "Unable to Enter Name Of the Company");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Enter Name Of the Company");
				Assert.fail("Unable to Enter Name Of the Company");
			}
		}
		
		/* Click Arrow Button of Company Name */
		@FindBy(xpath = "//input[@id='id_company']//parent::div/span")
		private WebElement clickCompanyArrowBtn;
		
		/**
		 * Description Method Click Arrow Button of Company Name in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickCompanyArrowButton() {
			try 
			{
				WebActionUtil.waitForElement(clickCompanyArrowBtn, "CompanyArrowButton", 20);
				WebActionUtil.clickOnElementUsingJS(clickCompanyArrowBtn, "CompanyArrowButton");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click Arrow Button of Company Name");
				Assert.fail("Unable to Click Arrow Button of Company Name");
			}
		}
		
		/* Enter the Job Designation */
		@FindBy(id = "id_jobtitle")
		private WebElement enterJobDesig;
		
		/**
		 * Description Method Enter the Job Designation in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void enterJobDesignation() {
			try 
			{
				WebActionUtil.waitForElement(enterJobDesig, "JobDesignation", 20);
				WebActionUtil.typeText(enterJobDesig, "Mechanical Painter", "Unable to Enter the Job Designation");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Enter the Job Designation");
				Assert.fail("Unable to Enter the Job Designation");
			}
		}
		
		/* Click Arrow Button of Job Designation */
		@FindBy(xpath = "//input[@id='id_jobtitle']//parent::div/span")
		private WebElement clickDesignationArrowBtn;
		
		/**
		 * Description Method Click Arrow Button of Job Designation in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickDesignationArrowButton() {
			try 
			{
				WebActionUtil.waitForElement(clickDesignationArrowBtn, "DesignationArrowButton", 20);
				WebActionUtil.clickOnElementUsingJS(clickDesignationArrowBtn, "DesignationArrowButton");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click Arrow Button of Designation");
				Assert.fail("Unable to Click Arrow Button of Designation");
			}
		}
		
		/* Click Calendar Button */
		@FindBy(id = "id_startyear")
		private WebElement clickCalendarBtn;
		
		/**
		 * Description Method Click Calendar Button in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickCalendarButton() {
			try 
			{
				WebActionUtil.waitForElement(clickCalendarBtn, "ClickCalendarButton", 20);
				WebActionUtil.clickOnWebElement(clickCalendarBtn, "ClickCalendarButton", "Unable to Click Calendar Button");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click Calendar Button");
				Assert.fail("Unable to Click Calendar Button");
			}
		}
		
		/* Select Month in Calendar */
		public WebElement selectMonthInCalendar(String calendarMonth) 
		{
			String xpath = "//input[@id='id_startyear']/ancestor::div[@class='vdp-datepicker']/div//span[text()='"+calendarMonth+"']";
			return driver.findElement(By.xpath(xpath));
		}

		/**
		 * Description Method Select Month in Calendar in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void calendarMonthSelection(String calendarMonth) {
			try 
			{
				WebActionUtil.waitForElement(selectMonthInCalendar(calendarMonth), "CalendarMonthSelection", 30);
				WebActionUtil.clickOnWebElement(selectMonthInCalendar(calendarMonth), "CalendarMonthSelection", "Unable to Select Month in Calendar");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Select Month in Calendar");
				Assert.fail("Unable to Select Month in Calendar");
			}
		}
		
		/* Click Salary in Lakhs Button */
		@FindBy(id = "id_salary_lakh")
		private WebElement clickSalaryInLakhsBtn;
		
		/**
		 * Description Method Click Salary in Lakhs Button in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickSalaryInLakhsButton() {
			try 
			{
				WebActionUtil.waitForElement(clickSalaryInLakhsBtn, "ClickSalaryInLakhs", 20);
				WebActionUtil.clickOnWebElement(clickSalaryInLakhsBtn, "ClickSalaryInLakhs", "Unable to Click Salary In Lakhs");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click Salary In Lakhs");
				Assert.fail("Unable to Click Salary In Lakhs");
			}
		}
		
		/* Select Salary in Lakhs */
		public WebElement selectSalInLakhs(String salaryInLakhs) 
		{
			String xpath = "//li[contains(text(),' 3')]/preceding-sibling::li[contains(text(),'"+salaryInLakhs+"')]";
			return driver.findElement(By.xpath(xpath));
		}

		/**
		 * Description Method Select Salary in Lakhs in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void selectSalaryInLakhs(String salaryInLakhs) {
			try 
			{
				WebActionUtil.waitForElement(selectSalInLakhs(salaryInLakhs), "SelectSalaryInLakhs", 30);
				WebActionUtil.clickOnWebElement(selectSalInLakhs(salaryInLakhs), "SelectSalaryInLakhs", "Unable to Select Salary In Lakhs");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Select Salary In Lakhs");
				Assert.fail("Unable to Select Salary In Lakhs");
			}
		}
		
		/* Select Salary in Thousands */
		public WebElement selectSalInThousands(String salaryInThousands) 
		{
			String xpath = "(//li[contains(text(),'20')])[2]/following-sibling::li[contains(text(),'"+salaryInThousands+"')]";
			return driver.findElement(By.xpath(xpath));
		}

		/**
		 * Description Method Select Salary in Thousands in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void selectSalaryInThousands(String salaryInThousands) {
			try 
			{
				WebActionUtil.waitForElement(selectSalInThousands(salaryInThousands), "SelectSalaryInThousands", 30);
				WebActionUtil.clickOnWebElement(selectSalInThousands(salaryInThousands), "SelectSalaryInThousands", "Unable to Select Salary In Thousands");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Select Salary In Thousands");
				Assert.fail("Unable to Select Salary In Thousands");
			}
		}
		
		/* Select the Work Department */
		@FindBy(id = "id_functionalArea_10013")
		private WebElement selectWorkDept;
		
		/**
		 * Description Method Select the Work Department in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void selectWorkDepartment() {
			try 
			{
				WebActionUtil.waitForElement(selectWorkDept, "SelectWorkDepartment", 20);
				WebActionUtil.clickOnWebElement(selectWorkDept, "SelectWorkDepartment", "Unable to Select the Work Department");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Select the Work Department");
				Assert.fail("Unable to Select the Work Department");
			}
		}
		
		/* Click the Department Name */
		public WebElement clickDeptName(String deptName) 
		{
			String xpath = "//li[contains(text(),'"+deptName+"')]";
			return driver.findElement(By.xpath(xpath));
		}
		
		/**
		 * Description Method Click the Department Name in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickDepartmentName(String deptName) {
			try 
			{
				WebActionUtil.waitForElement(clickDeptName(deptName), "ClickDepartmentName", 20);
				WebActionUtil.clickOnWebElement(clickDeptName(deptName), "ClickDepartmentName", "Unable to Click the Department Name");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click the Department Name");
				Assert.fail("Unable to Click the Department Name");
			}
		}
		
		/* Select the Belonging Industry */
		@FindBy(id = "id_industry_18")
		private WebElement selectBelongingInd;
		
		/**
		 * Description Method Select the Belonging Industry in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void selectBelongingIndustry() {
			try 
			{
				WebActionUtil.waitForElement(selectBelongingInd, "SelectBelongingIndustry", 20);
				WebActionUtil.clickOnWebElement(selectBelongingInd, "SelectBelongingIndustry", "Unable to Select the Belonging Industry");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Select the Belonging Industry");
				Assert.fail("Unable to Select the Belonging Industry");
			}
		}
		
		/* Click Next Button */
		public WebElement clickNextBtn(String clickNext) 
		{
			String xpath = "//button[contains(text(),'"+clickNext+"')]";
			return driver.findElement(By.xpath(xpath));
		}

		/**
		 * Description Method Click Next Button in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickNextButton(String clickNext) {
			try 
			{
				WebActionUtil.waitForElement(clickNextBtn(clickNext), "ClickNextButton", 30);
				WebActionUtil.clickOnWebElement(clickNextBtn(clickNext), "ClickNextButton", "Unable to Click Next Button");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click Next Button");
				Assert.fail("Unable to Click Next Button");
			}
		}
		
		/* Click Skip Button */
		public WebElement clickSkipBtn(String clickSkip) 
		{
			String xpath = "//button[contains(text(),'"+clickSkip+"')]";
			return driver.findElement(By.xpath(xpath));
		}

		/**
		 * Description Method Click Skip Button in the application
		 * 
		 * @author Shashank Joshi
		 * 
		 */
		public synchronized void clickSkipButton(String clickSkip) {
			try 
			{
				WebActionUtil.waitForElement(clickSkipBtn(clickSkip), "ClickSkipButton", 30);
				WebActionUtil.clickOnWebElement(clickSkipBtn(clickSkip), "ClickSkipButton", "Unable to Click Skip Button");

			} catch (Exception e) 
			{

				WebActionUtil.error(e.getMessage());
				WebActionUtil.error("Unable to Click Skip Button");
				Assert.fail("Unable to Click Skip Button");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
