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

@Test
public class project_Activity8 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void pageTitle() {
		driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.get("https://alchemy.hguy.co/lms/");
		
	}
	
	public void TestCase8() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(1000));
		WebElement Contactlink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-1506\"]/a")));
		Contactlink.click();
		
		WebElement fullName = driver.findElement(By.name("your-name"));
        WebElement email = driver.findElement(By.name("your-email"));
        WebElement subject = driver.findElement(By.name("your-subject"));
        WebElement message = driver.findElement(By.name("your-message"));

        fullName.sendKeys("Chandra kiran");
        email.sendKeys("ambatichandrakiran17@gmail.com");
        subject.sendKeys("Test Message");
        message.sendKeys("This is a test message from TestNG automation.");
		
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();
		
		 
        WebElement confirmation = driver.findElement(By.cssSelector("div.wpcf7-response-output"));
        String responseText = confirmation.getText();
        System.out.println("Confirmation Message: " + responseText);
        
        Assert.assertTrue(responseText.contains("Thank you"), "Submission failed or message not found!");
		
		
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
