package adomanych;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import pages.adomanych.OpenCartMainPage;
import pages.adomanych.OpenCartRegistrationPage;
import org.testng.Assert;

import java.util.Random;


public class OpenCartTest {
    public WebDriver driver;

    public String BuildRandomEmail(){
        String SaltCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SaltCHARS.length());
            salt.append(SaltCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }




    @BeforeTest
    public void setBrowser()
    {
        //System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openCartTest()
    {
        String email = BuildRandomEmail() + "@gmail.com";
        OpenCartMainPage rMainPage = PageFactory.initElements(driver, OpenCartMainPage.class);
        rMainPage.OpenMainPage();
        rMainPage.OpenregistrationPage();
        OpenCartRegistrationPage rRegisterPage = PageFactory.initElements(driver, OpenCartRegistrationPage.class);
        rRegisterPage.Registration("Catt", "Cotorv",email,
                                    "1234", "1234", "1234");
        //rRegisterPage.Logout();
        String expectedTitle = "Your Account Has Been Created!";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        rRegisterPage.Logout();

    }
}
