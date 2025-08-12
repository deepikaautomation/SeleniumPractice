package Locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlertPopUp {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		
		driver.findElement(By.cssSelector("#alertexamples")).click();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		
		//waitForAlertIsPresent(10);
		System.out.println(alertGetText(10));
		//System.out.println(alert.getText());
		//alert.accept();
		
		
		
		//Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
	}

	
	public static Alert waitForAlertIsPresent(int timeOuts) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOuts));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public static String alertGetText(int timeOuts) {
		return waitForAlertIsPresent(timeOuts).getText();
		
		
	}
	
	public static void acceptAlert(int timeOuts) {
		waitForAlertIsPresent(timeOuts).accept();
		
		
	}
	
	public static void dismissAlert(int timeOuts) {
		waitForAlertIsPresent(timeOuts).dismiss();
		
		
	}
}
