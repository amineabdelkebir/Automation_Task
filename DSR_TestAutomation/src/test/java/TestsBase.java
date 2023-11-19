package testutilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;


public class TestsBase extends testData {
    public String baseURL = testData.URL;
    public WebDriver driver;

    @Parameters({"browser"})
    @BeforeSuite(alwaysRun = true)
    public void driverSetup(@Optional("chrome") String browser) {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        driver.navigate().to(baseURL);


    }

    @AfterSuite
    void teardown() {
        driver.quit();
    }
}