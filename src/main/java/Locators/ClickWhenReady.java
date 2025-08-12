package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickWhenReady {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		
		By tryitBtn=By.linkText("Try it Free   Testing Git");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(tryitBtn)).click();
		
		WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(tryitBtn));
		
		Actions act=new Actions(driver);
		act.click(btn).build().perform();
		
		
	}
	
	
	public static void clickWhenReady(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		
	}

}
