package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://openai.com/index/chatgpt/");
        driver.navigate().back();
        driver.navigate().refresh();
    }
    
}
