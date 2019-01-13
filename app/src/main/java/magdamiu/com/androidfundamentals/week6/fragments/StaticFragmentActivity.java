package magdamiu.com.androidfundamentals.week6.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import magdamiu.com.androidfundamentals.R;

public class StaticFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_statically);
    }
}
