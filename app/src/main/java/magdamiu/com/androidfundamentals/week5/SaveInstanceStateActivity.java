package magdamiu.com.androidfundamentals.week5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.EditText;

import magdamiu.com.androidfundamentals.R;

public class SaveInstanceStateActivity extends AppCompatActivity {

    private final String INPUT_VALUE = "input";
    private final String CHECKBOX_VALUE = "checkbox";

    private EditText mEditTextMessage;
    private CheckBox mCheckBoxIsTrue;

    private String mInputValue;
    private boolean mCheckBoxValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_instance_state);

        mEditTextMessage = (EditText) findViewById(R.id.edittext_message);
        mCheckBoxIsTrue = (CheckBox) findViewById(R.id.checkbox_true);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(INPUT_VALUE, mEditTextMessage.getText().toString());
        outState.putBoolean(CHECKBOX_VALUE, mCheckBoxIsTrue.isChecked());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            mInputValue = savedInstanceState.getString(INPUT_VALUE);
            mCheckBoxValue = savedInstanceState.getBoolean(CHECKBOX_VALUE);
            mEditTextMessage.setText(mInputValue);
            mCheckBoxIsTrue.setSelected(mCheckBoxValue);
        }
    }
}
