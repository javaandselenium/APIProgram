package validations;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class Test4 {
@Test
public void demo() {
	Response resp = when()
	.get("http://localhost:3000/posts");
	ArrayList lst1 = resp.jsonPath().get("title");
	ArrayList lst2=resp.jsonPath().get("id");
	
//	for(Object b:lst1) {
//		System.out.println(b);
//	}
	
	for(int i=0;i<lst1.size();i++) {
		System.out.println(lst1.get(i)+"*******"+lst2.get(i));
	}
	
	
	
}
}
