package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ChromeOptions co=new ChromeOptions();
		 * 
		 * co.addArguments("--headless");
		 * 
		 * WebDriver driver=new ChromeDriver(co);
		 */
		
		
		/*
		 * FirefoxOptions fo=new FirefoxOptions(); fo.addArguments("--headless");
		 * WebDriver driver=new FirefoxDriver(fo);
		 */
		
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--incoginito"
				+ "");
		WebDriver driver=new FirefoxDriver(fo);
		

		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println("title : " + driver.getTitle());
		
	}

}
