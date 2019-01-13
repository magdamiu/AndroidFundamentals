package magdamiu.com.androidfundamentals.week6.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import magdamiu.com.androidfundamentals.R;

public class BundleFragmentActivity extends AppCompatActivity {

    public static final String NUMBER = "number";

    private EditText mEditTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_fragment);

        initView();
    }


    public void btnSendNumberOnClick(View view) {
        if (mEditTextNumber != null && mEditTextNumber.getText() != null) {
            String content = mEditTextNumber.getText().toString();
            if (!content.isEmpty()) {
                int number = Integer.parseInt(content);
                Bundle bundle = new Bundle();
                bundle.putInt(NUMBER, number);
                BundleFragment bundleFragment = new BundleFragment();
                bundleFragment.setArguments(bundle);
                addTheFragmentDynamically(bundleFragment);
            }
        } else {
            mEditTextNumber.setError(getString(R.string.write_number_error));
        }
    }

    private void initView() {
        mEditTextNumber = findViewById(R.id.edittext_number);
    }

    private void addTheFragmentDynamically(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Begin the transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Replace the contents of the container with the new fragment
        fragmentTransaction.replace(R.id.container, fragment);
        // or ft.add(R.id.container, new ArticleFragment());
        fragmentTransaction.commit();
    }

}
