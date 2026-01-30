package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");
        System.out.println("the tille of the page is" + driver.getTitle());
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("XYZ");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        
        
        
        
        driver.quit();




    }
    
}