package mateusmoreira.appcongrega2017;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class RestaurantesFragment extends Fragment {

    public RestaurantesFragment() {
        // Required empty public constructor
    }

    WebView wvpage;
    String caminhoURL = "http://congrega.urcamp.edu.br/restaurantes/";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_restaurantes, container, false);

        wvpage = (WebView) v.findViewById(R.id.webView3);
        wvpage.loadUrl(caminhoURL);
        WebSettings settings = wvpage.getSettings();
        settings.setJavaScriptEnabled(true);
        wvpage.setWebViewClient(new MyWebViewClient());
        return v;

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @SuppressWarnings("deprecation")
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            final Uri uri = Uri.parse(url);
            return true;
        }

        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }

    }


}
