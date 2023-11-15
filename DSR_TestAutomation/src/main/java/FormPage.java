import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends PagesBase {

	public FormPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(name ="FirstName")
    WebElement FirstnameTxtBox;
    @FindBy(name ="LastName")
    WebElement LastnameTxtBox;
    @FindBy(name ="Email")
    WebElement EmailTxtBox;
    @FindBy(name ="PhoneNumber")
    WebElement PhoneNumberTxtBox;
    @FindBy(xpath = "//input[@type='radio' and @name='Gender' and @value='Male']")
    WebElement GenderRadiobtnM;
    @FindBy(xpath = "//input[@type='radio' and @name='Gender' and @value='Female']")
    WebElement GenderRadiobtnF;
    @FindBy(name ="Vacancy")
    WebElement VacanvyDropdownSelect;
    @FindBy(name ="myfile")
    WebElement choosefilebtn;
    @FindBy(name ="Agreement")
    WebElement AgrementChekBox;
    @FindBy(name ="submitbutton")
    WebElement Submmitbtn;

    public void filluserForm(String firstname, String lastname, String email, String phonenumber, String VaccanySelection, String Genderchoice,String resumePath)
    {

        settext(FirstnameTxtBox, firstname);
        settext(LastnameTxtBox, lastname);
        settext(EmailTxtBox, email);
        settext(PhoneNumberTxtBox, phonenumber);
        if ("Female".equals(Genderchoice)) {
            clickbutton(GenderRadiobtnF);
        } else if ("Male".equals(Genderchoice)) {
            clickbutton(GenderRadiobtnM);
        }
        select = new Select(VacanvyDropdownSelect);
        select.selectByVisibleText(VaccanySelection);
        choosefilebtn.sendKeys(resumePath);
        clickbutton(AgrementChekBox);

        clickbutton(Submmitbtn);
    }
   }
