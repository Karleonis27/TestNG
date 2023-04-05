package restAssureTests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class printOutHeaders {
	
	
	//headers are data about your data, used to provide info about an API request
	
	@Test
	public void testingHeaders() {
	
	        //set the base URL
			RestAssured.baseURI ="https://reqres.in/api/users?page=2";
			
			//create request object 
			RequestSpecification httpRequest = RestAssured.given();
			
			//response object 
			Response myResponse = httpRequest.request(Method.GET);
			
//			// to print a single header
//			System.out.println(myResponse.getHeader("Content_Type"));
//			
//			
			//prints out all Headers
			Headers allHeaders = myResponse.getHeaders();
			
			for( Header eachHeader: allHeaders) {
				System.out.println(eachHeader.getName()+ "========="+ eachHeader.getValue());
				
			}
			
			
			
	
	
	
	}

}
