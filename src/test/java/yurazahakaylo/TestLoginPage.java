package yurazahakaylo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
    public void FirstTest()
    {
        LoginPage demo = PageFactory.initElements(driver, LoginPage.class);

        demo.useEmailFlat();
        demo.usePasswordFlat();
        demo.clickOnLoginBtn();

        demo.check();
    }
    @AfterTest
    public void afterTest()
    {
        LoginPage demo = PageFactory.initElements(driver, LoginPage.class);
        demo.close();
    }

}
