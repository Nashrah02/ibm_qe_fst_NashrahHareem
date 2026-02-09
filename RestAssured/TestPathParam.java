package RestAssured;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestPathParam{
   // Set Base URL with path parameter


@Test
public void getIPInformation() {
    String abc = "http://ip-api.com/json/{ipAddress}";
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .when()
        .pathParam("ipAddress", "107.218.134.107") // Set path parameter
        .get(abc); // Send GET request

    // Print response
    System.out.println(response.getBody().asPrettyString());
}
}
