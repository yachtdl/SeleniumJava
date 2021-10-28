package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

//https://www.selenium.dev/documentation/webdriver/waits/
public class WaitForElements {
    WebDriver driver;
    @Test
    public void testImplicitWait() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //implicitWait's default query time frequency 250ms
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //explicitWait is used to tell web driver wait for certain conditions or maximum time exceeded, which can be applied only for specified elements
        //It is recommended to use when the elements are taking long time to load and also for verifying the property of the element like(visibilityOfElementLocated, elementToBeClickable,elementToBeSelected)
        //since Selenium 4, using new WebDriverWait(driver,Duration.ofSeconds(10))
        //WebDriverWait wait=new WebDriverWait(driver, 10);
        //fluentWait s
        FluentWait<WebDriver> fWait=new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(20)).
                pollingEvery(Duration.ofSeconds(2)).
                ignoring(NoSuchElementException.class);
        driver.manage().window().maximize();
        driver.get("https://www.expedia.com/Flights");
        driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']/div/button")).click();
        driver.findElement(By.id("location-field-leg1-origin")).sendKeys("san francisco"+ Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/div/button")).click();
        driver.findElement(By.id("location-field-leg1-destination")).sendKeys("los angeles"+Keys.ENTER);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("abc"))).click();
        WebElement foo=fWait.until(driver -> driver.findElement(By.id("abc")));
        foo.click();
    }

    @AfterTest
    public void teardown(){
        driver.close();
    }
}
