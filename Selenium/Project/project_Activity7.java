package project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class project_Activity7 {

WebDriver driver;
WebDriverWait wait;

@BeforeClass
public void pageTitle() {
	driver = new FirefoxDriver();
	
	driver.get("https://alchemy.hguy.co/lms/");
}

@Test
public void TestCase7(){
	wait =new WebDriverWait(driver,Duration.ofSeconds(1000));
	WebElement Allcourseslink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-1508\"]/a")));
	Allcourseslink.click();
	
   
	String pageTitle = driver.getTitle();
	Assert.assertTrue(pageTitle.contains("All Courses"),"Page title does not contain 'All Courses'");
	
	List<WebElement> courses = driver.findElements(By.className("ld-course-list-items row"));	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 5000);");
	
	 int numberofcourses = courses.size();
	 System.out.println("number of courses on page"+numberofcourses);
	 
	 Assert.assertTrue(numberofcourses>0,"No courses found on the page.");	
}
@AfterClass
public void tearDown(){
	driver.quit();
}
}