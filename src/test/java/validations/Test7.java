package validations;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test7 {
	@Test
	public void demo() {
		Response resp = when()
				.get("http://localhost:3000/posts");
				ArrayList<String> lst1 = resp.jsonPath().get("title");
				for(int i=0;i<lst1.size();i++) {
					
				//send to another request
				given()
				.pathParam("abc",lst1.get(i))
				.get("http://localhost:3000/posts/{abc}")
				.then()
				.log().all();
		
	}}

}
