package com.tyss.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.WebActionUtil;

public class Ajio_Page {

	public static WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Ajio_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
	
	/*Kids main menu*/
	public static WebElement clkKidsMenu(String mainMenu) 
	{
		String linkText = "mainMenu";
		return driver.findElement(By.linkText(linkText));
	}
	
	
	/*clk Boys sub menu*/
	public static WebElement clkOnSubMenu(String subMenu) 
	{
		String xpath = "//a/span[text()='"+subMenu+"']";
		return driver.findElement(By.xpath(xpath));
	}
	

	/* Highlight all products*/
	@FindBy(xpath = "//div[@class='contentHolder']")
	private List<WebElement> highlightProducts;
	
	/*clk on product*/
	public static WebElement clkOnProduct(String productName) 
	{
		String xpath = "//div[@class='contentHolder']//div[text()='"+productName+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*select size*/
	public static WebElement selectSize(String size) 
	{
		String xpath = "//div[text()='"+size+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/*clk pincode field*/
	@FindBy(xpath = "//div[@class='edd-pincode-msg']")
	private  WebElement pinCode;
	
	/*enter pincode in the txtfield*/
	@FindBy(xpath = "//input[@class='edd-pincode-modal-text']")
	private  WebElement pinCodeTextField;
	
	/*clk confirm button*/
	@FindBy(xpath = "//button[text()='CONFIRM PINCODE']")
	private  WebElement btnConfirmPincode;
	
	/*verify error pincode msg*/
	@FindBy(xpath="//div[@class='edd-pincode-msg-details edd-pincode-msg-details-not-deliverable']")
	private  WebElement errorPincodeMsg;
	
	/*clk change pincode*/
	@FindBy(xpath = "//span[text()='Change Pincode']")
	private  WebElement btnChangePincode;
	
	/*verify success pincode msg*/
	@FindBy(xpath="//div[@class='edd-message-success-container']/ul//li")
	private  List<WebElement> successPincodeMsg;
	
	
	/*clk Add to Bag*/
	@FindBy(xpath = "//span[text()='ADD TO BAG']")
	private  WebElement btnAddToBag; 
	
	/*clk cart button*/
	@FindBy(xpath = "//div[@class='ic-cart ']")
	private  WebElement btnCart; 
	
	/*verify actual produName*/
	@FindBy(xpath = "//div[@class='product-name']/a")
	private  WebElement actualProduct; 
	
	/*verify actual size*/
	@FindBy(xpath = "//div[@class='cartsize']/div")
	private  WebElement actualSize; 
	
	/*verify actual Price*/
	@FindBy(xpath = "//div[@class='net-price best-price-strip']")
	private  WebElement actualPrice; 
	
	//	
//	/*close cookie popup*/
//	@FindBy(xpath = "//div[@class='cookie-consent-button-container']/button/span")
//	private  WebElement closeCookiePopUp;
//	
//	/*Alert*/
//	@FindBy(xpath = "//i[@class='icon icon-close-alt modal-close-button']")
//	private WebElement btnclose;

	/**
	 * 
	 * Description: method to mouse Hover on Main menu
	 * @author sushmita
	 */
	
	public synchronized void mouseHoverOnMainMenu(String mainMenu) {
		try {
			WebActionUtil.waitForElement(clkKidsMenu(mainMenu), "main menu", 45);
			WebActionUtil.mouseHover(driver, clkKidsMenu(mainMenu));
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
	 * Description: method to highlight all the products 
	 * @author sushmita
	 */
	public synchronized void highLightAllProducts(WebDriver driver) {
		try {
			for(WebElement element : highlightProducts) 
			{
				WebActionUtil.waitForElement(element, "Products", 25);
				WebActionUtil.mouseHover(driver, element);
				WebActionUtil.info(element.getText());
				
				}
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to  Highlight  the product");
			Assert.fail("Unable to  highlight the product ");
		}
	}
	
	/**
	 * 
	 * Description: method to click product
	 * @author sushmita
	 */
	
	public synchronized void clkProduct(String productName) {
		try {
			WebActionUtil.waitForElement(clkOnProduct(productName), "productName", 25);
			WebActionUtil.clickOnWebElement(clkOnProduct(productName), "product", "Unable to click product");
			WebActionUtil.switchToTab(1);
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
	 * Description: method to size of the  product
	 * @author sushmita
	 */
	
	public synchronized void selectProductSize(String size) {
		try {
			WebActionUtil.waitForElement(selectSize(size), "product size", 30);
			WebActionUtil.clickOnWebElement(selectSize( size), "product size", "Unable to select size");
				}
		
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to select product size");
			Assert.fail("Unable to select product size");
		}
	}
	
	/**
	 * 
	 * Description: method to click pincode field
	 * @author sushmita
	 */
	
	public synchronized void clkPincode() {
		try {
			WebActionUtil.waitForElement(pinCode, "pincode field", 25);
			WebActionUtil.clickOnWebElement(pinCode, "pinCode flield", "Unable to click pinCode field");
				}
		
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click pinCode field");
			Assert.fail("Unable to click pinCode field");
		}
	}
	
	
	/**
	 * 
	 * Description: method to enter pincode
	 * @author sushmita
	 */
	
	public synchronized void enterPincode(String pincode) {
		try {
			WebActionUtil.waitForElement(pinCodeTextField, "pinCodeTextField", 25);
			WebActionUtil.typeText(pinCodeTextField, pincode, "pincode");
				}
		
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to enter pinCode");
			Assert.fail("Unable to enter pinCode");
		}
	}
	
	/**
	 * 
	 * Description: method to click confirm button
	 * @author sushmita
	 */
	
	public synchronized void clickConfirmBtn() {
		try {
			WebActionUtil.waitForElement(pinCodeTextField, "pinCodeTextField", 25);
			WebActionUtil.clickOnWebElement(btnConfirmPincode, "confirm button", "Unable to click confirm button");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click confirm button");
			Assert.fail("Unable to click confirm button");
		}
	}
	
	/**
	 * 
	 * Description: method to verify error msg
	 * @author sushmita
	 */
	
	public synchronized void verifyErrorMsg() {
		try {
			
			WebActionUtil.waitForElement(errorPincodeMsg, "error msg", 25);
			if(errorPincodeMsg.isDisplayed()) 
			{
				String err = errorPincodeMsg.getText();
				WebActionUtil.info(err);
			
				WebActionUtil.clickOnWebElement(btnChangePincode, "Change pincode", "Unable to click changePincode");
				
				}
			}
			 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to verify pincode err msg");
			Assert.fail("Unable to verify pincode err msg");
		}
	}
	
	/**
	 * 
	 * Description: method to click Add to bag 
	 * @author sushmita
	 */

	public synchronized void addToBag() {
		try {
			if(((WebElement) successPincodeMsg).isDisplayed()) 
			{
				for(WebElement msg :successPincodeMsg) 
				{
					WebActionUtil.waitForElement(msg, "pinCode successful msg", 25);
					String successMsg = msg.getText();
					WebActionUtil.info(successMsg);
				}
			}
			WebActionUtil.clickOnWebElement(btnAddToBag, "Add to Bag", "Unable to add to bag");
		}		
		catch (Exception e) 
		{
			WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to add to bag");
			Assert.fail("Unable to add to bag");
		}
	}
	
	/**
	 * 
	 * Description: method to click Cart button
	 * @author sushmita
	 */
	
	public synchronized void clickCartBtn() {
		try {
			WebActionUtil.waitForElement(pinCodeTextField, "pinCodeTextField", 25);
			WebActionUtil.clickOnWebElement(btnCart, "cart", "Unable to click cart button");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to click cart button");
			Assert.fail("Unable to click cart button");
		}
	}
	
	/**
	 * 
	 * Description: method to verify prod title
	 * @author sushmita
	 */
	
	public synchronized void verifyProductName(String productName) {
		try {
			WebActionUtil.waitForElement(actualProduct, "pinCodeTextField", 25);
			WebActionUtil.verifytext(productName, actualProduct, "Product title");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to verify product title");
			Assert.fail("Unable to click product title");
		}
	}
	
	/**
	 * 
	 * Description: method toverify prod size
	 * @author sushmita
	 */
	
	public synchronized void verifyProductSize(String productName) {
		try {
			WebActionUtil.waitForElement(actualSize, "size", 25);
			WebActionUtil.verifytext(productName, actualSize, "Product size");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to verify product size");
			Assert.fail("Unable to click product size");
		}
	}
	
	/**
	 * 
	 * Description: method to verify prod Price
	 * @author sushmita
	 */
	
	public synchronized void verifyProductPrice(String price) {
		try {
			WebActionUtil.waitForElement(actualPrice, "pinCodeTextField", 25);
			WebActionUtil.verifytext(price, actualPrice, "Product title");
		}
		 catch (Exception e) 
		{
			 WebActionUtil.error(e.getMessage());
			WebActionUtil.error("Unable to verify product price");
			Assert.fail("Unable to click product price");
		}
	}
	
	
	
	
	

}
