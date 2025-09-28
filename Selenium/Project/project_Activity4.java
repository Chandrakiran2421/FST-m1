package project;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class project_Activity4 {
WebDriver driver;
@BeforeClass
public void pageTitle() {
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/lms/");
}
@Test 
public void Testcase4() {
	List<WebElement> popularCourses=driver.findElements(By.xpath("//h3[@class='entry-title']"));
	String second_popular=popularCourses.get(1).getText();
	Assert.assertEquals(second_popular, "Email Marketing Strategies");
	
}
@AfterClass(alwaysRun=true)
public void tearDown() {
	if(driver!=null) {
	driver.quit();
	}
}
}
