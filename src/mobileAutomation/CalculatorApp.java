package mobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorApp {

	WebDriver driver;
	@Test
	public void Launch() throws Exception
	{
		//Configuration
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy On6");
		cap.setCapability("udid", "32006e18f03e5543");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		//App info
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.storefront.StorefrontActivity");
		
		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 Thread.sleep(1000*8);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]")).click();
		 Thread.sleep(1000*8);
		 driver.quit();
		
	}

}
