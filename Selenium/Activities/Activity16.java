package Activities_test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Activity16 {
	public static void main(String [] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/selects");
		System.out.println("The title of the page is: " + driver.getTitle());
		WebElement  Dropdown = driver.findElement(By.tagName("select"));
		Select select = new Select(Dropdown);
		select.selectByVisibleText("Two");
		System.out.println("The text value in the second option is:" +select.getFirstSelectedOption().getText());
		select.selectByIndex(3);
		System.out.println("The text value in the second option is:" +select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Four");
		System.out.println("The text value in the second option is:" +select.getFirstSelectedOption().getText());
		List<WebElement> allOptions = select.getOptions();
		System.out.println("The options in the list are:");
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		
	}
}
