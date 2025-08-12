package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndUrl {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.linkText("Forgotten Password")).click();
		
		String textcontains=waitForTitleContainsandFetch(2,"Password");
		
		String titleIs=waitForTitleIsandFetch(2,"Forgot Your Password?");
		
		System.out.println(textcontains);
		System.out.println(titleIs);
		
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.linkText("Headsets")).click();
		String containsUrl=waitForUrlContainsandFetch(20,"gaming+headsets");
		System.out.println(containsUrl);
		

	}
	
	public static String waitForTitleContainsandFetch(int timeouts,String fractionofText) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(fractionofText));
		return driver.getTitle();
	}
	
	public static String waitForTitleIsandFetch(int timeouts,String text) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs(text));
		return driver.getTitle();
	}
	
	public static String waitForUrlContainsandFetch(int timeouts,String fractionofUrl) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(fractionofUrl));
		return driver.getCurrentUrl();
	}
	
	public static Boolean waitForUrlIsandFetch(int timeouts,String fractionofUrl) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlContains(fractionofUrl));
		
	}


	public static String waitForUrlandFetch(int timeouts,String url) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(url);
		return driver.getCurrentUrl();
	}
}
