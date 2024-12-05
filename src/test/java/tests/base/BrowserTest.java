package tests.base;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest extends BaseTest {

    @Test
    public void myBrowserTest() {


        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        Logger logger = LogManager.getLogger(BrowserTest.class);


        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
        logger.info("Comparing the URLs");


    }
}
