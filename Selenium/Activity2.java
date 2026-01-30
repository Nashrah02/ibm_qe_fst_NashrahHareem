package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");
        System.out.println("the tille of the page is" + driver.getTitle());
        WebElement u = driver.findElement(By.id("username"));
        u.sendKeys("admin");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("XYZ123y@");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        driver.quit();




    }
    
}
