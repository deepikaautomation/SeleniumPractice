package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class BigBasketLevelHandling {

	

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		Thread.sleep(3000);
		//WebElement l1ShopByCat=driver.findElement(By.xpath("//div[@class='relative h-full']/button[contains(@id,'headlessui-menu-button')]"));
		
		//By svgShopByCat=By.xpath("//*[local-name()='svg' and @class='CategoryMenu___StyledArrowDown-sc-d3svbp-3 iwTeGC transform rotate-180']");
		//Thread.sleep(5000);
		
		WebElement ele=driver.findElement(By.xpath("(//div[@class='QuickSearch___StyledMenuButton-sc-rtz2vl-1 dpuSIx'])[2]"));
		By button=By.xpath("//*[@id='headlessui-menu-button-:Rn69b6:']");
		//WebElement ee=driver.findElement(button);
		Thread.sleep(5000);
		driver.findElement(with(button).toLeftOf(ele)).click();
		
		//ee.click();
		//Actions act=new Actions(driver);
		
		//act.moveToElement(ee).click().build().perform();
		
		
		
		//WebElement veges=driver.findElement(By.linkText("Exotic Fruits & Veggies"));
		//WebElement shopCat=driver.findElement(with(svgShopByCat).toLeftOf(veges));
		//Thread.sleep(5000);
		//shopCat.click();
	
	}

}
