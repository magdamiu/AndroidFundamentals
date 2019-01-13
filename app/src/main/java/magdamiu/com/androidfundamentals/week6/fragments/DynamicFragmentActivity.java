package magdamiu.com.androidfundamentals.week6.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import magdamiu.com.androidfundamentals.R;

public class DynamicFragmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_dinamically);

        addTheFragmentDynamically();
    }

    private void addTheFragmentDynamically() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Begin the transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Replace the contents of the container with the new fragment
        fragmentTransaction.replace(R.id.container, new ArticleFragment());
        // or ft.add(R.id.container, new ArticleFragment());
        fragmentTransaction.commit();
    }
}
