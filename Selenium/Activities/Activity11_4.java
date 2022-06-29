package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        String initialWindow = driver.getWindowHandle();
        System.out.println("Initial Window : " + initialWindow);

        driver.findElement(By.id("launcher")).click();
        //1st New tab
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles : " + allWindowHandles);
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        System.out.println("Current window handle : " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("New Tab Title is : " + driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);

        //2nd new tab
        driver.findElement(By.linkText("Open Another One!")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles : " + allWindowHandles);
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        System.out.println("New Tab handle : " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("New Tab Title is : " + driver.getTitle());
        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is : " + newTabText);

        //Close the Browser
        driver.quit();

    }
}
