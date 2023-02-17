package com.webviewdemo.client;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;

public class ClientImpl extends WebViewClient{
    private Activity activity = null;

    public ClientImpl(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean UrlLoading(WebView webView, String url) {
        if(url.contains("journaldev.com")) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }
}
