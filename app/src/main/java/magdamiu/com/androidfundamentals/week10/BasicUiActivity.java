package magdamiu.com.androidfundamentals.week10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import magdamiu.com.androidfundamentals.MainActivity;
import magdamiu.com.androidfundamentals.R;
import magdamiu.com.androidfundamentals.utils.Logging;

public class BasicUiActivity extends AppCompatActivity {

    private TextView mTextViewInfoText;
    private ImageView mImageViewProfilePicture;
    private Button mButtonChangeText;
    private EditText mEditTextPhoneNumber;
    private CheckBox mCheckBoxTerms;
    private RadioGroup mRadioGroupSelection;
    private RadioButton mRadioButtonYes;
    private RadioButton mRadioButtonNo;
    private RatingBar mRatingBarReview;
    private Switch mSwitchOnOff;
    private SeekBar mSeekBarMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set the layout of the activity
        setContentView(R.layout.activity_basic_ui);

        initView();
    }

    private void initView() {
        // set and get text using TextView
        mTextViewInfoText = findViewById(R.id.text_view_info_text);
        mTextViewInfoText.setText(getString(R.string.hello_from_java));
        String valueOfInfoText = mTextViewInfoText.getText().toString();
        if (valueOfInfoText != null) {
            Logging.show(BasicUiActivity.this, valueOfInfoText);
        }

        // set image resource on an ImageView
        mImageViewProfilePicture = findViewById(R.id.image_view_profile_picture);
        mImageViewProfilePicture.setImageResource(R.drawable.android_1);

        // set text on a Button
        mButtonChangeText = findViewById(R.id.button_change_text);
        mButtonChangeText.setText(getString(R.string.change_text));

        // get the EditText element
        mEditTextPhoneNumber = findViewById(R.id.edit_text_phone_number);
        mEditTextPhoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        // get the CheckBox element
        mCheckBoxTerms = findViewById(R.id.checkbox_terms);
        mCheckBoxTerms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // add your code
                } else {
                    // add your code
                }
            }
        });


        // get the RadioButtons and RadioGroup elements
        mRadioGroupSelection = findViewById(R.id.radio_group_selection);
        mRadioButtonYes = findViewById(R.id.radio_button_yes);
        mRadioButtonNo = findViewById(R.id.radio_button_no);

        // get RatingBar element
        mRatingBarReview = findViewById(R.id.rating_bar_review);

        // get Switch element
        mSwitchOnOff = findViewById(R.id.switch_on_off);

        // get SeekBar element
        mSeekBarMoney = findViewById(R.id.seek_bar_money);
    }

    public void changeTextViewValue(View view) {
        mTextViewInfoText.setText(getString(R.string.new_text));

        if (mEditTextPhoneNumber != null) {
            String phoneNumber = mEditTextPhoneNumber.getText().toString();
            if (phoneNumber != null && !phoneNumber.isEmpty()) {
                mTextViewInfoText.setText(phoneNumber);
            } else {
                mEditTextPhoneNumber.setError(getString(R.string.required));
            }
        }

        if (mCheckBoxTerms != null) {
            boolean isChecked = mCheckBoxTerms.isChecked();
            Toast.makeText(BasicUiActivity.this,
                    "Checkbox status = " + isChecked,
                    Toast.LENGTH_LONG).show();
            if (isChecked) {
                mRadioGroupSelection.setVisibility(View.VISIBLE);
                boolean yesIsChecked = mRadioButtonYes.isChecked();
                boolean noIsChecked = mRadioButtonNo.isChecked();
                Logging.show(BasicUiActivity.this,
                        "first =" + yesIsChecked + " " +
                                "second =" + noIsChecked);
            } else {
                mRadioGroupSelection.setVisibility(View.GONE);
            }
        }

        // get value from RatingBar
        float ratingValue = mRatingBarReview.getRating();
        Logging.show(BasicUiActivity.this, "rating = " + ratingValue);

        // get value from Switch
        boolean isSwitchChecked = mSwitchOnOff.isChecked();
        String textOn = mSwitchOnOff.getTextOn().toString();
        String textOff = mSwitchOnOff.getTextOff().toString();
        Logging.show(BasicUiActivity.this, isSwitchChecked + " " +
                textOn + " " + textOff);

        // get value from SeekBar
        int money = mSeekBarMoney.getProgress();
        Logging.show(BasicUiActivity.this, "value = " + money);
    }
}
