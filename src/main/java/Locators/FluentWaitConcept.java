package Locators;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		
		By tryitBtn=By.linkText("Try it Freett");
		
		
		/*
		 * Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		 * 
		 * .withTimeout(Duration.ofSeconds(10)) .ignoring(NoSuchElementException.class)
		 * .ignoring(NoClassDefFoundError.class) .pollingEvery(Duration.ofSeconds(2))
		 * .withMessage("...not found..."); WebElement
		 * ele=wait.until(ExpectedConditions.elementToBeClickable(tryitBtn));
		 */
	
		
		waitForElementtoClickablewithFluentWait(10,2,tryitBtn).click();
				         
	}
	
	
	public static WebElement waitForElementtoClickablewithFluentWait(int timeOut,int pollingTime,By locator) {
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
	            
	            .withTimeout(Duration.ofSeconds(timeOut))
	            .ignoring(NoSuchElementException.class)
	            .ignoring(NoClassDefFoundError.class)
	            .pollingEvery(Duration.ofSeconds(pollingTime))
	            .withMessage("...not found...");
	            
          return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}

}
