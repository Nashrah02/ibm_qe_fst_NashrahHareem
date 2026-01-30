package selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity13 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        System.out.println("the title of the page is "+driver.getTitle());
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());
        List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println(cols.size());
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }
        // third row
        // System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]/td")).getText());
        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
    }
    
}
