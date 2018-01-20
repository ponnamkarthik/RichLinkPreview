package io.github.ponnamkarthik.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.ponnamkarthik.richlinkpreview.RichLinkView;
import io.github.ponnamkarthik.richlinkpreview.RichLinkViewSkype;
import io.github.ponnamkarthik.richlinkpreview.RichLinkViewTelegram;
import io.github.ponnamkarthik.richlinkpreview.RichLinkViewTwitter;
import io.github.ponnamkarthik.richlinkpreview.ViewListener;

public class MainActivity extends AppCompatActivity {

    RichLinkView richLinkView;
    RichLinkViewTelegram richLinkView1;
    RichLinkViewSkype richLinkView2;
    RichLinkViewTwitter richLinkView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        richLinkView = (RichLinkView) findViewById(R.id.richLinkView);
        richLinkView1 = (RichLinkViewTelegram) findViewById(R.id.richLinkView1);
        richLinkView2 = (RichLinkViewSkype) findViewById(R.id.richLinkView2);
        richLinkView3 = (RichLinkViewTwitter) findViewById(R.id.richLinkView3);

        richLinkView.setLink("https://whatsapp.com" ,new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
        richLinkView1.setLink("https://telegram.org" ,new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
        richLinkView2.setLink("https://www.skype.com" ,new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
        richLinkView3.setLink("https://twitter.com" ,new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });


    }
}
