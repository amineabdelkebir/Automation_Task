import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(name ="Gender")
    WebElement GenderRadiobtn;
    @FindBy(name ="Vacancy")
    WebElement VacnavyDropdownSelect;
    @FindBy(name ="myfile")
    WebElement choosefilebtn;
    @FindBy(name ="Agreement")
    WebElement AgrementChekBox;
    @FindBy(name ="submitbutton")
    WebElement Submmitbtn;

    public void filluserForm(String firstname, String lastname, String email, String phonenumber)
    {

        settext(FirstnameTxtBox, firstname);
        settext(LastnameTxtBox, lastname);
        settext(EmailTxtBox, email);
        settext(PhoneNumberTxtBox, phonenumber);

        clickbutton(AgrementChekBox);
        clickbutton(Submmitbtn);
    }

}
