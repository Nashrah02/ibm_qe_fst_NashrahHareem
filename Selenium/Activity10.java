package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        driver.get("https://training-support.net/webelements/drag-drop");
        System.out.println("the title of the webpage is " +driver.getTitle());
        WebElement a = driver.findElement(By.id("dropzone1"));
        WebElement f = driver.findElement(By.xpath("//img[@id='ball']"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        builder.clickAndHold(f).moveToElement(a).pause(5000).release().build().perform();;
           
        if(a.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 1");
        }
         builder.dragAndDrop(f, dropzone2).pause(5000).build().perform();
        if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
        }

    }
    
}
