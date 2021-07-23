package com.tyss.actitime.scripts;
import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
//import com.tyss.demo.dataproviders.BlueStoneDataProvider;
public class BlueStone extends BaseTest {
	
		@Test

		public void createRequisition(String customerName,String projectName,String taskName) throws Exception
		{

			InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);
			
			pages.homePage.searchOnProduct();
//			pages.productPage.enterDetails();
//			pages.prodPage.enterDetails();
//			pages.orderPage.processOrder();
//			pages.paymentPage.processPaymentDetails();

		}
	}
