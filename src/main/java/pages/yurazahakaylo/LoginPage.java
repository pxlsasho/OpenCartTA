package pages.yurazahakaylo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private static final String BASE_URL = "https://demo.opencart.com/index.php?route=account/login";
    private WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void open()
    {
        driver.get(BASE_URL);
    }

    public void close(){driver.quit();}

    @FindBy(id = "input-email")
    public WebElement email;

    @FindBy(id = "input-password")
    public  WebElement password;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    public  WebElement loginBtn;

    @FindBy(id = "content")
    public WebElement loginMessagechecker;



    public void useEmailFlat(String emailSendKeys){
        email.click();
        email.sendKeys(emailSendKeys);
    }
    public void usePasswordFlat(String passwordSendKeys){
        password.click();
        password.sendKeys(passwordSendKeys);
    }
    public void clickOnLoginBtn(){
        loginBtn.click();
    }


}
