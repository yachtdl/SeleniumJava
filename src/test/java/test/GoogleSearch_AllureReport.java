package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.GoogleHomePageObjects;

public class GoogleSearch_AllureReport {
    //https://docs.qameta.io/allure/
    //https://www.youtube.com/watch?v=bFQqo45Nh60&ab_channel=SDET-AutomationTechie
    //after run test, run in terminal:
    //allure serve /Users/lindu/IdeaProjects/SeleniumJava/allure-results
    WebDriver driver;
    GoogleHomePageObjects page;

    @BeforeSuite
    public void prepare(){
        WebDriverManager.chromedriver().driverVersion("94.0.4606.61").setup();
        driver=new ChromeDriver();
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
