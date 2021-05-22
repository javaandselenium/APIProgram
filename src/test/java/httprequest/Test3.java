package httprequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test3 {
	@Test
	public void getThereq() {
		when()
		.get("http://localhost:3000/posts")
		.then()
		.log().all()
		.assertThat().statusCode(200);
		
	}

}
