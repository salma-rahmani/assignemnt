package tests.base;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest extends BaseTest {

    @Test
    public void myBrowserTest() {
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "Failed");


    }
}
