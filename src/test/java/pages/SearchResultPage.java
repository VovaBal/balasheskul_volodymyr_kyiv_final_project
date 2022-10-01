package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.util.List;
import java.util.logging.Handler;

public class SearchResultPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//h1[@class='srp-controls__count-heading']")
    private WebElement searchResultText;
    @FindBy(how = How.XPATH, using = "//ul//li[@class='fake-tabs__item btn'][3]")
    private WebElement buttonBuyItNow;
    @FindBy(how = How.XPATH, using = "//ul[@class='srp-results srp-list clearfix']//li[4]//div//div")
    private WebElement elements;
    @FindBy(how = How.XPATH,using = "//span[text()='1 TB']")
    WebElement filter1TB;
    @FindBy(how = How.XPATH,using = "//div[@id='srp-river-main']//li[3]")
    WebElement productFromTheList;

    public SearchResultPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        PageFactory.initElements(driver, this);
    }

    public String getSearchResultText() {
        waitForVisability(searchResultText);
        return searchResultText.getText();
    }

    public void buttonBuyItNowPress() {
        waitForVisability(buttonBuyItNow);
        buttonBuyItNow.click();
    }

    public void openProduct() {
        waitForVisability(elements);
       // Assertions.assertThat(elements).isNotEmpty();
        elements.click();
    }
    public void clickOnFilter1TB (){
        waitForVisability(filter1TB);
        filter1TB.click();
    }
    public void filterCheck (){
        waitForVisability(productFromTheList);
        Assertions.assertThat(productFromTheList.getText()).contains("1TB");
    }
}
