package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {
	
	
	//StaleElemennTException
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//DOM is created, V1 version
		WebElement email=driver.findElement(By.id("input-email"));//created in V1 version
		email.sendKeys("resrtyyy");//sending  in V1 version
		
		driver.navigate().refresh();//and when its refreshed DOM becomes V2 version
		//email.sendKeys("after refresh");//and when trying to sendkeys in V2 version by a V1 elemnt,StaleElementException occurs, 
		
		
		 email=driver.findElement(By.id("input-email"));
		email.sendKeys("after refresh");
		//toremove this exception after refresh again use the same elemnt and send keys
        
	}

}
