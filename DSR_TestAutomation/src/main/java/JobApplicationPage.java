import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import io.qameta.allure.Step;
public class JobApplicationPage extends PagesBase {

	public JobApplicationPage(WebDriver driver) {
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
    @FindBy(css = "div>input[value='Male']")
    WebElement GenderRadiobtnM;
    @FindBy(css = "div>input[value='Female']")
    WebElement GenderRadiobtnF;
    @FindBy(name ="Vacancy")
    WebElement VacanvyDropdownSelect;
    @FindBy(name ="myfile")
    WebElement choosefilebtn;
    @FindBy(name ="Agreement")
    WebElement AgrementChekBox;
    @FindBy(name ="submitbutton")
    WebElement Submmitbtn;

    @Step("populate and complete the user form with relevant information")
        public void filluserForm(String firstname, String lastname, String email, String phonenumber) {
        settext(FirstnameTxtBox, firstname);
        settext(LastnameTxtBox, lastname);
        settext(EmailTxtBox, email);
        settext(PhoneNumberTxtBox, phonenumber);
    }
    public void selectGender(String Genderchoice) {
        if (Genderchoice.equalsIgnoreCase("Female")) {
            clickbutton(GenderRadiobtnF);
        } else if (Genderchoice.equalsIgnoreCase("Male")) {
            clickbutton(GenderRadiobtnM);
        }
    }
    public void selectJob(String VaccanySelection) {
        select = new Select(VacanvyDropdownSelect);
        select.selectByVisibleText(VaccanySelection);
    }
    public void uploadResume(String resumePath) {
        choosefilebtn.sendKeys(resumePath);
    }
    public void AgrementSubmit() {
        clickbutton(AgrementChekBox);
        clickbutton(Submmitbtn);
    }
   }
