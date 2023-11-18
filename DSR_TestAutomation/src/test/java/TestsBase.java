import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class TestsBase {
    public String baseURL = ConfigurationReader.getProperty("baseURL");
    public WebDriver driver;
    @Parameters({"browser"})
    @BeforeSuite(alwaysRun = true)
    public void driverSetup(@Optional("chrome") String browser) {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
        driver.navigate().to(baseURL);
    }

   @AfterSuite
    void teardown() {
        driver.quit();
    }}