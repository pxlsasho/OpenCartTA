package kushnirolesya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.kushnirolesya.CartPageOpenCart;
import pages.kushnirolesya.LoginPageOpenCart;
import pages.kushnirolesya.MainPageOpenCart;
import pages.kushnirolesya.RegisterPageOpenCart;

import java.util.Random;

public class TestOpenCart {
    String driverPath = "C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver;
    String email = BuildRandomEmail() + "@gmail.com";

    public String BuildRandomEmail(){
        String SaltCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SaltCHARS.length());
            salt.append(SaltCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    @BeforeTest
    public void launchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void RegisterOpenCart()
    {
        MainPageOpenCart mainPage = PageFactory.initElements(driver, MainPageOpenCart.class);

        mainPage.openRegistration();

        Assert.assertTrue(mainPage.CheckValidMainPageOpening());

        RegisterPageOpenCart registPage = PageFactory.initElements(driver, RegisterPageOpenCart.class);
        registPage.RegisterAs("Doo","Foo", email,
                "0987654321","DooFoo123", "DooFoo123");

        Assert.assertTrue(registPage.CheckValidRegistration());
        mainPage.LogOut();
    }

    @Test(priority = 2)
    public void LoginOpenCart()
    {
        MainPageOpenCart mainPage = PageFactory.initElements(driver, MainPageOpenCart.class);

        mainPage.openLogin();

        Assert.assertTrue(mainPage.CheckValidMainPageOpening());

        LoginPageOpenCart loginPage = PageFactory.initElements(driver, LoginPageOpenCart.class);

        loginPage.LoginAs(email, "DooFoo123");

        Assert.assertTrue(loginPage.CheckValidLogin());
    }
    @Test(priority = 3)
    public void AddToCartOpenCart()
    {
        MainPageOpenCart mainPage = PageFactory.initElements(driver, MainPageOpenCart.class);

        mainPage.open();

        Assert.assertTrue(mainPage.CheckValidMainPageOpening());

        CartPageOpenCart cartPage = PageFactory.initElements(driver, CartPageOpenCart.class);

        cartPage.searchItem("iMac");
        cartPage.AddToCart();

        //Assert.assertTrue(cartPage.CheckValidCartAdd());
    }
    /*@AfterTest
    public void OpenCartClose()
    {
        driver.close();
    } */
}
