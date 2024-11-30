package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		
		//multiple attribute 
		   ////input[@name='search' and @type='text']
		
		//Get all the links
		   //a
		
		//xpath with contains and text
		
		//p[contains(text(),'Powered By ')]
		
		//h2[contains(text(),'Returning Customer')] 
		
		
	}

}
