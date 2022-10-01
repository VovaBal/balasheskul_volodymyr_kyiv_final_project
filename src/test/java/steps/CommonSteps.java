package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import pages.DriverManager;
import pages.MainPage;

public class CommonSteps {
    private MainPage mainPage;


    public CommonSteps() {

    }


    @Given("^User navigate to main page \"([^\"]*)\"$")
    public void userNavigateToMainPage(String arg0) {
        this.mainPage = new MainPage(DriverManager.getInstance(), arg0);
        mainPage.openPage();
    }

    @When("^Enter product name \"([^\"]*)\"$")
    public void enterProductName(String productName) {
        mainPage.inputSearchField(productName);
    }

    @And("^User press search button$")
    public void userPressSearchButton() {
        mainPage.pressSearchButton();
    }

    @And("^User click on sign up button$")
    public void userClickOnSignInButton() {

        mainPage.clickRegisterButton();
        Assertions.assertThat(mainPage.getTextRegister()).isEqualTo("Create an account");
    }

    @And("^User click on sign in button$")
    public void registeredUserClickOnSignInButton() {
        mainPage.signInButton();
    }
}
