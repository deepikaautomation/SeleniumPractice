package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateGooglePage {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("WebDriver");
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@role='presentation']//span"));
		
		for(WebElement e:list) {
			System.out.println(e.getText());
		}

	}

}
