package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegPageTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
	
	driver=new ChromeDriver();
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	By firstName=By.id("input-firstname");
	By lastName=By.id("input-lastname");
	By email=By.id("input-email");
	By telephone=By.id("input-telephone");
	By password=By.id("input-password");
	By confPassword=By.id("input-confirm");
	
	ElementUtil eleUtil=new ElementUtil(driver);
	eleUtil.doSendKeys(firstName, "Deepika");
	eleUtil.doSendKeys(lastName, "Mahesh");
	eleUtil.doSendKeys(email, "deepikdr86@gmail.com");
	eleUtil.doSendKeys(telephone, "645643643645");
	eleUtil.doSendKeys(password, "deepmahesh");
	eleUtil.doSendKeys(confPassword, "deepmahesh");
	
	
	}
	

}
