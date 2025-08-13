package Activities_test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {
	public static void main (String [] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("The title of the page is:"+ driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		 System.out.println("The check box is  present: "+checkbox.isDisplayed());
		
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")).click();
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(2000));
		Boolean checkbox2 = driver.findElement(By.id("checkbox")).isDisplayed();
		if(checkbox2 == true) {
			System.out.println("The check box is present");
		}
		else {
			System.out.println("The check box is not present");
		}
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")).click();
		WebDriverWait wait2 = new WebDriverWait (driver, Duration.ofSeconds(20));
		Boolean checkbox3 = driver.findElement(By.id("checkbox")).isDisplayed();
		if(checkbox3 == true) {
			System.out.println("The check box is present");
		}
		else {
			System.out.println("The check box is not present");
		}

		driver.findElement(By.id("checkbox")).click();
		
		driver.quit();
	}
	
	

}
