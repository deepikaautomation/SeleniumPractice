package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagateGetUrl {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.navigate().to("https://www.amazon.in/");
		//driver.navigate().back(); naveen automationlabs selenium course
		
		By searchName=By.name("q");
		
		driver.findElement(searchName).sendKeys("naveen automation");
		Thread.sleep(3000);
		List<WebElement> srchlist =driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span"));
		System.out.println(srchlist.size());
		for(WebElement e:srchlist) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("naveen automationlabs selenium course")) {
				e.click();
				System.out.println("naveen automationlabs selenium course is present:Test passed");
				break;
			}
		}
		
	}

}
