

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import net.jodah.failsafe.internal.util.DelegatingExecutorService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RadioButtonTests extends ConfigTests {

    @BeforeMethod
    public void Configuration () {
        //Configuration.baseUrl = "https://demoqa.com";
        Configuration.reportsFolder="src/main/resources/RadioButtonFailedTests/";
    }

    @Test(groups = {"FrontEnd"})
    public void YesRadioButton() {
        open("https://demoqa.com/radio-button");
        SelenideElement radioButton = $(byAttribute("for", "yesRadio"));
        radioButton.click();
        softAssert.assertFalse(radioButton.is(Condition.selected));
    }
    @Test(groups = {"BackEnd"})
    public void NoRadioButton() {
        open("/radio-button");
        SelenideElement noradioButton = $(byAttribute("for", "noRadio"));
        softAssert.assertTrue(noradioButton.isEnabled());

    }

    @Test(retryAnalyzer = Retry.class)
    public void FailTadioButtonTest() {
            open("/radio-button");
            SelenideElement YesradioButton = $(byId("YesRadio"));
            YesradioButton.click();
    }
}
