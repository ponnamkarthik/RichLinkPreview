package io.github.ponnamkarthik.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.ponnamkarthik.richlinkpreview.RichLinkView;
import io.github.ponnamkarthik.richlinkpreview.ViewListener;

public class MainActivity extends AppCompatActivity {

    RichLinkView richLinkView;
    RichLinkView richLinkView1;
    RichLinkView richLinkView2;
    RichLinkView richLinkView3;
    RichLinkView richLinkView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        richLinkView = (RichLinkView) findViewById(R.id.richLinkView);
        richLinkView1 = (RichLinkView) findViewById(R.id.richLinkView1);
        richLinkView2 = (RichLinkView) findViewById(R.id.richLinkView2);
        richLinkView3 = (RichLinkView) findViewById(R.id.richLinkView3);
        richLinkView4 = (RichLinkView) findViewById(R.id.richLinkView4);

        richLinkView.setLink("https://stackoverflow.com", new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
        richLinkView1.setLink("https://facebook.com", new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
        richLinkView2.setLink("https://twitter.com", new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
        richLinkView3.setLink("https://medium.com", new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
        richLinkView4.setLink("https://github.com", new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });

    }
}
