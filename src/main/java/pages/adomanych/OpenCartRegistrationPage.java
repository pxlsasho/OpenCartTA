package pages.adomanych;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartRegistrationPage {
    private static final String BASE_URL = "https://demo.opencart.com/";
    private WebDriver driver;
    @FindBy (xpath = "/html/body/nav/div/div[2]/ul/li[2]/a")
    private WebElement myAccountButton;
    @FindBy (name = "firstname")
    private WebElement firstNameLink;
    @FindBy (name = "lastname")
    private WebElement lastNameLink;
    @FindBy (name = "email")
    private WebElement emailLink;
    @FindBy (name = "telephone")
    private WebElement telephoneLink;
    @FindBy (name = "password")
    private WebElement passwordLink;
    @FindBy (name = "confirm")
    private WebElement passwordConfirmLink;
    @FindBy (name = "agree")
    private WebElement agreePrivacyPolicyLink;
    @FindBy (xpath = "/html/body/div[2]/div/div/form/div/div/input[2]")
    private WebElement continueButton;
    @FindBy (linkText = "Logout")
    private WebElement logoutButton;



    public void InputFirstName(String firstname){
        firstNameLink.click();
        firstNameLink.clear();
        firstNameLink.sendKeys(firstname);
    }
    public void InputLastName(String lastname){
        lastNameLink.click();
        lastNameLink.clear();
        lastNameLink.sendKeys(lastname);
    }
    public void Inputemail(String email){
        emailLink.click();
        emailLink.clear();
        emailLink.sendKeys(email);
    }
    public void InputTelephoneNumber(String telephon){
        telephoneLink.click();
        telephoneLink.clear();
        telephoneLink.sendKeys(telephon);
    }
    public void InputPassword(String password){
        passwordLink.click();
        passwordLink.clear();
        passwordLink.sendKeys(password);
    }
    public void InputConfirmPassword(String confirmpassword){
        passwordConfirmLink.click();
        passwordConfirmLink.clear();
        passwordConfirmLink.sendKeys(confirmpassword);
    }
    public void AgreePrivatePolicy(){
        agreePrivacyPolicyLink.click();
    }
    public void Continue(){
        continueButton.click();
    }
    public void Logout(){
        myAccountButton.click();
        logoutButton.click();
    }
    public void Registration(String firstname, String lastname, String email,
                             String telephon, String password, String confirmpassword){

        InputFirstName(firstname);
        InputLastName(lastname);
        Inputemail(email);
        InputTelephoneNumber(telephon);
        InputPassword(password);
        InputConfirmPassword(confirmpassword);
        AgreePrivatePolicy();
        Continue();
    }
}
