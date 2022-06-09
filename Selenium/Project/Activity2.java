import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Activity2{

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
    public void getHeading() {
        //Get the header of the website.
        String heading = driver.findElement(By.className("entry-title")).getText().trim();
        System.out.println("Heading of webpage : " +heading);
        //Make sure it matches “Welcome to Alchemy Jobs” exactly
        Assert.assertEquals(heading, "Welcome to Alchemy Jobs");
    }
    @AfterMethod
    public void closeBrowser() {
        //Close browser
        driver.close();
    }

}
