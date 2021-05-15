package httprequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class Test1 {
	@Test
	public void getRequest() {
		Response resp = RestAssured.get("http://localhost:3000/posts");
	System.out.println(resp.getStatusCode());
	Assert.assertEquals(201,resp.getStatusCode());
	
	System.out.println(resp.getContentType());
		
		ValidatableResponse response = resp.then();
	response.log().all();
	
	}

}
