package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
        System.out.println("the title of the page is " + driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//h3[text()='Heading #3']")));
        System.out.println(driver.findElement(By.xpath("//h3[text()='Heading #3']")).getCssValue("color"));
        System.out.println(driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class"));
        System.out.println( driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText());
        driver.quit();

    }
    
}
