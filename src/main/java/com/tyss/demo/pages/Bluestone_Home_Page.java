package com.tyss.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.demo.util.WebActionUtil;

public class Bluestone_Home_Page
{
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public Bluestone_Home_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	
	@FindBy(xpath = "//li[@class='menuparent repb']/a[text()='Rings ']")
	private WebElement ringlink;
	
	
	@FindBy(xpath = "//a[text()='Rings ']/following-sibling::div//ul//div/ul/li/a[text()='Diamond']")
	private WebElement diamondLink;
	
	
	@FindBy(xpath = "//span[text()='Price']")
	private WebElement filterlinkPrice;
	
	@FindBy(xpath = "//div[@id='top-filter']//div//div/div/form[@id='price']/div/div/span[@data-displayname='rs 10000 to rs 20000']")
	private WebElement filterPrice;
	
	
	@FindBy(xpath = "//span[text()='Metal']")
	private WebElement filterMetalLink;
	
	@FindBy(xpath = "//div[@id='top-filter']//div//div/div/form[@id='metal']/div/div/span[text()=' Gold ']")
	private WebElement filterMetal;
	
	
	@FindBy(xpath = "//div[@id='top-filter']//div//div/div/form[@id='gender']/div/div/span[text()=' Women ']")
	private WebElement genderSelectFilter;

	
	@FindBy(xpath = "//section[@id='Offers-form']/span/span[text()='Offers']")
	private WebElement offerSelectLink;
	
	@FindBy(xpath = "//div[@id='top-filter']//div//div/div/form[@id='offers']/div/div/span[text()=' 40% Making Charge Off ']")
	private WebElement offerSelectFilter;
	
	
	@FindBy(xpath = "//span[text()='More Filters']/../../following-sibling::div//form[@id='stones']/div/div/span[text()='Diamond']")
	private WebElement moreFilter;
	
	@FindBy(xpath = "//div[@id='top-filter']//div//div/div/form[@id='gold purity']/div/div/span[text()=' 18k ']")
	private WebElement caratFilter;
	
	
	@FindBy(xpath = "//div[@class='p-image']/a/img[@alt='The Alexaine Ring']")
	private WebElement selectimg;
	
	
	@FindBy(xpath = "//h1[text()='The Odeta Ring']")
	private WebElement titleOfImg;
	
	
	@FindBy(name="search_query")
	private WebElement searchTxtField;
	
	
	@FindBy(name="submit_search")
	private WebElement btnSearch;
	
	
	
	@FindBy(xpath="//li[@class='menuparent repb']/a[text()='Pendants ']")
	private WebElement pendantsLink;
	

	@FindBy(xpath = "//ul[@class='two-col']/li/span[text()='Mangalsutra']")
	private WebElement MangalLink;
	
	
	@FindBy(xpath = "//div[@class='p-image']/a/img[@alt='The Bawri Mangalsutra']")
	private WebElement clickimg;
	
	/**
	 * Description Method to click on the Product and apply filters
	 * @param filters
	 * 
	 * 
	 */
	public synchronized void clickOnDiamond()
	{
		WebActionUtil.mouseHover(driver, ringlink);
		WebActionUtil.clickOnWebElement(diamondLink, "Diamond", "Clicked on Diamond");
		WebActionUtil.clickOnWebElementLink(filterlinkPrice);
		WebActionUtil.clickOnWebElementLink(filterPrice);
		WebActionUtil.clickOnWebElementLink(filterMetalLink);
		WebActionUtil.clickOnWebElementLink(filterMetal);
		WebActionUtil.clickOnWebElementLink(offerSelectLink);
		WebActionUtil.clickOnWebElementLink(offerSelectFilter);
		WebActionUtil.clickOnWebElementLink(selectimg);
		WebActionUtil.switchToTab(1);
	}
	
	/**
	 * Description Method to search the Product and apply filters
	 * @param filters
	 * 
	 * 
	 */
	public synchronized void searchOnProduct()
	{
		WebActionUtil.typeText(searchTxtField,"Rings","Entered Text");
		WebActionUtil.clickOnWebElement(btnSearch, "search button", "clicked on Button");
		WebActionUtil.clickOnWebElementLink(filterlinkPrice);
		WebActionUtil.clickOnWebElementLink(filterPrice);
		WebActionUtil.clickOnWebElementLink(filterMetalLink);
		WebActionUtil.clickOnWebElementLink(filterMetal);
		WebActionUtil.clickOnWebElementLink(offerSelectLink);
		WebActionUtil.clickOnWebElementLink(offerSelectFilter);
		WebActionUtil.clickOnWebElementLink(selectimg);
		WebActionUtil.switchToTab(1);
		
	}
	public synchronized void clickOnProduct()
	{
		WebActionUtil.mouseHover(driver, pendantsLink);
		WebActionUtil.clickOnWebElement(MangalLink, "Mangalsutra", "Clicked on Element");
		WebActionUtil.clickOnWebElementLink(filterlinkPrice);
		WebActionUtil.clickOnWebElementLink(filterPrice);
		WebActionUtil.clickOnWebElementLink(filterMetalLink);
		WebActionUtil.clickOnWebElementLink(filterMetal);
		WebActionUtil.clickOnWebElementLink(offerSelectLink);
		WebActionUtil.clickOnWebElementLink(offerSelectFilter);
		WebActionUtil.clickOnWebElementLink(clickimg);
		WebActionUtil.switchToTab(1);
	}
	
		
}
	
	
	
	
	
	

