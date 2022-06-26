package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        WebElement userName = driver.findElement(By.xpath("//input[contains(@class, 'username')]"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
        password.sendKeys("password");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("action-confirmation"))));
        String loginMsg = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message : " + loginMsg);

        //Close the browser
        driver.quit();
    }
}
