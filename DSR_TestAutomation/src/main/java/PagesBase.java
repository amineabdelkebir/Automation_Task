import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PagesBase {

    protected WebDriver driver;
    public PagesBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public Select select;
    protected static void clickbutton(WebElement button)
    {
        button.click();
    }
    protected static void settext(WebElement textelement,String value)
    {
        textelement.sendKeys(value);
    }
}
