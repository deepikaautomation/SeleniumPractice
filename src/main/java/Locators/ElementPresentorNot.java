package Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementPresentorNot {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By imglogo=By.cssSelector("img.img-responsive");
	    By searchItem=By.name("search");
	    By searcIcon=By.cssSelector("#search > span > button");
	    		
	    
	    if(ispresent(imglogo)) System.out.println("Logo is present:passed");
	   
	    if(ispresent(searchItem)) {
	    	System.out.println("Search is present:passed");
	    	doSendkeys(searchItem,"macbook");
	    	doSearch(searcIcon);
	    };
	    
	    

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean ispresent(By locator) {
		return getElement(locator).isDisplayed();
		
	}
	public static void doSendkeys(By locator , String value) {
		getElement(locator).sendKeys(value);
		
	}
	public static void doSearch(By locator) {
		getElement(locator).click();
	}

}
