package yurazahakaylo;

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

    //

    public void useFirstNameFlat() {
        firstNameFlat.click();
        firstNameFlat.sendKeys("Jastin");
    }


    public void useLastNameFlat() {
        lastNameFlat.click();
        lastNameFlat.sendKeys("Vlastelin");
    }


    public void useEMailFlat() {
        eMailFlat.click();
        eMailFlat.sendKeys("mieysemail@gmail.com");
    }


    public void useTelephoneFlat(){
        telephoneFlat.click();
        telephoneFlat.sendKeys("26589426444");
    }


    public void usePasswordFlat(){
        passwordFlat.click();
        passwordFlat.sendKeys("9866");
    }


    public void UsePasswordConfirmFlat(){
        passwordConfirmFlat.click();
        passwordConfirmFlat.sendKeys("9866");
    }



    public void clickToAgreePrivacyPolicy(){ agreePrivacyPolicy.click();}
    public void clickToContinue(){ toContinue.click();}



    @FindBy(xpath = "//*[@id=\"account-register\"]/div[1]")
    private WebElement checker;



    public void check(){
        boolean b = checker.isDisplayed();
    }
}

