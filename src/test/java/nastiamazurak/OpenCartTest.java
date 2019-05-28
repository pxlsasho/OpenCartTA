package nastiamazurak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.nastiamazurak.CartPage;
import pages.nastiamazurak.DemoMainPage;
import pages.nastiamazurak.LoginPage;
import pages.nastiamazurak.RegisterPage;

import java.util.Random;

public class OpenCartTest
{
    String driverPath =  "/Users/nmazurak/downloads/chromedriver";
    private WebDriver driver;

    Random rand = new Random();
    int n = rand.nextInt();
    String email = n + "test663@test.com";
    String pass = "12345";

    @BeforeTest
    public void launchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @Test
    public void RegistrationAndLogout () {


       // System.setProperty("webdriver.chrome.driver", driverPath);
       // WebDriver driver = new ChromeDriver();


        DemoMainPage MainPage = PageFactory.initElements(driver, DemoMainPage.class);

        MainPage.open();
        MainPage.clickOnAccount();
        MainPage.clickOnRegister();


        RegisterPage rPage = PageFactory.initElements(driver, RegisterPage.class);
        rPage.enterFirstName("test");
        rPage.enterLastName("testing");
        rPage.enterEmail(email);
        rPage.enterPhone("1111111");
        rPage.enterPassword(pass);
        rPage.confirmPassword(pass);

        rPage.policyCheck();
        rPage.pressContinue();
        rPage.logOut();
        String logOutCheck = "Account Logout";
        

        Assert.assertEquals(rPage.ActualResult(),logOutCheck );


    }

    @Test
    public void loginTest() {
        //System.setProperty("webdriver.chrome.driver", "/Users/nmazurak/downloads/chromedriver");
      // WebDriver driver = new ChromeDriver();
       // String email = "test3152525@test.com";

        LoginPage lPage = (LoginPage)PageFactory.initElements(driver, LoginPage.class);
        lPage.open();
        lPage.LoginPage();
        lPage.enterEmail(email);
        lPage.enterPassword(pass);
        lPage.clicklogin();
        String expectedResult = "My Account";

        Assert.assertEquals(expectedResult, lPage.ActualResult());


    }

    @Test
    public void addToCartTest() {

        String search = "macbook";
        DemoMainPage MainPage = (DemoMainPage)PageFactory.initElements(driver, DemoMainPage.class);
        MainPage.open();
        MainPage.Search(search);
        CartPage cPage = (CartPage)PageFactory.initElements(driver, CartPage.class);
        cPage.addToCart();
        cPage.cartTotalClick();

        //String expectedItem = "x 1";

        //Assert.assertEquals(expectedItem, cPage.Result());

        //String expectedResult = "Success: You have added MacBook to your shopping cart!";

        //Assert.assertEquals(cPage.actualResult(), expectedResult);

        //Assert.assertEquals(cPage.Result(), "Search - macbook");



    }
}

