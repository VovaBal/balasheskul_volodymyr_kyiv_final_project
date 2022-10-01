package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//span[@id='gh-ug']//a[text()='Sign in']")
    WebElement signInButton;
    @FindBy(how = How.XPATH, using = "//a[text()='register']")
    WebElement register;
    @FindBy(how = How.XPATH, using = "//h1[text()='Create an account']")
    WebElement getTextReg;
    @FindBy(how = How.XPATH, using = "//input[@id='gh-ac']")
    WebElement searchField;
    @FindBy(how = How.XPATH, using = "//input[@id='gh-btn']")
    WebElement searchButton;
    @FindBy(how = How.XPATH, using = "//button[@id='gh-shop-a']")
    WebElement allCategoriesButton;
    @FindBy(how = How.XPATH, using = "//a[@id='gh-shop-see-all-center']")
    WebElement seeAllButton;
    @FindBy(how = How.XPATH, using = "//h1[text()='All Categories']")
    WebElement allCategoriesHeader;

    public void pressSearchButton() {
        waitForVisability(searchButton);
        searchButton.click();
    }

    public void inputSearchField(String input) {
        waitForVisability(searchField);
        searchField.sendKeys(input);
    }

    public void signInButton() {
        waitForVisability(signInButton);
        signInButton.click();
    }

    public void clickRegisterButton() {
        waitForVisability(register);
        register.click();
    }

    public String getTextRegister() {
        return getTextReg.getText();
    }

    public void allCategoriesButtonClick() {
        waitForVisability(allCategoriesButton);
        allCategoriesButton.click();
    }

    public void seeAllButtonClick() {
        waitForVisability(seeAllButton);
        seeAllButton.click();
    }


    public void checkTextAllCategories (){
        Assertions.assertThat(allCategoriesHeader.getText()).isEqualTo("All Categories");
    }

}
