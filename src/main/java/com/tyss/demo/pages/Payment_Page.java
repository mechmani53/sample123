package com.tyss.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.demo.util.WebActionUtil;

public class Payment_Page {
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Payment_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
		}
	
	@FindBy(id = "email")
	private WebElement emailTxtField;
	
	@FindBy(id = "contactNumber")
	private WebElement contactNumber;
	
	@FindBy(xpath = "//input[@type='button']")
	private WebElement continueButton;

	
	public synchronized void processPaymentDetails() {
		
	
	WebActionUtil.typeText(emailTxtField, "sushmitaph03@gmail.com", "email entered");
	WebActionUtil.typeText(contactNumber, "8660951347", "mobnumber entered");
	WebActionUtil.clickOnWebElement(continueButton, "continue button", " element is not clickable");
}
}