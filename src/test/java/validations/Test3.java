package validations;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void getThereq() {
		 Object title = when()
		.get("http://localhost:3000/posts")
		//capture the single data i wanted to print
		.jsonPath().get("[0].title");
		System.out.println(title);
}
}