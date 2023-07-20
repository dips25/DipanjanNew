package com.example.mygithub.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mygithub.R;

public class RepoWebViewActivity extends AppCompatActivity {

    Intent intent;
    WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        intent = getIntent();




        webView = (WebView) findViewById(R.id.repowebview);


        String url = intent.getStringExtra("url");

        webView.loadUrl(url);


    }
}
