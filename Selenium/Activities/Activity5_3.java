package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : "+pageTitle);

        //Use findElement() to find the checkbox input element.
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        //Use the isSelected() method to check if it is visible on the page.
        System.out.println("The TextBox Input is enabled: " +textBox.isEnabled());
        //Click the "Enable Input".
        driver.findElement(By.id("toggleInput")).click();
        //Print the result of the isSelected() method again.
        System.out.println("The TextBox Input is enabled: " +textBox.isEnabled());

        //Close the browser
        driver.quit();
    }
}
