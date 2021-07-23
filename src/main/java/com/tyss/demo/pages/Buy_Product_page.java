package com.tyss.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.demo.util.WebActionUtil;



public class Buy_Product_page 
{
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Buy_Product_page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
	/*title */
	@FindBy(xpath = "//div/a[text()='The Alexaine Ring']")
	private WebElement textlink;
	
	/*pincode*/
	@FindBy(xpath = "//div[@class='store-content']/div//div/input[@id='getNearestStore']")
	private WebElement pincodeLink;
	
	/*pincode update*/
	@FindBy(xpath = "//div[text()='Update']")
	private WebElement btnupdate;
	
	/*select size*/
	@FindBy(xpath = "//span[text()=' Select a Ring Size ']")
	private WebElement selectSize;
	
	/* size*/
	@FindBy(xpath = "//span[@class='size']")
	private WebElement ddSize;
	
	/*Buy option*/
	@FindBy(xpath = "//input[@id='buy-now']")
	private WebElement btnBuy;
	
	/*place order*/
	@FindBy(xpath="//a[text()='Place Order']")
	private WebElement btnPlaceOrder;
	
	/*email field*/
	@FindBy(id="email")
	private WebElement emailTxtField;
	
	/*contact number*/
	@FindBy(id="contactNumber")
	private WebElement mobileNumberTxtField;
	
	/*continue button*/
	@FindBy(xpath="//input[@type='button']")
	private WebElement btnContinue;
	
	/*whatsapp mobile number*/
	@FindBy(id="waMobileNumber")
	private WebElement whNumberTxtField;
	
	/*Name of Buyer*/
	@FindBy(id="fullname")
	private WebElement nameTxtField;
	
	/*receiving number*/
	@FindBy(id="recipientNumber")
	private WebElement reNumberTxtField;
	
	/*postal code*/
	@FindBy(id="postcode_delivery")
	private WebElement pincodeTxtField;
	
	/*address field*/
	@FindBy(id="address")
	private WebElement houseNoTxtField;
	
	@FindBy(id="street")
	private WebElement streetTxtField;
	
	@FindBy(id="locality")
	private WebElement townNameTxtField;
	
	/*payment proceed*/
	@FindBy(xpath="//button[text()=' Proceed to Payment ']")
	private WebElement btnProceedPayment;
	
	/**
	 * Description Method to buy the product using all other required fields
	 * @param filters
	 * 
	 * 
	 */
	public synchronized void enterDetails()
	{
		WebActionUtil.verifytext("The Alexaine Ring", textlink, "Title");
		WebActionUtil.waitForElement(pincodeLink, "pincode Field", 15);
		WebActionUtil.clearText(pincodeLink, "Pincode Cleared");
		WebActionUtil.typeText(pincodeLink, "581115", "Pincode entered");
		WebActionUtil.clickOnWebElement(btnupdate, "Pincode Update", "Pincode is Updated");
		WebActionUtil.clickOnWebElementLink(selectSize);
		WebActionUtil.clickOnWebElementLink(ddSize);
		WebActionUtil.clickOnWebElementLink(btnBuy);
		WebActionUtil.clickOnWebElementLink(btnPlaceOrder);

		WebActionUtil.typeText(emailTxtField, "sushmitaph03@gmail.com", "email entered");
		WebActionUtil.typeText(mobileNumberTxtField, "8660951347", "mobile number entered");
		WebActionUtil.clickOnWebElement(btnContinue, "continue button", "web element is not clickable");
		WebActionUtil.typeText(whNumberTxtField, "8660951347", "Number Entered");
		WebActionUtil.typeText(nameTxtField, "Sushmita", "name textfield");
		WebActionUtil.typeText(reNumberTxtField, "8660951347", "recipent mobile num text field");
		WebActionUtil.typeText(pincodeTxtField, "581115", "Pincode entered");
		WebActionUtil.typeText(houseNoTxtField, "7/1", "House Number Entered");
		WebActionUtil.typeText(streetTxtField, "Ashok nagar", "Street Name Entered");
		WebActionUtil.typeText(townNameTxtField, "Ranebennur", "Town Name Entered");
		WebActionUtil.clickOnWebElementLink(btnProceedPayment);
		
	}
	public synchronized void details() throws InterruptedException{
		
		WebActionUtil.waitForElement(pincodeLink, "pincode Field", 15);
		WebActionUtil.clearText(pincodeLink, "Pincode Cleared");
		WebActionUtil.typeText(pincodeLink, "581115", "Pincode entered");
		WebActionUtil.clickOnWebElement(btnupdate, "Pincode Update", "Pincode is Updated");
		WebActionUtil.waitForElement(btnBuy, "pincode Field", 10);
		//WebActionUtil.mouseHoverClick(driver, btnBuy);
		WebActionUtil.clickOnElementUsingJS(btnBuy, "Buy Now");
		WebActionUtil.clickOnWebElementLink(btnPlaceOrder);
		WebActionUtil.typeText(emailTxtField, "sushmitaph03@gmail.com", "email entered");
		WebActionUtil.typeText(mobileNumberTxtField, "8660951347", "mobilenumber entered");
		WebActionUtil.clickOnWebElement(btnContinue, "continue button", "element is not clickable");
		WebActionUtil.typeText(whNumberTxtField, "8660951347", "Number Entered");
		WebActionUtil.typeText(nameTxtField, "sushmita", "name entered into textfield");
		WebActionUtil.typeText(reNumberTxtField, "8660951347", "recipent mobnum textfield");
		WebActionUtil.typeText(pincodeTxtField, "581115", "Pincode entered");
		WebActionUtil.typeText(houseNoTxtField, "7/1", "House Number is entered");
		WebActionUtil.typeText(streetTxtField, "Someshwara Temple Street", "Street Name passed");
		WebActionUtil.typeText(townNameTxtField, "Halasuru", "Town Name passed");
		WebActionUtil.clickOnWebElementLink(btnProceedPayment);
		
	}
	
}