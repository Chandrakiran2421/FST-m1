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

public class project_Activity5 {
WebDriver driver;
WebDriverWait wait;

@BeforeClass
public void pageTitle() {
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/lms/");
}

@Test
public void Testcase5() {
	wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
	WebElement myaccount=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-1507\"]/a")));
	
	myaccount.click();
	
	wait.until(ExpectedConditions.titleContains("My Account"));
	
	String title=driver.getTitle();
	System.out.println(title);
	
	Assert.assertTrue(title.contains("My Account"), "Title does not contain 'My Account'. Current title: \\" + title);
	
	
}
@AfterClass(alwaysRun=true)
public void tearDown() {
	if(driver!=null) {
	driver.quit();
	}
}
}
