import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class JobApplicationPage extends PagesBase {



    @FindBy(name = "FirstName")
    WebElement FirstnameTxtBox;
    @FindBy(name = "LastName")
    WebElement LastnameTxtBox;
    @FindBy(name = "Email")
    WebElement EmailTxtBox;
    @FindBy(name = "PhoneNumber")
    WebElement PhoneNumberTxtBox;
    @FindBy(css = "div>input[value='Male']")
    WebElement GenderRadiobtnM;
    @FindBy(css = "div>input[value='Female']")
    WebElement GenderRadiobtnF;
    @FindBy(name = "Vacancy")
    WebElement VacanvyDropdownSelect;
    @FindBy(name = "myfile")
    WebElement choosefilebtn;
    @FindBy(name = "Agreement")
    WebElement AgrementChekBox;
    @FindBy(name = "submitbutton")
    WebElement Submmitbtn;
    public JobApplicationPage(WebDriver driver) {
        super(driver);

    }
    @Step("populate and complete the user form with relevant information")
    public void filluserForm(String firstname, String lastname, String email, String phonenumber) {
        settext(FirstnameTxtBox, firstname);
        System.out.println(firstname);
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

    public boolean handleAlert(String expectedEmail, String alertText) {
        System.out.println(alertText);
        return alertText.contains(expectedEmail);
    }
}