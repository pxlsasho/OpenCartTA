package pages.cstashkevych;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
    private WebDriver driver;

    @FindBy(linkText = "My Account")
    public WebElement PersonalCabinetLink;

    @FindBy(linkText = "Logout")
    public WebElement LogoutLink;

    @FindBy(linkText = "Login")
    public WebElement LoginLink;

    @FindBy(id = "input-email")
    public WebElement EmailInput;

    @FindBy(id = "input-password")
    public WebElement PasswordInput;

    @FindBy(xpath = "//form/input[contains(@class, 'btn-primary')]")
    public WebElement LoginButton;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickOnPersonalCabinet()
    {
        PersonalCabinetLink.click();
    }

    public void clickOnLogout()
    {
        LogoutLink.click();
    }

    public void clickOnLogin()
    {
        LoginLink.click();
    }

    public void clickOnEmailInput() {
        EmailInput.click();
    }

    public void enterEmailInput() {
        EmailInput.sendKeys("caroline124@gmail.com");
    }

    public void clickOnPasswordInput() {
        PasswordInput.click();
    }

    public void enterPasswordInput() {
        PasswordInput.sendKeys("test123");
    }

    public void clickOnLoginButton() {
        LoginButton.click();
    }


}
