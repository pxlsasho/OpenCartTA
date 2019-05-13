
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.RozetkaMainPage;

public class RozetkaTest {

    @Test

    public void testRozetka()
    {
        //Init chrome driver
        System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        /*driver.get("https://rozetka.com.ua");
        driver.findElement(By.linkText("UA")).click();
        driver.findElement(By.linkText("увійдіть в особистий кабінет")).click();
        driver.findElement(By.linkText("Зареєструватися")).click();*/

        RozetkaMainPage rMainPage = PageFactory.initElements(driver, RozetkaMainPage.class);
        rMainPage.open();
        //rMainPage.clickOnUALocalization();
        rMainPage.clickOnPersonalCabinet();
        rMainPage.clickOnRegistration();
    }


}
