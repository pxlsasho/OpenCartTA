package apasternak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.apasternak.CartPage;
import pages.apasternak.LoginPage;
import pages.apasternak.OpenCartMainPage;
import pages.apasternak.Registration;

public class OpenCartTest {


    @Test
    public void FirstTest() {

        //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        OpenCartMainPage opencart = PageFactory.initElements(driver, OpenCartMainPage.class);

        //Open registration form
        opencart.open();
        opencart.clickOnPersonalCabinet();
        opencart.clickOnRegistration();

        Registration registration = PageFactory.initElements(driver, Registration.class);
        //Inputing data
        registration.clickOnFirstNameInput();
        registration.enterFirstNameInput();

        registration.clickOnLastNameInput();
        registration.enterLastNameInput();

        registration.clickOnEmailInput();
        registration.enterEmailInput();

        registration.clickOnTelephoneInput();
        registration.enterTelephoneInput();

        registration.clickOnPasswordInput();
        registration.enterPasswordInput();

        registration.clickOnPasswordConfirmInput();
        registration.enterPasswordConfirmInput();

        //Submit
        registration.clickOnSubscribe();
        registration.clickToAgree();
        registration.clickContinue();

        //Logout
        //registration.clickOnLogout();

        //Logging
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);

        login.open();
        login.clickOnPersonalCabinet();
        login.clickOnLogin();
        login.clickOnEmail();
        login.inputEmail();
        login.clickOnPassword();
        login.inputPassword();
        login.loginButton();

        //Buying
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        cartPage.clickOnYourStore();
        cartPage.clickOnSearch();
        cartPage.inputSearch();
        cartPage.clickOnSearchButton();
        cartPage.clickOnAddToCartButton();
        cartPage.goToViewCart();
    }

}