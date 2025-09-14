package Activities_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void Homepage() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");		
		}
	
	@Test (groups = {"HedersTest"	, "ButtonTests "})
	public void pageTitleTest() {
		System.out.println("The title of the page"+ driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Selenium: Target Practice");
	}
	@Test(dependsOnMethods = {"pageTitleTest"}, groups= {"HedersTest"})
	public void TestHeader1() {
		WebElement header_3=driver.findElement(By.xpath("//h3=[contains(@class, 'orange')]"));
		Assert.assertEquals(header_3, "Heading #3");
	}
	@Test(dependsOnMethods = {"pageTitleTest"}, groups= {"HedersTest"})
	public void TestHeader2() {
		Color header_5color=Color.fromString(driver.findElement(By.cssSelector("h5.text-purple-600")).getCssValue("color"));
		Assert.assertEquals(header_5color.asHex(), "#805ad5");
	}
	@Test(dependsOnMethods = {"pageTitleTest"}, groups= {"ButtonTests"})
	public void Testbutton() {
		WebElement button_1=driver.findElement(By.xpath("//button[cointains(@class,'Emerald']"));
		Assert.assertEquals(button_1.getText(), "Emerald");
	}
	@Test(dependsOnMethods = {"pageTitleTest"}, groups= {"ButtonTests"})
	public void Testbutton2() {
		
        Color button2Color = Color.fromString(driver.findElement(By.xpath("//button[contains(@class, 'purple')]")).getCssValue("color"));
        Assert.assertEquals(button2Color.asHex(), "#581c87");
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
	
		
}

