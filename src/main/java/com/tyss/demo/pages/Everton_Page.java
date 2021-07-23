package com.tyss.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.WebActionUtil;

public class Everton_Page {
	public static WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Everton_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
//	/*men menu*/
//	@FindBy(linkText = "MEN")
//	private WebElement MensMenu;
	
	/*men menu*/
	public static WebElement clkMensMenu(String mainMenu) 
	{
		String linkText = "mainMenu";
		return driver.findElement(By.linkText(linkText));
	}
	
	
	/*shop link*/
	public static WebElement clkShopLink(String shopsType) 
	{
		String xpath = "//li/a/span[text()='"+shopsType+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*Face Coverings sub menu*/
	public static WebElement clkOnSubMenu(String subMenu) 
	{
		String xpath = "//div[text()='"+subMenu+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
//	/*Face Coverings sub menu*/
//	@FindBy(xpath = "//div[text()='Face Coverings']")
//	private WebElement faceCoverings;
	
	/* clk top sellers dropdown*/
	@FindBy(xpath = "//div[text()='Top Sellers']")
	private WebElement ddTopSellers;
	
	/*click filter lowestPriceFilter*/
	@FindBy(xpath = "//select[@id='sort-by']//option")
	private WebElement lowestPriceFilter;
	
	/*click items filter dropdown*/
	@FindBy(xpath = "//div[@data-talos='ddPageSize']/i[@class='icon icon-drop-down']")
	private WebElement ItemsDropdown;
	
	/*select no of items */
	@FindBy(xpath = "//select[@id='page-size']//option")
	private WebElement noOfItems;
	
	/*get text of items */
	@FindBy(xpath = "//div[@class='columns small-5 medium-12']")
	private List<WebElement> productsText;
	
//	/*clk on product*/
//	@FindBy(xpath = "//div[@class='product-card-title']/a[contains(text(),'Everton Single Pack')]")
//	private  WebElement clickProduct;
	
	/*clk on product*/
	public static WebElement clkOnProduct(String productName) 
	{
		String xpath = "//div[@class='product-card-title']/a[contains(text(),'"+productName+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*get on actualProduct text*/
	@FindBy(xpath = "//div[@class='product-title-container']/h1")
	private  WebElement actualProduct;
	
	/*clk quantity dropdown*/
	@FindBy(xpath = "//div[@class='drop-down-selected']//i")
	private  WebElement ddQty;
	
//	/*select quantity*/
//	@FindBy(xpath = "//select[@id='Quantity']//option[text()='2']")
//	private  WebElement selectQuantity;
//	
//	/*select quantity*/
//	public static WebElement selectQuantity(String Quantity) 
//	{
//		String xpath = "//select[@id='Quantity']//option[text()='"+Quantity+"']";
//		return driver.findElement(By.xpath(xpath));
//	}
	
	/*clk Add to cart*/
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private  WebElement btnAddToCart;
	
	/*close cookie popup*/
	@FindBy(xpath = "//div[@class='cookie-consent-button-container']/button/span")
	private  WebElement closeCookiePopUp;
	
	/*Alert*/
	@FindBy(xpath = "//i[@class='icon icon-close-alt modal-close-button']")
	private WebElement btnclose;
	
	
	/*verify quantity*/
	@FindBy(xpath = "//div[@class='drop-down-selected']")
	private  WebElement checkQty;
	
	/*search txt field*/
	@FindBy(id="typeahead-input-desktop")
	private  WebElement searchTxtField;
	
	/*search icon*/
	@FindBy(xpath = "//i[@class='icon icon-search']")
	private  WebElement btnSearch;
	
	public synchronized void closePopup()
	{
		try 
		{
			WebActionUtil.waitForElement(closeCookiePopUp, "cookies", 10);
			WebActionUtil.clickOnElementUsingJS(closeCookiePopUp, "cookies");
			WebActionUtil.waitForElement(btnclose, "alert", 10);
			WebActionUtil.clickOnElementUsingJS(btnclose, "alert");
				
		} 
		catch (Exception e) 
		{
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to close");
			Assert.fail("Unable to click on close");
		}
	
	}
	/**
	 * 
	 * Description: method to search product
	 * @author sushmita
	 */
	
	public synchronized void searchProduct(String searchProduct) {
		try {
			WebActionUtil.waitForElement(searchTxtField, "Shop link", 45);
			WebActionUtil.typeText(searchTxtField, searchProduct, "search text field");
				
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Enter product name");
			Assert.fail("Unable to Enter product name");
		}
	}
	
	
	/**
	 * 
	 * Description: method to click Search Icon
	 * @author sushmita
	 */
	
	public synchronized void clkSearchIcon() {
		try {
			WebActionUtil.waitForElement(btnSearch, "Search button", 45);
			WebActionUtil.clickOnWebElement(btnSearch, "search icon", "Unable to click Search button");	
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click Search button");
			Assert.fail("Unable to click Search button");
		}
	}
	
	
	
	/**
	 * 
	 * Description: method to click Shop Link
	 * @author sushmita
	 */
	
	public synchronized void clickShopLink(String shopsType) {
		try {
			WebActionUtil.waitForElement(clkShopLink(shopsType), "Shop link", 80);
			WebActionUtil.clickOnWebElement(clkShopLink(shopsType), "shops link", "Unable to click shops link");
			WebActionUtil.switchToTab(1);
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to Enter Task Description");
			Assert.fail("Unable to Enter Task Description");
		}
	}
	
	/**
	 * 
	 * Description: method to mouse Hover on Mens menu
	 * @author sushmita
	 */
	
	public synchronized void mouseHoverOnMensMenu(String mainMenu) {
		try {
			WebActionUtil.waitForElement(clkMensMenu(mainMenu), "Mens main menu", 45);
			WebActionUtil.mouseHover(driver, clkMensMenu(mainMenu));
		}
		catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to mouseHover on Men Menu");
			Assert.fail("Unable to mouseHover on  Men Menu");
		}
	}
	
	/**
	 * 
	 * Description: method to click Submenu
	 * @author sushmita
	 */
	
	public synchronized void clkSubmenu(String subMenu) {
		try {
			WebActionUtil.waitForElement(clkOnSubMenu(subMenu), "Submenu", 25);
			WebActionUtil.clickOnWebElement(clkOnSubMenu(subMenu), "Face Covering submenu", "Unable to click sub menu");
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
	 * Description: method to click TopSellerFilter
	 * @author sushmita
	 */
	
//	public synchronized void clkTopSellerFilter() {
//		try {
//			WebActionUtil.waitForElement(ddTopSellers, "Top sellers Dropdown", 25);
//			WebActionUtil.clickOnWebElement(ddTopSellers, "Top sellers Dropdown", "Unable to click on Top sellers Dropdown");
//		}
//		 catch (Exception e) 
//		{
//			 WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("Unable to click on Top sellers Dropdown");
//			Assert.fail("Unable to click on Top sellers Dropdown");
//		}
//	}
//	
	/**
	 * 
	 * Description: method to click PriceFilter
	 * @author sushmita
	 */
	
	public synchronized void clkPriceFilter(String priceRange) {
		try {
			WebActionUtil.waitForElement(ddTopSellers, "price filter", 25);
			WebActionUtil.selectOption(ddTopSellers, priceRange);;
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click on price filter");
			Assert.fail("Unable to click on price filter");
		}
	}
	
	/**
	 * 
	 * Description: method to click Items filter drop down
	 * @author sushmita
	 */
	
//	public synchronized void clkItemsFilterDropdown() {
//		try {
//			WebActionUtil.waitForElement(ItemsDropdown, "Items filter drop down", 25);
//			WebActionUtil.clickOnWebElement(ItemsDropdown, "items filter", "unable to click items filter drop down");
//		}
//		 catch (Exception e) 
//		{
//			 WebActionUtil.error(e.getMessage());
//			WebActionUtil.error("Unable to click on items filter drop down");
//			Assert.fail("Unable to click on items filter drop down");
//		}
//	}
	
	/**
	 * 
	 * Description: method to select no of Items 
	 * @author sushmita
	 */
	
	public synchronized void selectNoOfItems(String items) {
		try {
			WebActionUtil.waitForElement(noOfItems, "No of Items", 25);
			WebActionUtil.selectOption(ItemsDropdown, items);
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to select  No of Items");
			Assert.fail("Unable to select No of Items");
		}
	}
	
	
	
	/**
	 * 
	 * Description: method to get all product details in the page 
	 * @author sushmita
	 */
	
	public synchronized void getProductDetails() {
		try {
			for(WebElement product : productsText) 
			{
				WebActionUtil.waitForElement(product, "Products", 25);
				System.out.println(product.getText());
				}
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to get product details");
			Assert.fail("Unable to get product details");
		}
	}
	
	/**
	 * 
	 * Description: method to click product
	 * @author sushmita
	 */
	
	public synchronized void clkProduct(String productName) {
		try {
			WebActionUtil.waitForElement(clkOnProduct(productName), "No of Items", 25);
			WebActionUtil.clickOnWebElement(clkOnProduct(productName), "product", "Unable to click product");	
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
	
	public synchronized void verifyProduct(String productName) {
		try {
			WebActionUtil.waitForElement(actualProduct, "actual product title", 25);
			WebActionUtil.verifytext(productName, actualProduct,"Product title");
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
	 * Description: method to click on quantity dropdown
	 * @author sushmita
	 */
	
	public synchronized void clickQtyDropdown() {
		try {
			WebActionUtil.waitForElement(ddQty, "quantity drop down", 25);
			WebActionUtil.clickOnWebElement(ddQty, "Quantity dropdown", "Unable to click Quantity dropdown");
				}
		
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click Quantity dropdown");
			Assert.fail("Unable to click Quantity dropdown");
		}
	}
	
	/**
	 * 
	 * Description: method to select quantity
	 * @author sushmita
	 */
	
	public synchronized void selectQty(String quantity) {
		try {
			WebActionUtil.waitForElement(ddQty, "quantity", 25);
			WebActionUtil.selectOption(ddQty,  quantity);
				}
		
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to select quantity");
			Assert.fail("Unable to select quantity");
		}
	}
	
	/**
	 * 
	 * Description: method to click Add to cart
	 * @author sushmita
	 */
	
	public synchronized void clkAddToCart() {
		try {
			WebActionUtil.waitForElement(btnAddToCart, "Add to Cart", 25);
			WebActionUtil.clickOnWebElement(btnAddToCart, "Add to Cart", "Unable to click Add to Cart");
				}
		
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click Add to Cart");
			Assert.fail("Unable to click Add to Cart");
		}
	}
	
	/**
	 * 
	 * Description: method to click Add to cart
	 * @author sushmita
	 */
	
	public synchronized void verifyAddedQty() {
		try {
			WebActionUtil.waitForElement(checkQty, "quantity", 25);
			
			String exp = checkQty.getText();
			WebActionUtil.verifytext(exp, checkQty, "qauntity");
				}
		
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("unable to display added quantity");
			Assert.fail("Unable to click Add to Cart");
		}
	}
}
