package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity1Sel {
    public static void main(String[] args){
        WebDriver driver =new FirefoxDriver();
        driver.get("https://training-support.net/");
        System.out.println("the title of the page is "  +driver.getTitle());
    
        driver.findElement(By.linkText("About Us")).click();
        System.out.println("the title of the page is " +driver.getTitle());
        driver.close();
        driver.quit();
        




    }
    
}