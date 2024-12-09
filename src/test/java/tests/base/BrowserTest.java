package tests.base;

import base.BaseTest;
import config.ConfigManager;
import config.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest extends BaseTest {
    Logger log = LogManager.getLogger(this);


    @Test
    public void myBrowserTest() {
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        Logger logger = LogManager.getLogger(BrowserTest.class);


        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
        logger.info("Comparing the URLs");
    }

    @Test
    public void navigateToAboutTest()throws InterruptedException{
        WebElement aboutButton = driver.findElement(By.xpath("//a[text() ='About']"));
        Thread.sleep(1000);
        aboutButton.click();
    }

    @Test
    public void navigateToStoreTest()throws InterruptedException{
        WebElement storeButton = driver.findElement(By.xpath("//a[text() ='Store']"));
        Thread.sleep(1000);
        storeButton.click();
    }

    public static void main(String[] args) {
        DriverFactory.initializeWebDriver();

    }
}
