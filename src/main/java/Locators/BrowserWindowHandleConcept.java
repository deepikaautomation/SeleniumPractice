package Locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		WebElement twitterElement=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twitterElement.click();
		
		
		Set<String> winHandles=driver.getWindowHandles();
		Iterator<String> it=winHandles.iterator();
		
		//while(it.hasNext()) {
			String parentWindowID=it.next();
			System.out.println(parentWindowID);
			
			String childWindowID=it.next();
			System.out.println(childWindowID);
		//}
		
		
		
		driver.switchTo().window(childWindowID);
		System.out.println("child window   : " + driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window   : "+ driver.getCurrentUrl());
		
		driver.quit(); 
;
	}

}
