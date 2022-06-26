package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : "+pageTitle);

        //Use findElement() to find the checkbox input element.
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        //Use the isDisplayed() method to check if it is visible on the page.
        System.out.println("The checkbox Input is displayed: " +checkboxInput.isDisplayed());
        //Click the "Remove Checkbox".
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        //Print the result of the isDisplayed() method again.
        System.out.println("The checkbox Input is displayed: " +checkboxInput.isDisplayed());

        //Close the browser
        driver.quit();
    }

}















