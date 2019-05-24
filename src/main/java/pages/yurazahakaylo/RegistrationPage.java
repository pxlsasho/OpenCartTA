package pages.yurazahakaylo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

    private static final String BASE_URL = "https://demo.opencart.com/index.php?route=account/register";
    private WebDriver driver;

    public RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
    }


    public void open() {driver.get(BASE_URL);}
    public void close(){driver.quit();}


    //Register Account

    @FindBy(id = "input-firstname")
    private WebElement firstNameFlat;

    @FindBy(id = "input-lastname")
    public WebElement lastNameFlat;

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

    //

    public void useFirstNameFlat(String firstNameSendKeys) {
        firstNameFlat.click();
        firstNameFlat.sendKeys(firstNameSendKeys);
    }


    public void useLastNameFlat(String lastNameSendKeys) {
        lastNameFlat.click();
        lastNameFlat.sendKeys(lastNameSendKeys);
    }


    public void useEMailFlat(String eMailSendKeys) {
        eMailFlat.click();
        eMailFlat.sendKeys(eMailSendKeys);
    }


    public void useTelephoneFlat(String telephoneSendKeys){
        telephoneFlat.click();
        telephoneFlat.sendKeys(telephoneSendKeys);
    }


    public void usePasswordFlat(String passwordSendKeys){
        passwordFlat.click();
        passwordFlat.sendKeys(passwordSendKeys);
    }


    public void UsePasswordConfirmFlat(String passwordConfirmSendKeys){
        passwordConfirmFlat.click();
        passwordConfirmFlat.sendKeys(passwordConfirmSendKeys);
    }



    public void clickToAgreePrivacyPolicy(){ agreePrivacyPolicy.click();}
    public void clickToContinue(){ toContinue.click();}



    @FindBy(xpath = "//*[@id=\"account-register\"]/div[1]")
    public WebElement checker;




}

