package pages.apasternak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartMainPage {

    private static final String BASE_URL = "https://demo.opencart.com";
    private WebDriver driver;

    @FindBy(linkText = "My Account")
    public WebElement PersonalCabinetLink;

    @FindBy(linkText = "Register")
    public WebElement RegisterLink;

    public OpenCartMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void clickOnPersonalCabinet() {
        PersonalCabinetLink.click();
    }

    public void clickOnRegistration() {
        RegisterLink.click();
    }

}



