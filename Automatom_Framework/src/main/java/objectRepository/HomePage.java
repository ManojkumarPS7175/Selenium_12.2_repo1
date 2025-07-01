package objectRepository;

	import org.openqa.selenium.WebDriver;
/**
	* @author ManojKumarPS
	*/
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class HomePage {
	/**
	 * This method gives Home page locators values
	 */
		
		public static WebDriver driver;
		
		@FindBy(partialLinkText = "Books")
		private WebElement Bookslinks;
		
		@FindBy(partialLinkText = "Computers")
		private WebElement Computerslink;
		
		@FindBy(partialLinkText = "Electronics")
		private WebElement Electronicslink;
		
		@FindBy(partialLinkText = "Apparel & Shoes")
		private WebElement ApparelShoeslink;
		
		@FindBy(partialLinkText = "Digital downloads")
		private WebElement Digitaldownloadslink;
		
		@FindBy(partialLinkText = "Jewelry")
		private WebElement Jewelrylinks;
		
		@FindBy(partialLinkText = "Gift Cards")
		private WebElement GiftCardslink;
		
		@FindBy(partialLinkText = "Log out")
		private WebElement LogoutLink;
		
		public HomePage() {
			  PageFactory.initElements(driver,this);
		}

		/**
		 * @return the books  links
		 */
		public WebElement getBookslinks() {
			return Bookslinks;
		}

		/**
		 * @return the computers link
		 */
		public WebElement getComputerslink() {
			return Computerslink;
		}

		/**
		 * @return the electronics link
		 */
		public WebElement getElectronicslink() {
			return Electronicslink;
		}

		/**
		 * @return the apparelShoeslink
		 */
		public WebElement getApparelShoeslink() {
			return ApparelShoeslink;
		}

		/**
		 * @return the digital downloads link
		 */
		public WebElement getDigitaldownloadslink() {
			return Digitaldownloadslink;
		}

		/**
		 * @return the jewelry links
		 */
		public WebElement getJewelrylinks() {
			return Jewelrylinks;
		}

		/**
		 * @return the giftCardslink
		 */
		public WebElement getGiftCardslink() {
			return GiftCardslink;
		}

		/**
		 * @return the logoutLink
		 */
		public WebElement getLogoutLink() {
			return LogoutLink;
		}
		
		
	}


