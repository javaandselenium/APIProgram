package serialization;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

public class ExpSerailizer {
	@Test
	public void postBDD() {
	Stubpojo s=new Stubpojo("abctesting",900,"zibra");
		given()
		.contentType(ContentType.JSON)
		.body(s,ObjectMapperType.JACKSON_1)
		.when()
		.post("http://localhost:3000/posts")
		.then()
		.log().all();
	}
}
