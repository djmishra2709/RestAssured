package Rest_Assured.Rest_Assured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Validation_XML {
	
	@Test
	public void SinglexmlValidation()
	{
		given()
		
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.body("CUSTOMER.ID", equalTo("15"))
		.log().all();
	}

	//verify multiple response in XML
	@Test(priority=2)
	public void  multiplexmlValidation()
	{
		given()
		
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.body("CUSTOMER.ID", equalTo("15"))
		.body("CUSTOMER.FIRSTNAME", equalTo("Bill"))
		.body("CUSTOMER.CITY", equalTo("Seattle"))
		.log().all();
		
	}

	//verify multiple response in XML in one line
		@Test(priority=3)
		public void  multiplexmlValidationinOneGo()
		{
			given()
			
			.when()
				.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
			.then()
			.body("CUSTOMER.text()", equalTo("15BillClancy319 Upland Pl.Seattle"));
			
			
		}
		
		//verify value with xml path in XML 
				@Test(priority=4)
				public void  xmlValidationinxpath()
				{
					given()
					
					.when()
						.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
					.then()
					.body(hasXPath("/CUSTOMER/CITY", containsString("Seattle")));
										
					
				}
				
				//verify value with xml path in XML 
				@Test(priority=5)
				public void  xmlValidationinxpath2()
				{
					given()
					
					.when()
						.get("http://thomas-bayer.com/sqlrest/INVOICE/")
					.then()
					.body(hasXPath("/INVOICEList/INVOICE[text()='30']"));
										
					
				}
}
