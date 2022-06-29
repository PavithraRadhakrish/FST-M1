package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/popups");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign In']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(signInButton).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = signInButton.getAttribute("data-tooltip");
        System.out.println("Tooltip text of the button : " + tooltipText);
        signInButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        System.out.println(driver.findElement(By.id("action-confirmation")).getText());

        //Close browser
        driver.quit();

    }
}
