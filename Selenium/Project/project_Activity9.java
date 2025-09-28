package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class project_Activity9 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void completeLesson() {
        driver.get("https://alchemy.hguy.co/lms");

        WebElement allCoursesLink = driver.findElement(By.linkText("All Courses"));
        allCoursesLink.click();

        List<WebElement> courses = driver.findElements(By.className("entry-title"));
        Assert.assertTrue(courses.size() > 0, "No courses found.");
        String courseTitle = courses.get(0).getText();
        courses.get(0).click();

        WebElement firstLesson = driver.findElement(By.cssSelector("div.ld-lesson-list-item-preview > a"));
        String lessonTitle = firstLesson.getText();
        firstLesson.click();

        WebElement lessonHeading = driver.findElement(By.cssSelector("h1.entry-title"));
        Assert.assertEquals(lessonHeading.getText().trim(), lessonTitle.trim(), "Lesson title does not match.");

        try {
            WebElement markCompleteBtn = driver.findElement(By.cssSelector("input.learndash_mark_complete_button"));
            if (markCompleteBtn.isDisplayed()) {
                markCompleteBtn.click();
                System.out.println("Clicked on 'Mark Complete' button.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("'Mark Complete' button not found. It might have been already completed.");
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

