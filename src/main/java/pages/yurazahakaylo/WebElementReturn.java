package yurazahakaylo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WebElementReturn

{

    @FindBy(linkText = "My Account")
    public WebElement personalCabinetLink;

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    //Register Account

    @FindBy(id = "input-firstname")
    public WebElement firstNameFlat;

    @FindBy(id = "input-lastname")
    public WebElement lastNameFlat;

    @FindBy(id = "input-email")
    public WebElement eMailFlat;

    @FindBy(id = "input-telephone")
    public WebElement telephoneFlat;

    @FindBy(id = "input-password")
    public WebElement passwordFlat;

    @FindBy(id = "input-confirm")
    public WebElement passwordConfirmFlat;

    @FindBy(name = "agree")
    public WebElement agreePrivacyPolicy;

    @FindBy(className = "btn-primary")
    public WebElement toContinue;



    public WebElement getPersonalCabinetLink(){return this.personalCabinetLink;}
    public WebElement getRegist(){return this.registerLink;}
    public WebElement getFirstNameFlat(){return this.firstNameFlat;}
    public WebElement getLastNameFlat(){return this.lastNameFlat;}
    public WebElement geteMailFlat(){return this.eMailFlat;}
    public WebElement getTelephoneFlat(){return this.telephoneFlat;}
    public WebElement getpasswordFlat(){return this.passwordFlat;}
    public WebElement getPasswordConfirmFlat(){return this.passwordConfirmFlat;}
    public WebElement getAgreePrivacyPolicy(){return this.agreePrivacyPolicy;}
    public WebElement getToContinue(){return this.toContinue;}
}
