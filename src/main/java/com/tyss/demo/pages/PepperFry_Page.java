package com.tyss.demo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.demo.util.WebActionUtil;

public class PepperFry_Page {
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public PepperFry_Page(WebDriver driver, long ITO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
	@FindBy(linkText ="Living")
	private WebElement livingMenu;
	
	@FindBy(xpath = "//div[@id='meta-living']//div/div/a[contains(text(),'Arm')]")
	private WebElement chairsSubMenu;
	
	
	@FindBy(xpath = "//div[@class='clip__filter']//div/div/h2[contains(text(),'PEPPERFRY BRANDS')]/parent::div/following-sibling::ul/div/div/li/label[text()='No']")
	private WebElement pepperFryBrands;
	

	@FindBy(xpath = "//div[@class='clip__filter']//div/div/h2[contains(text(),'BRAND')]/parent::div/following-sibling::ul/div/div/li/label[contains(text(),'Woodsworth')]")
	private WebElement brandsMenu;
	
	
	@FindBy(xpath = "//div[@class='clip__filter']//div/div/h2[contains(text(),'PRICE')]/parent::div/following-sibling::ul/div/div/li/label[contains(text(),'Under ₹ 10,000')]")
	private WebElement price;
	
	
	@FindBy(xpath = "//div[@class='clip__filter']//div/div/h2[contains(text(),'PRIMARY MATERIAL')]/parent::div/following-sibling::ul/div/div/li/label[contains(text(),'Teak Wood')]")
	private WebElement lnkMaterial;
	
	
	
	@FindBy(xpath = "//div[@class='clip__filter']//div/div/h2[contains(text(),'DISCOUNT')]/parent::div/following-sibling::ul/div/div/li/label[contains(text(),'10% and Above')]")
	private WebElement lnkDiscount;
	
	
	@FindBy(xpath = "//div/h2/a[contains(text(),'Aadya Solid Wood Upholstered Armchair in Natural Finish-')]")
	private WebElement lnkProduct;
	
	@FindBy(xpath = "//div/h1[contains(text(),'Aadya Solid Wood Upholstered Armchair in Natural Finish-')]")
	private WebElement productText;
	
	@FindBy(xpath = "//div/input[@id='pincode']")
	private WebElement pincodeLink;
	
	@FindBy(xpath = "//div/a[text()='Change']")
	private WebElement ChangePincode;
	
	@FindBy(xpath = "//div/a[contains(text(),'Buy Now')]")
	private WebElement btnBuyNow;
	
	@FindBy(xpath = "//div/a[contains(text(),'PLACE ORDER')]")
	private WebElement btnPlaceOrder;
	
	
	public synchronized void  buyProduct()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebActionUtil.mouseHover(driver, livingMenu);	
		WebActionUtil.clickOnWebElementLink(chairsSubMenu);
		WebActionUtil.clickOnWebElementLink(pepperFryBrands);
		WebActionUtil.waitForElement(brandsMenu, "Brands menu", 20);
		WebActionUtil.clickOnWebElementLink(brandsMenu);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebActionUtil.clickOnWebElementLink(price);
		WebActionUtil.waitForElement(lnkMaterial, "Material link", 20);
		WebActionUtil.clickOnWebElementLink(lnkMaterial);
		WebActionUtil.waitForElement(lnkDiscount, "discount", 10);
		WebActionUtil.clickOnWebElementLink(lnkDiscount);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebActionUtil.clickOnWebElementLink(lnkProduct);
		WebActionUtil.switchToTab(1);
		WebActionUtil.clearText(pincodeLink, "clear pincode");
		WebActionUtil.typeText(pincodeLink, "581115", "Changed Pincode");
		WebActionUtil.waitForElement(ChangePincode, "pincode cahnge", 10);
		WebActionUtil.clickOnWebElementLink(ChangePincode);
		WebActionUtil.waitForElement(btnBuyNow, " Buy now button", 10);
		WebActionUtil.clickOnWebElementLink(btnBuyNow);
		WebActionUtil.waitForElement(btnPlaceOrder, "place order", 10);
		WebActionUtil.clickOnWebElement(btnPlaceOrder, "Place order", "Order is Placed");
		
	}
}
