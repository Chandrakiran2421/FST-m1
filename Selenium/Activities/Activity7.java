package Activities_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	public static void main (String [] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("The title of the page is:"+ driver.getTitle());
		
		WebElement text_box= driver.findElement(By.id("textInput"));
		 System.out.println("Input test Enabled: "+ text_box.isEnabled());
		 
		 driver.findElement(By.id("textInputButton")).click();
		 
		 WebElement text_box1= driver.findElement(By.id("textInput"));
		 System.out.println("Input test Enabled: "+ text_box1.isEnabled());
		 
		 text_box1.sendKeys("Chandra kiran");
		 System.out.println(text_box1.getDomProperty("value"));
		 
		 driver.quit();
		
	}

}
