import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.Normalizer;

public class FormTest extends TestsBase {

    FormPage FormObject;

    /*@DataProvider(name="excelfile")

    public Object  userregisterdata() throws IOException
    //Object[][]
    {

        ExcelReader ER =new ExcelReader();
        return ER.getExcelData();

    }
    */
    @Test(priority = 1,alwaysRun = true)
    public void usercanregistersuccssfuly()
    {
         FormObject = new FormPage(driver);
         FormObject.filluserForm("amam","bmbm","bm.am@vv.com","913909090","QA engineer","Female","C/amine/resume.pdf");

       // Assert.assertTrue(registerObject.successregnotif.getText().contains("Your registration completed"));
    }

}


