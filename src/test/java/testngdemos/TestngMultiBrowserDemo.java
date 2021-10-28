package testngdemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngMultiBrowserDemo {
    WebDriver driver;
    @Parameters("browserName")
    @BeforeTest
    public void setup(String browserName){
        System.out.println("Browser name is: "+browserName);
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
    }
    @Test
    public void test1() throws Exception{
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
    }
    @AfterTest
    public void teardown(){
        driver.close();
        System.out.println("Test complete.");
    }
}
