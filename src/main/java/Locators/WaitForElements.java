package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footer=By.cssSelector("footer a");
		
		
		List<WebElement> footerList=waitpresenceOfAllElements(10,footer);
		
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//List<WebElement> footerList=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
		//List<WebElement> footerList=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
	    System.out.println(footerList.size());
	
	    for(WebElement e:footerList) {
	    	 System.out.println(e.getText());
	    }
	    System.out.println("/*************/");
	    
	    List<WebElement> footerList1=waitvisibilityOfAllElements(20,footer);
	    
	    for(WebElement e:footerList1) {
	    	 System.out.println(e.getText());
	    }
	}
	
	public static List<WebElement> waitpresenceOfAllElements(int timeOut, By locator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
	}
	
	public static List<WebElement> waitvisibilityOfAllElements(int timeOut, By locator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
	}

}
