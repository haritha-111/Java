import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JSONpathRestassured {
	

	    public static void main(String[] args) {
	        // Set the base URI of the API
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	        // Make a GET request to retrieve a user
	        Response response = RestAssured.get("/users/1");

	        // Extracting a specific value from the response using JSONPath
	        String username = response.jsonPath().getString("username");

	        // Printing the extracted value
	        System.out.println("Username: " + username);
	    }
	}