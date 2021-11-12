package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RegistrationPage {
    protected SelenideElement
            autorization = $(byText("ავტორიზაცია")),
            registration = $(byText("რეგისტრაცია")),

            email = $("#Email"),
            password = $("#Password"),
            repeatPassword = $("#PasswordRetype"),
            phone = $("#Phone"),
            smsCodeInput = $("#PhoneCode"),
            sendSmsCodeBtn = $("#PhoneCodeSend"),
            captcha = $(".captcha"),
            captchaInput = $("#CaptchaVal"),
            agree_1 = $("#test"),
            agree_2 = $("#tbcAgreement"),

            emailError = $(byText("მიუთითეთ ელ.ფოსტა")),
            passwordError = $(byText("პაროლის სიმბოლოების მინიმალური რაოდენობა უნდა იყოს 6")),
            repeatPasswordError = $(byText("პაროლები არ ემთხვევა")),
            phoneError = $(byText("შეიყვანეთ ტელეფონის ნომერი")),
            smsCodeError = $(byText("შეიყვანეთ SMS კოდი")),
            captchaError = $(byText("ჩაწერეთ უსაფრთხოების კოდი")),
            agreeError = $(byText("დაეთანხმეთ საიტის წესებს")),

            registerBtn = $(by("type", "submit")),

            popupBlock = $(".custom-modal-container"),
            closePopupBtn = $(".close-popup");


    protected ElementsCollection
            gender = $$(by("name", "Gender"));

}
