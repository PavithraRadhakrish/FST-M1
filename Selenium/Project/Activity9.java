import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openBrowser() {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open the browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void jobListing() {
        //Login
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        //Get title after login
        driver.findElement(By.id("wp-submit")).click();
        System.out.println("The current page title is : " + driver.getTitle().trim());
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Job Listings place
        WebElement jobListingWebElement = driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]"));
        jobListingWebElement.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Add new job listing
        driver.findElement(By.xpath("//a[text()='Add New' and @class='page-title-action']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Enter job role
        driver.findElement(By.xpath("(//button[contains(@class,'components-button has-icon')])[5]")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String jobPositionTitle = "Manager";
        WebElement positionTxtBx = driver.findElement(By.xpath("//textarea[@id = 'post-title-0']"));
        positionTxtBx.sendKeys(jobPositionTitle);
        //publish
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement publish = driver.findElement(By.xpath("//button[text()='Publish…']"));
        publish.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.findElement(By.xpath("//button[text()='Publish']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        //View job
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='View Job']")));
        driver.findElement(By.xpath("//a[text()='View Job']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Ensure job listing created
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("entry-title")));
        String jobPostTitle = driver.findElement(By.className("entry-title")).getText();
        Assert.assertEquals(jobPostTitle, "Manager");

    }

    @AfterMethod
    public void closeBrowser() {
        //Close browser
        driver.close();
    }
}