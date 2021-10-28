package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.GoogleHomePageObjects;

public class ExcelDataProvider {
    WebDriver driver;
    GoogleHomePageObjects page;

    @BeforeSuite
    public void prepare(){
        WebDriverManager.chromedriver().driverVersion("94.0.4606.61").setup();
        driver=new ChromeDriver();
        page=new GoogleHomePageObjects(driver);
    }

    @Test(dataProvider = "test1data")
    public void test1(String name,Double password,String email) throws Exception{
        System.out.println(name+" "+password+" "+email);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.name("txtUsername")).sendKeys(name);
        driver.findElement(By.name("txtPassword")).sendKeys(String.valueOf(password));
        driver.findElement(By.name("Submit")).click();
        Assert.assertEquals("Invalid credentials",driver.findElement(By.id("spanMessage")).getText());
        Thread.sleep(2000);
    }

    @AfterSuite
    public void afterProcess(){
        driver.close();
    }

    @DataProvider(name="test1data")
    public Object[][] getData(){
        Object[][] data=testData("/excel/Book3.xlsx","Sheet1");
        return data;
    }
    public Object[][] testData(String filePath,String sheetName){
        ExcelUtils excel=new ExcelUtils(filePath,sheetName);
        int rowCount=excel.getRowCount();
        int colCount=excel.getColCount();
        Object[][] data=new Object[rowCount-1][colCount];
        for(int i=1;i<rowCount;i++){
            for(int j=0;j<colCount;j++){
                if(j==1)
                    data[i-1][j]=excel.getCeilNumber(i,j);
                else
                    data[i-1][j]=excel.getCeilString(i,j);
            }
        }
        return data;
    }
}
