package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 */
public class ExplicitWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		driver=new ChromeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		By emailId=By.id("input-emaill");
		By password=By.id("input-password");
		By button=By.cssSelector("input[type='submit']");
		
		
		waitUntilPresenceofElement(emailId,10).sendKeys("ttt@yopmail.com");
		
		
		doSendKeys(password, "yteywte");
	
		
		
		
	}
	
	
	/*An expectation for checking that an element is present on the DOM of a page. 
	 * This does notnecessarily mean that the element is visible.*
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitUntilPresenceofElement(By locator, int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	
	/*An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.*
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitUntilVisible(By locator, int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	/**
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	/**
	 * @param locator
	 * @param text
	 */
	public static void doSendKeys(By locator,String text) {
		
		getElement(locator).sendKeys(text);
	}

}
