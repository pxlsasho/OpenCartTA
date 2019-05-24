package yurazahakaylo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.yurazahakaylo.RegistrationPage;

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

       demo.useFirstNameFlat("Igor");
       demo.useLastNameFlat("Pypok");
       demo.useEMailFlat("kolega@zelenskiy.ua");
       demo.useTelephoneFlat("097851685");
       demo.usePasswordFlat("9866");
       demo.UsePasswordConfirmFlat("9866");
       demo.clickToAgreePrivacyPolicy();
       demo.clickToContinue();



       Assert.assertEquals(demo.checker.getText(), "Warning: E-Mail Address is already registered!");

    }
    @AfterTest
    public void afterTest()
    {
        RegistrationPage demo = PageFactory.initElements(driver, RegistrationPage.class);


        demo.close();
    }

}
