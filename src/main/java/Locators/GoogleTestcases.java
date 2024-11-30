 package Locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestcases {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By lang=By.xpath("//div[@id='SIvCob']/a");
		
		List<String> languagelist=langTextList(lang);
		System.out.println("Total langauges offered : " + toalLangList(lang));
		System.out.println(languagelist.toString());

		
		
		
	}
	
	public static List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);
	}
	
	
	public static List<String> langTextList(By locator) {
		
		List<String> langText=new ArrayList<String>();
		List<WebElement> langlist=getElements(locator);
		for(WebElement e:langlist) {
			
			langText.add(e.getText());
			
		}
		return langText;
		
	}
	
	
	public static int toalLangList(By locator) {
		
		return langTextList(locator).size();
	}
		

}
