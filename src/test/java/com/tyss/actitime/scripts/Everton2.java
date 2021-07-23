package com.tyss.actitime.scripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
import com.tyss.demo.dataproviders.EvertonDataProvider;

public class Everton2 extends BaseTest{
	@Test(description = "Create Users", dataProvider = "TestUsersDataProvider", dataProviderClass = EvertonDataProvider.class)


	public void shopAtEverton2(String shopsType,String mainMenu,String subMenu,String productName,String quantity,String priceRange,String items) throws Exception {

		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);

		/*click on shop link*/
		pages.evertonPage.clickShopLink(shopsType);

		
		/*click on close popup*/
		pages.evertonPage.closePopup();
		
		/*search*/
		pages.evertonPage.searchProduct(productName);

		/*click on search icon */
		pages.evertonPage.clkSearchIcon();;

		/*click on TopSellerFilter */
		pages.evertonPage.clkPriceFilter(priceRange);

//		/*click on PriceFilter */
//		pages.evertonPage.clkPriceFilter();

//		/*click on items Filter Dropdown*/
//		pages.evertonPage.clkItemsFilterDropdown();

		/*select No Of Items*/
		pages.evertonPage.selectNoOfItems(items);

		/*get product details*/
		pages.evertonPage.getProductDetails();

		/*click product */
		pages.evertonPage.clkProduct(productName);

		/*verify product */
		pages.evertonPage.verifyProduct(productName);

		/*click Qty Dropdown*/
		pages.evertonPage.clickQtyDropdown();

		/*select Qty */
		pages.evertonPage.selectQty(quantity);

		/*Add to cart */
		pages.evertonPage.clkAddToCart();

		/*verify qty*/
		pages.evertonPage.verifyAddedQty();

	}
}
