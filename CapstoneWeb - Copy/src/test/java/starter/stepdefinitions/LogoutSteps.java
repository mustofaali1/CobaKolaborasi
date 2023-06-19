package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.LandingPage;
import starter.pages.LogoutPage;

public class LogoutSteps {
    @Steps
    LogoutPage logoutPage;
    LandingPage landingPage;

    @Given("I click icon logout")
    public void clickIconLogout(){
        logoutPage.clickIconLogout();
    }
    @Then("I redirected to the landing page")
    public void redirectedToTheLandingPage(){
        landingPage.validOnLandingPage();
    }
}
