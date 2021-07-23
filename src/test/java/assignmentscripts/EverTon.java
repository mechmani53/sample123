package assignmentscripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
import com.tyss.demo.dataproviders.CreateUsersDataProvider;
import com.tyss.demo.dataproviders.EvertonDataProvider;

public class EverTon extends BaseTest
{
//	@Test(description = "Create Users", dataProvider = "TestUsersDataProvider", dataProviderClass = EvertonDataProvider.class)

@Test
//	public void shopAtEverton(String shopsType,String mainMenu,String subMenu,String productName,String quantity,String priceRange,String items) throws Exception {
	public void shopAtEverton() throws Exception {
		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);

		/*click on shop link*/
		pages.evertonPage.clickShopLink("Shop");

//		/*click on closepopup*/
//		pages.evertonPage.closePopup();
//		
		/*mousehover menu*/
		pages.evertonPage.mouseHoverOnMensMenu("men");

		/*click on sub menu */
		pages.evertonPage.clkSubmenu("Face Coverings");

		/*click on TopSellerFilter */
		pages.evertonPage.clkPriceFilter("Lower Price");

//		/*click on PriceFilter */
//		pages.evertonPage.clkPriceFilter();

//		/*click on items Filter Dropdown*/
//		pages.evertonPage.clkItemsFilterDropdown();

		/*select No Of Items*/
		pages.evertonPage.selectNoOfItems("24 Items");

		/*get product details*/
		pages.evertonPage.getProductDetails();

		/*click product */
//		pages.evertonPage.clkProduct(productName);
//
//		/*verify product */
//		pages.evertonPage.verifyProduct(productName);
//
//		/*click Qty Dropdown*/
//		pages.evertonPage.clickQtyDropdown();
//
//		/*select Qty */
//		pages.evertonPage.selectQty(quantity);
//
//		/*Add to cart */
//		pages.evertonPage.clkAddToCart();
//
//		/*verify qty*/
//		pages.evertonPage.verifyAddedQty();

	}
}