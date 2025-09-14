package Activities_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class TestActivity1 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net");
	}
		@Test(priority=1)
		public void homePageTest() {
		Assert.assertEquals(driver.getTitle(),"Training Support");	
		driver.findElement(By.linkText("About Us")).click();
		}
		
		@Test(priority=2)
		public void nextPageTest() {
			Assert.assertEquals(driver.getTitle(),"About Training Support");
		}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
		
		
		
}

