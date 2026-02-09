package TestNG;


import org.openqa.selenium.firefox.FirefoxDriver;
	
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setup(){
        driver= new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/login-form");
    }
    @Test
    @Parameters({"username","password","message"})
    public void logintest(@Optional("admin")String username, @Optional("password") String password, @Optional("Login Success!") String message){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        wait.until(ExpectedConditions.titleContains("Success"));
        String loginMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Login Success!", loginMessage);


    }
    @AfterClass
    public void teardown(){
        driver.close();
    }
}