package Locators;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupAlert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		String username="admin";
		String password="admin";
		
		driver=new ChromeDriver();
		//driver.get("https://authorized:password001@testpages.eviltester.com/styled/auth/basic-auth-results.html");
		
		
		((HasAuthentication)driver).register(()->new UsernameAndPassword(username,password));
		driver.get("https://testpages.eviltester.com/styled/auth/basic-auth-results.html");

	}

}
