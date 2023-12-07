import java.util.HashMap;
import java.util.Map;

import Payload.DataPojoClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class HashMaps {

			// TODO Auto-generated method stub
	

	    public static void main(String[] args) {
	        // Set the base URI of the API
	        RestAssured.baseURI = "https://example.com/api";

	        // Create a HashMap to represent the JSON body
	        //Here, a HashMap named requestBodyMap is created to represent the
//JSON body of the request. It includes keys "name," "age," and "email" with corresponding values.
	        Map<String, Object> requestBodyMap = new HashMap<>();
	        requestBodyMap.put("name", "John Doe");
	        requestBodyMap.put("age", 25);
	        requestBodyMap.put("email", "john.doe@example.com");

	        // Convert HashMap to a POJO (User class)
	        //An instance of the User class is created and populated with values from the requestBodyMap. 
	        //This is a way to convert the HashMap to a user-defined class.
	        DataPojoClass dp = new DataPojoClass();
	        dp.setName((String) requestBodyMap.get("name"));
	        dp.setAge((int) requestBodyMap.get("age"));
	        dp.setEmail((String) requestBodyMap.get("email"));

	        // Perform a POST request with the JSON body using Rest Assured
	        RestAssured.given()
	                .contentType(ContentType.JSON)
	                .body(dp)
	            .when()
	                .post("/users")
	            .then()
	                .statusCode(201) // Assuming a successful creation response code
	                .log().all(); // Log the response details
	    }
	}

