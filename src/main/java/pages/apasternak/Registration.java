package pages.apasternak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {

    private WebDriver driver;

    @FindBy(id = "input-firstname")
    public WebElement FirstNameInput;

    @FindBy(id = "input-lastname")
    public WebElement LastNameInput;

    @FindBy(id = "input-email")
    public WebElement EmailInput;

    @FindBy(id = "input-telephone")
    public WebElement TelephoneInput;

    @FindBy(id = "input-password")
    public WebElement PasswordInput;

    @FindBy(id = "input-confirm")
    public WebElement PasswordConfirmInput;

    @FindBy(name = "agree")
    public WebElement AgreePrivacyPolicy;

    @FindBy(className = "btn-primary")
    public WebElement ContinueButton;

    @FindBy(name = "newsletter")
    public WebElement SubscribeButton;

    @FindBy(linkText = "Logout")
    public WebElement Logout;

    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnFirstNameInput() {
        FirstNameInput.click();
    }

    public void enterFirstNameInput() {
        FirstNameInput.sendKeys("Andrew");
    }

    public void clickOnLastNameInput() {
        LastNameInput.click();
    }

    public void enterLastNameInput() {
        LastNameInput.sendKeys("Pasternak");
    }

    public void clickOnEmailInput() {
        EmailInput.click();
    }

    public void enterEmailInput() {
        EmailInput.sendKeys("pasternak@gmail.com");
    }

    public void clickOnTelephoneInput() {
        TelephoneInput.click();
    }

    public void enterTelephoneInput() {
        TelephoneInput.sendKeys("380934163908");
    }

    public void clickOnPasswordInput() {
        PasswordInput.click();
    }

    public void enterPasswordInput() {
        PasswordInput.sendKeys("ovecka");
    }

    public void clickOnPasswordConfirmInput() {
        PasswordConfirmInput.click();
    }

    public void enterPasswordConfirmInput() {
        PasswordConfirmInput.sendKeys("ovecka");
    }

    public void clickOnSubscribe() {
        SubscribeButton.click();
    }

    public void clickToAgree() {
        AgreePrivacyPolicy.click();
    }

    public void clickContinue() {
        ContinueButton.click();
    }

    public void clickOnLogout() {
        Logout.click();
    }

}
