import java.util.HashMap;

public class Hashmap2 {

	private void JsonBodyHashMap()
	{
	    HashMap<String,Object> dataBody = new HashMap();
	        
	    dataBody.put("name", "Harry Potter");
	    dataBody.put("email", "hoggwarts22@wiz.com");
	    dataBody.put("gender", "Male");
	    dataBody.put("status", "active");
	        
	    RestAssured
	        .given()
	            .header("Authorization","Bearer c005c96081fd4f9205d53b5f0e8d0aab4eac0c63ad282de7aeda1f2b2fd0bdc6")
	            .baseUri("https://gorest.co.in/public/v1/users/")
	            .contentType(ContentType.JSON)
	            .body(dataBody)
	            .log()
	            .body()
	       .when()
	           .post()
	        .then()
	            .assertThat().statusCode(201)
	            .log().body();
	}
	
}