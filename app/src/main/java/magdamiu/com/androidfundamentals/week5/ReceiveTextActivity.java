package magdamiu.com.androidfundamentals.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

import magdamiu.com.androidfundamentals.R;

import static java.util.Objects.isNull;

public class ReceiveTextActivity extends AppCompatActivity {

    private TextView mTextViewReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_text);

        initView();
    }

    private void initView() {
        Intent intent = getIntent();
        String message = intent.getStringExtra(SendTextActivity.CAROL);
        if (message != null && !message.isEmpty()) {
            mTextViewReceived = findViewById(R.id.textview_text);
            mTextViewReceived.setText(message);
        }
    }
}
