import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class testTOtest {
    public  String BaseURL ="https://vladimirwork.github.io/web-ui-playground//";
    public static WebDriver driver;
    public void startdriver()

    {

        System.setProperty("webdriver.chrome.driver",System.getProperty("/usr/lib/chromium-browser/chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to(BaseURL);

    }	/*	caps.setCapability(PhantomJSDriverService.PHANTOMJS_GHOSTDRIVER_CLI_ARGS,phantomJsArgs);
			driver = new PhantomJSDriver(caps);
*/



}
