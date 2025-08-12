package Locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());   
		alt.accept();
		
		String expectedText="You successfully clicked an alert";
		String actualString=driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText();
		
	if(actualString.contains(expectedText)) {
		  System.out.println("Testcase successfull");
	}
		//String alttext=alt.getText();
		//System.out.println(alttext);

	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	Alert alt1=driver.switchTo().alert();
	
	System.out.println(alt1.getText()); 
	alt1.dismiss();
	String actual1String=driver.findElement(By.xpath("//p[text()='You clicked: Cancel']")).getText();
	System.out.println(actual1String);
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert alt2=driver.switchTo().alert();
	System.out.println(alt2.getText())    ;
	
	alt2.sendKeys("Test promptalert");
	alt2.accept();
	
	
	
	}
	
	

}
