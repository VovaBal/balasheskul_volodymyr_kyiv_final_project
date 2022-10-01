package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DriverManager;
import pages.SignInPage;

public class EbaySignInSteps {

    private SignInPage signInPage;


    public EbaySignInSteps() {
        this.signInPage = new SignInPage(DriverManager.getInstance());
    }




    @When("^Registered user enter valid email \"([^\"]*)\"$")
    public void registeredUserEnterValidEmail(String email) {

        signInPage.emailEnter(email);
    }

    @And("^User pressed button continue$")
    public void userPressedButtonContinue() {
        signInPage.pressedContinueButton();
    }

    @And("^Registered user enter password \"([^\"]*)\"$")
    public void registeredUserEnterValidPassword(String password) {
        signInPage.passwordEnter(password);
    }

    @And("^User pressed button Sign in$")
    public void userPressedButtonSignIn() {
        signInPage.buttonSignInPress();

    }

    @Then("^User enter on the next page$")
    public void userEnterOnTheNextPage() {
        signInPage.checkAccountName();
        DriverManager.close();
    }


    @Then("^User sees massage \"([^\"]*)\"$")
    public void userSeesMassage(String message)  {
        signInPage.errorMassage(message);
        DriverManager.close();
    }
}
