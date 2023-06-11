package starter.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.userCounselor.GetAllUserCounselor;

public class GetAllUserCounselorSteps {
    @Steps
    GetAllUserCounselor getAllUserCounselor;

    @Given("I set GET all user counselor valid endpoint")
    public void setGetAllUserCounselorValidEndpoint(){
        getAllUserCounselor.setGetAllUserCounselorValidEndpoint();
    }
    @When("I send GET HTTP request with valid endpoint")
    public void sendGetHTTPRequestWithValidEndpoint(){
        getAllUserCounselor.sendReqValidToken();
    }
    @Then("I received valid GET HTTP response code 200")
    public void receivedValidGetHTTPResponseCode200(){
        getAllUserCounselor.receivedResponseCode200();
    }


    @Given("I set GET all user counselor invalid endpoint")
    public void setGetAllUserCounselorInvalidEndpoint(){
        getAllUserCounselor.setGetAllUserCounselorInvalidEndpoint();
    }
    @When("I send GET HTTP request with invalid endpoint")
    public void sendGetHTTPRequestWithInvalidEndpoint(){
        getAllUserCounselor.sendReqInvalidToken();
    }
    @Then("I received GET HTTP response code 404")
    public void receivedGetHTTPResponseCode404(){
        getAllUserCounselor.receivedResponseCode404();
    }
}
