package magdamiu.com.androidfundamentals.week6.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import magdamiu.com.androidfundamentals.R;

public class ListenerFragmentActivity extends AppCompatActivity implements FragmentListener {

    private TextView mTextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_listener);

        initView();
    }

    private void initView() {
        mTextViewResult = findViewById(R.id.textview_result);
        ListenerFragment listenerFragment = new ListenerFragment();
        addTheFragmentDynamically(listenerFragment);
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

    @Override
    public void addTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        mTextViewResult.setText("The sum is : " + result);
    }
}
