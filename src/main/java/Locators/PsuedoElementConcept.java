package Locators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementConcept {
	
	
	//PsuedoElement-which does not have a tag or attributes,this can be locate by usingJavaScriptExceutor
	//convert driver into JavaScriptExecutor
	//elements css selector should not use not xpath
	

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		
		String mand_field=js.executeScript(script).toString();
		System.out.println(mand_field);
		
		if(mand_field.contains("*")) {
			System.out.println("This is a mandatory field");
			
		}

	}

}
