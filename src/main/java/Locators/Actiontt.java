package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiontt {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String name="Deepika";
		
		
		
		
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement desk=driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		By firstname=By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By continueBtn=By.cssSelector("input[type='submit']");
		
		
		
    
		doSendKeysActionwithPause(firstname,"Divya",500);
		
		//doActionSendKeys(firstname, "Divya");
		doActionSendKeys(lastname, "AS");
		Thread.sleep(5000);
		doActionClick(continueBtn);
		
		
        
		
		
		
		
		
		
	}
	
	public static WebElement getElement(By locatorname) {
		
		return driver.findElement(locatorname);
		
	}
	
	public static void doActionSendKeys(By locator,String text) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator), text).build().perform();
		
		
		
		
	}
	
	public static void doActionClick(By locatname) {
		
		Actions act=new Actions(driver);
		act.click(getElement(locatname)).build().perform();
		
		//act.moveToElement(getElement(locatname)).click();
		
	}
	
	
	public static void doSendKeysActionwithPause(By loctname,String text,long time) {
		
		 char[] texttochArray=text.toCharArray();
			
			for( char e : texttochArray) {
				Actions act=new Actions(driver);
				act.sendKeys(getElement(loctname),String.valueOf(e)).pause(time).build().perform();
				
			}
		
	}

}
