# RichLink-Preview
A Rich Link Preview Library for Android

[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-RichLinkPreview-green.svg?style=flat )]( https://android-arsenal.com/details/1/6702 )


> Sample Image
<img src="https://github.com/PonnamKarthik/RichLinkPreview/raw/master/screenshots/sample.png" width="300" alt="ScreenShot">


#### Import using Gradle

~~~gradle
compile 'io.github.ponnamkarthik:richlinkpreview:1.0.9'
~~~

for android studio 3.x

~~~gradle
implementation 'io.github.ponnamkarthik:richlinkpreview:1.0.9'

### jsoup library required 
Implementation 'org.jsoup:jsoup:1.12.1'
~~~

#### To implement existing layout using XML

Add below code in activity_main.xml

~~~xml
<!--default view or whatsapp -->
<io.github.ponnamkarthik.richlinkpreview.RichLinkView
    android:id="@+id/richLinkView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
</io.github.ponnamkarthik.richlinkpreview.RichLinkView>
<!-- Telegram -->
<io.github.ponnamkarthik.richlinkpreview.RichLinkViewTelegram
    android:id="@+id/richLinkView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
</io.github.ponnamkarthik.richlinkpreview.RichLinkViewTelegram>
<!-- Skype -->
<io.github.ponnamkarthik.richlinkpreview.RichLinkViewSkype
    android:id="@+id/richLinkView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
</io.github.ponnamkarthik.richlinkpreview.RichLinkViewSkype>
<!-- Twitter -->
<io.github.ponnamkarthik.richlinkpreview.RichLinkViewTwitter
    android:id="@+id/richLinkView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
</io.github.ponnamkarthik.richlinkpreview.RichLinkViewTwitter>
~~~

In your MainActivity.java add below code

~~~java
public class MainActivity extends AppCompatActivity {
    
    RichLinkView richLinkView; 
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ...
        // 
        richLinkView = (RichLinkView) findViewById(R.id.richLinkView);
        
        
        
        richLinkView.setLink("https://stackoverflow.com", new ViewListener() {
            
            @Override
            public void onSuccess(boolean status) {
                
            }
            
            @Override
            public void onError(Exception e) {
                
            }
        });
        
    }
}
~~~


~~~java
RichLinkView richLinkView;
RichLinkViewTelegram richLinkViewTelegram;
RichLinkViewSkype richLinkViewSkype;
RichLinkViewTwitter richLinkViewTwitter;

//Set Link is same as default
~~~

> **OR**

#### If you want to implement your own layout.

~~~java
private MetaData data;

RichPreview richPreview = new RichPreview(new ResponseListener() {
    @Override
    public void onData(MetaData metaData) {
        data = metaData;
       
        //Implement your Layout
    }
    
    @Override
    public void onError(Exception e) {
        //handle error
    }
});
~~~

> if you want to set obtained meta data to view

~~~java

richLinkView.setLinkFromMeta(metaData)

or

MetaData metaData = new MetaData();
metaData.setTitle("Title");
metaData.setDescription("Custom Meta Data");
metaData.setFavicon("http://favicon url");
metaData.setImageurl("http://image url");
metaData.setSitename("Custom Meta data site");

richLinkView.setLinkFromMeta(metaData);


~~~


> Set your own CickListener

~~~java

//at first disable default click
richLinkView.setDefaultClickListener(false);

//set your own click listener
richLinkView.setClickListener(new RichLinkListener() {
    @Override
    public void onClicked(View view, MetaData meta) {
        //do stuff
        Toast.makeText(getApplicationContext(), meta.getTitle(), Toast.LENGTH_SHORT).show();
    }
});

~~~

> MetaData

```java
metaData.getTitle();

metaData.getImageurl();

metaData.getDescription();

metaData.getSitename();

metaData.getUrl();

metaData.getMediatype();
```
