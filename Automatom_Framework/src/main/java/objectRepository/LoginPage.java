package objectRepository;

/**
 * @author ManojKumar PS
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	/**
	 * This method gives Login page locators values
	 */
	
	@FindBy(id = "Email")
	private WebElement usernameTF;
	
	@FindBy(id = "Password")
	private WebElement passwordTf;
	
	@FindBy(linkText = "Forgot password?")
	private WebElement forgotpasswordlink;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginlinkbutton;
	
	public void Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getForgotpasswordlink() {
		return forgotpasswordlink;
	}

	public WebElement getLoginlinkbutton() {
		return loginlinkbutton;
	}
	
}