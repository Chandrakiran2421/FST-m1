package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class project_Activity2 {
WebDriver driver;

@BeforeClass
public void pageTitle() {
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/lms/");
}
@Test
public void Testcase2() {
	WebElement Header=driver.findElement(By.xpath("//*[@id=\"uagb-infobox-74cd79b6-b855-4e72-81bc-e70591de1896\"]/div/div/div/div[1]/h1"));
	Assert.assertEquals(Header.getText(), "Learn from Industry Experts");
}
@AfterClass(alwaysRun=true)
public void tearDown() {
	if(driver!=null) {
	driver.quit();
	}
}
}
