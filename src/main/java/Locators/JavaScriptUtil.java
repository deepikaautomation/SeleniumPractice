package Locators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {


	private WebDriver driver;

	public JavaScriptUtil(WebDriver driver) {

		this.driver=driver;


	}

	public String  getTitleByJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		return js.executeScript("return document.title ;").toString();

	}

	public void  goBackByJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("history.go(-1)").toString();

	}
	
	public void  goForwardByJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("history.forward(1) ;").toString();

	}
	
	public void  refreshBrowserByJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("history.go(0) ;").toString();

	}
	
	public void  alertByJS(String msg) {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("alert('" + msg + "')");

	}
	
	public String  getInnerTextByJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		
		return js.executeScript("return document.documentElement.innerText;").toString();

	}
	
	public void  drawBorder(WebElement ele) {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		
	   js.executeScript("arguments[0].style.border='3px solid red';",ele);

	}
	
	public void  scrollPageDownByJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight;");// this means scroll from top to bottom  that is start from 0 to bottom of the page

	}
	
	public void  scrollPageUpByJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		
	   js.executeScript("window.scrollTo(document.body.scrollHeight,0;");// this means scroll from bottom to top  that is start from bottom to 0 of the page

	}
	
	public void  scrollPageDownByJS(String height) {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		
	   js.executeScript("window.scrollTo(0,  '" +height + "';");// this means scroll from bottom to top  that is start from bottom to 0 of the page

	}
	
	public void  scrollDownToMiddleofthePageByJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight/2);");// this means scroll from bottom to top  that is start from bottom to 0 of the page

	}
	
	public void  scrollIntoView(WebElement ele) {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		
	   js.executeScript("arguments[0].scrollIntoView(true);",ele);

	}
	
	public void  clickElementByJS(WebElement ele) {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		
	   js.executeScript("arguments[0].click();",ele);

	}

}
