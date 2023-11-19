import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagesBase {

    public WebDriver driver;
    protected static WebDriverWait wait;
    public Select select;

    public PagesBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    public static void clickbutton(WebElement button) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(button));
            button.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void settext(WebElement textelement, String value) {

        {
            try {
                wait.until(ExpectedConditions.visibilityOf(textelement)).clear();
                textelement.sendKeys(value);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

}