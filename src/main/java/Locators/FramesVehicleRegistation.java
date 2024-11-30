package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesVehicleRegistation {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		WebElement framePath=driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]"));
		//iframe[starts-with(@id,'frame-one')]
		driver.switchTo().frame(framePath);
		
		//#RESULT_TextField-1
		By proposalTitle=By.id("RESULT_TextField-1");
		By location=By.cssSelector("input[name='RESULT_TextField-3'][id='RESULT_TextField-3']");
		By description=By.cssSelector("#RESULT_TextArea-5");
		By upload=By.xpath("//input[@type='file']");
		
		By submit=By.id("FSsubmit");
		
		doSendKeys(proposalTitle,"Testproposal");
		doSendKeys(location,"Trivand");
		doSendKeys(description,"This is the test proposal Selenium");
		doUploadFile(upload,"C:\\Users\\DeepikaDR\\Downloads\\HTTP METHODS.jpg");
		Thread.sleep(3000);
		doClick(submit);
		
		System.out.println("Completed");
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doUploadFile(By locator, String filepath) {
		getElement(locator).sendKeys(filepath);
		
	}
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}

}
