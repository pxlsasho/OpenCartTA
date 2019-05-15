package yuriikhilchenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.yuriikhilchenko.MainPage;
import pages.yuriikhilchenko.RegisterPage;

public class OpenCartTest
{
    @Test
    public void openCartTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        MainPage MainPage = PageFactory.initElements(driver, MainPage.class);
        MainPage.open();
        MainPage.clickOnAccount();
        MainPage.clickOnRegister();

        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
        registerPage.enterFirstName("Yurii");
        registerPage.enterLastName("Khilchenko");
        registerPage.enterEmail("mail@mail.com");
        registerPage.enterPhone("12345678");
        registerPage.enterPassword("12345qwert!@QW");
        registerPage.confirmPassword("12345qwert!@QW");

        registerPage.policyCheck();
        registerPage.pressContinue();


    }
}