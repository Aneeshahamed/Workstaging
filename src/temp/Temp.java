package temp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Temp 
{
	String path = System.setProperty("webdriver.chrome.driver","E:\\Automation\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	WebDriverWait wait20 = new WebDriverWait(driver, 40);
	@Test(priority = 1)
	public void Login() throws Exception
	{
		driver.get("https://allworkjob.com/data/copy-paste-day1-data1/");
		driver.manage().window().maximize();
		char Parent_Data= '2';
		List <WebElement> L1 = driver.findElementsByXPath("//a[contains(text(),'DAY')]");
		for(int i = 1; i<=L1.size(); i++)
		{
			String Child_DAY = driver.findElement(By.xpath("//a[.=\"DAY "+(+i)+"\"]")).getText(); 
			if(Child_DAY.equalsIgnoreCase("DAY 4"))
			{
				System.out.println("Day = "+Child_DAY);
				WebElement Choose_DAY = driver.findElement(By.xpath("//a[.='"+(Child_DAY)+"']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", Choose_DAY);
				WebElement Choose_DAY_DATE = driver.findElement(By.xpath("//a[.='Day"+(+i)+" Copy data "+(Parent_Data)+"'] | //a[.='day"+(+i)+" copy data "+(Parent_Data)+"']"));
				Choose_DAY_DATE.click();
				break;
			}
		}
		int i = 7;
		String Page_Title = "COPY PASTE";
		String Parent_Day= "6";
		//String Parent_Data = "8";
		String PreData = "Copy paste Day"+Parent_Day+" data"+Parent_Data+" – data";
		if(Page_Title.equalsIgnoreCase("COPY PASTE") || (Page_Title.equalsIgnoreCase(PreData)))
		{
			System.out.println(PreData);
			if(PreData.equals("Copy paste Day6 data8 – data"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("Failed in 2nd condition");
			}
		}
		else
		{
			System.out.println("failed");
		}
		i = --i;
		System.out.println("Loop = "+i);
		
		
	}
	@AfterTest
	public void close() throws InterruptedException
	{
//		Thread.sleep(1000*5);
//		driver.quit();
	}

}
