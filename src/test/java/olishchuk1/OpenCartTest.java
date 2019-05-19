package olishchuk1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.olishchuk1.OpenCartMainPage;
import pages.olishchuk1.OpenCartCartPage;
import pages.olishchuk1.OpenCartRegisterPage;

public class OpenCartTest
{
    public WebDriver driver;

    @BeforeTest
    public void setBrowser()
    {
        System.setProperty("webdriver.chrome.driver",
                "E:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
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
