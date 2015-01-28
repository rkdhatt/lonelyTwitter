package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {

	private int count;
	private ArrayList<LonelyTweetModel> tweetList;
	
	public TweetListModel() {
		super();
		count = 0;
		tweetList = new ArrayList<LonelyTweetModel>();
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public ArrayList<LonelyTweetModel> getTweets() {
		// TODO Auto-generated method stub
		//?
		
		return tweetList;
	}

	public void addTweet(LonelyTweetModel tweet) {
		// TODO Auto-generated method stub
		count++;
		if (tweetList.contains(tweet)) {
			throw new IllegalArgumentException();
		} else {
			tweetList.add(tweet);
		}
	}
	
	public boolean hasTweets(LonelyTweetModel tweet) {
		return tweetList.contains(tweet);
	}
	
	public void removeTweet(LonelyTweetModel tweet) {
		try {
			tweetList.remove(tweet);
		} catch (RuntimeException e) {
			System.out.println("tweet did not exist in the first place!");
		}
	}
	 
}
