package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/keyboard-events");
        System.out.println("the title of page is" +driver.getTitle());
        Actions builder = new Actions(driver);
        builder.sendKeys("This is coming from Selenium").build().perform();
        System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
        System.out.println(driver.findElement(By.xpath("//h1[contains(@class,'mt-3')]")).getText());
        driver.quit();

        



    }
    
}
