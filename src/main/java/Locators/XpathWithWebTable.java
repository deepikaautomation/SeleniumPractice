package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class XpathWithWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		////a[text()='Briar Carter Carter']/parent::td/preceding-sibling::td//input
		
		// (//a[text()='Briar Carter Carter']/ancestor::tr/td)[7]
		
		//span[text()='Jordan Hermann']/../../../following-sibling::td//span

		//span[text()='Jordan Hermann']/ancestor::td/following-sibling::td//span
		
		
		//span[text()='Contacts']
		
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("deepikadr86@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//div[contains(@class,'submit ')]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	   // WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.attributeContains(
              //  By.id("main-nav"), "class", "collapsed"));
		
		//driver.findElement(By.xpath("//div[@class,'ui fluid container']")).click();
		//driver.switchTo().frame("downloadFrame");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[text()='Briar Carter Carter']/parent::td/preceding-sibling::td//input")).click();
		selectUser("Briar Carter Carter");
		selectUser("Keaton Patterson Patterson");
		
		
		String emailId=getUserEmailId("Briar Carter Carter");
		System.out.println(emailId);
		
		
		
		
		
		
		
		
		
	}
	
	
	//dynamic xpath
	public static void selectUser(String username) {
		
		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td//input")).click();
		
	}
	
	public static String getUserEmailId(String username) {
		
		return driver.findElement(By.xpath("(//a[text()='Briar Carter Carter']/ancestor::tr/td)[7]")).getText();
		
		
		
	}

}
