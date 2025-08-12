package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedFrameConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		
		driver.findElement(By.id("inp_val")).sendKeys("Test ABBC");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("TESTTT QQQ");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Destined to be");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("Adding");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Destined to be   yes");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[text()='One on One Call Support']")).click();
		
	}

}
