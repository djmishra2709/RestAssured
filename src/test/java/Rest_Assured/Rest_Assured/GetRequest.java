package Rest_Assured.Rest_Assured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetRequest {
	
	@Test
	public void getrequest()
	{
			given()
			
			.when()
				.get("https://reqres.in/api/users")
				
				
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				//.assertThat().body().toString().contains("Charles")
				.header("Content-Type", "application/json; charset=utf-8");
	}

}
