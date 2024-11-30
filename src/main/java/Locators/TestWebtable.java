package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TestWebtable {

    static WebDriver driver;

    public static void main(String[] args) {
        // Set up ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();

        try {
            // Open the application
            driver.get("https://ui.cogmento.com/");
            driver.manage().window().maximize();

            // Log in
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("deepikadr86@gmail.com");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@12345");
            driver.findElement(By.xpath("//div[contains(@class,'submit ')]")).click();

            // Wait for page to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Contacts']")));

            // Navigate to "Contacts"
            driver.findElement(By.xpath("//span[text()='Contacts']")).click();

            // Wait for sidebar collapse
            wait.until(ExpectedConditions.attributeContains(By.id("main-nav"), "class", "collapsed"));

            // Interact with "Briar Carter Carter"
            WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Briar Carter Carter']/parent::td/preceding-sibling::td//input")
            ));
            checkbox.click();

            System.out.println("Checkbox clicked successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
