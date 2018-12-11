package magdamiu.com.androidfundamentals.week5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import magdamiu.com.androidfundamentals.R;

public class ReceiverLifecycleActivity extends AppCompatActivity {

    private final String TAG = ReceiverLifecycleActivity.class.getSimpleName();

    private TextView mTextViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiverlifecycle);

        mTextViewName = (TextView) findViewById(R.id.textview_name);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String message = extras.getString(LifecycleActivity.MESSAGE);
            if (message != null && message.length() > 0) {
                mTextViewName.setText(message);
                message += " " + TAG;
                Intent intent = new Intent();
                intent.putExtra(LifecycleActivity.MESSAGE, message);
                setResult(RESULT_OK, intent);
                finish();
            }
        }
    }
}
