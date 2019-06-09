package mobileAutomation;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleChrome 
{
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
		cap.setCapability("appPackage", "");
		cap.setCapability("appActivity", "");
		
		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 
		
	}

}
