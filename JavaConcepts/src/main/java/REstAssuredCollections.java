import io.restassured.RestAssured;
	import io.restassured.response.Response;
	
	
public class REstAssuredCollections {

	 
	    public static void main(String[] args) {
	        // Set the base URI of the API
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	        // Make a GET request to retrieve a list of users
	        Response response = RestAssured.get("/users");

	        // Extracting data from the response using Rest Assured methods
	        String responseBody = response.getBody().asString();
	        int statusCode = response.getStatusCode();

	        // Printing the response body and status code
	        System.out.println("Response Body:\n" + responseBody);
	        System.out.println("Status Code: " + statusCode);
	    }
	}