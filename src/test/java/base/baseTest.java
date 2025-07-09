package base;

import java.time.Duration;
//import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.AllureReportUtil;
public class baseTest {
    public WebDriver driver;

   @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
   
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        driver.get("https://dev.cnsbd.com:2022/");
    }
  @AfterSuite
    public void tearDown() {
        driver.quit();
        generateAndOpenReport();
    }
   public void generateAndOpenReport() {
       try {
           AllureReportUtil.generateAllureReport();
           AllureReportUtil.openAllureReport();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}