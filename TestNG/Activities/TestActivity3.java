package Activities_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestActivity3 {
	
	
	WebDriver driver;
	@BeforeTest
	public void homePageTest() {
	driver = new FirefoxDriver();
	driver.get(" https://training-support.net/webelements/login-form/");
	}
	
	@Test(priority=1)
	public void Testcase1() {
		Assert.assertEquals(driver.getTitle(), "Selenium: Login Form");
	}
	@Test(priority =2)
	public void Testcase2(){
		WebElement username= driver.findElement(By.id("username"));
		WebElement password= driver.findElement(By.id("password"));
		
		Assert.assertTrue(username.isDisplayed());
		Assert.assertTrue(password.isDisplayed());
	}
	@Test(priority=3)
	public void Testcase3() {
		WebElement username= driver.findElement(By.id("username"));
		WebElement password= driver.findElement(By.id("password"));
		username.sendKeys("admin");
		password.sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String login_message = driver.findElement(By.cssSelector("h2.text-center")).getText();
		Assert.assertEquals("Welcome Back, Admin!", login_message);
	}
	@AfterTest
	public void endtest() {
		driver.quit();
	}
}
