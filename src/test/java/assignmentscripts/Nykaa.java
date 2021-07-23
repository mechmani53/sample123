package assignmentscripts;

import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;

public class Nykaa extends BaseTest {
	
	@Test
	public void createRequisition(String customerName,String projectName,String taskName) throws Exception
	{

		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);
		
		pages.nykaaPage.buyNykaaProduct();
//		

	}
}
