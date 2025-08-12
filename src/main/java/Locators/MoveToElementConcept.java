package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how++to+create+menu+with+submenu&o=rec&keyword=&lido=&tipo=0&vis=-1&site=0&codigobanca=");
		WebElement contentMenu=driver.findElement(By.className("menulink"));
		
		Actions act=new Actions(driver);
		
		
		act.moveToElement(contentMenu).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();

	}

}
