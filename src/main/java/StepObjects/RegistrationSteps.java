package StepObjects;

import PageObjects.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

public class RegistrationSteps extends RegistrationPage {
    @Step ("close popup if shown")
    public RegistrationSteps closePopup(){
        if (popupBlock.is(Condition.visible)) {
            closePopupBtn.click();
        }
        return this;
    }

    @Step ("go to registration page")
    public RegistrationSteps goToRegistrationPage(){
        if (autorization.is(Condition.visible)){
            autorization.click();
            if(registration.is(Condition.visible)){
                registration.click();
            }
        }
        return this;
    }
    @Step ("choose gender, value {indexOfGender}")
    public RegistrationSteps selectGender(int indexOfGender){
        gender.get(indexOfGender).click();
        return this;
    }
    @Step ("write email, value {emailAddress}")
    public RegistrationSteps writeEmail(String emailAddress){
        email.setValue(emailAddress);
        return this;
    }
    @Step ("write password, value {pass}, and repeat password, value {repeatPass}")
    public RegistrationSteps passwordAndRepeat(String pass, String repeatPass){
        password.setValue(pass);
        repeatPassword.setValue(repeatPass);
        return this;
    }
    @Step ("write phone number and check if send sms code btn is enabled, value {phoneNum}")
    public RegistrationSteps writePhoneNumber(String phoneNum){
        phone.setValue(phoneNum);
        return this;
    }
    @Step ("check if send sms code btn is enabled")
    public RegistrationSteps isSendSmsBtnEnabled(){
        Assert.assertTrue(sendSmsCodeBtn.is(Condition.enabled));
        return this;
    }
    @Step ("select agree buttons")
    public RegistrationSteps checkAgreeBtns(){
        if(!agree_1.is(Condition.checked)){
            agree_1.click();
        }
        if(!agree_2.is(Condition.checked)){
            agree_2.click();
        }
        return this;
    }
    @Step ("check if agree btns are checked")
    public RegistrationSteps areAgreeBtnsChecked(){
        Assert.assertTrue(agree_1.is(Condition.checked));
        Assert.assertTrue(agree_2.is(Condition.checked));
        return this;
    }
    @Step ("check if any of fields is empty (errors aren't shown)")
    public RegistrationSteps ckeckIfErrorsAreVisible(){
        Assert.assertFalse(emailError.is(Condition.visible));
        Assert.assertFalse(passwordError.is(Condition.visible));
        Assert.assertFalse(repeatPasswordError.is(Condition.visible));
        Assert.assertFalse(phoneError.is(Condition.visible));
        Assert.assertTrue(captchaError.is(Condition.visible));
        Assert.assertTrue(smsCodeError.is(Condition.visible));
        Assert.assertFalse(agreeError.is(Condition.visible));
        return this;
    }
    @Step ("click on registration button")
    public RegistrationSteps clickOnRegBtn(){
        registerBtn.click();
        return this;
    }
}
