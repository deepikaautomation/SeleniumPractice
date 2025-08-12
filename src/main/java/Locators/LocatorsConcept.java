package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//1st approach
		//driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		
		
		
		
		By img=By.cssSelector("img.img-responsive");
	    By search=By.name("search");
	    
	    
		
		
		By emailId=By.id("input-email");
		By password=By.id("input-password");
		
		By login=By.xpath("//input[@type='submit']");
		
		//linktest
		By Register=By.linkText("Register");
		
		//partiallinktext
		By forgot=By.partialLinkText("Forgotten");
		
		//tagname
		By newcustomer=By.tagName("h2");
		
		//By login=By.cssSelector("#input-email");
		
		//getElement(emailId).sendKeys("naveen@gmail.com");
		//getElement(password).sendKeys("naveen@123");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		if(eleUtil.isElementDisplayed(img))  System.out.println("Image displayed -Testcase passed");
		if(eleUtil.isElementDisplayed(search)) System.out.println("Search displayed -Testcase passed");
		eleUtil.doSendKeys(emailId,"naveen@gmail.com");
		eleUtil.doSendKeys(password,"naveen@123");
		
		//String cust=driver.findElement(newcustomer).getText();
		
		String cust=eleUtil.getlocatortext(newcustomer);
		System.out.println(cust);
		
		
		
		eleUtil.doClick(login);
		eleUtil.doClick(Register);
		
		//FindElements
		By text=By.className("form-control");
		List<WebElement> listofText=driver.findElements(text);
		
		System.out.println("count ofTextboxes in Regpagre : " + listofText.size());
		
		//getAttribute
		String plhoder=driver.findElement(By.name("firstname")).getAttribute("placeholder");
		System.out.println(plhoder);
		
	}
	
	
	

}
