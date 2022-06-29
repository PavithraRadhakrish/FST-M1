package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Text is : "+promptAlert.getText());
        promptAlert.sendKeys("Yes, you are!");
        promptAlert.accept();

        //Close the Browser
        driver.quit();

    }
}
