package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver=driver;

	}

	public  WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public  void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();

	}

	public String  getlocatortext(By locator) {
		return getElement(locator).getText();

	}

	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	} 

	
	//********Select based Dropdown Utils *********************/ 
	public  void doSelectDropdownByIndex(By locator,int index) {

		Select select=new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public  void doSelectDropdownByValue(By locator,String value) {

		Select select=new Select(getElement(locator));
		select.selectByValue(value);

	}

	public  void doSelectDropdownByVisibleText(By locator,String text) {

		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);

	}
	
	
	//*************ActionSendKeys
	
	public  void doActionSendKeys(By locator,String text) {
		Actions act=new Actions(driver);
		
		act.sendKeys(getElement(locator),text).build().perform();
		
	}
	
	public  void doActionClick(By locator) {
		Actions act=new Actions(driver);
		
		act.click(getElement(locator)).build().perform();
		
	}

}
