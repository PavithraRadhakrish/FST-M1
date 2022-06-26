package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");
        System.out.println("Page title : " + driver.getTitle().toString().trim());

        //Find using id
        WebElement id = driver.findElement(By.id("about-link"));
        System.out.println("Text in element : " + id.getText());

        //Find using className
        WebElement className = driver.findElement(By.className("green"));
        System.out.println("Text in element : " + className.getText());

        //Find using cssSelector
        WebElement css = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element : " + css.getText());

        //Find using linkText
        WebElement linkText = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element : " + linkText.getText());

        //Close the browser
        driver.close();
    }
}
