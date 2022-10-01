package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DriverManager;
import pages.MainPage;
import pages.RegistrationPage;

public class EbaySignUpSteps {
    private RegistrationPage registrationPage;

    public EbaySignUpSteps() {
        registrationPage = new RegistrationPage(DriverManager.getInstance());

    }


    @When("^User enter valid first name \"([^\"]*)\"$")
    public void userEnterValidFirstName(String data) {
        registrationPage.inputFirstName(data);
    }

    @And("^User enter valid last name \"([^\"]*)\"$")
    public void userEnterValidLastName(String data) {
        registrationPage.inputLastName(data);
    }

    @And("^User enter valid email \"([^\"]*)\"$")
    public void userEnterValidEmail(String data) {
        registrationPage.inputEmail(data);
    }

    @And("^User enter valid password \"([^\"]*)\"$")
    public void userEnterValidPassword(String data) {
        registrationPage.inputPassword(data);
    }

    @Then("^create account button is \"([^\"]*)\"$")
    public void createAccountButtonIsActive(String state) {
        boolean actualState = registrationPage.isButtonActive();
        if (state.equals("active"))
            Assertions.assertThat(actualState).isTrue();

        if (state.equals("not active"))
            Assertions.assertThat(actualState).isFalse();

        DriverManager.close();
    }

}
