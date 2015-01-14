package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Reader extends User {
	// overrides setName method in user
	private static final Boolean enabled = false;
	public void setName(String name) throws IOException{
		if(name.length() > 8) {
			throw new IOException("Name too long!");
		}
		this.name = name;
	}
	
}
