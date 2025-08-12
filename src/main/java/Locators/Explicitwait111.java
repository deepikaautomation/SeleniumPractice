package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait111 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		By name=By.id("input-firstname");
		
		
		visblityofElment(name,10).sendKeys("gsgsgg");
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//WebElement ele= wait.until(ExpectedConditions.presenceOfElementLocated(name));
		//ele.sendKeys("wertwre");
		
		//wait.until(ExpectedConditions.visibilityOf(ele))
		
		//wait.until(ExpectedConditions.alertIsPresent())
		
		//wait.until(ExpectedConditions.titleContains(null))
		
		//wait.until(ExpectedConditions.elementToBeClickable(name))

	}
	
	public static WebElement visblityofElment(By locator, int timeout ) {
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	}
	
	public void eleCLICKABLEt(By locator, Duration time ) {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	WebElement ele= wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
}


}
