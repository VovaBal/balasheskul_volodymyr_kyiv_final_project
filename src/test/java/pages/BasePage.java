package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait waiter;
    private String baseUrl;

    public BasePage(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.baseUrl = baseUrl;
    }

    public void openPage() {
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void waitForVisability(WebElement webElement) {
        waiter.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForListVisability(List<WebElement> list) {
        waiter.until(ExpectedConditions.visibilityOfAllElements(list));
    }

    public void reloadPage() {
        driver.navigate().refresh();
    }


    public void waitForInteractive(WebElement webElement) {
        waiter.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitForRefresh(WebElement webElement) {
        waiter.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(webElement)));
    }

    public void selectTab(int number) {
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
//        driver.close();
//        driver.switchTo().window(tabs2.get(0));

    }

}
