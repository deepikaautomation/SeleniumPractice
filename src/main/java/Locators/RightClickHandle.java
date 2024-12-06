package Locators;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement  right=driver.findElement(By.cssSelector("span.context-menu-one.btn.btn-neutral"));
		
		Actions act=new Actions(driver);
		act.contextClick(right).build().perform();
		
		List<WebElement> listRightMenu= driver.findElements(By.cssSelector("ul.context-menu-list span"));
		
		
		for(WebElement e:listRightMenu) {
			
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals("Copy")) {
				e.click();
				Thread.sleep(5000);
				alertPopup();
				break;
			}
			
		}
		

	}
	
	
	public static void alertPopup() {
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
	}

}
