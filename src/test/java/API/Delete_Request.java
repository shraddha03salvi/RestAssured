package API;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_Request {

	
	@Test
	public void Delete() {
		RequestSpecification request = RestAssured.given();
		Response response =  request.delete("http://192.168.0.32:8000/api/notes/5ce68abb6b01dc1bc4922aa3/user/notes");
		int code =  response.getStatusCode();
		System.out.println("Status code is"+code);
		//Assert.assertEquals(code,204);
		System.out.println("Test time deleted successfully");
		
	}
	//For Response Body
		@Test
		
		public void responsebody() 
		{
		Response resp =RestAssured.delete("http://192.168.0.32:8000/api/notes/5ce68abb6b01dc1bc4922aa3/user/notes");
		String data = resp.asString();
		System.out.println("Data is"+data);
		}

}
