import StepObjects.RegistrationSteps;
import Utils.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObjects.RegistrationData.*;

@Listeners(Utils.TestLister.class)

public class MyMarketRegistration extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("MyMarket Registration Test Case with main fields")

    public void registrationFillInputFields(){
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .closePopup()
                .goToRegistrationPage()
                .selectGender(female)
                .writeEmail(email)
                .passwordAndRepeat(password, password)
                .writePhoneNumber(phone)
                .isSendSmsBtnEnabled()

                .clickOnRegBtn();
    }

    @Test(retryAnalyzer = Retry.class, priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("MyMarket Registration Test Case with all input fields (!sms, !captcha)")

    public void registrationWithAllFields(){
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .closePopup()
                .goToRegistrationPage()
                .selectGender(male)
                .writeEmail(email)
                .passwordAndRepeat(password, password)
                .writePhoneNumber(realPhoneNumber)
                .checkAgreeBtns()
                .isSendSmsBtnEnabled()
                .areAgreeBtnsChecked()

                .clickOnRegBtn()
                .ckeckIfErrorsAreVisible();
    }

    @Test(retryAnalyzer = Retry.class, priority = 2)
    @Severity(SeverityLevel.BLOCKER)
    @Description("MyMarket Registration Test Case with wrong password")

    public void registrationWithWrongPassword(){
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .closePopup()
                .goToRegistrationPage()
                .selectGender(male)
                .writeEmail(email)
                .writePhoneNumber(realPhoneNumber)
                .checkAgreeBtns()
                .isSendSmsBtnEnabled()
                .areAgreeBtnsChecked()
                .passwordAndRepeat(password, wrongRepeatPassword)
                .clickOnRegBtn()
                .ckeckIfErrorsAreVisible();
    }
}
