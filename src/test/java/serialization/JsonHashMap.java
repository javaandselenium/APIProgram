package serialization;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class JsonHashMap {
	@Test
	public void postBDD() {
	HashMap<String,Object>j=new HashMap<String, Object>();
		j.put("id",800);
		j.put("title","Manaultesting56");
		j.put("author","Bharanigramesh");
		
		given()
		.contentType(ContentType.JSON)
		.body(j)
		.when()
		.post("http://localhost:3000/posts")
		.then()
		.log().all();
	}

}
