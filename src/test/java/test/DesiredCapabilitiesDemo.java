package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.GoogleHomePageObjects;

//https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
//https://www.guru99.com/chrome-options-desiredcapabilities.html
public class DesiredCapabilitiesDemo {
    DesiredCapabilities caps;
    WebDriver driver;
    GoogleHomePageObjects page;

    @BeforeSuite
    public void prepare(){
        caps=new DesiredCapabilities();
        caps.setCapability("javascriptEnabled",false);
        WebDriverManager.chromedriver().driverVersion("94.0.4606.61").setup();
        driver=new ChromeDriver(caps);
        page=new GoogleHomePageObjects(driver);
    }

    @Test
    public void googleSearch(){
        driver.get("https://www.google.com/");
        page.setTextInSearchBox("test");
        page.clickSearchButton();
    }

    @AfterSuite
    public void afterProcess(){
        driver.close();
    }
}
