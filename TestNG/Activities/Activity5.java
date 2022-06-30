package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(groups = {"HeaderTests", "ButtonTests"})
    public void pageTitle() {
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test (dependsOnMethods = {"pageTitle"}, groups = {"HeaderTests"})
    public void HeaderTest1() {
        WebElement thirdHeader = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(thirdHeader.getText(), "Third header");
    }

    @Test (dependsOnMethods = {"pageTitle"}, groups = {"HeaderTests"})
    public void HeaderTest2() {
        WebElement fifthHeader = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(fifthHeader.getCssValue("color"), "rgb(251, 189, 8)");
    }

    @Test (dependsOnMethods = {"pageTitle"}, groups = {"ButtonTests"})
    public void ButtonTest1() {
        WebElement oliveButton = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(oliveButton.getText(), "Olive");
    }

    @Test (dependsOnMethods = {"pageTitle"}, groups = {"ButtonTests"})
    public void ButtonTest2() {
        WebElement firstButtonColor = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(firstButtonColor.getCssValue("color"), "rgb(255, 255, 255)");
    }

    //Include alwaysRun property on the @AfterTest
    //to make sure the page closes
    @AfterTest(alwaysRun = true)
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
