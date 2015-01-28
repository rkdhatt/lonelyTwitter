package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TwitterListModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	// should have labeled it twitterlistmodel for less confusion
	TweetListModel tweets;
	
	public TwitterListModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		tweets= new TweetListModel();
		
	}

	//count number of tweets in list of tweets
	public void testCount() {
		NormalTweetModel normalTweet = new NormalTweetModel("Hello");
		tweets.addTweet(normalTweet);
		assertEquals("Count should be 1", tweets.getCount(), 1);
	}
	
	public void testAddTweets() {
		
		NormalTweetModel normalTweet = new NormalTweetModel("Hi");
		tweets.addTweet(normalTweet);
		assertEquals("There should be a tweet in the list", 1, tweets.getTweets().size());
		//assertNotNull("The tweets list is not initialized", tweets.getTweets());
	}
	
}
