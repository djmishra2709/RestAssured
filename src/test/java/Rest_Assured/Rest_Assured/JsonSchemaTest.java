package Rest_Assured.Rest_Assured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import java.io.File;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaTest {

	@Test
	public void jsonschemavalidate() {


		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/2";

	      //obtain response
	      given()
	      .when().get()

	      //verify JSON Schema
	      .then().assertThat()
	      .body(JsonSchemaValidator.matchesJsonSchema(new File("C:/Users/dheer/Desktop/Appium/Rest_Assured/schema.json")));
	 

	}

}
