package selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {public static void main(String[] args){
    WebDriver driver = new FirefoxDriver();
    Actions builder = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://training-support.net/webelements/dynamic-controls");
    System.out.println("the title of the page is" +driver.getTitle());
    WebElement e =driver.findElement(By.id("checkbox"));
    WebElement tg=driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
    tg.click();
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("checkbox")));
    tg.click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
    e.click();
    driver.quit();



  
    
    


    
}
    
}
