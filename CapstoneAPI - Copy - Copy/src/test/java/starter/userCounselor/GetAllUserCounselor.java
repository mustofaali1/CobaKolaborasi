package starter.userCounselor;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUserCounselor {
    protected static String url = "https://13.210.163.192:8080";
    public String setGetAllUserCounselorValidEndpoint(){
        return url + "/users/counselors?topic=1&page=1&sort_by=hight_price";
    }
    public String setGetAllUserCounselorInvalidEndpoint(){
        return url + "/users/counselor?topic=1&page=1&sort_by=hight_price";
    }
    public void sendReqValidToken(){
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .get(setGetAllUserCounselorValidEndpoint());
    }
    public void receivedResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendReqInvalidToken(){
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImY5M2YxMGM0LTAzYTEtMTFlZS1iNDRkLTAyNDJjMGE4NDAwMyIsImVtYWlsIjoid2F2YXhpeTY0OUBwZW9naS5jb20iLCJ1c2VybmFtZSI6IndhdmF4aXkxMjMiLCJhdXRoX2J5IjoiYXV0aCIsImV4cCI6MTY4NjU2MzM1Mn0")
                .get(setGetAllUserCounselorValidEndpoint());
    }

    public void receivedResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
