package pages.nastiamazurak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private static final String BASE_URL = "https://demo.opencart.com/index.php?route=account/logout";
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void open()
    {
        driver.get(BASE_URL);
    }

    @FindBy(
            linkText = "My Account"
    )
    private WebElement myAccountLink;
    @FindBy(
            linkText = "Login"
    )
    private WebElement loginLink;
    @FindBy(
            name = "email"
    )
    private WebElement emailInput;
    @FindBy(
            name = "password"
    )
    private WebElement passwordInput;
    @FindBy(
            xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input"
    )
    private WebElement loginBtn;

    public void LoginPage() {
        this.myAccountLink.click();
        this.loginLink.click();
    }

    public void enterEmail(String email) {
        this.emailInput.clear();
        this.emailInput.sendKeys(new CharSequence[]{email});
    }

    public void enterPassword(String pass) {
        this.passwordInput.clear();
        this.passwordInput.sendKeys(new CharSequence[]{pass});
    }

    public void clicklogin() {
        this.loginBtn.click();
    }
}
