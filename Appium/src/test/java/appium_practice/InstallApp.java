package appium_practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class InstallApp {
	
	public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities dc = new DesiredCapabilities();
	  // Common DC (Android or IOS)
	  dc.setCapability("deviceName", "moto x4");  
	  dc.setCapability("automationName", "appium");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("UDID", "ZY224KFCGC");
	   //uninstall app
	  dc.setCapability("app","C:\\Users\\Lenovo\\Videos\\study material\\Touch Screen Test_v1.7.14_apkpure.com.apk");
	  
	  // Appium Server Port No.
	  URL url = new URL("http://localhost:4723/wd/hub");
	  
	  AndroidDriver driver = new AndroidDriver(url, dc);

	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
}
