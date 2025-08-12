package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	 static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		By email=By.id("input-email");
		
		By passwo=By.name("password");
		
		By login=By.xpath("//input[@value='Login']");
		
		
		
		
		
		
		//    input[id='username'][type='email'][class='form-control private-form__control login-email']
		
		
		//WebElement emailele=getElement(email);
		//WebElement passele=getElement(passwo);
		WebElement loginele=getElement(login);
		
		
		//emailele.sendKeys("ghgfdsf");
		//passele.sendKeys("gfhgfd");
		
		//loginele.click();
		
		doSendKeys(email,"gfshgdfgsdhfg");
		doSendKeys(passwo, "ewtrye988");
		
		//loginele.click();
		doClick(login);
		
		
	}
	
	public static WebElement getElement(By locatorname) {
		
		return driver.findElement(locatorname);
		
		
	}
	
	public static void doSendKeys(By Locatorname,String text) {
		
		driver.findElement(Locatorname).sendKeys(text);
		
	}
	
	public static void doClick(By Locatorname) {
		
		driver.findElement(Locatorname).click();
		
	}
	
	

}
