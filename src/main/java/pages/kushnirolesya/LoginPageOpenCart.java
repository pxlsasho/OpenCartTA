package pages.kushnirolesya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageOpenCart {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
    private WebElement loginButton;

    @FindBy(name = "email")
    private WebElement emailLink;

    @FindBy(name = "password")
    private WebElement passwordLink;

    public LoginPageOpenCart(WebDriver driver)
    {
        this.driver = driver;
    }

    public void ClickOnLogin(){loginButton.click();}

    public  void enterEmail(String email)
    {
        emailLink.click();
        emailLink.clear();
        emailLink.sendKeys(email);
    }

    public  void enterPassword(String password)
    {
        passwordLink.click();
        passwordLink.clear();
        passwordLink.sendKeys(password);
    }

    public void LoginAs(String email, String password)
    {
        enterEmail(email);
        enterPassword(password);
        ClickOnLogin();
    }
}
