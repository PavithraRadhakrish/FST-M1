package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println (driver.getTitle().toString().trim());

        driver.findElement(By.id("firstName")).sendKeys("Pavithra");
        driver.findElement(By.id("lastName")).sendKeys("Radhakrishnan");
        driver.findElement(By.id("email")).sendKeys("rpavithra@gmail.com");
        driver.findElement(By.id("number")).sendKeys("9940523620");
        driver.findElement(By.xpath("//input[@value='submit']")).click();

        Thread.sleep(5);

        // Close the browser
        driver.quit();
    }
}
