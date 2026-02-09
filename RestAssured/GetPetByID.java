package RestAssured;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;



import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GetPetByID {
    String abc = "https://petstore.swagger.io/v2/pet";
    	
    @Test(dataProvider = "petIdProvider")
    public void GetPetDetails(String id) {
        // Specify the base URL to the RESTful web service
        

        
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .when().get(abc +"/"+ id); // Run GET request

        // Now let us print the body of the message to see what response
        // we have received from the server
        response.getBody().prettyPrint();
        // System.out.println("Response Body is =>  " + responseBody);

        // Assertions
        System.out.println("Status Code is => " + response.getStatusCode());
    }
     	
    @Test
    public void UpdatePet() {
        // Write the request body
        String reqBody = """
        {
            "id": 98263, 
            "name": "Nashrah", 
            "status": "hungry"
        }
        """;
    
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .body(reqBody).when().post(abc); // Send POST request
    
        // Print response of POST request
        String body = response.getBody().asPrettyString();
        System.out.println(body);
    }
    @Test
    public void DeletePet() {
        
    
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .when().delete(abc + "/12345"); // Send POST request
    
        // Print response of POST request
        String body = response.getBody().asPrettyString();
        System.out.println(body);
    }
    
    	
    @DataProvider
    public Object[][] petIdProvider() {
        // Setting parameters to pass to test case
        Object[][] testData = new Object[][] { { "77232" }, { "77233" } };
        return testData;
    }
    

    
}

