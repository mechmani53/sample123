package com.tyss.actitime.scripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
import com.tyss.demo.dataproviders.AjioDataProvider;
import com.tyss.demo.dataproviders.NikeDataProvider;

public class Nike extends BaseTest{
		@Test(description = "Create Users", dataProvider = "TestUsersDataProvider", dataProviderClass = NikeDataProvider.class)
	

		public void shopAtNike(String mainMenu,String mainMenu2,String subMenu,String subCategory,String productName,String size,String priceRange) throws Exception {
		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);
	
		/*verify on main menu */
		pages.nikePage.verifyMainMenu(mainMenu);
		
		/*click on main menu*/
		pages.nikePage.mouseHoverOnMainMenu(mainMenu);

		/*verify on main menu */
		pages.nikePage.verifysubMenu(subMenu);
		
		/*click on sub menu */
		pages.nikePage.clkSubmenu(subMenu);

		/*Clk subCategory*/
		pages.nikePage.clkSubCategory(subCategory);
		
		/*click on sort by*/
		pages.nikePage.clkSortByDropdown();
		
		/*click on price */
		pages.nikePage.selectPriceRange(priceRange);
		
//		/*get all products */
//		pages.nikePage.getAllProducts();
		
		/*click on product */
		pages.nikePage.clkOnProduct(productName);
		
		/*click on product title*/
		pages.nikePage.verifyPrduct(productName);
		
		/*click on size*/
		pages.nikePage.selectProdSize(size);
		
		/*click on add to bag */
		pages.nikePage.clkOnAddToBag();
		
		/*verify cart */
		pages.nikePage.verifyCartBtn();
		
		/*click on cart */
		pages.nikePage.clkOnCartBtn();
		
		/*click on price */
		pages.nikePage.verifySizeofTheProd(size);
		
		

}

}
