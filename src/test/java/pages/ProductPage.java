package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    @FindBy(how = How.XPATH,using = "//a[@id='isCartBtn_btn']")
    WebElement shopCartButton;
    @FindBy(how = How.XPATH,using = "//a[@id='vi-viewInCartBtn']")
    WebElement viewInCartButton;

    public ProductPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        PageFactory.initElements(driver, this);
    }

    public void shopCartButtonPress (){
        waitForVisability(shopCartButton);
        shopCartButton.click();

    }
    public void getTextButtonViewInCart (){
        waitForVisability(viewInCartButton);
        Assertions.assertThat(viewInCartButton.getText()).contains("View in cart");
    }
}
