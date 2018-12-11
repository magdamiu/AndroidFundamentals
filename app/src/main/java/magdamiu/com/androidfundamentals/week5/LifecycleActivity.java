package magdamiu.com.androidfundamentals.week5;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


import magdamiu.com.androidfundamentals.R;
import magdamiu.com.androidfundamentals.utils.Logging;

public class LifecycleActivity extends AppCompatActivity {

    final static int FIRST_ACTIVITY_CODE = 255;
    final static String MESSAGE = "MESSAGE";

    private final String TAG = LifecycleActivity.class.getSimpleName();

    private EditText mEditTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        mEditTextName = (EditText) findViewById(R.id.edittext_name);
        Logging.show(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logging.show(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logging.show(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logging.show(TAG, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logging.show(TAG, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logging.show(TAG, "onDestroy");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == LifecycleActivity.FIRST_ACTIVITY_CODE && resultCode == RESULT_OK) {
            String message = data.getStringExtra(LifecycleActivity.MESSAGE);
            Intent intent = new Intent();
            intent.putExtra(LifecycleActivity.MESSAGE, message);
            setResult(RESULT_OK, intent);
            mEditTextName.setText(message);
        }
    }

    public void btnStartSecondActivity(View view) {
        String name = mEditTextName.getText().toString();
        if (name != null && name.length() > 0) {
            Intent newIntent = new Intent(this, ReceiverLifecycleActivity.class);
            newIntent.putExtra(MESSAGE, name);
            startActivityForResult(newIntent, FIRST_ACTIVITY_CODE);
        } else {
            mEditTextName.setError(getResources().getString(R.string.complete_the_name));
        }
    }
}
