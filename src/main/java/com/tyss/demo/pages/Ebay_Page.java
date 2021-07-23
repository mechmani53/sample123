package com.tyss.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.WebActionUtil;

public class Ebay_Page {
	public static WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Ebay_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}	
	
	/*clk on main  menu*/
	public static WebElement clkMainMenu(String mainMenu) 
	{
		String xpath = "//div[@class='hl-cat-nav']//ul//li/a[text()='"+mainMenu+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk sub menu*/
	public static WebElement clkSubMenu(String subMenu) 
	{
		String xpath = "//div[@class='hl-cat-nav__sub-cats']//ul//li//a[text()='"+subMenu+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk subcategory*/
	public static WebElement clkSubCategory(String subCategory) 
	{
		String xpath = "//div[@class='dialog__cell']//ul//li//a[contains(text(),'"+subCategory+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk product*/
	public static WebElement clkProduct(String productName) 
	{
		String xpath = "//h3[contains(text(),'"+productName+"')]";
		return driver.findElement(By.xpath(xpath));
	}

	/*clk filters*/ 
	public static WebElement clkFilters(String filter) 
	{
		String xpath = "//p[text()='"+filter+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/*verify product*/
	
	@FindBy(xpath = "//div[@class='vi-swc-lsp']//h1")
	private WebElement actualTitle;
	
//	public static WebElement verifyTitle(String Name) 
//	{
//		String xpath = "//h1[contains(text(),'"+Name+"')]";
//		return driver.findElement(By.xpath(xpath));
//	}
	
	/*clk addToCart btn*/
	@FindBy(xpath = "//a[@id='isCartBtn_btn']")
	private WebElement addToCartBtn;

	/*clk view in Cart btn*/
	@FindBy(xpath = "//div[@class='item-quantity']//following-sibling::div//a[text()='View in cart']")
	private WebElement cartBtn;

	/*select product qty*/
	@FindBy(xpath = "//Select[@id='vi-quantity__select-box-0']")
	private WebElement selectQty;
	
	
	
	
	/**
	 * 
	 * Description: method to mouse Hover on Main menu
	 * @author sushmita
	 */
	
	public synchronized void clkOnMainMenu(String mainMenu) {
		try {
			WebActionUtil.waitForElement(clkMainMenu(mainMenu), "main menu", 45);
			WebActionUtil.mouseHover(driver, clkMainMenu(mainMenu));
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
	 * Description: method to click subcategory
	 * @author sushmita
	 */
	public synchronized void clkSubcategory(String subCategory) {
		try {
			WebActionUtil.waitForElement(clkSubCategory(subCategory), "subCategory", 30);
			WebActionUtil.clickOnWebElement(clkSubCategory(subCategory), "subCategory", "Unable to click on subCategory ");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click subCategory");
			Assert.fail("Unable to click  subCategory");
		}
	}
	
	/**
	 * 
	 * Description: method to click filters - Brand, size
	 * @author sushmita
	 */
	public synchronized void selectFilters(String filter) {
		try {
			WebActionUtil.waitForElement(clkFilters(filter), "Filters", 30);
			WebActionUtil.clickOnWebElement(clkFilters(filter), "Filters", "Unable to click on Filters ");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click Filters");
			Assert.fail("Unable to click sort Filters");
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
	 * Description: method to verify  product
	 * @author sushmita
	 */
	public synchronized void verifyProductTitle(String productName) {
		try {
			WebActionUtil.waitForElement(actualTitle, "product", 30);
//			String prodTitle = verifyProduct(productName).getText();
			WebActionUtil.verifytext(productName, actualTitle, "productTitle");
//			WebActionUtil.info("Product title is::" +actualTitle.getText());
			
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to verify product title");
			Assert.fail("Unable to verify product title");
		}
	}
	
	/**
	 * 
	 * Description: method to select quantity
	 * @author sushmita
	 */
	public synchronized void selectQuantity(String value) {
		try {
			WebActionUtil.waitForElement(selectQty, "cart button", 30);
			WebActionUtil.selectOption(selectQty, value);
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
			WebActionUtil.isElementVisible(cartBtn, "View in Cart");
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
	

	public synchronized void verifyActualPrice(String expprice) {
		try {
			WebActionUtil.waitForElement(actualPrice, "cart button", 30);
			String price =actualPrice.getText();
			String[] actPrice = price.split(" ");
			String p;
			for(int i=0;i<actPrice.length;i++)
			{
				if(i==1) {
			 p = actPrice[i];
				}
			}
			Assert.assertEquals(price, expprice);
			
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on cart button");
			Assert.fail("Unable to clk on cart button");
		}
	}


	public synchronized void verifyActualtitle(String productName) {
		try {
			WebActionUtil.waitForElement(actualTitle, "cart button", 30);
			String prodTitle =actualTitle.getText();
			String[] actPrdTitle= prodTitle.split(" ");
			String p;
			for(int i=0;i<actPrdTitle.length;i++)
			{
				if(i==1) {
			 p = actPrdTitle[i];
				}
			}
//			Assert.assertEquals(price, productName);
			
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on cart button");
			Assert.fail("Unable to clk on cart button");
		}
	}

	
	
}
