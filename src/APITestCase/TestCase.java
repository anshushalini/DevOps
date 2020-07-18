package APITestCase;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class TestCase {
	
	
	
	@Test
	public void Test1()
	{
		
		RestAssured.baseURI="https://reqres.in/";
		 given().log().all().header("Content-Type","application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}").when().post("api/users").then().statusCode(201).log().all();
	}

}
