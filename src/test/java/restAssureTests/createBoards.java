package restAssureTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class createBoards {
	
	
	String APIKey ="b2410e4edc715b73cd3b9d501bf35c8d";
	String OAuthToken ="ATTA935b3a2d9fc0cadf30c2658fe98fe0c1d59b490a2820ad2e75f8b55e0e4290f0DB83ADBD";
	String boardName ="restAssuredBoard";
	@Test
	public void createBoard() {
		        //set the base URL
				RestAssured.baseURI ="https://api.trello.com/1/boards";
				
				//create request object 
				RequestSpecification httpRequest = RestAssured.given();
				
				// passing header
				httpRequest.header("Content-Type","application/json");
				
				Response myResponse= httpRequest.post(RestAssured.baseURI+"/?name="+boardName+"&key="+APIKey+"&token="+OAuthToken);
				int statusCode = myResponse.getStatusCode();
				
				Assert.assertEquals(200, statusCode);
				System.out.println("The test passed and board created with statue code-"+ statusCode);
				
				
		
		
		
	}

}
