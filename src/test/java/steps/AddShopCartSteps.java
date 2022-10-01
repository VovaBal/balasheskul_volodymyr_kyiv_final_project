package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class AddShopCartSteps {

    private ShopCartPage shopCartPage;
    private ProductPage productPage;
    private SearchResultPage searchResultPage;


    public AddShopCartSteps() {

        searchResultPage = new SearchResultPage(DriverManager.getInstance(), "");
        productPage = new ProductPage(DriverManager.getInstance(), "");
        shopCartPage = new ShopCartPage(DriverManager.getInstance(), "");
    }



    @And("^User select product from list$")
    public void userSelectProductFromList() {
        searchResultPage.openProduct();
    }

    @And("^User press add to cart button$")
    public void userPressAddToCartButton() {
        searchResultPage.selectTab(1);
        productPage.shopCartButtonPress();
    }

    @Then("^User enter to shop cart page$")
    public void userEnterToShopCartPage() {
        shopCartPage.getAmount();
        DriverManager.close();
    }

    @And("^User click on product in shop cart$")
    public void userClickOnProductInShopCart() {
        shopCartPage.productInShopCartPress();
    }

    @Then("^User see button view in cart$")
    public void userSeeButtonViewInCart() {
        productPage.getTextButtonViewInCart();
        DriverManager.close();
    }


}
