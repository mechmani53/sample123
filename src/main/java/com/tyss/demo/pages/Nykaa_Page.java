package com.tyss.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.demo.util.WebActionUtil;

public class Nykaa_Page {
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Nykaa_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
	@FindBy(xpath="//ul[@class='HeaderNav css-f7ogli']/li/a[text()='brands']")
	private WebElement brandsMenu;
	
	
	@FindBy(xpath="//div[@class='css-ov2o3v']/a[text()='Lakme']")
	private WebElement clkLakmeProduct;
	
	@FindBy(xpath="//div[@class='clearfix']/div[text()='Color']")
	private WebElement clkONColor;
	
	
	@FindBy(xpath="//span[text()='Pink']")
	private WebElement selectColor;
	
	@FindBy(xpath="//img[@alt='Lakme 9 to 5 Weightless Matte Mousse Lip & Cheek Color - Blush Velvet']")
	private WebElement clkOProduct;
	
	@FindBy(xpath="//div[@class='pdp-tile-add-to-cart-wrapper']/button[text()='ADD TO BAG']")
	private WebElement btnAddToBag;
	
	@FindBy(xpath="//div[@class='BagItems ']")
	private WebElement clkBagItems;
	
	@FindBy(xpath="//div[@class='product-des__details-title']/h1[@class='product-title']")
	private WebElement productText;
	
	@FindBy(xpath="//span[text()='Proceed']")
	private WebElement proceedBtn;
	
	
	public synchronized void buyNykaaProduct()
	{
		WebActionUtil.mouseHover(driver, brandsMenu);
		WebActionUtil.clickOnWebElement(clkLakmeProduct, "product", "product is clicked");
		WebActionUtil.clickOnWebElement(clkONColor, "color list", "color filter choosed");
		WebActionUtil.clickOnWebElement(selectColor, "select color", "color is selected");
		WebActionUtil.clickOnWebElement(clkOProduct, "select color checkbox", "color is selected");
		WebActionUtil.switchToTab(1);
		WebActionUtil.verifytext("Lakme 9 to 5 Weightless Matte Mousse Lip & Cheek Color - Blush Velvet", productText, "text verified");

		WebActionUtil.clickOnWebElement(btnAddToBag, "add product to bag", "product is added");
		WebActionUtil.clickOnWebElement(clkBagItems, "click on bag items", "product is added");
		WebActionUtil.clickOnWebElement(proceedBtn, "proceed btn", "Procced button is clicked");

	}
	
	
}
