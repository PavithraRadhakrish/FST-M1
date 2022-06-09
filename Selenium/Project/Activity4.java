import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity4 {

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
    public void getSecondHeading() {
        //Get the header of the website.
        String secondHeading = driver.findElement(By.xpath("//div[@class='entry-content clear']//h2[1]")).getText().trim();
        System.out.println("Second heading of webpage : " +secondHeading);
        //Make sure it matches “Quia quis non” exactly
        Assert.assertEquals(secondHeading, "Quia quis non");
    }
    @AfterMethod
    public void closeBrowser() {
        //Close browser
        driver.close();
    }
}
