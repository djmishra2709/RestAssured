package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import org.testng.annotations.Test;

public class SerilDeserializationPOST{
	
	@Test(priority=1)
	public  void createuserserializable()
	{
		Userdetails users =new Userdetails();
		users.setJob("S/W");
		users.setName("Dheeraj");
		
		given()
		 .contentType(ContentType.JSON)
		 .body(users)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201);
	}

	@Test(priority=2)
	public  void getuserdeserializable()
	{
		Userdetails users =get("https://reqres.in/api/users/1").as(Userdetails.class);
		System.out.println(users.toString());

		
	}
}
