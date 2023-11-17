import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.*;

public class JobApplicationTest extends TestsBase {

    FormPage FormObject;
    Faker faker;
    @BeforeClass(alwaysRun = true)
    public void beforeClass()  {
        FormObject = new FormPage(driver);
        faker = new Faker();
    }

        @Test(priority = 1,alwaysRun = true, dataProvider = "candidates-role")

        public void verifyIfUserCanApplySucceffuly(String roles) {
            String firstname = faker.name().firstName();
            String lastName = faker.name().lastName();
            String email = faker.internet().emailAddress();
            String phonenumber = "9999999999";
            FormObject.filluserForm(firstname,lastName,email,phonenumber);
            FormObject.selectGender("Female");
            FormObject.selectJob(roles);
            FormObject.uploadResume(System.getProperty("user.dir")+"/data/cvQAEnginner.pdf");
            FormObject.AgrementSubmit();

            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            Assert.assertTrue(alert.getText().contains(email));
            alert.accept();
    }
    @DataProvider(name = "candidates-role")
    public Object[][] searchData() {
        return new Object[][] {
               // {"QA Enginee"},
                //{"QAA Engineer"},
                {"Business Analyst"}//,
                // Add more test data as needed
        };
    }






    /*

    @AfterTest
public void closeDriver() {
    // Close the WebDriver instance after the test is complete
    if (driver != null) {
        driver.quit();
    }
}*/
}


