package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {
	
	
	
	//UseCase: ElementNotInteractableEcception,ElementNotIntercerptedException

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn=	By.id("input-firstname");
	
		By ln=	By.id("input-lastname");
		By continueBtn=By.cssSelector("input[type='submit']");
		
		Actions act=new Actions(driver);
		
		//act.sendKeys(driver.findElement(fn), "naveen").build().perform();
		//act.sendKeys(driver.findElement(ln),"automation").build().perform();
		//act.click(driver.findElement(continueBtn)).build().perform();
		doActionSendKeys(fn, "naveen");
		doActionSendKeys(ln, "automation");
		doActionClick(continueBtn);
		
		
		
	}
	
	public static WebElement getWebElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	
	public static void doActionSendKeys(By locator,String text) {
		Actions act=new Actions(driver);
		
		act.sendKeys(getWebElement(locator),text).build().perform();
		
	}
	
	public static void doActionClick(By locator) {
		Actions act=new Actions(driver);
		
		act.click(getWebElement(locator)).build().perform();
		
	}

}
