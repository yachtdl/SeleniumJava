import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class FindWebElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().driverVersion("94.0.4606.61").setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //Locate element by: xpath,name,id,className,cssSelector,linkText,tagName,partialLinkText
        WebElement textBox=driver.findElement(By.xpath("//input[@name='q']"));
        textBox.sendKeys("test");
    }

}
