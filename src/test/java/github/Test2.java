package github;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void getRepro() {
		given()
		.auth().oauth2("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")
		.pathParam("ownerName","abc")
		.pathParam("repoName","restassuredreprository")
		.when()
		.get("https://api.github.com/repos/{ownerName}/{repoName}")
		.then()
		.log().all();
		
	}

}
