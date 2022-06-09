import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity5 {
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
    public void navigateToAnotherPage() {
        //Click on Jobs link in menu item
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
        String jobsPageTitle = driver.getTitle().trim();
        System.out.println("Jobs page title : " +jobsPageTitle);
        //Make sure it matches “Quia quis non” exactly
        Assert.assertEquals(jobsPageTitle, "Jobs – Alchemy Jobs");
    }
    @AfterMethod
    public void closeBrowser() {
        //Close browser
        driver.close();
    }
}
