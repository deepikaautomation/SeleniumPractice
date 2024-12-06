package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {

	static WebDriver driver;
	
	public static void scrollToElement(WebDriver driver, WebElement element) {
	    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    
	 
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		WebElement frame=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		
		
		WebElement dragEle=driver.findElement(By.cssSelector("div#draggable"));
		WebElement dropEle=driver.findElement(By.cssSelector("div.ui-widget-header.ui-droppable"));
		System.out.println(dragEle.getText()); 
		
		scrollToElement(driver, dragEle);
		scrollToElement(driver, dropEle);
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		//act.clickAndHold(dragEle).dragAndDrop(dragEle, dropEle).build().perform();
		//act.clickAndHold(dragEle).moveToElement(dropEle).release().build().perform();
		
		act.dragAndDrop(dragEle, dropEle).build().perform();

	}

}
