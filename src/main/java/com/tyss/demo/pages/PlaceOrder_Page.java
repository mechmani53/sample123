package com.tyss.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.demo.util.WebActionUtil;

public class PlaceOrder_Page {
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public PlaceOrder_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
		}
	
	@FindBy(xpath = "//div[@class='product-title col-xs-6']/a")
	private WebElement prodctNameInCart;
	
	
	
	@FindBy(linkText = "PLACE ORDER")
	private WebElement btnPlaceOrder;
	
	public synchronized void processOrder() {
		WebActionUtil.verifytext("The Alexaine Ring", prodctNameInCart, "Title verified");	
	WebActionUtil.clickOnWebElementLink(btnPlaceOrder);
	}
}