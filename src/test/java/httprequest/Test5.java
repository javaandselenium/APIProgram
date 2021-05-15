package httprequest;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Test5 {
	
	@Test
	public void postBDD() {
		JSONObject j=new JSONObject();
		j.put("id",515);
		j.put("title","Manaultesting");
		j.put("author","Bharanigr");
		
		given()
		.contentType(ContentType.JSON)
		.body(j.toJSONString())
		.when()
		.post("http://localhost:3000/posts")
		.then()
		.log().all();
	}

}
