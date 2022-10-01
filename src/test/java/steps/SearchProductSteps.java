package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.DriverManager;
import pages.SearchResultPage;

import java.util.Arrays;

public class SearchProductSteps {


    private SearchResultPage searchResultPage;

    public SearchProductSteps() {

        searchResultPage = new SearchResultPage(DriverManager.getInstance(), "");

    }


    @Then("^User enter see result page$")
    public void userEnterSeeResultPage() {

        String result = searchResultPage.getSearchResultText();
        String[] tokens = result.split(" ");
        Assertions.assertThat(tokens).isNotEmpty();
        int amount = Integer.parseInt(tokens[0]);
        Assertions.assertThat(amount > 0);
        DriverManager.close();
    }

    @Then("^User see empty result page$")
    public void userSeeEmptyResultPage() {

        String result = searchResultPage.getSearchResultText();
        String[] tokens = result.split(" ");
        System.out.println(Arrays.toString(tokens));
        Assertions.assertThat(tokens).isNotEmpty();
        int amount = Integer.parseInt(tokens[0]);
        Assertions.assertThat(amount).isEqualTo(0);
        DriverManager.close();
    }

    @And("^User press buy it now button$")
    public void userPressBuyItNowButton() {

        searchResultPage.buttonBuyItNowPress();
    }
}
