package Activities_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TestActivity7 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void Loadhomepage() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
	}
	@DataProvider(name="Credentials")
	public static Object[][] creds(){
		return new Object[][] {
			{}
		};
		
	}
	

}
