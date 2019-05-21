package yurazahakaylo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    private static final String BASE_URL = "https://demo.opencart.com";
    private WebDriver driver;
    public MainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(linkText = "My Account")
    private WebElement accountLink;

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(linkText = "Login")
    private WebElement loginLink;


    public void open()
    {
        driver.get(BASE_URL);
    }
    public void close(){driver.quit();}

    public void openRegistrationPage()
    {
        driver.get(BASE_URL);
        accountLink.click();
        registerLink.click();
    }

    public  void openLoginPage()
    {
        driver.get(BASE_URL);
        accountLink.click();
        loginLink.click();
    }




}
