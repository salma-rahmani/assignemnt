package stepdefinations;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.LandingPage;


public class NavigateToGoogleAboutPageStep extends BaseTest {

    LandingPage googleLandingPage;

    @Before
    public void setup() {
        super.setup();
        this.googleLandingPage = new LandingPage(driver);
    }

    @Given("I am on the google web page")
    public void i_am_on_the_google_web_page() {}

    @When("I click on about button")
    public void i_click_on_about_button() {
        googleLandingPage.clickOnAboutButton();
    }

    @Then("I should see the about page")
    public void i_should_see_the_about_page() throws InterruptedException {
        Thread.sleep(2000);
    }
    @When("I click on commitment button")
    public void i_click_on_commitment_button(){
        googleLandingPage.clickOnCommitButton();
    }

    @Then("I should see the commitment page")
    public void i_should_see_the_commitment_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

}