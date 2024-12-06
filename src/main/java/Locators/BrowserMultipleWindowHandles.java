package Locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandles {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		
		String parentWindowID=driver.getWindowHandle();
		
		Thread.sleep(3000);
		WebElement twElement=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbElement=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement ytElement=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement liElement=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		twElement.click();
		fbElement.click();
		ytElement.click();
		liElement.click();
		
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		while(it.hasNext()) {
			
			String windowId=it.next();
			driver.switchTo().window(windowId);
			String url=driver.getCurrentUrl();
			System.out.println(url);
			
			if(!windowId.equals(parentWindowID)) {
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parentWindowID);
		boolean flag=driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed();
		System.out.println(flag);
		System.out.println("parent window   : "+ driver.getCurrentUrl());
		
	}
	

}
