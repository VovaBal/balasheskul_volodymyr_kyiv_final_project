package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//input[@id='userid']")
    WebElement emailSignInField;
    @FindBy(how = How.XPATH, using = "//button[@id='signin-continue-btn']")
    WebElement continueButton;
    @FindBy(how = How.XPATH, using = "//input[@id='pass']")
    WebElement passwordSignInField;
    @FindBy(how = How.XPATH, using = "//button[@id='sgnBt']")
    WebElement buttonSignIn;

    @FindBy(how = How.XPATH, using = "//button[@id='gh-ug']")
    WebElement nameAccount;
    @FindBy(how = How.XPATH, using = "//p[@id='errormsg']")
    WebElement errorMassage;


    public SignInPage(WebDriver driver) {
        super(driver, "");
        PageFactory.initElements(driver, this);
    }


    public void emailEnter(String email) {
        waitForVisability(emailSignInField);
        emailSignInField.sendKeys(email);
    }

    public void passwordEnter(String password) {
        waitForVisability(passwordSignInField);
        passwordSignInField.sendKeys(password);
    }

    public void pressedContinueButton() {
        waitForVisability(continueButton);
        continueButton.click();
    }

    public void buttonSignInPress() {
        waitForVisability(buttonSignIn);
        buttonSignIn.click();
    }

    public void checkAccountName() {
        Assertions.assertThat(nameAccount.getText()).contains("volodymyr");
    }

    public void errorMassage(String message) {
        Assertions.assertThat(errorMassage.getText()).isEqualTo(message);
    }
}
