package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//input[@id='firstname']")
    private WebElement firstNameField;

    @FindBy(how = How.XPATH, using = "//input[@id='lastname']")
    private WebElement lastNameField;

    @FindBy(how = How.XPATH, using = "//input[@id='Email']")
    private WebElement emailField;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//button[@id='EMAIL_REG_FORM_SUBMIT']")
    private WebElement buttonCreateAccount;


    public RegistrationPage(WebDriver driver) {
        super(driver, "");
        PageFactory.initElements(driver, this);
    }


    public void inputFirstName(String firstName) {
        waitForInteractive(firstNameField);
        firstNameField.sendKeys(firstName);

    }

    public void inputLastName(String lastName) {
        waitForInteractive(lastNameField);
        lastNameField.sendKeys(lastName);

    }

    public void inputEmail(String email) {
        waitForInteractive(emailField);
        emailField.sendKeys(email);

    }

    public void inputPassword(String password) {
        waitForInteractive(passwordField);
        passwordField.sendKeys(password);

    }

    public boolean isButtonActive() {
        waitForVisability(buttonCreateAccount);
        // String attribute = buttonCreateAccount.getAttribute("disabled");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return buttonCreateAccount.isEnabled();

//        if (attribute==null|| attribute.isEmpty() || !attribute.contains("disabled")) {
//            return false;
//        }
//        return true;
    }


}