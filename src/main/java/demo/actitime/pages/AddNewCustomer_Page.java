package demo.actitime.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.WebActionUtil;

public class AddNewCustomer_Page {
	public static WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public AddNewCustomer_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}

	/*click on +Add New button*/
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement ddAddNew;

	/*click on New Customer link*/
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement lnkNewCustomer;

	/* Enter customer name */
	@FindBy(xpath = "//div[@class='customerNameDiv']/input[@placeholder='Enter Customer Name']")
	private WebElement customerNameField;

	/* Enter customer description */
	@FindBy(xpath = "//div[@class='inputContainer']/textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionField;

	/* click on Select customer drop down */
	@FindBy(xpath = "//div[@class='selectedItem']/div[text()='- Select Customer -']")
	private WebElement ddSelectCustomer;

	/* Select any customer name from drop down */
	@FindBy(xpath = "//div[@class='searchItemList']//div[@class='itemRow cpItemRow ']")
	private WebElement selectCustomerName;

	/* Select one customer name from drop down */
	@FindBy(xpath = "//div[@class='searchItemList']//div[text()='Big Bang Company']")
	private WebElement TxtCustomerName;

	/* Select one customer name from drop down */
	@FindBy(xpath = "//div[@class='selectedItem' and text()='Big Bang Company']")
	private WebElement actualWebele;

	/* Select any checkboxes from copyWith */
	@FindBy(xpath = "//div[@class='components_copySettingsBlock copyProject']/div[@class='settingsPlaceholder']//div//label//input[@type='checkbox']")
	private WebElement checkBoxCopyWith;

	/* click  on  assignedUsers tab *///div[@class='assignedUsers']/span[text()='ASSIGNED USERS (4)']
	@FindBy(xpath = "//div[@class='assignedUsers']/span[text()='ASSIGNED USERS (3)']")
	private WebElement tabAssignedUsers;
	
	/* click  on  button +Assign*/
	@FindBy(xpath = "//div[@class='loadingContainer assignedUsersTab']//div[text()='Assign']")
	private WebElement btnAssign;

	/* click  on  user checkbox*/
	@FindBy(xpath = "//div[@class='content']/a/span[text()='managerName']")
	private WebElement clkOnUserCheckBox;
	
	public static WebElement chkBox(String managerName)
	{
		String xpath="//div[@class='content']/a/span[text()=' "+managerName+"']";
		return driver.findElement(By.xpath(xpath));
	}
	

	/* click  on  button Close*/
	@FindBy(xpath = "//div[@class='loadingContainer assignedUsersTab']//span[text()='Close']")
	private WebElement btnClose;

	/* click  on  tab Managers*///span[text()='MANAGERS (4)']
	@FindBy(xpath = "//span[text()='MANAGERS (3)']")
	private WebElement tabManagers;

	/* click  on button +AddManagers*/
	@FindBy(xpath = "//div[@class='loadingContainer managersTab']//div[@class='assignUserButton components_button withPlusIcon']")
	private WebElement btnAddManagers;


	/* click  on checkbox of manager*/
	@FindBy(xpath = "//span[text()='Womack, Ashley']")
	private WebElement chkBoxManager;

	/* click  on checkbox of manager*/
	@FindBy(xpath="//div[@class='loadingContainer managersTab']//span[text()='Close']")
	private WebElement closeAddManagers;

	/* click  on  button CreateCustomer*/
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement btnCreateCustomer;

	/* click  on  button CreateCustomer*/
	@FindBy(xpath = "//div[@title='TY-MQAS']")
	private WebElement verifyActualCustomer;

	/* click  on  button CreateCustomer*/
	@FindBy(xpath = "//a[@href='/tasks/tasklist.do']")
	private WebElement tasksMenu;

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

	/**
	 * 
	 * Description: method to click Assigned users tab
	 * @author sushmita
	 */

	public synchronized void clkAssignedUsersTab() 
	{
		try {
			WebActionUtil.waitForElement(tabAssignedUsers, " CopyWith checkBox", 30);

			WebActionUtil.clickOnWebElement(tabAssignedUsers, "AssignedUsers Tab", "UnAble to click Assignedusers tab");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to click assign users tab");
			Assert.fail("Unable to click assign users tab");
		}
	}

	/**
	 * 
	 * Description: method to click  Assign button
	 * @author sushmita
	 */

	public synchronized void clkAssignBtn() 
	{
		try {
			WebActionUtil.waitForElement(btnAssign, " Assign button", 10);

			WebActionUtil.clickOnWebElement(btnAssign, "Assign", "UnAble to click on Assign button");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to click on Assign button");
			Assert.fail("Unable to click on Assign button");
		}
	}	

	/**
	 * 
	 * Description: method to click UserCheckbox
	 * @author sushmita
	 */

	public synchronized void clkUserCheckbox() 
	{
		try {
			WebActionUtil.waitForElement(clkOnUserCheckBox, "UserCheckbox", 10);
			WebActionUtil.clickCheckBox(clkOnUserCheckBox, "User");
			//			WebActionUtil.clickOnWebElement(btnClose, "close", "Able to clk on close btn");

		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to click on Assign button");
			Assert.fail("Unable to click on Assign button");
		}
	}

	/**
	 * 
	 * Description: method to click close button
	 * @author sushmita
	 */

	public synchronized void closebtn() 
	{
		try {
			WebActionUtil.waitForElement(btnClose, "Close Button", 10);

			//			WebActionUtil.scrollToElement(btnClose, "able to scroll element");

			WebActionUtil.clickOnWebElement(btnClose, "close", "UnAble to clk on close btn");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to close the btn");
			Assert.fail("Unable to close the btn");
		}
	}

	/**
	 * 
	 * Description: method to click managers tab 
	 * @author sushmita
	 */
	public synchronized void clkManagersTab(String managerName) 
	{
		try {
			WebActionUtil.waitForElement(chkBox(managerName), "Managers Tab", 10);

			WebActionUtil.clickOnWebElement(chkBox(managerName), "Managers Tab", "UnAble to click managers tab");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to click managers");
			Assert.fail("Unable to click managers");
		}
	}	

	/**
	 * 
	 * Description: method to click Add managers button
	 * @author sushmita
	 */
	public synchronized void clkAddManagers() 
	{
		try {
			WebActionUtil.waitForElement(btnAddManagers, "ADD Managers ", 10);
			WebActionUtil.clickOnWebElement(btnAddManagers, "Add managers", "UnAble to click on ADD Managers button");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to add managers Button");
			Assert.fail("Unable to add managers button");
		}
	}

	/**
	 * 
	 * Description: method to click Manager chkBox
	 * @author sushmita
	 */
	public synchronized void selectManagerChkBox() 
	{
		try {
			WebActionUtil.waitForElement(chkBoxManager, "chkBoxManager ", 10);
			WebActionUtil.clickCheckBox(chkBoxManager, "manager checkbox");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to clck manager chkbox");
			Assert.fail("Unable to clck manager chkbox");
		}
	}
	/**
	 * 
	 * Description: method to click close button
	 * @author sushmita
	 */	
	public synchronized void clkcloseButton() 
	{
		try {
			WebActionUtil.waitForElement(closeAddManagers, "close btn ", 10);

			WebActionUtil.clickOnWebElement(closeAddManagers, "close", "UnAble to clk close button");
		}
		catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to click close button");
			Assert.fail("Unable to click close button");
		}
	}

	/**
	 * description: method to click CreateCustomerButton
	 * @author sushmita
	 */

	public synchronized void clkCreateCustomerButton() 
	{
		try {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			WebActionUtil.clickOnWebElement(btnCreateCustomer, "Managers Tab", "UnAble to click the tab");
			WebActionUtil.verifytext("TY-MQAS", verifyActualCustomer, "customer Name");
		}catch(Exception e) {
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("-Unable to click CreateCustomerButton");
			Assert.fail("Unable to click CreateCustomerButton");
		}
	}

}
