package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	
	//img[@alt='View aqi Data']/following-sibling::span
	
	//CSSS FOR  IMMEDIATE SIBLING USING + SIGN        ---->img[alt='View aqi Data']+span      
	
	//CSS for fetching allthe forward sibling  --> nav[class='navs w-full lg:w-fit']~hr
	
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
		
				
			
			driver=new ChromeDriver();
			driver.get("https://www.aqi.in/");
			//driver.get("https://www.aqi.in/dashboard/canada/ontario/ottawa");
			
			By eleAQI=By.xpath("//img[@alt='View aqi Data']/following-sibling::span");
			
			String aqiLevel=driver.findElement(with(By.xpath("//div[contains(@class,'gap-[0.5rem]')]/span[contains(@class,'text-[6rem] lg:text-[8.5rem]')]")).below(eleAQI)).getText();
			System.out.println("Live AQI -->" +aqiLevel);
			
			
			By loginPath=By.xpath("//span[text()='Login']");
			Thread.sleep(3000);
			String lightMode=driver.findElement(with(By.cssSelector("button[aria-label='Switch Dark Mode']")).toLeftOf(loginPath)).getText();
			System.out.println("Light Mode -->" +lightMode);
			
			
			By mostPollutedCities=By.xpath("//p[contains(text(),'New Delhi')]");
			Thread.sleep(5000);
			String rankingByPollut=driver.findElement(with(By.tagName("p")).toLeftOf(mostPollutedCities)).getText();
			
			System.out.println("Ranking interms of Pollution -->" +rankingByPollut);
			
			System.out.println(driver.findElement(with(By.tagName("p")).near(mostPollutedCities)).getText());
			System.out.println(driver.findElement(with(By.tagName("a")).near(mostPollutedCities)).getText());

	}

}
