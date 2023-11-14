package opensourcedemo;
/**
 * Project-2 - ProjectName : com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Forgot your password?’ link.
 * 7. Print the current url.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email to email field.
 * 11. Enter the password to password field.
 * 12. Click on Login Button.
 * 13. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class OpenSourceDemo {

    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) throws InterruptedException {
        // Which browser to launch using if else
        // EqualsIgnoreCase ignores upper case or lower case
        if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else {
            System.out.println("Invalid browser name");
        }

        //Getting baseUrl
        driver.get(baseUrl);
        //maximizing the window
        driver.manage().window().maximize();
        //Implicit wait of 10s
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Printing title of the page
        System.out.println("The title is: " + driver.getTitle());

        //Printing Current Url
        System.out.println("The Current URL is: " +driver.getCurrentUrl());

        //Printing the page source
        System.out.println("The page source is: " +driver.getPageSource());

        Thread.sleep(2000);

        //Click on Forgot your password link
        driver.findElement(By.className("orangehrm-login-forgot")).click();

        Thread.sleep(2000);

        //Printing current Url
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);

        //Navigate back to the login page
        driver.navigate().back();

        //Pausing the activity
        Thread.sleep(2000);

        //Refresh the page
        driver.navigate().refresh();

        Thread.sleep(2000);

        //Enter email to email field
        driver.findElement(By.name("username")).sendKeys("Mahak");

        //Enter password to the password field
        driver.findElement(By.name("password")).sendKeys("Mahak123");

        Thread.sleep(2000);

        //Click on login button
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        //Closing the browser
        driver.quit();
    }
}
