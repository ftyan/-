package com.ftyan.shahr;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class complaint extends AppCompatActivity {

    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);
        if (haveNetwork()){
            Toast.makeText(complaint.this, "Network connection is available", Toast.LENGTH_SHORT).show();
        } else if (!haveNetwork()) {
            Toast.makeText(complaint.this, "Network connection is not available", Toast.LENGTH_SHORT).show();
        }


        webView1 =findViewById(R.id.webview1);
        WebSettings webSettings1 =webView1.getSettings();
        webSettings1.setJavaScriptEnabled(true);
        webView1.loadUrl("http://rern.gov.eg/pages/complaints");
        webView1.setWebViewClient(new WebViewClient());
    }

    private boolean haveNetwork(){
        boolean have_WIFI= false;
        boolean have_MobileData = false;
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfos = connectivityManager.getAllNetworkInfo();
        for(NetworkInfo info:networkInfos){
            if (info.getTypeName().equalsIgnoreCase("WIFI"))if (info.isConnected())have_WIFI=true;
            if (info.getTypeName().equalsIgnoreCase("MOBILE DATA"))if (info.isConnected())have_MobileData=true;
        }
        return have_WIFI||have_MobileData;
    }
}


