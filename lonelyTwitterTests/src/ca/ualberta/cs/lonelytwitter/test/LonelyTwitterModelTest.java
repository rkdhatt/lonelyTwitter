package ca.ualberta.cs.lonelytwitter.test;


import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTwitterModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTwitterModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSampleCode() {
		
		//assertFalse("This is not true", isGreaterEqual(7,6));
		assertEquals("5 should be equal to 5.", 5, 5);
		//fail("This is a failing test.");
		
	}

	private boolean isGreaterEqual(int i, int j) {
		
		if(i>=j) {
			return true;
		}
		return false;
	}
	
	public void testEqualsCase() {
		
		//Date date = new Date();
		ImportantTweetModel tweet1 = new ImportantTweetModel("Hi", new Date(123));
		ImportantTweetModel tweet2 = new ImportantTweetModel("Hi", new Date(123));
		
		assertTrue("Same tweets", tweet1.equals(tweet2));
	}
}
