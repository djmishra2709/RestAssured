package Rest_Assured.Rest_Assured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicValidation {
	
	@Test
	public void basicValidation()
	{
			given()
			
			.when()
				.get("http://jsonplaceholder.typicode.com/posts/5")
				
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.log().all();
	}

	@Test
	public void respnseValidation()
	{
			given()
			
			.when()
				.get("https://reqres.in/api/users/2")
				
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.body("data.first_name", equalTo("Janet"))
				.log().all();
	}
	
	@Test
	public void responsemultipleValidation()
	{
			given()
			
			.when()
				.get("https://reqres.in/api/users")
				
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.body("data.first_name",hasItems("George","Emma"))
				.log().all();
	}
}
