package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions ;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']"));
        WebElement removeCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        removeCheckboxButton.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        System.out.println("Dynamic Checkbox disabled");
        removeCheckboxButton.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        System.out.println("Dynamic Checkbox enabled");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();


        //Close the browser
        driver.quit();

    }
}
