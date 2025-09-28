package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class project_Activity3 {
WebDriver driver;

@BeforeClass
public void pageTitle() {
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/lms/");
}
@Test 
public void Testcase3() {
	WebElement Header2=driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']"));
	Assert.assertEquals(Header2.getText(), "Actionable Training");
}

@AfterClass(alwaysRun=true)
public void tearDown() {
	if(driver!=null) {
	driver.quit();
	}
}
}
