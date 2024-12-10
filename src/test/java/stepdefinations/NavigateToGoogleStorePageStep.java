package stepdefinations;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.LandingPage;

public class NavigateToGoogleStorePageStep extends BaseTest {

    LandingPage googleLandingPage;

    @Before
    public void setup() {
        super.setup();
        this.googleLandingPage = new LandingPage(driver);
    }

    @Given("I am on the google page")
    public void i_am_on_the_google_page() {}

    @When("I click on store button")
    public void i_click_on_store_button() {
        googleLandingPage.clickOnStoreButton();
    }
    @Then("I should see store page")
    public void i_should_see_store_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("I click on earbuds page")
    public void i_click_on_earbuds_page(){
        googleLandingPage.clickOnEarbudsButton();
    }

    @Then("I should see the earbuds page")
    public void i_should_see_earbuds_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

}