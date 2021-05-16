package github;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test6 {
	@Test
	public void getRepro() {
		given()
		.auth().oauth2("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")
		.param("q","bharani89")
		.param("order","asc")
		
		.when()
		.get("https://api.github.com/search/repositories")
		.then()
		.log().all();
		
	}

}
