package base;

import config.ConfigManager;
import config.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;
    private static final String baseUrl = ConfigManager.getProperty("baseUrl");
    public Logger logger = LogManager.getLogger(this);


    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initializeWebDriver();
        driver.get(baseUrl);

        System.out.println("The URL " + baseUrl);
        logger.info("The URL" + baseUrl);


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("The browser is quit");
            logger.info("The browser is quit");


        }
    }


}
