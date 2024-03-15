package Rest_Assured.Rest_Assured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POSTRequest {
	
	public static HashMap map = new HashMap();
	
		@BeforeClass
		public void postdata()
		{
			map.put("name", RestUtils.getname());
			map.put("job", RestUtils.getjob());
			
			RestAssured.baseURI="https://reqres.in/api/users";
		}
	
		@Test
		public void postrequest()
		{
			given()
				.contentType("application/json; charset=utf-8")
				.body(map)
				
			.when()
					.post()
					
			.then()
					.statusCode(201)
					.and()
					.header("Content-Type", "application/json; charset=utf-8");
		
}
}
