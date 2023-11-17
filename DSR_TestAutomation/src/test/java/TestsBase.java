import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class TestsBase {


    public  String BaseURL ="https://vladimirwork.github.io/web-ui-playground//";
    public WebDriver driver;
    @Parameters({"browser"})
    @BeforeSuite(alwaysRun = true)
    public void driverSetup(@Optional("chrome") String browser) {
       WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
        driver.navigate().to(BaseURL);
    }

/*
    @AfterSuite
    void teardown() {
        driver.quit();
    }*/
    /*


    }

    public WebDriver getdriver()
        {
            return driver;

        }

        @AfterClass
        public void stopdriver()
        {
            driver.quit();

        }
      /*  @AfterMethod
/*
        public void screenshotOnfailure(ITestResult result)
        {
            if (result.getStatus() == ITestResult.FAILURE) {
                System.out.println("Failed !!");
                System.out.println("Takin Screenshot ...");
                Helper.capturescreenshot(getdriver(), result.getName());

            }

        }*/

}
