package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class User1nextday {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream out=new ObjectInputStream(new FileInputStream("./backupscore.ser"));
	//i am reading byte stream and converting back to java object
	NFCGame g=(NFCGame)out.readObject();
	System.out.println(g.level);
	System.out.println(g.name);
	System.out.println(g.score);
	System.out.println(g.life);
	

	}

}
