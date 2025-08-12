package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFramesAvailable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
	
			
		
		driver=new ChromeDriver();
		//driver.get("https://authorized:password001@testpages.eviltester.com/styled/auth/basic-auth-results.html");
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		List<WebElement> framesList=driver.findElements(By.xpath("//frame"));
		int frameCount=framesList.size();
		System.out.println(frameCount);
	//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='top.html']")));
	
		By frame=By.cssSelector("frame[src='top.html']");
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		waitframeToBeAvailable(10,frame);
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();
		
	

	}
	
	public static void waitframeToBeAvailable(int timeOut, By locator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		
		
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		
	}
	

}
