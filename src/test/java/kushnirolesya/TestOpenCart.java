package kushnirolesya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.kushnirolesya.MainPageOpenCart;
import pages.kushnirolesya.RegisterPageOpenCart;

public class TestOpenCart {
    @Test
    public void OpenCart()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        MainPageOpenCart mainPage = PageFactory.initElements(driver, MainPageOpenCart.class);
        mainPage.open();
        mainPage.openRegistration();

        RegisterPageOpenCart registPage = PageFactory.initElements(driver, RegisterPageOpenCart.class);
        registPage.RegisterAs("Doo","Foo","Ddooo@gmail.com",
                "0987654321","DooFoo123", "DooFoo123");

        mainPage.LogOut();
        mainPage.openLogin();
        registPage.LoginAs("Ddooo@gmail.com", "DooFoo123");

    }
}
