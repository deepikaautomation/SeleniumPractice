package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
    static WebDriver driver;
    
	public static void scrollToElement(WebDriver driver, WebElement element) {
	    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    
	 
	}

	public static void main(String[] args) throws InterruptedException {
	
			
			driver=new ChromeDriver();
			driver.get("https://jqueryui.com/slider/");
			Thread.sleep(5000);
			WebElement frame=driver.findElement(By.className("demo-frame"));
			
			driver.switchTo().frame(frame);
			
			By slider=By.id("slider");
			WebElement sliderEle=driver.findElement(slider);
			
			scrollToElement(driver,sliderEle);
			
			sliderEle.click();
			
			Thread.sleep(5000);
			int width=sliderEle.getSize().getWidth();
			
			Actions act=new Actions(driver);
			
			act.moveToElement(sliderEle, (width/2)-30, 0).build().perform();

	}

}
