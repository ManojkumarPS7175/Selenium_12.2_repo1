package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.WelcomePage;

public class BaseClass {
	public static ExtentReports EReports;
	public static WebDriver driver;
	
	/**
	 * Object Creation
	 */
	public JavaUtility jUtility=new JavaUtility();
	public WebdriverUtility WdUtility=new WebdriverUtility();
	public FileUtility fUtility=new FileUtility();
	
	
	@BeforeSuite
	public void ReportConfig() {
		ExtentSparkReporter Spark=new ExtentSparkReporter("./Html_reports"+jUtility.getSystemTime()+".png");
		EReports=new ExtentReports();
		EReports.attachReporter(Spark);
	}
	
	@BeforeClass
	 public void OpenBrowser() throws IOException {
		driver=new ChromeDriver();
		WdUtility.Maximize(driver);
		WdUtility.ImplicitWait(driver);
		
		driver.get(fUtility.getDatafromProperty("URL"));
	}
	
	@BeforeMethod
	public void Login() throws IOException {
		WelcomePage wPage=new WelcomePage(driver);
		wPage.getLoginLink().click();
		
		LoginPage lPage=new LoginPage();
		lPage.getUsernameTF().sendKeys(fUtility.getDatafromProperty("email"));
		lPage.getPasswordTf().sendKeys(fUtility.getDatafromProperty("password"));
		lPage.getLoginlinkbutton().click();
	}
	
	@AfterMethod
	public void Logout() {
		HomePage hPage=new HomePage();
		hPage.getLogoutLink().click();
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit(); 
	}
	
	@AfterSuite
	public void ReportBackup() {
		EReports.flush();
	}
}
