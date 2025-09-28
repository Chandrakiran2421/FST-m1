package project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class project_Activity1 {
	WebDriver driver;
	
	@BeforeClass
	public void pageTitle() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}
	@Test
	public void Testcase1() {
		Assert.assertEquals(driver.getTitle(), "Alchemy LMS – An LMS Application");
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		if(driver!=null) {
		driver.quit();
		}
	}

}
