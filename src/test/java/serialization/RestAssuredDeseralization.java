package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class RestAssuredDeseralization {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		Project obj = mapper.readValue(new File("./projectdetails.json"),Project.class);
System.out.println(obj.projectId);
		System.out.println(obj.projectName);
		System.out.println(obj.teamsize);
		System.out.println(obj.createdBy);
	}

}
