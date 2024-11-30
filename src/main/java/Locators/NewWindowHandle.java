package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindow=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com");
		System.out.println("child window :  "+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("parent window :  "+driver.getTitle());
	}

}
