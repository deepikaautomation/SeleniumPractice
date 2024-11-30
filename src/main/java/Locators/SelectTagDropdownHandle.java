package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropdownHandle {
	
	static WebDriver driver;
	
	
	//m1-  click on a specific langauge link min google
	//m2 - return the list of lang links
	//m3 -capturer the l;ist of google footer links    //div[@jscontroller='NzU6V']/div/a
	
	public static void main(String args[]) throws InterruptedException {
		
		driver=new ChromeDriver();
		//driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		driver.navigate().to("https://orangehrm.com/en/30-day-free-trial");
		By country=By.id("Form_getForm_Country");
		
		
		doSelectDropdownByIndex(country,1);
		
		Thread.sleep(2000);
		doSelectDropdownByValue(country,"Belgium");
		Thread.sleep(2000);
		doSelectDropdownByVisibleText(country,"India");
		
		
		WebElement country_ele  =driver.findElement(country);
		
		Select select= new Select(country_ele);
		List<WebElement> countyList=select.getOptions();
		int countcountry=countyList.size();
		for(WebElement e:countyList) {
			String text=e.getText();
			if(text.equals("Brazil")) {
				e.click();
				break;
			}
			
		}
		//select.selectByValue("India");
		//select.selectByVisibleText("Canada");
	
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
	public static void doSelectDropdownByIndex(By locator,int index) {
		
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
				
	}
	
	public static void doSelectDropdownByValue(By locator,String value) {
		
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
				
	}
	
	public static void doSelectDropdownByVisibleText(By locator,String text) {
		
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
				
	}
	
	public static  List<WebElement> getDropDownOptionsList(By locator) {
		
		Select select=new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static int getTotalDropDownOptions(By locator){
		return getDropDownOptionsList(locator).size();
		
		
	}
}
