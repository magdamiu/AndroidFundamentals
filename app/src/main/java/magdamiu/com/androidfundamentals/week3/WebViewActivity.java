package magdamiu.com.androidfundamentals.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import magdamiu.com.androidfundamentals.R;

public class WebViewActivity extends AppCompatActivity {

    private static final String ANDROID_DEVELOPER_URL = "https://developer.android.com/";
    private WebView mWebViewExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        initView();
    }

    private void initView() {
        mWebViewExample = findViewById(R.id.webview_example);
        WebSettings webSettings = mWebViewExample.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebViewExample.loadUrl(ANDROID_DEVELOPER_URL);
    }
}
