package selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {
    public static void main(String[] args){;

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-attributes");
        System.out.println("the title of the page is " +driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[starts-with(@id,'full-')]")).sendKeys("Nashrah");
        driver.findElement(By.cssSelector("input[id$='-email']")).sendKeys("nashrah123@gmail.com");
        driver.findElement(By.cssSelector("input[name*='-event-date-']")).sendKeys("2025-06-25");
        driver.findElement(By.cssSelector("textarea[id*='-additional-details-']")).sendKeys("I love to eat");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")))
                .getText();
        System.out.println("Success message: " + message);

        // Close the browser
        driver.quit();




    }
    
}
