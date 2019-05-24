
import static org.testng.Assert.assertEquals;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class FirstTest {

    @Test
    public void FirstTEst()
    {
        System.setProperty("webdriver.chrome.driver" ,  "/Users/osynyava/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Implicit Wait : DO NOT RECCOMEND!
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //Explicit Wait
        driver.get("https://apple.com/");
        WebDriverWait wait = new WebDriverWait(driver,10);
        //WebElement buyLink =
                //wait.until(ExpectedConditions.elementToBeClickable
                       // (By.xpath("//a[contains(@class, 'cta')][2]")));

        //WebElement element = driver.findElement(By.xpath("//a[contains(@class, 'cta')][2]"));
       // buyLink.click();







    }
}
