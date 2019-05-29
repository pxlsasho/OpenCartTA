package pages.nastiamazurak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    private WebDriver driver;
    @FindBy(
            xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]/span"
    )
    WebElement addToCartButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]")
    WebElement successString;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/ul/li[1]/table/tbody/tr/td[3]")
    WebElement checkCart;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/button")
    WebElement cartTotalButton;


    String result = "Success: You have added MacBook to your shopping cart!";

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        this.addToCartButton.click();
    }

    public String actualResult(){return successString.getText();}

    public void cartTotalClick(){this.cartTotalButton.click();}

    public String Result(){return checkCart.getText();}
}
