package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
	
			
		
		driver=new ChromeDriver();
		//driver.get("https://authorized:password001@testpages.eviltester.com/styled/auth/basic-auth-results.html");
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		List<WebElement> framesList=driver.findElements(By.xpath("//frame"));
		int frameCount=framesList.size();
		System.out.println(frameCount);
	driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='top.html']")));
	
	String header=driver.findElement(By.tagName("h2")).getText();
	System.out.println(header);
	
	driver.switchTo().defaultContent();
		//Thread.sleep(3000);
	     //for(int i=0;i<frameCount;i++) {
	    	 //if(framesList.get(i).getAttribute("name") .equals("main")) {
	    	//	 driver.switchTo().frame(i);fgfgfg
	    		 
	    		 
	    	// }
	    	 
	     }
	
	
	//https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/
	}


