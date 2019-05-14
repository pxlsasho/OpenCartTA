package nastiamazurak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.nastiamazurak.DemoMainPage;
import pages.nastiamazurak.RegisterPage;

public class OpenCartTest
{
    @Test
    public void tesOpenCart () {
        System.setProperty("webdriver.chrome.driver", "/Users/nmazurak/downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        String email = "test2525@test.com";
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


    }
}

