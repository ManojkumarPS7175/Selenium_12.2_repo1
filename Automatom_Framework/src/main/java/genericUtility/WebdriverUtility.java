package genericUtility;
/**
 * @author ManojKumarPS
 */

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	/**
	 * this method will maximize the window
	 * @return
	 */
	public void Maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * this method will minimize the window
	 * @return
	 */
	public void Minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	/**
	 * this method will Full screen the window
	 * @return
	 */
	public void FullScreen(WebDriver driver) {
		driver.manage().window().fullscreen();
		
	}
	
	/**
	 * this method will match the selenium speed with the window
	 * @return
	 */
	public void ImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	/**
	 * this method is used to mouse action
	 * @return MouseHover
	 */
	public void MouseHover(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element);	
	}
	
	/**
	 * This method will perform Click and hold
	 * @return clickAndHOld
	 */
	public void clickAndHold(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.clickAndHold(element);
	}
	
	/**
	 * This method will Perform Right click actions
	 * @return context
	 */
	public void ContextClick(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.contextClick(element);
	}
	
	/**
	 * This method is used to perform drag and drop 
	 * @param source
	 * @param Target
	 */
	public void DragAndDrop(WebDriver driver,WebElement source,WebElement Target) {
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, Target).perform();;
		
	}
	
	/**
	 * This method is used to handle the drop down using index value
	 * @param index
	 */
	public void	SelectByIndex(WebElement element,int index) {
		 Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 *This method is used to handle the drop down using Value 
	 * @param value
	 */
	public void SelectByValue(WebElement element,String value) {
		 Select sel=new Select(element);
		sel.selectByValue(value);		
	}
	
	/**
	 * This method is used to handle the drop down using visible text
	 * @param Text
	 */
	public void SelectByVisibleTest(WebElement element,String Text) {
		 Select sel=new Select(element);
		sel.selectByVisibleText(Text);
		
	}
	
	/**
	 * This method is used to view all Options which is present in dropDown
	 * @return 
	 * 
	 */
	public String[] GetAllOptions(WebElement element) {
		 Select sel=new Select(element);
		List<WebElement> AllOptions = sel.getOptions();
		String[] option=new String[AllOptions.size()];
		
		for(int i=0;i<AllOptions.size();i++) {
			option[i]=AllOptions.get(i).getText();
		}
		return option;
		}
	
	/**
	 * this is used to switch the window using index
	 * @param index
	 */
	public void SwitchByIndex(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * this is used to switch the window using NameORId
	 * @param NameORId
	 */
	public void SwitchByNameORId(WebDriver driver, String NameORId) {
		driver.switchTo().frame(NameORId);
	}
	
	/**
	 * this is used to switch the window using element
	 * @param Element
	 */
	public void SwitchByElement(WebDriver driver, WebElement Element) {
		driver.switchTo().frame(Element);	
	}
	
	/**
	 * this is used to switch back to main window
	 */
	public void defaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();	
	}
	
	/**
	 * this used to switch to parent window
	 */
	public void ParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	
	/**
	 * this is used to switch to alert
	 * @return
	 */
	public Alert SwitchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	/**
	 * this is used to switch to window
	 * @param ActUrl
	 * @param ExpUrl
	 */
	public void SwitchToWindow(WebDriver driver,String ActUrl,String ExpUrl) {
		Set<String> AllWindowIDs = driver.getWindowHandles();
	
		for (String AllIDs : AllWindowIDs) {
			driver.switchTo().window(AllIDs);
			
			ActUrl=driver.getCurrentUrl();
			if (ActUrl.equals(ExpUrl)) {
				break;
			}
		}	
	}
	
	/**
	 * this is used to take screenshot
	 * @throws IOException
	 */
	public void GetPhoto(WebDriver driver) throws IOException {
		JavaUtility JU=new JavaUtility();
		TakesScreenshot tScreenshot=(TakesScreenshot)driver;
		File temp = tScreenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+JU.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	/**
	 * this used to perform JsScroll
	 * @param x
	 * @param y
	 */
	public void JsScroll(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Window.scrollTo("+x+","+y+")");
		
	}
}
	
