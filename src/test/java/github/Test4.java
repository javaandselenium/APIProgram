package github;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void getRepro() {
		given()
		//.auth().oauth2("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")
		.formParam("barrerToken","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")
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.log().all();
}
}