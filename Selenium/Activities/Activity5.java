package Activities_test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
	public static void main (String [] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("The title of the page is:"+ driver.getTitle());
		
		Boolean checkbox = driver.findElement(By.id("checkbox")).isDisplayed();
		if(checkbox == true) {
			System.out.println("Checkbox is present");
		}
			else {
				System.out.println("Checkbox is not present");
			}
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")).click();
		
		Boolean checkbox_disable= driver.findElement(By.id("checkbox")).isDisplayed();
		if(checkbox_disable == true) {
			System.out.println("Checkbox is still present");
		}
			else {
				
				System.out.println("Checkbox is not present");
		
		
		}
		

	}

}
