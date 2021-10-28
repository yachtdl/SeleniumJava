package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//https://www.selenium.dev/selenium/docs/api/java/allclasses-noframe.html
//headless browsers: https://gist.github.com/evandrix/3694955
public class HeadlessChromeDemo {
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1280,800");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.google.com/");
    }
}
