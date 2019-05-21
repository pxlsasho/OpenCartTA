package yurazahakaylo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
    public void FirstTest()
    {
        CartPage demo = PageFactory.initElements(driver, CartPage.class);

        demo.search();
        demo.addToCart();

        demo.check();

    }
    @AfterTest
    public void afterTest()
    {
        CartPage demo = PageFactory.initElements(driver, CartPage.class);
       // demo.close();
    }
}
