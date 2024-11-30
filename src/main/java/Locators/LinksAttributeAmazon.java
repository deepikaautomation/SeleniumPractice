package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttributeAmazon {


	static WebDriver driver;
	ElementUtil eleUtil=new ElementUtil(driver);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();

		driver.get("https://www.amazon.in");

		By linksText=By.tagName("a");
		By img=By.tagName("img");


		System.out.println("countoflinks---   " +  getElements(linksText).size());
		System.out.println("countofImages---   " +  getElements(img).size());
		getElementAttributes(img,"src");
		getElementAttributes(linksText,"href");


		/*
		 * List<WebElement> listText=getElements(linksText); for(WebElement e:listText)
		 * { String linkText=e.getText(); String hrefValue=e.getAttribute("href");
		 * System.out.println(hrefValue + "---->"+linkText);
		 * 
		 * }
		 */

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void getElementAttributes(By locator,String Attrvalue) {
		List<WebElement> eleList=getElements(locator);
		for(WebElement e: eleList) {
			String attrval=e.getAttribute(Attrvalue);
			System.out.println(attrval);
		}
		
		
	}

}
