package activities;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 implements  org.testng.IReporter,org.testng.ITestListener{
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        Reporter.log("Start Test | ");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Browser Opened | ");
        wait = new WebDriverWait(driver, 10);
        Reporter.log("Page title is " + driver.getTitle() + " | ");
    }

    @Test(priority = 0)
    public void simpleAlertTestCase() {
        Reporter.log("simpleAlertTestCase() started |");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert opened |");
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Focus switched to alert |");
        String alertText = simpleAlert.getText();
        Reporter.log("Alert text is : " + alertText + " |");
        Assert.assertEquals("This is a JavaScript Alert!", alertText);
        simpleAlert.accept();
        Reporter.log("Alert closed");
        Reporter.log("Test case ends |");
    }

    @Test(priority = 1)
    public void confirmAlertTestCase() {
        Reporter.log("confirmAlertTestCase() started | ");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Confirm Alert opened | ");
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched focus to alert | ");
        String alertText = confirmAlert.getText();
        Reporter.log("Alert text is: " + alertText + " | ");
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);
        confirmAlert.accept();
        Reporter.log("Alert closed | ");
        Reporter.log("Test case ended | ");
    }

    @Test(priority = 2)
    public void promptAlertTestCase() {
        Reporter.log("promptAlertTestCase() started |");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened |");
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");
        String alertText = promptAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");
        promptAlert.sendKeys("Awesome!");
        Reporter.log("Text entered in prompt alert |");
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);
        promptAlert.accept();
        Reporter.log("Alert closed | ");
        Reporter.log("Test case ended |");
    }

    @AfterClass
    public void tearDown() {
        Reporter.log("End Test | ");
        driver.quit();
    }
}
