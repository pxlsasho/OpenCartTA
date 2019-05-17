package kushnirolesya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.kushnirolesya.CartPageOpenCart;
import pages.kushnirolesya.LoginPageOpenCart;
import pages.kushnirolesya.MainPageOpenCart;
import pages.kushnirolesya.RegisterPageOpenCart;

public class TestOpenCart {
    String driverPath = "C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver;
    public String email = "Zzooo@gmail.com";

    @BeforeTest
    public void launchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void RegisterOpenCart()
    {
        MainPageOpenCart mainPage = PageFactory.initElements(driver, MainPageOpenCart.class);

        mainPage.openRegistration();

        RegisterPageOpenCart registPage = PageFactory.initElements(driver, RegisterPageOpenCart.class);
        registPage.RegisterAs("Doo","Foo", email,
                "0987654321","DooFoo123", "DooFoo123");
        mainPage.LogOut();
    }

    @Test(priority = 2)
    public void LoginOpenCart()
    {
        MainPageOpenCart mainPage = PageFactory.initElements(driver, MainPageOpenCart.class);

        mainPage.openLogin();

        LoginPageOpenCart loginPage = PageFactory.initElements(driver, LoginPageOpenCart.class);

        loginPage.LoginAs(email, "DooFoo123");
    }
    @Test(priority = 3)
    public void AddToCartOpenCart()
    {
        MainPageOpenCart mainPage = PageFactory.initElements(driver, MainPageOpenCart.class);

        mainPage.open();

        CartPageOpenCart cartPage = PageFactory.initElements(driver, CartPageOpenCart.class);

        cartPage.searchItem("iMac");
        cartPage.AddToCart();
    }
    /*@AfterTest
    public void OpenCartClose()
    {
        driver.close();
    } */
}
