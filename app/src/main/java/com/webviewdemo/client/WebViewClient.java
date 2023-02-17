package com.webviewdemo.client;

import android.webkit.WebView;

public class WebViewClient {
    public boolean UrlLoading(WebView webView, String url){
        if(url.contains("journaldev.com")) return false;
        return true;
    }
}
