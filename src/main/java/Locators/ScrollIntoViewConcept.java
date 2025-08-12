package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Top picks for Canada']"));
		
		JavaScriptUtil ju=new JavaScriptUtil(driver);
				ju.scrollIntoView(ele);
		
		
		////span[text()='Top picks for Canada']

	}

}
