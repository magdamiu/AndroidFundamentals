package magdamiu.com.androidfundamentals.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import magdamiu.com.androidfundamentals.R;
import magdamiu.com.androidfundamentals.utils.Logging;

public class ViewExamplesActivity extends AppCompatActivity {

    private static final String TAG = "ViewExamplesActivity";

    private EditText mEditTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_examples);

        mEditTextEmail = findViewById(R.id.edittext_email);
    }

    public void btnClickMeOnClick(View view) {
        String email = mEditTextEmail.getText().toString();
        if (!email.isEmpty()) {
            Logging.show(TAG, email);
        }
    }
}
