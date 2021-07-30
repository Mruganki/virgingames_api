package com.virgingames.bingoinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;

public class BingoSteps {
    @Step("Getting All games Information")
    public ValidatableResponse getAllLivefeedInfo(){

        return SerenityRest.rest()
                .given().log().all()
                .contentType(ContentType.JSON)
                .accept( "application/json" )
                .when()
                .get(EndPoints.GET_ALL_BINGO)
                .then().log().all();
    }


}
