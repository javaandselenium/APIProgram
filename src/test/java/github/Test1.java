package github;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test1 {
	
	@Test
	public void createRepro() {
		JSONObject j=new JSONObject();
		j.put("name","restassuredreprository");
		
		given()
		.contentType(ContentType.JSON)
		.body(j.toJSONString())
		.auth().oauth2("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")
		.when()
		.post("https://api.github.com/user/repos")
		.then()
		.log().all();
	}

}
