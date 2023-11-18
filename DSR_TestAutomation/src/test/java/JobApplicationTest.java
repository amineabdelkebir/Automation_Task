import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.*;

public class JobApplicationTest extends TestsBase {
    JobApplicationPage FormObject;
    Faker faker;
    @BeforeClass(alwaysRun = true)
    public void dataGenrator()  {
        FormObject = new JobApplicationPage(driver);
        faker = new Faker();
    }
    @Test(priority = 1,alwaysRun = true)
       public void verifyIfUserCanApplySucceffuly() {
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
            handleAlert(email);
               }
    //Perform Alert PopUp
    private void handleAlert(String expectedEmail) {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        Assert.assertTrue(alertText.contains(expectedEmail));
        alert.accept();
    }
    @AfterTest
        public void closeDriver() {
    // Close the WebDriver instance after the test is complete
    if (driver != null) {
        driver.quit();
    }
}}


