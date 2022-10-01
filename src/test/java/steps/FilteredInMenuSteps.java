package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DriverManager;
import pages.MainPage;
import pages.SearchResultPage;

public class FilteredInMenuSteps {

    private SearchResultPage searchResultPage;
    private MainPage mainPage;

    public FilteredInMenuSteps() {

        searchResultPage = new SearchResultPage(DriverManager.getInstance(), "");
        mainPage = new MainPage(DriverManager.getInstance(), "");
    }

    @And("^User clicks on the 1 TB filter$")
    public void theUserClicksOnTheTBFilter() {
        searchResultPage.clickOnFilter1TB();
    }

    @Then("^User sees that in the name of each product contains 1 TB$")
    public void userSeesThatInTheNameOfEachProductContains() {
        searchResultPage.filterCheck();
        DriverManager.close();
    }


    @When("^User click shop by category$")
    public void userClickShopByCategory() {
        mainPage.allCategoriesButtonClick();
    }

    @And("^User click see all categories$")
    public void userClickSeeAllCategories() {
        mainPage.seeAllButtonClick();
    }

    @Then("^User sees header All categories$")
    public void userSeesHeaderAllCategories() {
        mainPage.checkTextAllCategories();
        DriverManager.close();
    }
}
