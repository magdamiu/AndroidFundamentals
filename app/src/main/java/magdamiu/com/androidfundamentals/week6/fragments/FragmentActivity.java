package magdamiu.com.androidfundamentals.week6.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import magdamiu.com.androidfundamentals.R;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    public void btnStaticFragment(View view) {
        startActivity(new Intent(this, StaticFragmentActivity.class));
    }

    public void btnDynamicFragment(View view) {
        startActivity(new Intent(this, DynamicFragmentActivity.class));
    }

    public void btnBundleFragment(View view) {
        startActivity(new Intent(this, BundleFragmentActivity.class));
    }

    public void btnMethodFragment(View view) {
        startActivity(new Intent(this, MethodFragmentActivity.class));
    }

    public void btnListenerFragment(View view) {
        startActivity(new Intent(this, ListenerFragmentActivity.class));
    }
}
