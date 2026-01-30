package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementPrac {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");
        WebElement n=driver.findElement(By.id("username"));
        n.sendKeys("Nashrah");
        WebElement sub = driver.findElement(By.xpath("//button[text()='submit']"));
        System.out.println(n.getText());
        driver.quit();
        
        




    }
    
}
