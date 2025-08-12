package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeysdPress {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		
		//driver.get("https://www.amazon.ca/Ordinary-Peeling-Solution-30ml-AHA/dp/B071D4D5DT/ref=asc_df_B071D4D5DT?mcid=8626467d09283ecf817f57eb6a5832be&tag=googleshopc0c-20&linkCode=df0&hvadid=706828956917&hvpos=&hvnetw=g&hvrand=11571626837797939765&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000821&hvtargid=pla-404914823242&psc=1&gad_source=1");
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		//act.scrollToElement(driver.findElement(By.className("desktop-searchBar"))).build().perform()
		
		act.sendKeys(Keys.TAB)
		       .pause(100)
		       .sendKeys(Keys.TAB)
		       .pause(100)
		         .sendKeys(Keys.TAB)
		         
		         .sendKeys(Keys.TAB)
		         .sendKeys(Keys.TAB)
		         
		         .sendKeys(Keys.TAB)
		         
		         .sendKeys(Keys.TAB)
		         
		         .sendKeys(Keys.TAB)
		         .sendKeys(Keys.TAB)
		         .sendKeys(Keys.TAB)
		         .sendKeys(Keys.TAB)
		         .sendKeys("Salwar")
		         .pause(500)
		         .sendKeys(Keys.ENTER)
		        
		         
		         .build()
		         .perform();
		         
		       JavasciptUtil jsclass=  new JavScriptUtil(driver);
		       driver.navigate().
		
		

	}

}
