package com.tyss.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.WebActionUtil;

public class Nike_Page {
	public static WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Nike_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
	/*move on Men main  menu*/
	public static WebElement clkOnMainMenu(String mainMenu) 
	{
		String xpath = "//li[@class='pre-desktop-menu-item d-lg-ib is-static is-header']/a[text()='"+mainMenu+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk sub menu*/
	public static WebElement clkOnSubMenu(String subMenu) 
	{
		String xpath = "//a[@aria-label ='main-menu, Men, Shoes']/parent::div//a[text()='"+subMenu+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk sub category*/
	public static WebElement clkOnSubCategory(String subCategory) 
	{
		String xpath = "//div[@class='categories css-10qr031 is--desktop']//a[text()='"+subCategory+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*clk sort by drop down*/
	@FindBy(xpath="//span[text()='Sort By']")
	private WebElement ddSortBy;
	
	/*clk price button*/
	public static WebElement clkPriceBtn(String priceRange) 
	{
		String xpath = "//div[@id='sort-options']//button[text()='"+priceRange+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*get all products*/
	@FindBy(xpath="//div[@class='product-card__titles']")
	private List<WebElement> productsList;
	
	/*clk product*/
	public static WebElement clkProduct(String productName) 
	{
		String xpath = "//div[@class='product-card__info disable-animations']//div[@id='"+productName+"']";
		return driver.findElement(By.xpath(xpath));
	}
	//div[@class='product-card__info disable-animations']//div[@id='Nike SB Check Solarsoft Canvas']	

	/*check product*/
	@FindBy(xpath="(//h2[text()='Skate Shoe']/../h1)[1]")
	private WebElement checkProduct;
	
	
	/*clk  on size*/
	public static WebElement clkOnSize(String size) 
	{
		String xpath = "//div[@class='mt2-sm css-1j3x2vp']//div//label[text()='"+size+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*click on Add to bag*/
	@FindBy(xpath="//button[text()='Add to Bag']")
	private WebElement btnAddToBag;
	
	
	/*click on cart*/
	@FindBy(id="nav-cart")
	private WebElement btnCart;
	
	/*verify actual size*/
	@FindBy(xpath="//label[text()='Size']/../div[@class='css-123i213 e4f9riy2']")
	private WebElement actualSize;
	
	
	

	/** 
	 * 
	 * Description: method to verify Main menu
	 * @author sushmita
	 */
	
	public synchronized void verifyMainMenu(String mainMenu) {
		try {
			WebActionUtil.waitForElement(clkOnMainMenu(mainMenu), "main menu", 45);
			WebActionUtil.isElementVisible(clkOnMainMenu(mainMenu), "main menu");
		}
		catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to find main menu");
			Assert.fail("Unable to find main Menu");
		}
	}
	/** 
	 * 
	 * Description: method to mouse Hover on Main menu
	 * @author sushmita
	 */
	
	public synchronized void mouseHoverOnMainMenu(String mainMenu) {
		try {
			WebActionUtil.waitForElement(clkOnMainMenu(mainMenu), "main menu", 45);
			WebActionUtil.mouseHover(driver, clkOnMainMenu(mainMenu));
		}
		catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to mouseHover on main Menu");
			Assert.fail("Unable to mouseHover on main Menu");
		}
	}
	
	/** 
	 * 
	 * Description: method to verify sub menu
	 * @author sushmita
	 */
	
	public synchronized void verifysubMenu(String subMenu) {
		try {
			WebActionUtil.waitForElement(clkOnSubMenu(subMenu), "sub menu", 45);
			WebActionUtil.isElementVisible(clkOnSubMenu(subMenu), "sub menu");
		}
		catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to find sub menu");
			Assert.fail("Unable to find sub Menu");
		}
	}
	/**
	 * 
	 * Description: method to click Submenu
	 * @author sushmita
	 */
	
	public synchronized void clkSubmenu(String subMenu) {
		try {
			WebActionUtil.waitForElement(clkOnSubMenu(subMenu), "Submenu", 30);
			WebActionUtil.clickOnWebElement(clkOnSubMenu(subMenu), "submenu", "Unable to click sub menu");
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
	 * Description: method to click Subcategory
	 * @author sushmita
	 */
	
	public synchronized void clkSubCategory(String subCategory) {
		try {
			WebActionUtil.waitForElement(clkOnSubCategory(subCategory), "Submenu", 30);
			WebActionUtil.clickOnWebElement(clkOnSubCategory(subCategory), "submenu", "Unable to click sub category");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click sub category");
			Assert.fail("Unable to click sub category");
		}
	}
	
	/**
	 * 
	 * Description: method to click Sort by dropDown
	 * @author sushmita
	 */
	public synchronized void clkSortByDropdown() {
		try {
			WebActionUtil.waitForElement(ddSortBy, "Sort By", 30);
			WebActionUtil.clickOnWebElement(ddSortBy, "sort  by", "Unable to click sort by drop down ");
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
			WebActionUtil.waitForElement(clkPriceBtn(priceRange), "Price button", 30);
			WebActionUtil.clickOnWebElement(clkPriceBtn(priceRange), "price button", "Unable to click price button ");
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
	 * Description: method to print all products
	 * @author sushmita
	 */
	public synchronized void getAllProducts() {
		try {
			for(WebElement prod :productsList) {
			WebActionUtil.waitForElement(prod, "Price button", 30);
			
			WebActionUtil.info(prod.getText());
		}
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to print products");
			Assert.fail("Unable to print products");
		}
	}
	
	/**
	 * 
	 * Description: method to click on product
	 * @author sushmita
	 */
	public synchronized void clkOnProduct(String productName) {
		try {
			WebActionUtil.waitForElement(clkProduct(productName), "product", 45);
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
	 * Description: method to verify on product
	 * @author sushmita
	 */
	public synchronized void verifyPrduct(String productName) {
		try {
			WebActionUtil.waitForElement(checkProduct, "product", 30);
			WebActionUtil.verifytext(productName, checkProduct, "actual product title");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to verify product");
			Assert.fail("Unable to verify product");
		}
	}
	
	/**
	 * 
	 * Description: method to clk on product size
	 * @author sushmita
	 */
	public synchronized void selectProdSize(String size) {
		try {
			WebActionUtil.waitForElement(clkOnSize(size), "product", 30);
			WebActionUtil.clickOnWebElement(clkOnSize(size), "size", "Unable to clk on Size of the product");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on Size of the product");
			Assert.fail("Unable to clk on Size of the product");
		}
	}
	
	/**
	 * 
	 * Description: method to clk on Add to bag
	 * @author sushmita
	 */
	public synchronized void clkOnAddToBag() {
		try {
			WebActionUtil.waitForElement(btnAddToBag, "Add tO bag btn", 30);
			WebActionUtil.clickOnWebElement(btnAddToBag, "Add To bag btn", "Unable to clk on AddToBag");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to clk on AddToBag");
			Assert.fail("Unable to clk on AddToBag");
		}
	}
	
	/**
	 * 
	 * Description: method to verify cart button 
	 * @author sushmita
	 */
	public synchronized void verifyCartBtn() {
		try {
			WebActionUtil.waitForElement(btnCart, "cart button", 30);
			WebActionUtil.isElementClickable(btnCart, "Cart button");
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
			WebActionUtil.waitForElement(btnCart, "cart button", 30);
			WebActionUtil.clickOnWebElement(btnCart, "cart button", "Unable to clk on cart button");
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
	
}