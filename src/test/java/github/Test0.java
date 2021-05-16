package github;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test0 {
	/**
	 * Base uri="https://api.github.com"
	 */
@Test
public void getRepro() {
	given()
	.auth().oauth2("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")
	.when()
	.get("https://api.github.com/user/repos")
	.then()
	.log().all();
	
}
}
