package browsertests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class FirefoxBrowserTest {

    public static void main(String[] args) {

        //Website URL
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        //Setting the drivers
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        //Creating "driver" object
        WebDriver driver = new FirefoxDriver();

        //How to launch the URL in Selenium
        driver.get(baseUrl);

        //Print the current Title of the page
        String title = driver.getTitle();
        System.out.println("The current title is: " + title);

        //Print the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current URL is: " + url);

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("The page source is :" + pageSource);

        //Enter the email in the email field
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        emailField.sendKeys("ccTiwari@hotmail.co.uk");

        //Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys("Asdfghjk12345678");

        //Close the browser
        driver.close();


    }
}
