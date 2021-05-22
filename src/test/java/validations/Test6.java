package validations;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Test6 {
	@Test
	public void demo() {
		 Response resp = when()
		.get("http://localhost:3000/posts");
		 //capture the first id from the response
	Object	firestId=resp.jsonPath().get("[0].id");
		System.out.println(firestId);
		
		//send to another request
		given()
		.pathParam("id",firestId)
		.get("http://localhost:3000/posts/{id}")
		.then()
		.log().all();
	}

}
