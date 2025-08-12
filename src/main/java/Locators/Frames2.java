package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		
		int frameCount=driver.findElements(By.tagName("frame")).size();
		System.out.println("frame count = " +frameCount);
		
		
		//List<WebElement> frameList=driver.findElements(By.tagName("frame"));
		//frameList.size();
		 
		
		
		//driver.switchTo().frame("content");
		
		//driver.switchTo().frame(4);
		
		WebElement frameEle =driver.findElement(By.xpath("//frame[@name='content']"));
		driver.switchTo().frame(frameEle);
		
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);

	}

}
