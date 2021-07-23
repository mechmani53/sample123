package com.tyss.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.WebActionUtil;

public class Decathlon_Page {
	public static WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Decathlon_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
	/*clk menu icon*/
	@FindBy(xpath = "//div[@class='btn-close']")
	private WebElement closePopUpBtn;
	
	/*clk menu icon*/
	@FindBy(xpath = "//div[@class='menu-icon ']")
	private WebElement menuIcon;
	
	
	/*clk on main  menu*/
	public static WebElement clkMainMenu(String mainMenu) 
	{
		String xpath = "//div[@class='de-menu-header']/ul//li[text()='"+mainMenu+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk sub menu*/
	public static WebElement clkSubMenu(String subMenu) 
	{
		String xpath = "//div[@class='tab-pane active']//div/h4[contains(text(),'Footwear')]/parent::div/ul/li/a[contains(text(),'"+subMenu+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk filter1*/
	public static WebElement clkFilter1(String filter1) 
	{
		String xpath = "//span[text()='"+filter1+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk color filter*/
	public static WebElement clkColorFilter(String color) 
	{
		String xpath = "//div[text()='COLOR']/..//ul//li//span[contains(@style,'"+color+"']";
		return driver.findElement(By.xpath(xpath));
	}
	//div[text()='COLOR']/..//ul//li//span[contains(@style,'background-color:#000000')]
	
	/*clk size dropdown*/
	@FindBy(xpath = "//button[text()='SIZE']")
	private WebElement btnSize;
	
	/*select size*/
	public static WebElement clkSize(String size) 
	{
		String xpath = "//div[@class='ais-RefinementList']//ul//li//span[text()='"+size+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk sortBy btn*/
	@FindBy(xpath = "//p[@class='d-inline-block']")
	private WebElement btnSortBy;
	
	/*select price range*/
	public static WebElement clkPrice(String priceRange) 
	{
		String xpath = "//div[@class='custom_sorting']/p//ul//li//a[text()='"+priceRange+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk product*/
	public static WebElement clkProduct(String productName) 
	{
		String xpath = "//div[contains(text(),'"+productName+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk change pincode btn*/
	@FindBy(xpath = "//div[@class='delivery-pincode']/div//button")
	private WebElement changePincodeBtn;
	
	/*enter  pincode */
	@FindBy(xpath = "//input[@class='pincode-input form-control']")
	private WebElement pincodeTxtField;

	/*clk apply btn*/
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement applyBtn;

	/*clk addToCart btn*/
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCartBtn;

	/*clk Cart btn*/
	@FindBy(xpath = "//p[text()='Cart']")
	private WebElement cartBtn;

	/*verify product title*/
	@FindBy(xpath = "//div[@class='item-content']/p")
	private WebElement actualProdTitle;
	
	/*verify size*/
	@FindBy(xpath = "//div[@class='item-size']/strong")
	private WebElement actualSize;
	
	
	/**
	 * 
	 * Description: method to clk on close btn
	 * @author sushmita
	 */
	
	public synchronized void clkOnClosePopBtn() {
		try {
			WebActionUtil.waitForElement(closePopUpBtn, "close btn", 45);
			WebActionUtil.clickOnWebElement(closePopUpBtn, "close btn", "Unable to CLICK on close btn");
		}
		catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to CLICK on close btn");
			Assert.fail("Unable to CLICK on close btn");
		}
	}
	/**
	 * 
	 * Description: method to mouse Hover on Main menu
	 * @author sushmita
	 */
	
	public synchronized void clkOnMainMenu(String mainMenu) {
		try {
			WebActionUtil.waitForElement(clkMainMenu(mainMenu), "main menu", 45);
			WebActionUtil.clickOnWebElement(clkMainMenu(mainMenu), "mainMenu", "Unable to clk on main Menu");
		}
		catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on main Menu");
			Assert.fail("Unable to clk on main Menu");
		}
	}
	
	/**
	 * 
	 * Description: method to click Submenu
	 * @author sushmita
	 */
	
	public synchronized void clkSubmenu(String subMenu) {
		try {
			WebActionUtil.waitForElement(clkSubMenu(subMenu), "Submenu", 30);
			WebActionUtil.clickOnWebElement(clkSubMenu(subMenu), "submenu", "Unable to click sub menu");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click sub Menu");
			Assert.fail("Unable to click sub Menu");
		}
	}
	
	/**
	 * 
	 * Description: method to click Sort by dropDown
	 * @author sushmita
	 */
	public synchronized void clkSortByDropdown() {
		try {
			WebActionUtil.waitForElement(btnSortBy, "Sort By", 30);
			WebActionUtil.clickOnWebElement(btnSortBy, "sort  by", "Unable to click sort by drop down ");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click sort by");
			Assert.fail("Unable to click sort by");
		}
	}
	
	/**
	 * 
	 * Description: method to click price range
	 * @author sushmita
	 */
	public synchronized void selectPriceRange(String priceRange) {
		try {
			WebActionUtil.waitForElement(clkPrice(priceRange), "Price button", 30);
			WebActionUtil.clickOnWebElement(clkPrice(priceRange), "price button", "Unable to click price button ");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click price button");
			Assert.fail("Unable to click price button");
		}
	}
	
	/**
	 * 
	 * Description: method to click on filters
	 * @author sushmita
	 */
	public synchronized void clkFilter(String filter1) {
		try {
			
			WebActionUtil.waitForElement(clkFilter1(filter1), "flter check box", 30);
			
			WebActionUtil.clickCheckBox(clkFilter1(filter1), "filter1");
		}
		
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on check box");
			Assert.fail("Unable to clk on checkbox");
		}
	}
	
	/**
	 * 
	 * Description: method to click on product
	 * @author sushmita
	 */
	public synchronized void clkOnProduct(String productName) {
		try {
			WebActionUtil.waitForElement(clkProduct(productName), "product", 30);
			WebActionUtil.clickOnWebElement(clkProduct(productName), "product", "Unable to click product");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click product");
			Assert.fail("Unable to click product");
		}
	}
	
	/**
	 * 
	 * Description: method to  click Change pincode button
	 * @author sushmita
	 */
	public synchronized void clkOnChangePincodeBtn() {
		try {
			WebActionUtil.waitForElement(changePincodeBtn, "Change pincode button", 30);
			WebActionUtil.clickOnWebElement(changePincodeBtn, "Change pincode button", "Change pincode button");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click Change pincode buttonverify product");
			Assert.fail("Unable to click Change pincode button");
		}
	}
	
	
	/**
	 * 
	 * Description: method to clk on product size drop down
	 * @author sushmita
	 */
	public synchronized void clkSizeDropdown() {
		try {
			WebActionUtil.waitForElement(btnSize, "size Drop down", 30);
			WebActionUtil.clickOnWebElement(btnSize, "size Drop down", "Unable to clk on size Drop down");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on size Drop down");
			Assert.fail("Unable to clk on size Drop down");
		}
	}
	/**
	 * 
	 * Description: method to select on product size checkbox
	 * @author sushmita
	 */
	public synchronized void selectProdSize(String size) {
		try {
			WebActionUtil.waitForElement(clkSize(size), "size checkbox", 30);
			WebActionUtil.clickCheckBox(clkSize(size), "size checkbox");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on size checkbox");
			Assert.fail("Unable to clk on size checkbox");
		}
	}
	
	/**
	 * 
	 * Description: method to enter pincode
	 * @author sushmita
	 */
	public synchronized void enterPincode(String pincode) {
		try {
			WebActionUtil.waitForElement(pincodeTxtField, "pincode Txt Field", 30);
			WebActionUtil.typeText(pincodeTxtField, pincode, "pincodeTxtField");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to enter  pincode");
			Assert.fail("Unable to  enter  pincode");
		}
	}
	
	/**
	 * 
	 * Description: method to clk on apply btn
	 * @author sushmita
	 */
	public synchronized void clkOnApplyBtn() {
		try {
			WebActionUtil.waitForElement(applyBtn, "apply Btn", 30);
			WebActionUtil.clickOnWebElement(applyBtn, "apply Button", "Unable to clk on applyBtn");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on applyBtn");
			Assert.fail("Unable to clk on applyBtn");
		}
	}
	
	/**
	 * 
	 * Description: method to clk on Add to bag
	 * @author sushmita
	 */
	public synchronized void clkOnAddToBag() {
		try {
			WebActionUtil.waitForElement(addToCartBtn, "add To CartBtn", 30);
			WebActionUtil.clickOnWebElement(addToCartBtn, "add ToCart Btn", "Unable to clk on addToCartBtn");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on addToCartBtn");
			Assert.fail("Unable to clk on addToCartBtn");
		}
	}
	
	/**
	 * 
	 * Description: method to verify cart button 
	 * @author sushmita
	 */
	public synchronized void verifyCartBtn() {
		try {
			WebActionUtil.waitForElement(cartBtn, "cart button", 30);
			WebActionUtil.isElementClickable(cartBtn, "Cart button");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on cart button");
			Assert.fail("Unable to clk on cart button");
		}
	}

	
	/**
	 * 
	 * Description: method to clk on cart btn
	 * @author sushmita
	 */
	public synchronized void clkOnCartBtn() {
		try {
			WebActionUtil.waitForElement(cartBtn, "cart button", 30);
			WebActionUtil.clickOnWebElement(cartBtn, "cart button", "Unable to clk on cart button");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on cart button");
			Assert.fail("Unable to clk on cart button");
		}
	}
	

	/**actualProdTitle
	 * 
	 * Description: method to verify Size of The Product
	 * @author sushmita
	 */
	public synchronized void verifySizeofTheProd(String size) {
		try {
			WebActionUtil.waitForElement(actualSize, "cart button", 30);
			String actProdSize= actualSize.getAttribute("value");
			if(size.equals(actProdSize))
			{
				WebActionUtil.info("Product size is verified");
			}
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to verify actual size of the product");
			Assert.fail("Unable to verify actual size of the product");
		}
	}
	
	/**
	 * 
	 * Description: method to verify actual Product title
	 * @author sushmita
	 */
	public synchronized void verifyActualProdTitle(String productName) {
		try {
			WebActionUtil.waitForElement(actualProdTitle, "cart product title", 30);
			String actProdTitle= actualProdTitle.getAttribute("value");
			if(productName.equals(actProdTitle))
			{
				WebActionUtil.info("Product title is verified");
			}
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to verify actual title of the product");
			Assert.fail("Unable to verify actual title of the product");
		}
	}
	
}
