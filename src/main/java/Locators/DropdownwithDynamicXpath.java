package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownwithDynamicXpath {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.microchip.com/prochiplicensing/#//");
		
		//WebElement dropdown1=driver.findElement(By.xpath("//select[@id='productionYear']"));
		
		WebElement dropdown1=driver.findElement(By.xpath("//label[text()="
				+ "'When is your design planned for production?']/preceding-sibling::select"));
		
		Select select=new Select(dropdown1);
		
		select.selectByVisibleText("2023");

	}

}
