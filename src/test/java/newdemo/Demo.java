package newdemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo 
{
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///F:/New%20folder/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();								 
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

	@Test          // verifying Logo displayed 
	public void test1() throws IOException
	{
		boolean Logo = driver.findElement(By.xpath("/html/body/div/center/img")).isDisplayed();
		Assert.assertEquals(Logo, "Logo not displayed");
	}
}
