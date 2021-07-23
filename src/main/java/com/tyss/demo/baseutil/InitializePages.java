package com.tyss.demo.baseutil;

import org.openqa.selenium.WebDriver;

import com.tyss.demo.pages.Ajio_Page;
import com.tyss.demo.pages.Bluestone_Home_Page;
import com.tyss.demo.pages.BuyProduct_Page;
import com.tyss.demo.pages.Buy_Product_page;
import com.tyss.demo.pages.Decathlon_Page;
import com.tyss.demo.pages.Ebay_Page;
import com.tyss.demo.pages.Everton_Page;
import com.tyss.demo.pages.Login_Page;
import com.tyss.demo.pages.NewProject_Page;
import com.tyss.demo.pages.Nike_Page;
import com.tyss.demo.pages.Nykaa_Page;
import com.tyss.demo.pages.Payment_Page;
import com.tyss.demo.pages.PepperFry_Page;
import com.tyss.demo.pages.PlaceOrder_Page;
import com.tyss.demo.pages.Tasks_Page;
import com.tyss.demo.pages.Users_Page;
import com.tyss.demo.util.WebActionUtil;

import demo.actitime.pages.AddNewCustomer_Page;

/**
 * Description Initialize all pages with driver,ETO, WebAactionUtil
 * 
 * @author shreya.u@testyantra.com,vivek.d@testyantra.com,aatish.s@testyantra.com
 * 
 */

public class InitializePages {
	public Login_Page loginPage;
	public Users_Page usersPage;
	public Bluestone_Home_Page homePage;
	public Buy_Product_page productPage;
	public PlaceOrder_Page orderPage;
	public Payment_Page paymentPage;
	public BuyProduct_Page prodPage;
	public Nykaa_Page nykaaPage;
	public PepperFry_Page pepperFryPage;
	public AddNewCustomer_Page newCustomerPage;
	public Tasks_Page tasksPage;
	public NewProject_Page projectPage;
	public Nike_Page nikePage;
	public Everton_Page evertonPage;
	public Ajio_Page ajioPage;
	public Decathlon_Page decathlonPage;
	public Ebay_Page ebayPage;
	public InitializePages(WebDriver driver, long ETO, WebActionUtil WebActionUtil) {

		loginPage = new Login_Page(driver, ETO, WebActionUtil);
		usersPage = new Users_Page(driver, ETO, WebActionUtil);
		
		homePage = new Bluestone_Home_Page(driver, ETO, WebActionUtil);
		productPage = new Buy_Product_page(driver, ETO, WebActionUtil);
		prodPage = new BuyProduct_Page(driver, ETO, WebActionUtil);
		orderPage = new PlaceOrder_Page(driver, ETO, WebActionUtil);
		paymentPage = new Payment_Page(driver, ETO, WebActionUtil);

		nykaaPage = new Nykaa_Page(driver, ETO, WebActionUtil);
		
		pepperFryPage = new PepperFry_Page(driver, ETO, WebActionUtil);
		newCustomerPage = new AddNewCustomer_Page(driver, ETO, WebActionUtil);
		tasksPage = new Tasks_Page(driver, ETO, WebActionUtil);
		projectPage = new NewProject_Page(driver, ETO, WebActionUtil);
		evertonPage = new Everton_Page(driver, ETO, WebActionUtil);
		ajioPage =  new Ajio_Page(driver, ETO, WebActionUtil);
		nikePage = new Nike_Page(driver, ETO, WebActionUtil);
		decathlonPage= new Decathlon_Page(driver, ETO, WebActionUtil);
		ebayPage = new Ebay_Page(driver, ETO, WebActionUtil);
	}

}
