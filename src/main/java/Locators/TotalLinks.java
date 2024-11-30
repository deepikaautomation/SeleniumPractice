package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		By links=By.tagName("a");
		
		List<WebElement> listofLinks=driver.findElements(links);
		
		System.out.println("Link Counts : "  + listofLinks.size());
		
		/* For each*/
		int count=0;
		for(WebElement e:listofLinks) {
			String linktext=e.getText();
			
			if(linktext.length()>0) {
			System.out.println(count + " : " + e.getText());
		}
			count++;
		}
		 
		
	
	}

}
