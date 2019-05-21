package ovoroniak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.olishchuk1.OpenCartMainPage;
import pages.olishchuk1.OpenCartRegisterPage;

public class OpenCartTest
{
    public WebDriver driver;

    @BeforeTest
    public void setBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\123\\Downloads\\chromedriver_win32.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void openCartTest()
    {
        OpenCartMainPage OCMainPage = PageFactory.initElements(driver, OpenCartMainPage.class);
        OCMainPage.openMainPage();
        OCMainPage.openRegistration();

        OpenCartRegisterPage OCRegPage = new OpenCartRegisterPage(driver);
        OCRegPage.RegisterAs("Foo", "Bar", "foo.bar@gmail.com",
                "555-555", "ADMIN", "ADMIN");
    }




}
