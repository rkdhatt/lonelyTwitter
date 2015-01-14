package ca.ualberta.cs.lonelytwitter;

public class Author extends User {

	public Author() {
		super();
		name = "anonmous_author";
	}
	
	public Author(String string) {
		super(string);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
