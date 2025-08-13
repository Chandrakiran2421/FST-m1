package Activities_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	public static void main (String [] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/login-form");
		
		System.out.println("This is the page title: "+ driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button")).click();
		
		String message = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/h1")).getText();
        System.out.println(message);
        
        driver.quit();
		
		
		
		
		
	}

}
