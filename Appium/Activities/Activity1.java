package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Activity1 {

    AndroidDriver<MobileElement> androidDriver;
    WebDriverWait wait;

    @BeforeClass
    public void initialize() throws MalformedURLException {
         DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setCapability("deviceName","Pavi Redmi");
         capabilities.setCapability("platformName", "Android");
         capabilities.setCapability("automationName", "UiAutomator2");
         capabilities.setCapability("appPackage", "com.miui.calculator");
         capabilities.setCapability("appActivity", ".cal.CalculatorActivity");
         URL appServer = new URL("http://localhost:4723/wd/hub");
         androidDriver = new AndroidDriver(appServer, capabilities);
        capabilities.setCapability("noReset", true);

     }

     @Test
    public void multiplication(){
        //Line 34 to close the calculator app's privacy statement
        androidDriver.findElementById("android:id/button1").click();
        androidDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        androidDriver.findElementById("btn_9_s").click();
         androidDriver.findElementByAccessibilityId("multiply").click();
         androidDriver.findElementById("btn_9_s").click();
         androidDriver.findElementByAccessibilityId("equals").click();
         String resultValue = androidDriver.findElement(MobileBy.id("result")).getText().replace("= ","");
         Assert.assertEquals(resultValue,"81");

     }

     @AfterClass
    public void quit(){
        androidDriver.quit();
     }


}
