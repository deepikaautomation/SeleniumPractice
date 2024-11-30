package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	static WebDriver driver;
	public static void main(String[] args)  {
	
			
		
		driver=new ChromeDriver();
		//driver.get("https://authorized:password001@testpages.eviltester.com/styled/auth/basic-auth-results.html");
		
		driver.get("https://combine-pdf-online.pdffiller.com/?keyword=how%20to%20upload%20files%20together&campaignid=73502298&adgroupid=4816223858&msclkid=fbde78ecafe71e7443a41fa9ed7aa3ab&utm_source=bing&utm_medium=cpc&utm_campaign=Merge"
				+ "&utm_term=how%20to%20upload%20files%20together&utm_content=Combine%20PDF");
		
		WebElement fileUpload=driver.findElement(By.cssSelector("input[type='file']"));
		fileUpload.sendKeys("C:\\Users\\DeepikaDR\\Downloads\\HTTP METHODS.jpg");
	}

}
