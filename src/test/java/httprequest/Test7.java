package httprequest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class Test7 {
	
	@Test
	public void deletereq() {
		given()
		.delete("http://localhost:3000/posts/50")
		.then()
		.log().all();
	}

}
