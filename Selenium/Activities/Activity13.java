package Activities_test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
	public static void main(String [] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("The title of the page is: " + driver.getTitle());
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("The number of rows in the table is: "+rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("The number of rows in the table is: "+cols.size());
		List<WebElement> third_row=driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[3]/td[1]"));
		System.out.println("The elements of the 3rd row are: ");
		for (WebElement cell  : third_row) {
			System.out.println(cell.getText());
		}
		WebElement seccond_row=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]"));
		System.out.println(seccond_row.getText());
		
	}

}
