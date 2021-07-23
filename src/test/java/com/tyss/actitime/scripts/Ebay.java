package com.tyss.actitime.scripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
import com.tyss.demo.dataproviders.EbayDataProvider;

public class Ebay extends BaseTest
{
	@Test(description = "Create Users", dataProvider = "TestUsersDataProvider", dataProviderClass = EbayDataProvider.class)


	public void shopAtEbay(String mainMenu,String subMenu,String subCategory,String productName,String size,String filter1,String brand) throws Exception {

		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);
		
		/*click on main menu*/
		pages.ebayPage.clkOnMainMenu(mainMenu);

		/*click on sub menu */
		pages.ebayPage.clkSubmenu(subMenu);
		
		/*click on sub category */
		pages.ebayPage.clkSubcategory(subCategory);
		
		/*click on sub filter1 */
		pages.ebayPage.selectFilters(filter1);

		/*click on filters brand */
		pages.ebayPage.selectFilters(brand);
		
		/*click on filter size */
		pages.ebayPage.selectFilters(size);
		
		/*click product */
		pages.ebayPage.clkOnProduct(productName);
		
		/*verify product title*/
//		pages.ebayPage.verifyProductTitle(productName);
		
		/*select quantity*/
//		pages.ebayPage.selectQuantity(quantity);
		
		/*click Add to bag*/
		pages.ebayPage.clkOnAddToBag();
		
		/*verify crt btn */
		pages.ebayPage.verifyCartBtn();
		
		/*click cart btn*/
		pages.ebayPage.clkOnCartBtn();
		
		}
	
}//h2[text()='Shop by US Shoe Size']/ancestor::section/descendant::p[text()='12']
