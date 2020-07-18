package ResuableMethod;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class body {
	
	
	
	@Test
	public  static String  Test1(String email,String password)
	{
		
		String s="{\r\n" + 
				"    \"username\": \""+email+"\",\r\n" + 
				"    \"password\": \""+password+"\"\r\n" + 
				"}";
		return s;
		
		
	}
		
		
	public	JsonPath jsonbody(String Response)
		{
			JsonPath js=new JsonPath(Response);
			
			return js;
			
		  
			
			
			
		}


}
