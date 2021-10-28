package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
    public static void textbox_search(WebDriver driver, String keyword){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(keyword);
    }

    public static void button_search(WebDriver driver){
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).sendKeys(Keys.ENTER);
    }
}
