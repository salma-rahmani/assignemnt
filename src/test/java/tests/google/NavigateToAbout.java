package tests.google;

import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.google.LandingPage;

public class NavigateToAbout extends BaseTest {
    Logger log = LogManager.getLogger(this);

    @Test
    public void myAboutTest() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        Thread.sleep(1000);
        landingPage.clickOnAboutButton();
        Thread.sleep(1000);
    }
}
