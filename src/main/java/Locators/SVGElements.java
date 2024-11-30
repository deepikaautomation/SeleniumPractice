package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {
	
	
	//Total no of svg elements in Xpath
	
	//*[local-name()='svg']

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			
		
		driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		By framePath=By.xpath("//iframe[starts-with(@id,'map-instance')]");
		
		driver.switchTo().frame(driver.findElement(framePath));
		
		By svgPath=By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']");
		List<WebElement> statesList=driver.findElements(svgPath);
		
		System.out.println(statesList.size());
		
		for(WebElement e:statesList) {
			
			String stateName=e.getAttribute("name");
			System.out.println(stateName);
			if(stateName.equals("Utah")) {
				e.click();
			}
		}

	}

}
