package magdamiu.com.androidfundamentals.week5;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import magdamiu.com.androidfundamentals.R;
import magdamiu.com.androidfundamentals.utils.Logging;

public class ImplicitIntentActivity extends AppCompatActivity {

    private static String TAG = ImplicitIntentActivity.class.getSimpleName();

    private EditText mEditTextUrl;
    private EditText mEditTextLocation;
    private EditText mEditTextShare;
    private EditText mEditTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        initView();
    }

    private void initView() {
        mEditTextUrl = findViewById(R.id.edittext_url);
        mEditTextLocation = findViewById(R.id.edittext_location);
        mEditTextShare = findViewById(R.id.edittext_share);
        mEditTextPhone = findViewById(R.id.edittext_phone);
    }

    public void btnOpenWebsiteOnclick(View view) {
        if (mEditTextUrl != null) {
            // Get the URL text.
            String url = mEditTextUrl.getText().toString();

            // Parse the URI and create the intent.
            Uri website = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, website);
            // Find an activity to hand the intent and start that activity.
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Logging.show(TAG, getResources().getString(R.string.cant_handle));
            }
        }
    }

    public void btnLocationOnClick(View view) {
        if (mEditTextLocation != null) {
            // Get the string indicating a location. Input is not validated; it is
            // passed to the location handler intact.
            String location = mEditTextLocation.getText().toString();

            // Parse the location and create the intent.
            Uri addressUri = Uri.parse("geo:0,0?q=" + location);
            Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

            // Find an activity to handle the intent, and start that activity.
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Logging.show(TAG, getResources().getString(R.string.cant_handle));
            }
        }
    }

    public void btnShareOnClick(View view) {
        if (mEditTextShare != null) {
            String textToShare = mEditTextShare.getText().toString();
            String mimeType = "text/plain";
            ShareCompat.IntentBuilder
                    .from(this)
                    .setType(mimeType)
                    .setChooserTitle(R.string.share_text_with)
                    .setText(textToShare)
                    .startChooser();
        }
    }

    public void btnPhoneOnClick(View view) {
        if (mEditTextPhone != null) {
            String phone = mEditTextPhone.getText().toString();
            Uri phoneUri = Uri.parse("tel:" + phone);
            Intent intent = new Intent(Intent.ACTION_DIAL, phoneUri);
            // Find an activity to handle the intent, and start that activity.
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Logging.show(TAG, getResources().getString(R.string.cant_handle));
            }
        }
    }
}
