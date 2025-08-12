package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		
		JavaScriptUtil ju=new JavaScriptUtil(driver);
		ju.scrollIntoView(driver.findElement(By.xpath("//h2[text()='System Distribution Details']")));
		
		Thread.sleep(3000);
		
		
		while(true) {
			
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
				
				countryCheck("India");
				//break;
WebElement next=driver.findElement(By.linkText("Next"));
				
				
				if(next.getAttribute("class").contains("disabled")) {
					
					System.out.println("Pagination is over---country not found");
					break;
				}
				next.click();
				
			}
			else {
				Thread.sleep(3000);
				WebElement next=driver.findElement(By.linkText("Next"));
				
				
				if(next.getAttribute("class").contains("disabled")) {
					
					System.out.println("Pagination is over---");
					break;
				}
				next.click();
				//Thread.sleep(5000);
				
			}
		}
		
		//td[text()='Hong Kong']

	}
	public static void countryCheck(String countryname) {
		
		List<WebElement> countrychboxList=driver.findElements(By.xpath("//td[text()='"+countryname+"']/preceding-sibling::td//input[@type='checkbox']"));
		
		
			
			for(int i=0;i<countrychboxList.size();i++) {
				countrychboxList.get(i).click();
				
			}
		
		
		
		//driver.findElement(By.xpath("//td[text()='"+countryname+"']/preceding-sibling::td//input[@type='checkbox']")).click();
		
	}

}
