package APITestCase;

import org.testng.annotations.Test;

import ResuableMethod.body;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestCaseIII {
	
	
	body b=new body();
	@Test
	public void Test1()
	{
		
		RestAssured.baseURI="https://docs.atlassian.com/software/jira/docs/api/REST/8.10.0/#auth/1/session-login";
		SessionFilter filter=new SessionFilter();
		String res=given().headers("content-Type","application/json").filter(filter).log().all().
				body(b.Test1
				("shalinigupta9500@gmail.com","Sarita!95")).post("rest/auth/1/session").then().assertThat().statusCode(200).extract().response().asString();
				
			
	}

}
 