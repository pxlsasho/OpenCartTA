package yurazahakaylo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRegistrationPage {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        System.setProperty("webdriver.chrome.driver" ,"C:/Users/Zaga/IdeaProjects/ChromeDriver/chromedriver.exe");

        driver = new ChromeDriver();

        RegistrationPage demo = PageFactory.initElements(driver, RegistrationPage.class);
        demo.open();

    }
    @Test
    public void FirstTest()
    {
       RegistrationPage demo = PageFactory.initElements(driver, RegistrationPage.class);

       demo.useFirstNameFlat();
       demo.useLastNameFlat();
       demo.useEMailFlat();
       demo.useTelephoneFlat();
       demo.usePasswordFlat();
       demo.UsePasswordConfirmFlat();
       demo.clickToAgreePrivacyPolicy();
       demo.clickToContinue();

       demo.check();

    }
    @AfterTest
    public void afterTest()
    {
        RegistrationPage demo = PageFactory.initElements(driver, RegistrationPage.class);


        demo.close();
    }

}
