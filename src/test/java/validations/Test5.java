package validations;

import static io.restassured.RestAssured.when;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test5 {
	@Test
	public void demo() {
		String titlename="pythonapiqwerty";
		boolean flag = false;
		Response resp = when()
		.get("http://localhost:3000/posts");
		//capture all the titles from the body
		ArrayList lst1 = resp.jsonPath().get("title");
		//verify the expected data from the response
		for(int i=0;i<lst1.size();i++) {
			if(titlename.equals(lst1.get(i))) {
			 flag = true;
				break;
			}}
		
	
		if(flag) {
			System.out.println("Title is presnt ");
		}
		else
		{
			System.out.println("Title is not present");
			
		}
		
		
}
}