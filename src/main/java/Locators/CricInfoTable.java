package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//span[text()='Jordan Hermann']/../../../following-sibling::td//span

				//span[text()='Jordan Hermann']/ancestor::td/following-sibling::td//span
			
		
		driver=new ChromeDriver();
		driver.navigate().
		driver.get("https://www.espncricinfo.com/series/sa20-2022-23-1335268/pretoria-capitals-vs-sunrisers-eastern-cape-final-1343973/full-scorecard");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//span[text()='Phil Salt']/ancestor::td/following-sibling::td//span")).getText();
	String bowlingName=getWicktersName("Jordan Hermann");
	System.out.println(bowlingName);
	}
	 
	
	public static String getWicktersName(String batsman) {
		
		return driver.findElement(By.xpath("//span[text()='"+batsman+"']/ancestor::td/following-sibling::td//span")).getText();
		
	}

}
