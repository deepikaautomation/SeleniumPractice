package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandling {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int headerCount=getHeaderCount();
		int rowCount=getRowCount();
		System.out.println(headerCount);
		System.out.println(rowCount);
		
		//List<WebElement> companyName=driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		
		//for(WebElement e:companyName) {
		//	System.out.println(e.getText());
		//}
		
		List<WebElement> contact=driver.findElements(By.xpath("//table[@id='customers']//td[2]"));
		for(WebElement e:contact) {
			System.out.println(e.getText());
		}
		
		System.out.println("-------------------------------------------------------------");
		//table[@id='customers']/tbody/tr[2]/td[1]
		
		String beforeXpath="//table[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int row=2;row<=rowCount+1;row++) {
			
			String orgXpath=beforeXpath+row+afterXpath;
			String companyName=driver.findElement(By.xpath(orgXpath)).getText();
			System.out.println(companyName);
		}
		
		

	}
	
	public static int getHeaderCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	}

}
