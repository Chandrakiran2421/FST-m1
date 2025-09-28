package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class project_Activity6 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void pageTitle() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}
	
	@Test
	public void Testcase6() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		WebElement myaccountlink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-1507\"]/a")));
		
		myaccountlink.click();
		
		wait.until(ExpectedConditions.titleContains("My Account"));
		
		String pagetitle= driver.getTitle();
		
		Assert.assertTrue(pagetitle.contains("My Account"), "Title does not contain 'My Account'. Current title: \\" + pagetitle);
		
		WebElement loginbutton = driver.findElement(By.linkText("Login"));
		loginbutton.click();
		
		WebElement username= driver.findElement(By.id("user_login"));
		username.sendKeys("username");
		WebElement password= driver.findElement(By.id("user_pass"));
		password.sendKeys("password");
		
		WebElement login = driver.findElement(By.id("wp-submit"));
		login.click();
		
		 WebElement accountLink = driver.findElement(By.linkText("My Account"));
	        Assert.assertTrue(accountLink.isDisplayed(), "Login failed. 'My Account' link is not visible.");
		
		
		
}
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		if(driver!=null) {
		driver.quit();
		}
	}


}
