package validations;

import static io.restassured.RestAssured.when;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void getThereq() {
		when()
		.get("http://localhost:3000/posts")
		.then()
		.log().all()
		.assertThat().body("[1].title",equalTo("JAVA"))
		.assertThat().body("[4].id",equalTo(51));
	}
}
