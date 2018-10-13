package com.example.sherin.uttarauniversitywebiew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    private String URL="https://www.youtube.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // webView.loadUrl(URL);


        initView();
    }

    private void initView() {
        webView=findViewById(R.id.webViewId);
        webView.loadUrl(URL);
    }
}
