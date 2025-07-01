package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement ShoppingCart;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	/**
	 * @return the registerLink
	 */
	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	/**
	 * @return the loginLink
	 */
	public WebElement getLoginLink() {
		return LoginLink;
	}

	/**
	 * @return the shoppingCart
	 */
	public WebElement getShoppingCart() {
		return ShoppingCart;
	}
	

}
