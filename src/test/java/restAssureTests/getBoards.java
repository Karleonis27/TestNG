package restAssureTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getBoards {
	
	String APIKey ="b2410e4edc715b73cd3b9d501bf35c8d";
	String OAuthToken ="ATTA935b3a2d9fc0cadf30c2658fe98fe0c1d59b490a2820ad2e75f8b55e0e4290f0DB83ADBD";
	
	
	@Test
	public void getBoards() {
		
		 //set the base URL
		RestAssured.baseURI ="https://api.trello.com/1/members/me/boards";
		
		//create request object 
		RequestSpecification httpRequest = RestAssured.given();
		
		
		// stores everything into myResponse
	      Response myResponse=	httpRequest.get(RestAssured.baseURI+"?key="+APIKey+"&token="+OAuthToken);
	      
	      System.out.println(myResponse.prettyPrint());
	      
	      // this is how you do hard assertion
	      Assert.assertEquals(200, myResponse.getStatusCode());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
