package bdd.steps;


import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import net.thucydides.core.annotations.Step;

/**
 * Created by bthum on 3/26/17.
 */
public class PersonServiceSteps  {

    @Step
    public void findAll(){
        System.out.println("Inside findALl step");
    }

    @Step
    public JsonPath find(Long id ){
        Response response =RestAssured.given().accept("application/json").when().then().get("http://localhost:8080/services/api/person/" + id);
        com.jayway.restassured.path.json.JsonPath jsonPath = response.getBody().jsonPath();
        return jsonPath;
    }

}
