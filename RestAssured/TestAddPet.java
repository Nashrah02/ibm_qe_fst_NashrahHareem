
package RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;

import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestAddPet {
    String abc = "https://petstore.swagger.io/v2/pet";
    String UpdateURL ="https://petstore.swagger.io/v2/pet/98263/uploadImage";

    
    	
    @Test
    public void AddNewPet() {
        // Write the request body
        String reqBody = """
        {
            "id": 98263, 
            "name": "Nashrah", 
            "status": "alive"
        }
        """;
        File file = new File("src/test/resources/input.json");
    
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .body(file).when().post(abc); // Send POST request
    
        // Print response of POST request
        String body = response.getBody().asPrettyString();
        System.out.println(body);
    
    }
    	
@Test
public void addPetImage() {
    // Get file to upload
    File petImage = new File("C:\\Users\\NashrahHareem\\Desktop\\Full_Stack_Testing\\Java\\demo\\src\\test\\resources\\cat.jpg");
    Response response = given().multiPart(petImage) // Add image to upload
        .pathParam("petId", "98263") // Set petId parameter
        .when().post(UpdateURL); // Send POST request
 
    // Print response
    System.out.println(response.asPrettyString());
 
    
}

        
    }
