
package RestAssured;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TestQueryParam{


    @Test
public void getIPInformation() {
    String abc = "http://ip-api.com/json";
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .when()
        .queryParam("fields", "query,country,city,timezone") // Set path parameter
        .get(abc + "/125.219.5.94"); // Send GET request
    System.out.println(response.getBody().asPrettyString());
    
}
}
