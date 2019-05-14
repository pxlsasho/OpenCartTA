package yurazahakaylo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDemo
{
    @Test
    public void FirstTest()
    {
        System.setProperty("webdriver.chrome.driver" ,"C:/Users/Zaga/IdeaProjects/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();



        DemoMainPage demo = PageFactory.initElements(driver, DemoMainPage.class);

        //GO TO Register Account PAGE
        demo.open();
        demo.clickOnPersonalCabinet();
        demo.clickOnRegistration();

        //Register Account
        demo.clickOnFirstNameFlat();
        demo.enterFirstName();

        demo.clickOnLastNameFlat();
        demo.enterLastName();

        demo.clickOnEMailFlat();
        demo.enterEMail();

        demo.clickOnTelephoneFlat();
        demo.enterTelephone();

        demo.clickOnPasswordFlat();
        demo.enterPassword();

        demo.clickOnPasswordConfirmFlat();
        demo.enterPasswordConfirm();

        demo.clickToAgreePrivacyPolicy();
        demo.clickToContinue();
        //



        //rMainPage.open();
        //rMainPage.clickOnUALocalization();
        //rMainPage.clickOnPersonalCabinet();
        //rMainPage.clickOnRegistration();


    }

}