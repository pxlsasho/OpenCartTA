package olishchuk1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.olishchuk1.OpenCartMainPage;
import pages.olishchuk1.OpenCartCartPage;
import pages.olishchuk1.OpenCartRegisterPage;

import java.util.Random;

public class OpenCartTest
{
    public WebDriver driver;

    public String getSaltString()
    {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    @BeforeTest
    public void setBrowser()
    {
        //System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        System.setProperty("webdriver.chrome.driver",
               "E:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void openCartTest()
    {
        String email = getSaltString()+ "@gmail.com";

        OpenCartMainPage OCMainPage = PageFactory.initElements(driver, OpenCartMainPage.class);
        OCMainPage.openMainPage();
        OCMainPage.openRegistration();

        OpenCartRegisterPage OCRegPage = new OpenCartRegisterPage(driver);
        OCRegPage.RegisterAs("Foo", "Bar", email,
                "555-555", "ADMIN", "ADMIN");

        String expectedTitle = "Your Account Has Been Created!";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }




}
