package pages.cstashkevych;


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

    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnFirstNameInput() {
        FirstNameInput.click();
    }

    public void enterFirstNameInput() {
        FirstNameInput.sendKeys("Carolina");
    }

    public void clickOnLastNameInput() {
        LastNameInput.click();
    }

    public void enterLastNameInput() {
        LastNameInput.sendKeys("Anastasia");
    }

    public void clickOnEmailInput() {
        EmailInput.click();
    }

    public void enterEmailInput() {
        EmailInput.sendKeys("caroline19@gmail.com");
    }

    public void clickOnTelephoneInput() {
        TelephoneInput.click();
    }

    public void enterTelephoneInput() {
        TelephoneInput.sendKeys("0938649132");
    }

    public void clickOnPasswordInput() {
        PasswordInput.click();
    }

    public void enterPasswordInput() {
        PasswordInput.sendKeys("test123");
    }

    public void clickOnPasswordConfirmInput() {
        PasswordConfirmInput.click();
    }

    public void enterPasswordConfirmInput() {
        PasswordConfirmInput.sendKeys("test123");
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

}