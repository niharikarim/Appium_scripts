package appium_practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TapCalc {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  
		  
		  DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "moto x4");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("UDID", "ZY224KFCGC");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.google.android.calculator");
		  dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //find the Elements
		  WebElement digit=driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
		  driver.tap(1, digit, 500);
		  Thread.sleep(1000);
		  WebElement digit2=driver.findElementByAccessibilityId("plus");
		  driver.tap(1, digit2, 500);
		  Thread.sleep(1000);
		  WebElement digit3=driver.findElement(By.id("com.google.android.calculator:id/digit_9"));
		  driver.tap(1, digit3, 500);
		  Thread.sleep(1000);
		  WebElement Equals=driver.findElement(By.xpath("//android.widget.Button[@content-desc='equals']"));
		  driver.tap(1, Equals, 500);
		  Thread.sleep(1000);
		  String result=driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		  Thread.sleep(1000);
		  System.out.println(result);

}
}
