package serialization;

import java.io.Serializable;

public class NFCGame implements Serializable{
	String name;
	int level;
	int score;
	int life;
	public NFCGame(String name, int level, int score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}

}
