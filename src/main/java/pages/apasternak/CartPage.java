package pages.apasternak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    private WebDriver driver;

    @FindBy(linkText = "Your Store")
    public WebElement YourStoreLink;

    @FindBy(name = "search")
    public WebElement SearchLink;

    @FindBy(className = "btn-lg")
    public WebElement SearchButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]")
    public WebElement AddToCartButton;

    @FindBy(className = "dropdown-toggle")
    public WebElement ShoppingCartLink;

    @FindBy(linkText = "Shopping Cart")
    public WebElement ViewCart;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnYourStore() {
        YourStoreLink.click();
    }

    public void clickOnSearch() {
        SearchLink.click();
    }

    public void inputSearch() {
        SearchLink.sendKeys("iphone");
    }

    public void clickOnSearchButton() {
        SearchButton.click();
    }

    public void clickOnAddToCartButton() {
        AddToCartButton.click();
    }

    public void goToViewCart() {
        ViewCart.click();
    }
}
