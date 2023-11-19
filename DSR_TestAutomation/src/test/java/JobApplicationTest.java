import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JobApplicationTest extends TestsBase {
    JobApplicationPage FormObject;
    Faker faker;
    @BeforeTest(alwaysRun = true)
    public void dataGenrator()  {
        FormObject = new JobApplicationPage(driver);
        faker = new Faker();
    }
    @Test(priority = 1,alwaysRun = true)
    @Description("Perform Data Creation")
            public void verifyIfUserCanApplySucceffuly(){
           // Data Creation
            String firstname = faker.name().firstName();
            String lastName = faker.name().lastName();
            String email = faker.internet().emailAddress();
            String phonenumber = faker.phoneNumber().subscriberNumber(9);
            String gender= faker.random().nextBoolean() ? "Male" : "Female";
            String role = faker.random().nextBoolean() ? "QA Engineer" : faker.random().nextBoolean() ? "QAA Engineer" : "Business Analyst";
           // Filling form
            FormObject.filluserForm(firstname,lastName,email,phonenumber);
            FormObject.selectGender(gender);
            FormObject.selectJob(role);
            FormObject.uploadResume(System.getProperty("user.dir")+"/data/cvQAEnginner.pdf");
            FormObject.AgrementSubmit();
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            Assert.assertTrue(FormObject.handleAlert(email,alertText),"Condidate Applied Succefully");
            alert.accept();
               }
    @AfterTest
        public void closeDriver() {
    // Close the WebDriver instance after the test is complete
    if (driver != null) {
        driver.quit();
    }
}}


