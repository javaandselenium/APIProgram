package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class User1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	NFCGame g=new NFCGame("John",15,50000,3);
	//to store this java object in term of byte stream
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("./backupscore.ser"));
	out.writeObject(g);

	}

}
