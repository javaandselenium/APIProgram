package httprequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class Test2 {
	@Test
	public void getRequest() {
		Response resp = RestAssured.get("http://localhost:3000/posts");
	System.out.println(resp.getStatusCode());
	
	System.out.println(resp.getContentType());
		
		ValidatableResponse response = resp.then();
		response.assertThat().statusCode(200);
		response.assertThat().contentType(ContentType.JSON);
	response.log().all();
	
	}
}
