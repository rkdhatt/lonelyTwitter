package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class NormalTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public NormalTweetModelTest(String name) {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testEquals() {
		
		Date date = new Date();
		NormalTweetModel tweet1 = new NormalTweetModel("Hi", date);
		NormalTweetModel tweet2 = new NormalTweetModel("Hi", new Date(45465));
		
		assertTrue("Same tweets", tweet1.equals(tweet2));
	}

	
}
