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
import magdamiu.com.androidfundamentals.week4.ConstraintLayoutActivity;
import magdamiu.com.androidfundamentals.week4.RecyclerViewActivity;
import magdamiu.com.androidfundamentals.week4.SpinnerActivity;
import magdamiu.com.androidfundamentals.week4.Week4RecapActivity;
import magdamiu.com.androidfundamentals.week5.FirstActivity;
import magdamiu.com.androidfundamentals.week5.ImplicitIntentActivity;
import magdamiu.com.androidfundamentals.week5.LifecycleActivity;
import magdamiu.com.androidfundamentals.week5.SendTextActivity;
import magdamiu.com.androidfundamentals.week6.NavigationDrawerActivity;
import magdamiu.com.androidfundamentals.week6.fragments.FragmentActivity;
import magdamiu.com.androidfundamentals.week6.tabs.TabsActivity;
import magdamiu.com.androidfundamentals.week7.AlertsAndCardViewActivity;
import magdamiu.com.androidfundamentals.week7.CameraActivity;
import magdamiu.com.androidfundamentals.week7.CollapsingToolbarActivity;
import magdamiu.com.androidfundamentals.week8.MoviesActivity;

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

    public void btnWeek3SpinnerOnClick(View view) {
        startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
    }

    public void btnWeek4RecyclerViewOnClick(View view) {
        startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
    }

    public void btnWeek4RecapOnClick(View view) {
        startActivity(new Intent(MainActivity.this, Week4RecapActivity.class));
    }

    public void btnWeek4ConstraintOnClick(View view) {
        startActivity(new Intent(MainActivity.this, ConstraintLayoutActivity.class));
    }

    public void btnWeek5CC2(View view) {
        startActivity(new Intent(MainActivity.this, SendTextActivity.class));
    }

    public void btnWeek5CC3(View view) {
        startActivity(new Intent(MainActivity.this, FirstActivity.class));
    }

    public void btnWeek5ImplicitIntents(View view) {
        startActivity(new Intent(MainActivity.this, ImplicitIntentActivity.class));
    }

    public void btnWeek4RecyclerViewGroup2OnClick(View view) {
        startActivity(new Intent(MainActivity.this, magdamiu.com.androidfundamentals
                .week4.group2.RecyclerViewActivity.class));
    }

    public void btnWeek5LifecycleAndSetResultOnClick(View view) {
        startActivity(new Intent(MainActivity.this, LifecycleActivity.class));
    }

    public void btnWeek6TabsOnClick(View view) {
        startActivity(new Intent(MainActivity.this, TabsActivity.class));
    }

    public void btnWeek7AlertsAndCardViewOnClick(View view) {
        startActivity(new Intent(MainActivity.this, AlertsAndCardViewActivity.class));
    }

    public void btnWeek7CollapsingToolbarOnClick(View view) {
        startActivity(new Intent(MainActivity.this, CollapsingToolbarActivity.class));
    }

    public void btnWeek7CameraOnClick(View view) {
        startActivity(new Intent(MainActivity.this, CameraActivity.class));
    }

    public void btnWeek6FragmentsOnClick(View view) {
        startActivity(new Intent(MainActivity.this, FragmentActivity.class));
    }

    public void btnWeek6NavOnClick(View view) {
        startActivity(new Intent(MainActivity.this, NavigationDrawerActivity.class));
    }

    public void btnWeek8RetrofitOnClick(View view) {
        startActivity(new Intent(MainActivity.this, MoviesActivity.class));
    }
}
