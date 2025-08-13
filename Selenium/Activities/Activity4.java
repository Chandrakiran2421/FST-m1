package Activities_test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
	public static void main (String [] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/target-practice");
		System.out.println("The title of the page is:"+ driver.getTitle());
		
	String text= driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h3[1]")).getText();
	System.out.println(text);
	String color = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h5")).getCssValue("color");
	System.out.println(color);
	String purple_class = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[5]")).getAttribute("class");
	System.out.println(purple_class);
	String text2=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[6]")).getText();
	System.out.println(text2);
	}
	

}
