package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://training-support.net/selenium/tables");
    String pageTitle = driver.getTitle();
    System.out.println("The Page Title : "+pageTitle);


    List<WebElement> columns = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
    System.out.println("Number of columns are : " + columns.size());
    List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
    System.out.println("Number of rows are : " + rows.size());

    WebElement beforeCellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
    System.out.println("Second row and second column value before sorting : " + beforeCellValue.getText());

    driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();

    WebElement afterCellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
    System.out.println("Second row and second column value after sorting : " + afterCellValue.getText());

    WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
    System.out.println("Table Footer values : " + footer.getText());

    //Close browser
    driver.quit();

    }
}
