package pages.kushnirolesya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageOpenCart {
    private WebDriver driver;

    @FindBy(name = "search")
    private WebElement searchLink;

    @FindBy(xpath = "/html/body/header/div/div/div[2]/div/span/button/i")
    private WebElement searchButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]/i")
    private WebElement addToCartLink;

    //@FindBy(xpath = "html/body/div[2]/div[1]")
    //private WebElement successAdding;

    public CartPageOpenCart(WebDriver driver){this.driver = driver;}

    public void ClickOnSearchButton(){searchButton.click();}

    public void AddToCart()
    {
        addToCartLink.click();
    }

    public void searchItem(String item)
    {
        searchLink.click();
        searchLink.clear();
        searchLink.sendKeys(item);
        ClickOnSearchButton();
    }
}
