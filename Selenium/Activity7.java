package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("The title of page is "+ driver.getTitle());
        WebElement a =driver.findElement(By.id("textInput"));
        
        System.out.println(a.isEnabled());
        driver.findElement(By.id("textInputButton")).click();
        System.out.println(driver.findElement(By.id("textInput")).isEnabled());
    }


    
    
}
