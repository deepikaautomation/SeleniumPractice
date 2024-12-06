package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
		
	//	By svgforCountyList=By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='subregion']//*[name()='path']");
		Actions act=new Actions(driver);
		
		
		for(WebElement e:statesList) {
			
			String stateName=e.getAttribute("name");
			System.out.println(stateName);
			if(stateName.equals("Florida")) {
				Thread.sleep(5000);
				int x=e.getSize().getWidth();
				int y=e.getSize().getHeight();
				System.out.println( x  + " " + y);
				Thread.sleep(5000);
			   act.moveToElement(e, (x/2)-40, 0).click().build().perform();
						break;
				
				
				//e.click();
				//statesList=driver.findElements(svgPath);
			
			}
		}
		
		Thread.sleep(5000);
		By svgforCountyList=By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='subregion']//*[name()='path']");
		
		List<WebElement> countyList=driver.findElements(svgforCountyList);
		System.out.println(countyList.size());
			for(WebElement e:countyList) {
			
			String countyName=e.getAttribute("name");
			System.out.println(countyName);
			}
			
	}

}
