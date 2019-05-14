package yurazahakaylo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoMainPage
{
    private static final String BASE_URL = "https://demo.opencart.com";
    private WebDriver driver;
    public DemoMainPage(WebDriver driver)
    {
        this.driver = driver;
    }


    WebElementReturn ElementReturn = new WebElementReturn();


    WebElement personalCabinetLink = ElementReturn.getPersonalCabinetLink();
    WebElement registerLink = ElementReturn.getRegist();
    WebElement firstNameFlat = ElementReturn.getFirstNameFlat();
    WebElement lastNameFlat = ElementReturn.getLastNameFlat();
    WebElement eMailFlat = ElementReturn.geteMailFlat();
    WebElement telephoneFlat = ElementReturn.getTelephoneFlat();
    WebElement passwordFlat = ElementReturn.getpasswordFlat();
    WebElement passwordConfirmFlat = ElementReturn.getPasswordConfirmFlat();
    WebElement agreePrivacyPolicy = ElementReturn.getAgreePrivacyPolicy();
    WebElement toContinue = ElementReturn.getToContinue();




    public void open()
    {
        driver.get(BASE_URL);
    }


    public void clickOnPersonalCabinet(){ personalCabinetLink.click(); }
    public void clickOnRegistration(){ registerLink.click();}

    public void clickOnFirstNameFlat(){ firstNameFlat.click();}
    public void enterFirstName() {firstNameFlat.sendKeys("Chornuy");}

    public void clickOnLastNameFlat(){ lastNameFlat.click();}
    public void enterLastName() {lastNameFlat.sendKeys("Vlastelin");}

    public void clickOnEMailFlat(){ eMailFlat.click();}
    public void enterEMail() {eMailFlat.sendKeys("miyemail@gmail.com");}

    public void clickOnTelephoneFlat(){ telephoneFlat.click();}
    public void enterTelephone() {telephoneFlat.sendKeys("26589426444");}

    public void clickOnPasswordFlat(){ passwordFlat.click();}
    public void enterPassword() {passwordFlat.sendKeys("9866");}

    public void clickOnPasswordConfirmFlat(){ passwordConfirmFlat.click();}
    public void enterPasswordConfirm() {passwordConfirmFlat.sendKeys("9866");}

    public void clickToAgreePrivacyPolicy(){ agreePrivacyPolicy.click();}
    public void clickToContinue(){ toContinue.click();}

}
