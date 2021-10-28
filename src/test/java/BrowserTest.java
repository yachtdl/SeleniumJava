import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserTest {
    public static void main(String[] args) {
        //https://bonigarcia.dev/webdrivermanager/
        String projectPath=System.getProperty("user.dir");
        //Firefox
        //System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver");
        //WebDriver driver=new FirefoxDriver();
        //Chrome
        //System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver");
        //WebDriver driver=new ChromeDriver();
        //IE: Sunset in 2019
        //Safari: No need to download driver. But need to enable "Allow Remote Automation" in Safari Develop option
        //WebDriver driver=new SafariDriver();
        //WebDriverManager https://github.com/bonigarcia/webdrivermanager
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().driverVersion("94.0.4606.61").setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
