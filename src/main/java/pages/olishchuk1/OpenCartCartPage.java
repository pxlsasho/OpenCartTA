package pages.olishchuk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCartCartPage {
    private WebDriver driver;

    @FindBy(className = "dropdown-toggle")
    private WebElement cartButtonLink;

    @FindBy(linkText = "View cart")
    private WebElement viewCartButton;

    @FindBy(name = "search")
    private WebElement searchLink;

    @FindBy(xpath = "/html/body/header/div/div/div[2]/div/span/button")
    private WebElement searchButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]")
    private WebElement MacBookLink;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[3]/button[1]")
    private WebElement iPhoneLink;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[3]/div/div[3]/button[1]")
    private WebElement AppleCinemaLink;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[4]/div/div[3]/button[1]")
    private WebElement CameraLink;

    public OpenCartCartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void openCart()
    {
        cartButtonLink.click();
        viewCartButton.click();
    }

    public void searchItem(String item)
    {
        searchLink.click();
        searchLink.clear();
        searchLink.sendKeys(item);
        searchButton.click();
    }
}
