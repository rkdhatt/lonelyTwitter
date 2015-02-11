package ca.ualberta.cs.lonelytwitter.test;

import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

/*
 * generate this class with new.. JUnit Test Case
 * set superclass to ActivityInstrumentationTestCase2
 */
public class LonelyTwitterActivityUITest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	Instrumentation instrumentation; // class: helps you perform some actions on your app
	Activity activity;
	EditText textInput;
	
	public LonelyTwitterActivityUITest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		instrumentation = getInstrumentation();
		activity = getActivity();

		textInput = ((EditText) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.body));
	}
	
	public void testSetText() {
		String text = "neat!";
		// Run UI thread
		instrumentation.runOnMainSync(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				textInput.setText("neat!");
			}
		});
		
		// wait until thread stops execution
		instrumentation.waitForIdleSync();
		assertEquals("Does this work?", text, textInput.getText().toString());
	}
	
	/*
	 * fills in the input text field and clicks the 'save'
	 * button for the activity under test
	 */
	private void makeTweet(String text) {
		assertNotNull(activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save));
		textInput.setText(text);
		// set text from edit text, then saved by pressing save button.
		((Button) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save)).performClick();
		
	}
	
	public void testTweet(){
		/*
		 * 
		 * Using the makeTweet() method in LonelyTwitterActivityUITest, create a test that will add a tweet.
		 * Assert that the ListView adapter gets a new element.
		 * Assert that the new thing in the adapter is a NormalTweetModel
		 * Assert that the text of the NormalTweetModel instance is correct
		 */
		// Run UI thread
		ListView listview = (ListView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.oldTweetsList);
		int count1 = listview.getAdapter().getCount();
		
		instrumentation.runOnMainSync(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				NormalTweetModel tweet = new NormalTweetModel("wooo");
				makeTweet("bleh");
			}
		});
		
		// wait until thread stops execution
		instrumentation.waitForIdleSync();

		int count2 = listview.getAdapter().getCount();
		assertEquals("Not equal", count2, count1+1);
	}
}
