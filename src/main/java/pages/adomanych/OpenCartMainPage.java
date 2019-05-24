package pages.adomanych;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartMainPage {
    private static final String BASE_URL = "https://demo.opencart.com/";
    private WebDriver driver;

    @FindBy (xpath = "/html/body/nav/div/div[2]/ul/li[2]/a")
    private WebElement myAccountButton;
    @FindBy (linkText = "Register")
    private WebElement registerButton;
    @FindBy (linkText = "Login")
    private WebElement loginButton;


    public OpenCartMainPage(WebDriver driver){this.driver = driver;}
    public void OpenMainPage(){driver.get(BASE_URL);}
    public void OpenregistrationPage(){
        myAccountButton.click();
        registerButton.click();
    }
    public void OpenLogin(){
        myAccountButton.click();
        loginButton.click();
    }
}
