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

    @FindBy(name = "search")
    private WebElement searchline;

    @FindBy(xpath = "/html/body/header/div/div/div[2]/div/span/button")
    private WebElement searchButton;

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

    public void Search(String search) {
        this.searchline.sendKeys(search);
        this.searchButton.click();
    }





}
