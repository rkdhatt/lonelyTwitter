package ca.ualberta.cs.lonelytwitter;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class IntentReaderActivity extends Activity {

	public static final String TEXT_KEY = "TEXT";
	public static final String TRANSFORM_KEY = "TRANSFORM";

	public static final int NORMAL = 1;
	public static final int REVERSE = 2;
	public static final int DOUBLE = 3;
	
	private String text; // from intent
	private int mode;
	
	public String getText() {
		return text;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent_reader);
		Intent intent = getIntent();

		mode = intent.getIntExtra(TRANSFORM_KEY, NORMAL);
		// now transform text
		text = transformText(intent.getStringExtra(TEXT_KEY));
		
		// Using TDD, test and implement a default message 
		// that will be displayed if no text is sent in the intent. This should not be 
		// returned in getText(), but should be displayed in the textview.
		if (text != null) {
			TextView textView = (TextView) findViewById(R.id.intentText);
			textView.setText(text);
		} else{
			TextView textView = (TextView) findViewById(R.id.intentText);
			textView.setText("There was no text from intent!");
		}
	}
	
	// performs transformations
	public String transformText(String text) {
		switch (mode) {
			case REVERSE:
				char[] string =  text.toCharArray();
				for (int i = 0; i < string.length / 2; i++) {
					char tmp = string[i];
					string[i] = string[string.length - i -1];
					string[string.length - i - 1] = tmp;
				}
				return new String(string);
			case DOUBLE:
				return text + text;
		}
		return text;
	}
}
