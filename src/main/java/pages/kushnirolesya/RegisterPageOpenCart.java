package pages.kushnirolesya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageOpenCart {
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


    public RegisterPageOpenCart(WebDriver driver)
    {
        this.driver = driver;
    }

    public  void enterFirstName(String name)
    {
        firstNameLink.click();
        firstNameLink.clear();
        firstNameLink.sendKeys(name);
    }

    public  void enterSurname(String surname)
    {
        surnameLink.click();
        surnameLink.clear();
        surnameLink.sendKeys(surname);
    }

    public  void enterEmail(String email)
    {
        emailLink.click();
        emailLink.clear();
        emailLink.sendKeys(email);
    }

    public  void enterTelephone(String phone)
    {
        telephoneLink.click();
        telephoneLink.clear();
        telephoneLink.sendKeys(phone);
    }

    public  void enterPassword(String password)
    {
        passwordLink.click();
        passwordLink.clear();
        passwordLink.sendKeys(password);
    }

    public  void enterConfirmPassword(String confirmPassword)
    {
        confirmPasswordLink.click();
        confirmPasswordLink.clear();
        confirmPasswordLink.sendKeys(confirmPassword);
    }

    public void ClickOnRegisterButton(){continueButton.click();}

    public  void ClickOnPrivacyPolicyAgree(){agreePrivacyPolicyLink.click();}

    public void RegisterAs(String firstname, String surname, String email, String telephone, String password, String confirmPassword)
    {
        enterFirstName(firstname);
        enterSurname(surname);
        enterEmail(email);
        enterTelephone(telephone);
        enterPassword(password);
        enterConfirmPassword(confirmPassword);
        ClickOnPrivacyPolicyAgree();
        ClickOnRegisterButton();
    }
}
