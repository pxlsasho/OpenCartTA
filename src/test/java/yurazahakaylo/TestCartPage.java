package yurazahakaylo;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.yurazahakaylo.CartPage;
import org.testng.Assert;
import java.util.concurrent.locks.Condition;
import javax.xml.datatype.Duration;
import java.util.concurrent.TimeUnit;
//import static org.awaitility.Awaitility.*;

public class TestCartPage {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        System.setProperty("webdriver.chrome.driver" ,"C:/Users/Zaga/IdeaProjects/ChromeDriver/chromedriver.exe");

        driver = new ChromeDriver();

        CartPage demo = PageFactory.initElements(driver, CartPage.class);
        demo.open();

    }
    @Test
    public void FirstTest() throws InterruptedException {
        CartPage demo = PageFactory.initElements(driver, CartPage.class);

        demo.search("iphone");
        demo.addToCart();

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(demo.checker));


        Assert.assertTrue(demo.checker.getText().contains
                ("Success: You have added "));
    }
    @AfterTest
    public void afterTest()
    {
        CartPage demo = PageFactory.initElements(driver, CartPage.class);
        demo.close();
    }
}
