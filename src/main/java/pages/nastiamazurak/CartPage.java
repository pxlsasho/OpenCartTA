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

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/h1")
    WebElement checkResult;

    String result = "Success: You have added MacBook to your shopping cart!";

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        this.addToCartButton.click();
    }

    public String actualResult(){return successString.getText();}

    public String Result(){return checkResult.getText();}
}
