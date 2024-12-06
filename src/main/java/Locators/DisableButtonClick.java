package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableButtonClick {
	
	//NoAlertException
	//NoFRameException
	//Nobrowserwindowexcepton
	//NoSuchElementException  occurs when there is no such element in the DOM
	//ElementNotInteractableException 
	//ElementClickInterceptedexception-this occurs when button is disabled
	//InvalidSelectorException occurs when we pass any invalid selectors  like wrong format
	
	//StaleElementException

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
		
		Thread.sleep(5000);
		
		WebElement button=  driver.findElement(By.xpath("/////button[text()='Click Me!']"));

		button.click();
	}

}
