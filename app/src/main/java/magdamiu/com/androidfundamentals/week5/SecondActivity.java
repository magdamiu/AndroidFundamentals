package magdamiu.com.androidfundamentals.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import magdamiu.com.androidfundamentals.R;

import static magdamiu.com.androidfundamentals.week5.FirstActivity.MESSAGE;

public class SecondActivity extends AppCompatActivity {

    private EditText mEditTextMessage;
    private android.support.constraint.Group mGroupDisplayMeesage;
    private TextView mTextViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();
    }

    private void initView() {
        mEditTextMessage = findViewById(R.id.edittext_message);
        mGroupDisplayMeesage = findViewById(R.id.group_display_message);
        mTextViewMessage = findViewById(R.id.textview_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE);
        if (message != null && !message.isEmpty()) {
            mGroupDisplayMeesage.setVisibility(View.VISIBLE);
            mTextViewMessage.setText(message);
        } else {
            mGroupDisplayMeesage.setVisibility(View.GONE);
        }
    }

    public void btnSendOnClick(View view) {
        if (mEditTextMessage != null) {
            String message = mEditTextMessage.getText().toString();
            if (message != null && !message.isEmpty()) {
                Intent intent = new Intent(this, FirstActivity.class);
                intent.putExtra(MESSAGE, message);
                startActivity(intent);
            } else {
                mEditTextMessage.setError(getResources().getString(R.string.fill_message));
            }
        }
    }
}
