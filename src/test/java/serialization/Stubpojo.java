package serialization;

public class Stubpojo {
	
	String title;
	int id;
	String author;
	public Stubpojo(String title, int id, String author) {
		super();
		this.title = title;
		this.id = id;
		this.author = author;
	}
	
	
	public Stubpojo() {}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

}
