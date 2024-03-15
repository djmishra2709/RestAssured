package Rest_Assured.Rest_Assured;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DeleteRequest {
	Response res;
	
	@Test
	public void deleterequest()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		res = 
			given()
			
			.when()
				.delete()
				
			.then()
				.statusCode(204)
				.statusLine("HTTP/1.1 204 No Content")
				.header("Server", "cloudflare")
				.log().all()
				.extract().response();
	}
	
	@AfterTest
	public void printresponse()
	{
		System.out.println("Response :"+res.asString());
		if(res.asString().contains(""))
		{
			System.out.println("A");
		    Assert.assertEquals(res.asString().contains(""), true);
		}
		else
			System.out.println("B");
	}

}
