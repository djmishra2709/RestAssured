package Rest_Assured.Rest_Assured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ParamValidation {
	
	@Test
	public void paramValidation()
	{
			given()
				.param("id","2")
				.header("Content-Type","text/plain")
				
			.when()
				.get("https://reqres.in/api/users")
				
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.body("data.first_name", equalTo("Janet"))
				.log().all();
	}

}
