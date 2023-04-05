package restAssureTests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class statusValidationTest {
	
	
	String APIKey ="b2410e4edc715b73cd3b9d501bf35c8d";
	String OAuthToken ="ATTA935b3a2d9fc0cadf30c2658fe98fe0c1d59b490a2820ad2e75f8b55e0e4290f0DB83ADBD";
	
	
	@Test
	public void validateData() {
	
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.given()
		.param("key", APIKey)
		.param("token",OAuthToken)
		.get("https://api.trello.com/1/members/me/boards")
		.then()
		.statusCode(200)
		.body("name",hasItems("FINAL_API_BOARD", "our first manual board")) // looks in all body to check for these key words
        .body("id", hasItems("6424dddd9c57124da3933399"));
        
   	
	}
	
	
	
	
	
	
	

}
