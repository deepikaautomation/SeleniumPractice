package Locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementFromPageSection {
	static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	//	List<WebElement> panelink=driver.findElements(By.xpath("//aside[@id='column-right']//a"));

		//System.out.println(panelink.size());
		//for(WebElement e:panelink) {

		//System.out.println(e.getText());
	//}
		
		By panelLink=By.xpath("//aside[@id='column-right']//a");
		By footerLink=By.xpath("//footer/div/div/div[@class='col-sm-3']/ul/li/a");
		List<String> rightEleList=getElementsTextList(panelLink);
		System.out.println(rightEleList);
		System.out.println(rightEleList.contains("Login"));
		
		List<String> footerElemList=getElementsTextList(footerLink);
		System.out.println(footerElemList);
		System.out.println(footerElemList.contains("Gift Certificates"));
		
	}



	public static List<String> getElementsTextList(By locator) {

		List<String> eleTextList=new ArrayList<String>();

		List<WebElement> eleList=getElements(locator);

		for(WebElement e:eleList) {

			String test=e.getText();
			eleTextList.add(test);
		}
		return eleTextList;
		
		
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
