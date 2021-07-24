package appium_practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Swipe {
	public static void main(String[] args) throws MalformedURLException {
		  
		  
		  DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "moto x4");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("UDID", "ZY224KFCGC");
		  //DC for Android 
		  dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		  dc.setCapability("appActivity", ".TouchScreenTestActivity");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Dimension size=driver.manage().window().getSize();
		  int ht=size.getHeight();
		  int wd=size.getWidth();
		  
		  System.out.println("Height is" +ht);
		  System.out.println("Width is" +wd);
		  
		  
		  
		//Vertical Swipe
		  driver.swipe( wd/2, (int) (ht*0.25), wd/2, (int) (ht*0.80), 1000);

		  // Horizontal swipe
		  driver.swipe((int)(wd*.20), ht/2, (int ) (wd*.80),ht/2, 1000);

}
}
