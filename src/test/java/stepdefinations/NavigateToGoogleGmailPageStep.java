package stepdefinations;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.LandingPage;

public class NavigateToGoogleGmailPageStep extends BaseTest {
    LandingPage googleLandingPage;

    @Before
    public void setup() {
        super.setup();
        this.googleLandingPage = new LandingPage(driver);
    }

    @Given("I am on the google web page")
    public void i_am_on_the_google_web_page() {}

    @When("I click on gmail button")
    public void i_click_on_gmail_button() {
        googleLandingPage.clickOnGmailButton();
    }
    @Then("I should see the gmail page")
    public void i_should_see_the_gmail_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

}

