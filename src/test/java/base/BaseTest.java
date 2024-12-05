package base;

import config.ConfigManager;
import config.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;
    public static final String baseUrl = ConfigManager.getProperty("baseUrl");


    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initializeWebDriver();
        driver.get(baseUrl);

        System.out.println("The URL " + baseUrl);


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("The browser is quit");


        }
    }


}
