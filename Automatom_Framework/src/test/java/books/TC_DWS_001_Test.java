package books;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import genericUtility.BaseClass;
import objectRepository.HomePage;

public class TC_DWS_001_Test extends BaseClass{
	
	@Test
	public void ClickOnBooks() {
		ExtentTest test=EReports.createTest("ClickOnBooks");
		test.log(Status.INFO, "Login is Completed");
		driver=new ChromeDriver();
		
		HomePage hPage=new HomePage();
		hPage.getBookslinks().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","Books Page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}

}
