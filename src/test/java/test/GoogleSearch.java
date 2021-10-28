package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GoogleSearch {
    WebDriver driver;
    @Test
    public void googleSearch1(){
        WebDriverManager.chromedriver().driverVersion("94.0.4606.61").setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name='qq']")).sendKeys("test");
        //auto suggest popup hide the search button, so can't use .click() method
        //driver.findElement(By.xpath("//input[@name='btnK']")).click();
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).sendKeys(Keys.ENTER);
        driver.close();
    }

    @Test
    public void googleSearch3(){
        System.out.println("test");  //purpose is for multi-thread testing config in testng1.xml
        //https://howtodoinjava.com/testng/testng-executing-parallel-tests/
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
