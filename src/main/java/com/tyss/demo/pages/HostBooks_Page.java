package com.tyss.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.demo.util.WebActionUtil;

public class HostBooks_Page {
	public WebDriver driver;
	public WebActionUtil WebActionUtil;
	public long ETO = 10;

	public HostBooks_Page(WebDriver driver, long ETO, WebActionUtil WebActionUtil) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.WebActionUtil = WebActionUtil;
		this.ETO = ETO;
	}
	

	@FindBy(id = "loginemail")
	private WebElement email;
	
	@FindBy(id = "loginpassword")
	private WebElement pwd;
	
	@FindBy(xpath = "//button[@id='check_in']")
	private WebElement login;
	
	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	private WebElement frame;
	
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	private WebElement frameCheckBox;
}
