package Activities_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
	public static void main (String [] args) {
		WebDriver driver= new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("The title of the page is:"+ driver.getTitle());
		
		
		
		WebElement Cargo_lockbutton = driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[1]"));
		WebElement Cargo_toml = driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[2]"));
		WebElement src_button = driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[3]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[4]"));
		
		builder.click(Cargo_lockbutton).pause(2000).moveToElement(Cargo_toml).pause(2000).click(Cargo_toml).build().perform();
		String actionMessage = driver.findElement(By.id("result")).getText();
		System.out.println(actionMessage);
		builder.doubleClick(src_button).pause(2000).contextClick(target).build().perform();
		builder.click(driver.findElement(By.xpath("//*[@id=\"menu\"]/div/ul/li[1]/button"))).pause(5000).build().perform();
		actionMessage = driver.findElement(By.id("result")).getText();
		System.out.println(actionMessage);
		driver.quit();
	}
}
