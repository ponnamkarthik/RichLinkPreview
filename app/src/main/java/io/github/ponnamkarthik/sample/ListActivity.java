package io.github.ponnamkarthik.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import io.github.ponnamkarthik.richlinkpreview.MetaData;
import io.github.ponnamkarthik.richlinkpreview.RichLinkListener;
import io.github.ponnamkarthik.richlinkpreview.RichLinkView;
import io.github.ponnamkarthik.richlinkpreview.RichLinkViewSkype;
import io.github.ponnamkarthik.richlinkpreview.RichLinkViewTelegram;
import io.github.ponnamkarthik.richlinkpreview.RichLinkViewTwitter;
import io.github.ponnamkarthik.richlinkpreview.ViewListener;
import io.github.ponnamkarthik.sample.R;
import io.github.ponnamkarthik.sample.adapters.URLAdapter;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.list);

        ArrayList<URL> urls = new ArrayList<>();

        try {
            urls.add(new URL("https://www.flipkart.com/"));
            urls.add(new URL("https://google.com"));
            urls.add(new URL("https://skype.com"));
            urls.add(new URL("https://twitter.com"));
            urls.add(new URL("https://www.flipkart.com/"));
            urls.add(new URL("https://google.com"));
            urls.add(new URL("https://skype.com"));
            urls.add(new URL("https://twitter.com"));
            urls.add(new URL("https://www.flipkart.com/"));
            urls.add(new URL("https://google.com"));
            urls.add(new URL("https://skype.com"));
            urls.add(new URL("https://twitter.com"));
            urls.add(new URL("https://www.flipkart.com/"));
            urls.add(new URL("https://google.com"));
            urls.add(new URL("https://skype.com"));
            urls.add(new URL("https://twitter.com"));

            URLAdapter urlAdapter = new URLAdapter(this, urls);

            listView.setAdapter(urlAdapter);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
