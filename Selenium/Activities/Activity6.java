package Activities_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
	public static void main (String [] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("The title of the page is:"+ driver.getTitle());
		
		Boolean checkbox_display = driver.findElement(By.id("checkbox")).isDisplayed();
		if(checkbox_display == true) {
			System.out.println("Checkbox is present");
		}
			else {
				System.out.println("Checkbox is not present");
			}
		Boolean checkbox_select = driver.findElement(By.id("checkbox")).isSelected();
		if(checkbox_select == true) {
			System.out.println("Checkbox is selected");
		}
			else {
				System.out.println("Checkbox is not selected");
			}
		driver.findElement(By.id("checkbox")).click();
		Boolean checkbox_select2 = driver.findElement(By.id("checkbox")).isSelected();
		if(checkbox_select2 == true) {
			System.out.println("Checkbox is selected");
		}
			else {
				System.out.println("Checkbox is not selected");
			}
		
	}


}
