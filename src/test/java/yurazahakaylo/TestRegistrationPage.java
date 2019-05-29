package yurazahakaylo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.yurazahakaylo.helper.Random;
import pages.yurazahakaylo.RegistrationPage;

public class TestRegistrationPage {
    private WebDriver driver;
    Random random = new Random();

    @BeforeMethod
    public void beforeMethod()
    {
        System.setProperty("webdriver.chrome.driver" ,"C:/Users/Zaga/IdeaProjects/ChromeDriver/chromedriver.exe");

        driver = new ChromeDriver();

        RegistrationPage demo = PageFactory.initElements(driver, RegistrationPage.class);
        demo.open();
    }
    @Test(priority = 1)
    public void RegistrationNewUserTest()
    {
       RegistrationPage demo = PageFactory.initElements(driver, RegistrationPage.class);

       demo.useFirstNameFlat(random.randomName);
       demo.useLastNameFlat(random.randomSecondName);
       demo.useEMailFlat(random.randomEmail);
       demo.useTelephoneFlat(random.randomPhoneNumber);
       demo.usePasswordFlat(random.randomPassword);
       demo.UsePasswordConfirmFlat(random.randomPassword);
       demo.clickToAgreePrivacyPolicy();
       demo.clickToContinue();

        Assert.assertTrue(demo.newUserRegistratedChecker.getText().contains
                ("Your Account Has Been Created!"));

    }

    @Test(priority = 2)
    public void NotEnoughCharactersForPasswordTest()
    {
        RegistrationPage demo = PageFactory.initElements(driver, RegistrationPage.class);

        String uncorrectPassword = random.BuildRandomStringBetween(0,3);


        demo.useFirstNameFlat("Igor");
        demo.useLastNameFlat("Pypok");
        demo.useEMailFlat("kolega@zelenskiy.ua");
        demo.useTelephoneFlat("097851685");
        demo.usePasswordFlat(uncorrectPassword);
        demo.UsePasswordConfirmFlat(uncorrectPassword);
        demo.clickToAgreePrivacyPolicy();
        demo.clickToContinue();

        Assert.assertTrue(demo.notTrueAmountForPasswordChecker.getText().contains
                ("Password must be between 4 and 20 characters!"));
    }

    @Test(priority = 3)
    public void TooMuchCharactersForPasswordTest()
    {
        RegistrationPage demo = PageFactory.initElements(driver, RegistrationPage.class);

        String uncorrectPassword = random.BuildRandomStringBetween(21,50);

        demo.useFirstNameFlat("Igor");
        demo.useLastNameFlat("Pypok");
        demo.useEMailFlat("dassld@zelenskiy.ua");
        demo.useTelephoneFlat("097851685");
        demo.usePasswordFlat(uncorrectPassword);
        demo.UsePasswordConfirmFlat(uncorrectPassword);  //
        demo.clickToAgreePrivacyPolicy();
        demo.clickToContinue();

        Assert.assertTrue(demo.notTrueAmountForPasswordChecker.getText().contains
                ("Password must be between 4 and 20 characters!"));
    }

    @AfterMethod
    public void afterMethod()
    {
        RegistrationPage demo = PageFactory.initElements(driver, RegistrationPage.class);


        demo.close();

    }

}
