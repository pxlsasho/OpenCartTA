package pages.apasternak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private static final String BASE_URL = "https://demo.opencart.com";
    private WebDriver driver;

    @FindBy(linkText = "My Account")
    public WebElement PersonalCabinetLink;

    @FindBy(linkText = "Login")
    public WebElement LoginLink;

    @FindBy(id = "input-email")
    public WebElement EmailInput;

    @FindBy(id = "input-password")
    public WebElement PasswordInput;


    @FindBy(xpath = "//form/input[contains(@class, 'btn-primary')]")
    public WebElement LoginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void clickOnPersonalCabinet() {
        PersonalCabinetLink.click();
    }

    public void clickOnLogin() {
        LoginLink.click();
    }

    public void clickOnEmail() {
        EmailInput.click();
    }

    public void inputEmail() {
        EmailInput.sendKeys("pasternakandrjj1@gmail.com");
    }

    public void clickOnPassword() {
        PasswordInput.click();
    }

    public void inputPassword() {
        PasswordInput.sendKeys("ovecka");
    }

    public void loginButton() {
        LoginButton.click();
    }

}
