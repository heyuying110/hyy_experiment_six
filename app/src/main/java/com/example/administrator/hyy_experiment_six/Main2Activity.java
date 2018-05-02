package com.example.administrator.hyy_experiment_six;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
      protected WebView webView;
      private  String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView=findViewById(R.id.webivew);
          value=getIntent().getStringExtra("name");

         webView.setWebChromeClient(new WebChromeClient());
         webView.setWebViewClient(new WebViewClient(){
             @Override
             public boolean shouldOverrideUrlLoading(WebView view, String url) {
                 webView.loadUrl(url);
                 return true;
             }
         });
         webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(value);




    }
}
