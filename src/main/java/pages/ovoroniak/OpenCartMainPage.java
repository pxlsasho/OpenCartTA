package pages.ovoroniak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartMainPage
{
    private static final String BASE_URL = "https://demo.opencart.com/";
    private WebDriver driver;

    @FindBy(linkText = "My Account")
    private WebElement MyAccountLink;

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    public OpenCartMainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void openMainPage()
    {
        driver.get(BASE_URL);
    }

    public void openRegistration()
    {
        MyAccountLink.click();
        registerLink.click();
    }

    public  void openLogin()
    {
        MyAccountLink.click();
        loginLink.click();
    }

    public void LogOut()
    {
        MyAccountLink.click();
        logoutLink.click();
    }


}

