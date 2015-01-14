package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ReTweetModel extends LonelyTweetModel implements FavReTweet{

	public ReTweetModel(String text) {
		super(text);
	}

	@Override
	public Date getTimestamp() {
		// return new date
		return null;
	}

	public ReTweetModel(String text, Date timestamp) {
		super(text, timestamp);
	}
	
	public User getUser() {
		return null;
	}

}
