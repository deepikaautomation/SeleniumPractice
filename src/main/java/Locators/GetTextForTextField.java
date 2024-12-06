package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForTextField {
	
	
	//.getText field donot work for Textfield
	
	//illegal argumentexception occurs when we pass null in send keys

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement fn=driver.findElement(By.id("input-firstname"));
		
		fn.sendKeys("Deepika ");
		
		String valueFN=fn.getAttribute("value");
		
		System.out.println(valueFN);
		
		WebElement ln=driver.findElement(By.id("input-lastname"));
        ln.sendKeys();
	}

}
