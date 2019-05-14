package pages.nastiamazurak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoMainPage{

    private static final String BASE_URL = "https://demo.opencart.com";
    private WebDriver driver;



    @FindBy(linkText = "My Account")
    private WebElement myAccountLink;

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    public DemoMainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void open()
    {
        driver.get(BASE_URL);
    }

    public void clickOnAccount()
    {
        myAccountLink.click();
    }
    public void clickOnRegister(){registerLink.click(); }


}
