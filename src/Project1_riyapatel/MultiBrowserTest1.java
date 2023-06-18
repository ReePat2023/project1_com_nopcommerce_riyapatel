package Project1_riyapatel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest1 {
    static String browser = "Edge";

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser ");
        }

        //1. Setup Chrome browser
        WebDriver driver = new FirefoxDriver();

        //2. Open the URL into Browser
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        driver.get(baseUrl);

        //3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        //4. Print the current url
        String url = driver.getCurrentUrl();
        System.out.println("Current url is " + url);

        //5. Print the page source
        System.out.println("Page source " + driver.getPageSource());

        //6. Enter the email to email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("reemexperts@gmail.com");

        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("riya123");

        //8. Close the browser
        driver.close();

    }
}