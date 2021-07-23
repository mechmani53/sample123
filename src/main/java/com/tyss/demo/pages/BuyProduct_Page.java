package com.tyss.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.demo.util.WebActionUtil;

public class BuyProduct_Page {
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public BuyProduct_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
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
}
}
