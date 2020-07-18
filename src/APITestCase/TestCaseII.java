package APITestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import ResuableMethod.body;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class TestCaseII {

	body b = new body();
	
	SessionFilter filter=new SessionFilter();

	@Test
	public void Test1() {

		String res = given().log().all().headers("Content-Type", "application/json").filter(filter).when()
				.body(body.Test1("eve.holt@reqres.in", "pistol")).post("/api/register").then().assertThat()
				.statusCode(200).log().all().extract().response().asString();

		JsonPath js = b.jsonbody(res);
		int id = js.get("id");
		Assert.assertNotNull(id);

	}

}
