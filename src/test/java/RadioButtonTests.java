

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class RadioButtonTests extends ConfigTests {

    @BeforeMethod
    public void Configuration () {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.reportsFolder="src/main/resources/RadioButtonFailedTests/";
    }

    @Test(priority = 1)
    public void YesRadioButton() {
        open("/radio-button");
        SelenideElement radioButton = $(byAttribute("for", "yesRadio"));
        radioButton.click();
        softAssert.assertFalse(radioButton.is(Condition.selected));
    }
    @Test(priority = 0)
    public void NoRadioButton() {
        open("/radio-button");
        SelenideElement noradioButton = $(byAttribute("for", "noRadio"));
        softAssert.assertTrue(noradioButton.isEnabled());

    }
}
