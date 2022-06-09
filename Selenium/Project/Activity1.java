import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity1 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openBrowser() {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open the browser
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void getTitle() {
        //Get the title of the website.
        String title = driver.getTitle().trim();
        System.out.println("Title is : " +title);
        //Make sure it matches “Alchemy Jobs – Job Board Application” exactly
        Assert.assertEquals (title, "Alchemy Jobs – Job Board Application");
    }
    @AfterMethod
    public void closeBrowser() {
        //Close browser
        driver.close();
    }

}
