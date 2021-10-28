package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePageObjects {
    WebDriver driver;
    By textbox_search=By.xpath("//input[@name='q']");
    By button_search=By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']");

    public GoogleHomePageObjects(WebDriver driver){
        this.driver=driver;
    }

    public void setTextInSearchBox(String text){
        driver.findElement(textbox_search).sendKeys(text);
    }

    public void clickSearchButton(){
        driver.findElement(button_search).sendKeys(Keys.ENTER);
    }
}
