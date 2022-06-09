import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Selenide.*;


public class CheckboxTests extends ConfigTests  {
    SoftAssert softAssert = new SoftAssert();


    @BeforeMethod
    public void Configuration1() {
        Configuration.baseUrl = "http://the-internet.herokuapp.com";
        Configuration.reportsFolder="src/main/resources/CheckboxFailedTests/";
    }


    @Test(timeOut = 10000)
    public void CheckBoxes()  {
        open("/checkboxes");
        SelenideElement checkbox1 =  $("input[type=checkbox]",1);
        checkbox1.setSelected(false);
        softAssert.assertTrue(checkbox1.is(Condition.checked));
        SelenideElement checkbox2 =  $("input[type=checkbox]",0);
        checkbox2.setSelected(true);
        softAssert.assertFalse(checkbox2.is(Condition.checked));
        softAssert.assertAll();

    }

}
