package APITestCase;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestCaseI {
	
	
	
	@Test
	public void Test1()
	{
		
		RestAssured.baseURI="https://reqres.in/";
		String res=given().log().all().headers("Content-Type","application/json").when().body("{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}").post("/api/register").then().assertThat().statusCode(200).log().all().extract().response().asString();
		
	
		JsonPath js=new JsonPath(res);
		int id=js.getInt("id");
		System.out.println(id);
		
		
	}

}
