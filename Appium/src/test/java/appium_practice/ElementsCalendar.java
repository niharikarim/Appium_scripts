package appium_practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ElementsCalendar {
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
		  driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
		  Thread.sleep(1000);
		  driver.findElementByAccessibilityId("plus").click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//android.widget.Button[@content-desc='equals']")).click();
		  Thread.sleep(1000);
		  String result=driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		  Thread.sleep(1000);
		  System.out.println(result);

}
}
