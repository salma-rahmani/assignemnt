package config;

import enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initializeWebDriver() {

        Browser browser = Browser.valueOf(ConfigManager.getProperty("browser").toUpperCase());

        switch (browser) {
            case CHROME:
                return driver = new ChromeDriver();


            case FIREFOX:
                return driver = new FirefoxDriver();


            case SAFARI:
                return driver = new SafariDriver();

            case EDGE:
                return driver = new EdgeDriver();


            default:

                throw new IllegalArgumentException("Browser not supported: " + browser);

        }
    }
}
