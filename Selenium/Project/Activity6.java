import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Random;

import java.time.Duration;
import java.util.List;

public class Activity6 {
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
        //To apply for job
        //Navigating to Jobs page
        Random rand = new Random();

        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
        System.out.println("Jobs page title : " +driver.getTitle().trim());
        //Search jobs
        driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Bank");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Search Jobs']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='job_listings']")));
        List<WebElement> items = driver.findElements(By.xpath("//img[@class='company_logo' and @alt='IBM']"));
        int listSize = items.size();
        //Select any jobs from list
        int rand_int1 = rand.nextInt(listSize);
        System.out.println("Size of List : " +rand_int1);
        items.get(rand_int1).click();
        System.out.println("Current page title : " +driver.getTitle().trim());
        //Click on Apply Jobs
        driver.findElement(By.xpath("//input[@class='application_button button' and @value = 'Apply for job' ]")).click();
        //Get the Email Id
        String email = driver.findElement(By.xpath("//a[@class='job_application_email']")).getText().trim();
        System.out.println("Email : " +email);
    }
    @AfterMethod
    public void closeBrowser() {
        //Close browser
        driver.close();
    }
}
