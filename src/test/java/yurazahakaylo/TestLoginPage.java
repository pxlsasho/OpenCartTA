package yurazahakaylo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.yurazahakaylo.LoginPage;

public class TestLoginPage {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        System.setProperty("webdriver.chrome.driver" ,"C:/Users/Zaga/IdeaProjects/ChromeDriver/chromedriver.exe");

        driver = new ChromeDriver();


        LoginPage demo = PageFactory.initElements(driver, LoginPage.class);
        demo.open();

    }
    @Test
    public void LoginTest()
    {
        LoginPage demo = PageFactory.initElements(driver, LoginPage.class);

        demo.useEmailFlat("kolega@zelenskiy.ua");
        demo.usePasswordFlat("9866");
        demo.clickOnLoginBtn();


        Assert.assertTrue(demo.loginMessagechecker.getText().contains
                ("My Account"));


    }
    @AfterTest
    public void afterTest()
    {

        LoginPage demo = PageFactory.initElements(driver, LoginPage.class);

        demo.close();
    }

}
