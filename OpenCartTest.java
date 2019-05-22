package cstashkevych;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.cstashkevych.CartPage;
import pages.cstashkevych.LoginPage;
import pages.cstashkevych.OpenCartMainPage;
import pages.cstashkevych.Registration;

public class OpenCartTest
{

    @Test
    public void FirstTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

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


        LoginPage login = PageFactory.initElements(driver, LoginPage.class);

        //Open login page
        login.clickOnPersonalCabinet();
        login.clickOnLogout();
        login.clickOnLogin();

        //Login
        login.clickOnEmailInput();
        login.enterEmailInput();

        login.clickOnPasswordInput();
        login.enterPasswordInput();

        login.clickOnLoginButton();

        //Search
        CartPage cart = PageFactory.initElements(driver, CartPage.class);

        cart.clickOnInputSearch();
        cart.enterInputSearch();

        cart.clickOnButtonSearch();
        cart.clickOniPhoneLink();
        cart.clickOnAddToCart();
    }
}