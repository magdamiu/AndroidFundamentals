package magdamiu.com.androidfundamentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import magdamiu.com.androidfundamentals.week2.ViewExamplesActivity;
import magdamiu.com.androidfundamentals.week2.Week2Activity;
import magdamiu.com.androidfundamentals.week3.LoginActivity;
import magdamiu.com.androidfundamentals.week3.WebViewActivity;
import magdamiu.com.androidfundamentals.week3.Week3Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnWeek2ViewExamplesOnClick(View view) {
        startActivity(new Intent(MainActivity.this, ViewExamplesActivity.class));
    }

    public void btnWeek2OnClick(View view) {
        startActivity(new Intent(MainActivity.this, Week2Activity.class));
    }

    public void btnWeek3ViewGroupsOnClick(View view) {
        startActivity(new Intent(MainActivity.this, Week3Activity.class));
    }

    public void btnLoginOnClick(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void btnWeek3WebViewOnClick(View view) {
        startActivity(new Intent(MainActivity.this, WebViewActivity.class));
    }
}
