package io.github.ponnamkarthik.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.github.ponnamkarthik.richlinkpreview.MetaData;
import io.github.ponnamkarthik.richlinkpreview.RichLinkListener;
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

    Button goToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        richLinkView = (RichLinkView) findViewById(R.id.richLinkView);
        richLinkView1 = (RichLinkViewTelegram) findViewById(R.id.richLinkView1);
        richLinkView2 = (RichLinkViewSkype) findViewById(R.id.richLinkView2);
        richLinkView3 = (RichLinkViewTwitter) findViewById(R.id.richLinkView3);

        goToList = (Button) findViewById(R.id.go_to_list);

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


        //custom clickListener
        richLinkView.setDefaultClickListener(false);
        richLinkView.setClickListener(new RichLinkListener() {
            @Override
            public void onClicked(View view, MetaData meta) {
                Toast.makeText(getApplicationContext(), meta.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });


        goToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListActivity.class));
            }
        });


    }
}
