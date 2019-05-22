package pages.cstashkevych;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage
{
    private WebDriver driver;

    @FindBy(className = "input-lg")
    public WebElement InputSearch;

    @FindBy(className = "btn-lg")
    public WebElement ButtonSearch;

    @FindBy(linkText = "iPhone")
    public WebElement iPhoneLink;

    @FindBy(id = "button-cart")
    public WebElement AddToCart;

    public void clickOnInputSearch()
    {
        InputSearch.click();
    }

    public void enterInputSearch() {
        InputSearch.sendKeys("iPhone");
    }

    public void clickOnButtonSearch()
    {
        ButtonSearch.click();
    }

    public void clickOniPhoneLink()
    {
        iPhoneLink.click();
    }

    public void clickOnAddToCart()
    {
        AddToCart.click();
    }

}
