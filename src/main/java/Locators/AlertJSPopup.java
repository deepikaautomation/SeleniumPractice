package Locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class AlertJSPopup {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		
		driver.findElement(By.cssSelector("#alertexamples")).click();
		
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	String mesg=driver.findElement(By.xpath("//div[@class='centered']/p[text()='You triggered and handled the alert dialog']")).getText();

	if(mesg.equals("You triggered and handled the alert dialog")) {
		System.out.println("Test passed");
	}
		
	//confirm
	Thread.sleep(10000);
	
	driver.findElement(By.id("confirmexample")).click();
	
	Alert alert1=driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert1.accept();
	
	 
	Thread.sleep(10000);
	//prompt
	driver.findElement(By.id("promptexample")).click();
	Alert alert2=driver.switchTo().alert();
	System.out.println(alert2.getText());
	alert2.sendKeys("Deepika here");
	alert2.accept();

	}

}
