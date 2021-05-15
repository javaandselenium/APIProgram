package httprequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test3 {
	@Test
	public void getThereq() {
		given()
		.get("http://localhost:3000/posts")
		.then()
		.log().all()
		.assertThat().statusCode(200);
		
	}

}
