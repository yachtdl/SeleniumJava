package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.GoogleHomePageObjects;

public class GoogleSearch_POM {
    WebDriver driver;
    GoogleHomePageObjects page;

    @BeforeSuite
    public void prepare(){
        WebDriverManager.chromedriver().driverVersion("94.0.4606.61").setup();
        driver=new ChromeDriver();
        page=new GoogleHomePageObjects(driver);
    }

    @Test
    public void googleSearch2(){
        driver.get("https://www.google.com/");
        page.setTextInSearchBox("test");
        page.clickSearchButton();
    }

    @AfterSuite
    public void afterProcess(){
        driver.close();
    }
}
