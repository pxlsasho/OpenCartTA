package yurazahakaylo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    private static final String BASE_URL = "https://demo.opencart.com";
    private WebDriver driver;
    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void open()
    {
        driver.get(BASE_URL);
    }

    public void close(){driver.quit();}

    @FindBy (xpath = "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    public WebElement searchFlat;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    public WebElement searchBtn;

    @FindBy(xpath =  "//*[@id=\"product-search\"]/div[1]")
    public WebElement checker;

    public void addToCart(){addToCartBtn.click();}

    public void search()
    {
        searchFlat.click();
        searchFlat.sendKeys("iphone");
        searchBtn.click();
    }

    public void check(){
        boolean b = checker.isDisplayed();
    }


}
