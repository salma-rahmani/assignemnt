import config.ConfigManager;
import config.DriverFactory;

import java.lang.invoke.ConstantBootstraps;

public class BaseTest {
    public static void main(String[] args) {

        ConfigManager.printAllProperties();
        DriverFactory.initializeWebDriver();



    }
}
