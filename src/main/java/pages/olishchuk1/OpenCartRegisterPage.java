package pages.olishchuk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartRegisterPage {
    private static final String BASE_URL = "https://demo.opencart.com/";
    private WebDriver driver;

    @FindBy(name = "firstname")
    private WebElement firstNameLink;

    @FindBy(name = "lastname")
    private WebElement surnameLink;

    @FindBy(name = "email")
    private WebElement emailLink;

    @FindBy(name = "telephone")
    private WebElement telephoneLink;

    @FindBy(name = "password")
    private WebElement passwordLink;

    @FindBy(name = "confirm")
    private WebElement confirmPasswordLink;

    @FindBy(name = "agree")
    private WebElement agreePrivacyPolicyLink;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/div/input[2]")
    private WebElement continueButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/h1")
    private WebElement sucsesfulReg;


    public OpenCartRegisterPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void inputFirstName(String name)
    {
        firstNameLink.click();
        firstNameLink.clear();
        firstNameLink.sendKeys(name);
    }

    public void inputSurname(String surname)
    {
        surnameLink.click();
        surnameLink.clear();
        surnameLink.sendKeys(surname);
    }

    public void inputEmail(String email)
    {
        emailLink.click();
        emailLink.clear();
        emailLink.sendKeys(email);
    }

    public void inputTelephone(String phone)
    {
        telephoneLink.click();
        telephoneLink.clear();
        telephoneLink.sendKeys(phone);
    }

    public void inputPassword(String password)
    {
        passwordLink.click();
        passwordLink.clear();
        passwordLink.sendKeys(password);
    }

    public void inputConfirmPassword(String confirmPassword)
    {

        confirmPasswordLink.click();
        confirmPasswordLink.clear();
        confirmPasswordLink.sendKeys(confirmPassword);
    }

    public void ClickOnRegisterButton(){continueButton.click();}

    public void ClickOnLogin(){loginButton.click();}

    public void ClickOnPrivacyPolicyAgree(){agreePrivacyPolicyLink.click();}

    public void RegisterAs(String firstname, String surname,
                           String email, String telephone,
                           String password, String confirmPassword)
    {
        inputFirstName(firstname);
        inputSurname(surname);
        inputEmail(email);
        inputTelephone(telephone);
        inputPassword(password);
        inputConfirmPassword(confirmPassword);
        ClickOnPrivacyPolicyAgree();
        ClickOnRegisterButton();
    }

    public void LoginAs(String email, String password)
    {
        inputEmail(email);
        inputPassword(password);
        ClickOnLogin();
    }
}
