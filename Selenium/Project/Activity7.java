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
import java.util.List;
import java.util.Objects;

public class Activity7 {
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
    public void createNewJobListing() {
        //Click on Jobs link in menu item
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/post-a-job/']")).click();
        String postJobPageTitle = driver.getTitle().trim();
        System.out.println("Current page title : " +postJobPageTitle);

        // Fill form
        String jobTitle = "Test Lead";
        String jobLocation = "Bombay";
        driver.findElement(By.xpath("//input[@id='create_account_email' and @class='input-text']")).sendKeys("muna@gmail.com");
        driver.findElement(By.xpath("//input[@id='job_title' and @class='input-text']")).sendKeys(jobTitle);
        driver.findElement(By.xpath("//input[@id='job_location' and @class='input-text']")).sendKeys(jobLocation);
        driver.findElement(By.xpath("//input[@id='company_name' and @class='input-text']")).sendKeys("IBM");
        String jobType = driver.findElement(By.xpath("//select[@id='job_type' and @class='postform']/option[@selected='selected']")).getText().toString().trim();
        System.out.println("Job Type selected : "+jobType);
        driver.findElement(By.xpath("//input[@id='company_website' and @class='input-text']")).sendKeys("www.ibm.com");
        driver.findElement(By.xpath("//input[@id='application' and @class='input-text']")).sendKeys("https://alchemy.hguy.co/jobs");
        driver.findElement(By.xpath("//iframe[contains(@id, 'job_description_ifr')]")).sendKeys("Applying for job");
        System.out.println("entered values");
        //Preview
        driver.findElement(By.xpath("//input[@value='Preview' and @type='submit']")).click();
        System.out.println("clicked preview");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        System.out.println("Current page title : " +driver.getTitle().trim());

        //Submit Listing
        driver.findElement(By.id("job_preview_submit_button")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        System.out.println("clicked submit");
        System.out.println("Current page title : " +driver.getTitle().trim());

        //Navigate to jobs page
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();

        //Enter search criteria
        driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys(jobTitle);
        driver.findElement(By.xpath("//input[@id='search_location' and @type = 'text']")).sendKeys(jobLocation);

        //Search the job listing
        driver.findElement(By.xpath("//input[@type='submit' and @value='Search Jobs']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        System.out.println("Current page title : " +driver.getTitle().trim());

        //Validate the result
        List<WebElement> items = driver.findElements(By.xpath("//img[@class='company_logo']"));
        for (WebElement item:items){
            String title = driver.findElement(By.xpath("//h3")).getText();
            String location = driver.findElement(By.xpath("//div[@class='location']")).getText();
            String type = driver.findElement(By.xpath("//ul[@class='meta']/li[1]")).getText();
            System.out.println("title from page : "+title);
            System.out.println("location from page : "+location);
            System.out.println("type from page : "+type);

            if ((title.equalsIgnoreCase(jobTitle)) && (location.equalsIgnoreCase(jobLocation)) && (type.equalsIgnoreCase(jobType))){
                System.out.println ("Job posted successfully in Jobs page");
                break;
            }
            else{
                System.out.println ("Job not posted successfully in Jobs page");
                System.out.println ("---------------------------------------");
            }
        }
    }
    @AfterMethod
    public void closeBrowser() {
        //Close browser
        driver.close();
    }
}
