package serialization;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ContentTypeSerilaization {
	@Test
	public void postBDD() {
		Stubpojo p=new Stubpojo("Testing",202,"john");
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://localhost:3000/posts")
		.then()
		.log().all();
	}

}
