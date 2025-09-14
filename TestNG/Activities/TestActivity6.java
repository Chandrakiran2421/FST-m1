package Activities_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class TestActivity6 {
	WebDriver driver;
	
	@BeforeClass
	public void homePageTest() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
	}
	

}
