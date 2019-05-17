package pages.yurazahakaylo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register

{
    private static final String BASE_URL = "https://demo.opencart.com";
    private WebDriver driver;

    public Register(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(BASE_URL);
    }



    @FindBy(linkText = "My Account")
    private WebElement personalCabinetLink;


    @FindBy(linkText = "Register")
    private WebElement registerLink;


    //Register Account

    @FindBy(id = "input-firstname")
    private WebElement firstNameFlat;

    @FindBy(id = "input-lastname")
    private WebElement lastNameFlat;

    @FindBy(id = "input-email")
    private WebElement eMailFlat;

    @FindBy(id = "input-telephone")
    private WebElement telephoneFlat;

    @FindBy(id = "input-password")
    private WebElement passwordFlat;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmFlat;

    @FindBy(name = "agree")
    private WebElement agreePrivacyPolicy;

    @FindBy(className = "btn-primary")
    private WebElement toContinue;




    public void clickOnPersonalCabinet() {
        personalCabinetLink.click();
    }

    public void clickOnRegistration() {
        registerLink.click();
    }

    public void clickOnFirstNameFlat() {
        firstNameFlat.click();
    }

    public void enterFirstName() {
        firstNameFlat.sendKeys("Chornuy");
    }

    public void clickOnLastNameFlat() {
        lastNameFlat.click();
    }

    public void enterLastName() {
        lastNameFlat.sendKeys("Vlastelin");
    }

    public void clickOnEMailFlat() {
        eMailFlat.click();
    }

    public void enterEMail() {
        eMailFlat.sendKeys("miyemail@gmail.com");
    }

    public void clickOnTelephoneFlat() {
        telephoneFlat.click();
    }

    public void enterTelephone() {
        telephoneFlat.sendKeys("26589426444");
    }

    public void clickOnPasswordFlat() {
        passwordFlat.click();
    }

    public void enterPassword() {
        passwordFlat.sendKeys("9866");
    }

    public void clickOnPasswordConfirmFlat() {
        passwordConfirmFlat.click();
    }

    public void enterPasswordConfirm() {
        passwordConfirmFlat.sendKeys("9866");
    }

    public void clickToAgreePrivacyPolicy() {
        agreePrivacyPolicy.click();
    }

    public void clickToContinue() {
        toContinue.click();
    }

}