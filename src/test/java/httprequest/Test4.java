package httprequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test4 {
	@Test
	public void postreq() {
		
		JSONObject j=new JSONObject();
		j.put("id",51);
		j.put("title","APItesting");
		j.put("author","Bharani");
		
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(j.toJSONString());
	Response response = req.post("http://localhost:3000/posts");
	response.then().log().all();
	
	
	}

}
