package validations;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test0 {
	@Test
	public void getThereq() {
		when()
		.get("http://localhost:3000/posts")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.and()
		.contentType(ContentType.JSON)
		.and()
		.assertThat().header("Pragma","no-cache")
		.assertThat().header("Expires","-1");
		
		
	}
}
