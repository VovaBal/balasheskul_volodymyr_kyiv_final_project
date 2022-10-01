package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager {

    private static WebDriver driver;


    private DriverManager() {

    }

    public static WebDriver getInstance() {
        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void close() {
        driver.quit();
        driver = null;
    }


}
