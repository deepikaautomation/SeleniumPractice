package Locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//By informationlocator=By.xpath("//h5[text()='Information']/following-sibling::ul//a");
		List<String> infoList=getListOfFooter("Information");
		System.out.println("Information --> "  +infoList);
		
		
		
		List<String> custServiceList=getListOfFooter("Customer Service");
		System.out.println("CustomerService --> "  +custServiceList);
		
		
		List<String> extrasList=getListOfFooter("Extras");
		System.out.println("Extras --> "  +extrasList);
		
		
		List<String> myAccList=getListOfFooter("My Account");
		System.out.println("My Account --> "  +myAccList);
	}



	public static List<String> getListOfFooter(String sectionName) {
		
		List<WebElement> footerList=driver.findElements(By.xpath("//h5[text()='" +sectionName+ "']/following-sibling::ul//a"));

		//List<WebElement> footerList=driver.findElements(locator);

		List<String> infoFooterList=new ArrayList<String>();

		for(WebElement e:footerList) {
			String text=e.getText();
			infoFooterList.add(text);


		}
		return infoFooterList;
	}
}


