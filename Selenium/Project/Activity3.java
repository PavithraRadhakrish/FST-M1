import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity3 {
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
    public void getUrlOfHeaderImage() {
        //Get the URL of the Header image.
        String imageUrl = driver.findElement(By.xpath("//div[@class='post-thumb-img-content post-thumb']//img[1]")).getAttribute("src");
        System.out.println("URL of Header image : " +imageUrl);

    }
    @AfterMethod
    public void closeBrowser() {
        //Close browser
        driver.close();
    }
}
