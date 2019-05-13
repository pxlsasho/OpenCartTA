package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaMainPage {

    //CONTANTS
    private static final String BASE_URL = "https://rozetka.com.ua";

    //FIELDS
    private WebDriver driver;

    //WEB ELEMENTS
    @FindBy(linkText = "UA")
    private WebElement uaLink;

    @FindBy(linkText = "увійдіть в особистий кабінет")
    private WebElement personalCabinetLink;

    @FindBy(linkText = "Зареєструватися")
    private WebElement registerLink;

    //CONSTRUCTOR
    public RozetkaMainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //MAIN METHODS
    //@Step
    public void open()
    {
        driver.get(BASE_URL);
    }

    public void clickOnUALocalization()
    {
        uaLink.click();
    }
    public void clickOnPersonalCabinet()
    {
        personalCabinetLink.click();
    }
    public void clickOnRegistration()
    {
        registerLink.click();
    }
}
