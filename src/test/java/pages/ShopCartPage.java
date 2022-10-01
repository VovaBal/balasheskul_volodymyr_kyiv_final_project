package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class ShopCartPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//a[@id='isCartBtn_btn']")
    private WebElement buttonAddToCart;
    @FindBy(how = How.XPATH, using = "//i[@id='gh-cart-n']")
    private WebElement amount;
    @FindBy(how = How.XPATH, using = "//h3[@class='item-title text-truncate-multiline lines-2 black-link']//span[@class='BOLD']")
    private WebElement productInCart;

    public ShopCartPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        PageFactory.initElements(driver, this);
    }

    public void getAmount() {
        waitForVisability(amount);
        Assertions.assertThat(Integer.parseInt(amount.getText())).isEqualTo(1);
    }

    public void productInShopCartPress() {
        waitForVisability(productInCart);
        productInCart.click();
    }
}
