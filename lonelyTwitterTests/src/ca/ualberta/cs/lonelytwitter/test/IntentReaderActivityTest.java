package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;
import android.test.ViewAsserts;

public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTest() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	// want to test whether activity can read text from my intent
	public void testSendText() {
		String text = "Hello world!";
		int code = IntentReaderActivity.NORMAL;
		IntentReaderActivity activity = startwithText(text, code);
		// check if the activity got the activity from startwithText method
		assertEquals("Is the text correct?", text, activity.getText());
	}
	
	public void testDoubleText() {
		String text = "Hello";
		IntentReaderActivity activity = startwithText(text, 
				IntentReaderActivity.DOUBLE); // want double mode transformation
		assertEquals("Double transform working?", text+text, activity.getText());
	}
	
	public void testReverseText() {
		String text = "Hello";
		IntentReaderActivity activity = startwithText(text, 
				IntentReaderActivity.REVERSE); // want reverse mode transformation
		assertEquals("Double transform working?", "olleH", activity.getText());
	}
	

	public void testDisplayText() {
		/*
		 * Write a test that asserts that the textview is actually visible on screen.
		 * Hints:
		 *     activity.getWindow().getDecorView() gets a view that will contain anything on screen
		 *     Android ViewAsserts contains an assert that you will find helpful
	*/	
		String text = "Hello world!";
		IntentReaderActivity activity = startwithText(text,
				IntentReaderActivity.NORMAL);
		assertEquals("correct text?", text, activity.getText());
		
		// get text view and see if there's a display
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		// check if same text sent to activity
		assertEquals("displays correct text?", text, view.getText().toString());
		View window = activity.getWindow().getDecorView();
		android.test.ViewAsserts.assertOnScreen(window, view);
		
	}
	
	private IntentReaderActivity startwithText(String text, int code) {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, code);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}
}
