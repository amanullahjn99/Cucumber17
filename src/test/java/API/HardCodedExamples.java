package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class HardCodedExamples {

    //in rest assured base uri = base URL
    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE3MDEzMTMzODIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTcwMTM1NjU4MiwidXNlcklkIjoiNjA4NyJ9.eGoUkdW0fdPTMXXp59rLBQA8IV_-g4yRz8b4CDtcsFU";

    public void createEmployee(){
        //prepare the request
        //request specification allows us to prepare the request and gives it in variable
        RequestSpecification request = given().header("Content-Type","application/json").
                header("Authorization", token)
                .body("{\n" +
                "  \"emp_firstname\": \"Amanl\",\n" +
                "  \"emp_lastname\": \"Ahmadii\",\n" +
                "  \"emp_middle_name\": \"None\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"2000-11-26\",\n" +
                "  \"emp_status\": \"Confirmed\",\n" +
                "  \"emp_job_title\": \"QA\"\n" +
                "}");

        //send the request for creating the employee
        //response is the class which holds the complete response body and the info
        Response response =  request.when().post("/createEmployee.php");

        //validate the response
        response.then().assertThat().statusCode(201);
    }


}