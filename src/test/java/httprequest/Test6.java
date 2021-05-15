package httprequest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test6 {
	@Test
	public void patchreq() {
		JSONObject j=new JSONObject();
	j.put("title","Manaultesting");
	
		
		given()
		.contentType(ContentType.JSON)
		.body(j.toJSONString())
		.when()
		.patch("http://localhost:3000/posts/50")
		.then()
		.log().all();
	}

}
