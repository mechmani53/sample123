package assignmentscripts;
import org.testng.annotations.Test;

import com.tyss.demo.baseutil.BaseTest;
import com.tyss.demo.baseutil.InitializePages;
public class PepperFry extends BaseTest{
	@Test
	public void create()
	{

		InitializePages pages = new InitializePages(driver, ETO, WebActionUtil);
		
		pages.pepperFryPage.buyProduct();
		
	}
}
