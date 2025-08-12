package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExceutorConcept {

	
	
	//There are many feature in browsr where selenium cannot supports
	//JavaScriptExecutor is an interface that helps to excute javascript from your javacode
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("https://freecrm.com/en");

		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//String title=js.executeScript("return document.title ;").toString();
		
		//System.out.println(title);
		
		//js.executeScript("alert ('hi my message');");
		
		JavaScriptUtil ju=new JavaScriptUtil(driver);
		//String mesg=ju.getTitleByJS();
		//System.out.println(mesg);
		
		//ju.alertByJS("Hi Deepika ,JS Alertttt here");
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		
		//WebElement ell=driver.findElement(By.id(":R1al9jsl9fja:"));
		//ju.drawBorder(ell);
		
		ju.scrollDownToMiddleofthePageByJS();
		
		Thread.sleep(5000);
		String innerText=ju.getInnerTextByJS();
		System.out.println(innerText);
		
		
		
		
		
		
		
		
		
	}

}
