package com.tyss.demo.dataproviders;

import org.testng.annotations.DataProvider;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.util.commonutils.ExcelUtil;

public class NikeDataProvider {
	@DataProvider(name = "TestUsersDataProvider")
	public static Object[][] getTestData() {
		int noofrows = ExcelUtil.getRowCount(BaseTest.EXCELPATH, "Nike");
		int noofcols = ExcelUtil.getColoumCount(BaseTest.EXCELPATH, "Nike");
		Object[][] workflowdata = new Object[noofrows][noofcols];
		
		for (int i = 1; i <= noofrows; i++) 
		{
			String data[] = ExcelUtil.getRowData(BaseTest.EXCELPATH, "Nike", i);

			for (int j = 0; j < data.length; j++) {

				workflowdata[i - 1][j] = data[j];
			}

		}
		return workflowdata;
	}
}
