import config.ConfigManager;
import config.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.lang.invoke.ConstantBootstraps;

public class BaseTest {
    public static void main(String[] args) {

        ConfigManager.printAllProperties();
        WebDriver driver = DriverFactory.initializeWebDriver();
        driver.get(ConfigManager.getProperty("baseUrl"));
        driver.quit();



    }
}
