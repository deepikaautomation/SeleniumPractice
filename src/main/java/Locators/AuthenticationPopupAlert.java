package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupAlert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://authorized:password001@testpages.eviltester.com/styled/auth/basic-auth-results.html");

	}

}
