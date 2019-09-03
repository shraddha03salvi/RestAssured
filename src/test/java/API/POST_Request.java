package API;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_Request {
	 @Test
	   public void PostUser() 
	  { RestAssured.baseURI ="http://192.168.0.32:8000/api/user/login";
		  RequestSpecification request = RestAssured.given();
		  request.header("Content-Type","application/json");
		  JsonObject requestParams = new JsonObject();
		  
		  requestParams.addProperty("email","shraddha12salvi@gmail.com");
		  
		  requestParams.addProperty("password","Shraddha@123");
		 request.body(requestParams.toString());
		  Response response = request.post("http://192.168.0.32:8000/api/user/login");
		  int statusCode = response.getStatusCode();
		  System.out.println("The status code recieved:" + statusCode);
		   System.out.println("Response body: " + response.asString());
		  //ResponseBody body = response.getBody();
		  //System.out.println(response.body().asString());
	}
	  @Test
	  public void Post_Signup() 
	  {
		  RestAssured.baseURI ="http://192.168.0.32:8000/api/user/userSignUp";
		  RequestSpecification request = RestAssured.given();
		  request.header("Content-Type","application/json");
		  JsonObject requestParams = new JsonObject();
		  requestParams.addProperty("firstName","Swapnil123");
		  requestParams.addProperty( "lastName","Salvi123");
		  requestParams.addProperty("service","advanced");
		  requestParams.addProperty("email","swapnil100@gmail.com");
		  requestParams.addProperty("password","Swapnil@123");
		  request.body(requestParams.toString());
		  Response response = request.post("http://192.168.0.32:8000/api/user/userSignUp");
		  int statusCode = response.getStatusCode();
		  System.out.println("The status code recieved:" + statusCode);
		   System.out.println("Response body: " + response.asString());
	  }
}
