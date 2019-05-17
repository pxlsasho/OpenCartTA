package pages.kushnirolesya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageOpenCart {
    private static final String BASE_URL = "https://demo.opencart.com/";
    //private static final String LOGOUT_URL = "https://demo.opencart.com/index.php?route=account/logout";
    private WebDriver driver;

    @FindBy(linkText = "My Account")
    private WebElement accountLink;

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    public MainPageOpenCart(WebDriver driver) {this.driver = driver; }

    public void open()
    {
        driver.get(BASE_URL);
    }

    public void openRegistration()
    {
        driver.get(BASE_URL);
        accountLink.click();
        registerLink.click();
    }

    public  void openLogin()
    {
        driver.get(BASE_URL);
        accountLink.click();
        loginLink.click();
    }

    public void LogOut()
    {
        //driver.get(LOGOUT_URL);
        accountLink.click();
        logoutLink.click();
    }
    //jjj
}
