package Activities_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestActivity2 {

	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/target-practice/");
	}
	
	@Test(priority =1)
	public void homePageTest() {
		Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
		}
	@Test(priority =2)
	public void findingButton() {
	WebElement blackbutton =	driver.findElement(By.cssSelector("button.black"));
		Assert.assertTrue(blackbutton.isDisplayed());
		Assert.assertEquals(blackbutton.getText(), "black");
	}
	
	@Test(enabled=false)
	public void Testcase3() {
		String subhedding = driver.findElement(By.linkText("Teal")).getText();
		Assert.assertTrue(subhedding.contains("Teal"));
	}
	@Test
	public void Testcase4() {
		throw new SkipException("skipping the test case");
	}
	@AfterClass
	public void afterMethod() {
		driver.quit();
	}
}
