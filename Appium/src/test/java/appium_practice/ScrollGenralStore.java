package appium_practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ScrollGenralStore {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  
		  
		  DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "moto x4");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("UDID", "ZY224KFCGC");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.androidsample.generalstore");
		  dc.setCapability("appActivity", ".SplashActivity");
		  
		//Appium Server Port no
			 URL url= new URL("http://localhost:4723/wd/hub");
			 
			 AndroidDriver driver = new AndroidDriver(url,dc);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).click();
				scrollToElement(driver, "text", "India");
				
				
				driver.findElement(By.xpath("//android.widget.TextView[@Text='India'")).click();
				
			}
				
				




		  public static void scrollToElement(AndroidDriver driver,String an,String av)
				{
					driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
				}
			

		}
			 
			 
			
			 
			 
			 
			
		  
		  



	
	
	}

}
