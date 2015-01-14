package ca.ualberta.cs.lonelytwitter;

public class Favourites {
	private Boolean like = true;
	private String title;
	
	
	public Favourites(Boolean like, String title) {
		super();
		this.like = like;
		this.title = title;
	}


	public Boolean getLike() {
		return like;
	}


	public void setLikeTrue() {
		this.like = true;
	}
	
	public void setLikeFalse() {
		this.like = false;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	

}
