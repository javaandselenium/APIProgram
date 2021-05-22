package validations;

import static io.restassured.RestAssured.when;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void getThereq() {
		when()
		.get("http://localhost:3000/posts")
		.then()
		.log().all()
		.assertThat().body("[1].title",Matchers.equalTo("JAVA"))
		.assertThat().body("[4].id",Matchers.equalTo(51));
	}

}
