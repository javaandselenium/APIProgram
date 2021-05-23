package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class RestAssuredSeralization {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Project p=new Project(123,"John",5,"sKILLRARY");
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("./projectdetails.json"),p);

	}

}
