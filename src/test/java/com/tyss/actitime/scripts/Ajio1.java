package com.tyss.actitime.scripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
import com.tyss.demo.dataproviders.AjioDataProvider;
import com.tyss.demo.dataproviders.EvertonDataProvider;

public class Ajio1 extends BaseTest{
	@Test(description = "Create Users", dataProvider = "TestUsersDataProvider", dataProviderClass = AjioDataProvider.class)


	public void shopAtAjio(String mainMenu,String mainMenu2,String subMenu,String productName,String size,String price,String pincode) throws Exception {

		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);

		/*click on main menu*/
		pages.ajioPage.mouseHoverOnMainMenu(mainMenu);

//		/*click on closepopup*/
//		pages.ajioPage.closePopup();
		
//		/*clk sub menu*/
//		pages.ajioPage.mouseHoverOnMensMenu(mainMenu);

		/*click on sub menu */
		pages.ajioPage.clkSubmenu(subMenu);
		
		/*highlight products*/
		pages.ajioPage.highLightAllProducts(driver);

		/*click product */
		pages.ajioPage.clkProduct(productName);

		/*select size*/
		pages.ajioPage.selectSize(size);

		/*clk pincode field */
		pages.ajioPage.clkPincode();

		/*enter pincode*/
		pages.ajioPage.enterPincode(pincode);

		/*click confirm btn */
		pages.ajioPage.clickConfirmBtn();

		/*verify error pincode msg */
		pages.ajioPage.verifyErrorMsg();

		/*enter valid pincode */
		pages.ajioPage.enterPincode(pincode);

		/*click confirm btn */
		pages.ajioPage.clickConfirmBtn();
		
		/*click Add to bag*/
		pages.ajioPage.addToBag();
		
		/*click crt btn */
		pages.ajioPage.clickCartBtn();
		
		/*verify product title*/
		pages.ajioPage.verifyProductName(productName);
		
		/*verify product size*/
		pages.ajioPage.verifyProductSize(size);
		
		/*verify product price*/
		pages.ajioPage.verifyProductPrice(price);

	}
}
