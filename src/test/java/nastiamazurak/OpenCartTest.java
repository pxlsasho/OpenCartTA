package nastiamazurak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.nastiamazurak.CartPage;
import pages.nastiamazurak.DemoMainPage;
import pages.nastiamazurak.LoginPage;
import pages.nastiamazurak.RegisterPage;

public class OpenCartTest
{
    @Test
    public void tesOpenCart () {
        System.setProperty("webdriver.chrome.driver", "/Users/nmazurak/downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        String email = "test32525@test.com";
        DemoMainPage MainPage = PageFactory.initElements(driver, DemoMainPage.class);

        MainPage.open();
        MainPage.clickOnAccount();
        MainPage.clickOnRegister();


        RegisterPage rPage = PageFactory.initElements(driver, RegisterPage.class);
        rPage.enterFirstName("test");
        rPage.enterLastName("testing");
        rPage.enterEmail(email);
        rPage.enterPhone("1111111");
        rPage.enterPassword("12345");
        rPage.confirmPassword("12345");

        rPage.policyCheck();
        rPage.pressContinue();
        rPage.logOut();


    }

    @Test
    public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/nmazurak/downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        String email = "test3152525@test.com";
        String pass = "12345";
        LoginPage lPage = (LoginPage)PageFactory.initElements(driver, LoginPage.class);
        lPage.open();
        lPage.LoginPage();
        lPage.enterEmail(email);
        lPage.enterPassword(pass);
        lPage.clicklogin();
    }

    @Test
    public void addToCartTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/nmazurak/downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        String search = "macbook";
        DemoMainPage MainPage = (DemoMainPage)PageFactory.initElements(driver, DemoMainPage.class);
        MainPage.open();
        MainPage.Search(search);
        CartPage cPage = (CartPage)PageFactory.initElements(driver, CartPage.class);
        cPage.addToCart();
    }
}

