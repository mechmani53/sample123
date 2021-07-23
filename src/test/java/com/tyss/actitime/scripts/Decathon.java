package com.tyss.actitime.scripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
import com.tyss.demo.dataproviders.AjioDataProvider;
import com.tyss.demo.dataproviders.DecathlonDataProvider;

public class Decathon extends BaseTest{

	@Test(description = "Create Users", dataProvider = "TestUsersDataProvider", dataProviderClass = DecathlonDataProvider.class)


	public void shopAtDecathlon(String mainMenu,String subMenu,String productName,String size,String priceRange,String pincode,String filter1) throws Exception {

		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);

		
		/*click on closepopup*/
		pages.decathlonPage.clkOnClosePopBtn();
		
		/*click on main menu*/
		pages.decathlonPage.clkOnMainMenu(mainMenu);

		/*click on sub menu */
		pages.decathlonPage.clkSubmenu(subMenu);

		/*click on sub menu */
		pages.decathlonPage.clkFilter(filter1);
		
		/*click on SizeDropdown */
		pages.decathlonPage.clkSizeDropdown();
		
		/*click on ProdSize checkbox */
		pages.decathlonPage.selectProdSize(size);
		
		/*click on SortByDropdown */
		pages.decathlonPage.clkSortByDropdown();
		
		/*click on PriceRange */
		pages.decathlonPage.selectPriceRange(priceRange);
		
		/*click product */
		pages.decathlonPage.clkOnProduct(productName);

		/*clk pincode field */
		pages.decathlonPage.clkOnChangePincodeBtn();;

		/*enter pincode*/
		pages.decathlonPage.enterPincode(pincode);

		/*click apply btn */
		pages.decathlonPage.clkOnApplyBtn();
		
		
		/*click Add to bag*/
		pages.decathlonPage.clkOnAddToBag();
		
		/*verify crt btn */
		pages.decathlonPage.verifyCartBtn();
		
		/*click cart btn*/
		pages.decathlonPage.clkOnCartBtn();
		
		/*verify product title*/
		pages.decathlonPage.verifyActualProdTitle(productName);
		
		/*verify product size*/
		pages.decathlonPage.verifySizeofTheProd(size);
		

	}
}
