package io.github.ponnamkarthik.richlinkpreview;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by ponna on 16-01-2018.
 */

public class RichPreview {

    MetaData metaData;
    ResponseListener responseListener;
    String url;

    public RichPreview(ResponseListener responseListener) {
        this.responseListener = responseListener;
        metaData = new MetaData();
    }

    public void getPreview(String url){
        this.url = url;
        new getData().execute();
    }

    private class getData extends AsyncTask<Void , Void , Void> {

        @Override
        protected Void doInBackground(Void... params) {
            Document doc = null;
            try {
                doc = Jsoup.connect(url).get();

                Elements elements = doc.getElementsByTag("meta");

                for(Element element : elements) {
                    if(element.hasAttr("property")) {

                        String str_property = element.attr("property").toString().trim();

                        if(str_property.equals("og:title")) {
                            metaData.setTitle(element.attr("content").toString());
                        }
                        if(str_property.equals("og:url")) {
                            metaData.setUrl(element.attr("content").toString());
                        }
                        if(str_property.equals("og:site_name")) {
                            metaData.setSitename(element.attr("content").toString());
                        }
                        if(str_property.equals("og:image")) {
                            metaData.setImageurl(element.attr("content").toString());
                        }
                        if(str_property.equals("og:description")) {
                            metaData.setDescription(element.attr("content").toString());
                        }
                    }
                }

                if(metaData.getTitle().equals("") || metaData.getTitle().isEmpty()) {
                    metaData.setTitle(doc.title());
                }

                if(metaData.getUrl().equals("") || metaData.getUrl().isEmpty()) {
                    URI uri = null;
                    try {
                        uri = new URI(url);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                    if(url == null) {
                        metaData.setUrl(url);
                    } else {
                        metaData.setUrl(uri.getHost());
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
                responseListener.onError(new Exception("No Html Received from " + url + " Check your Internet " + e.getLocalizedMessage()));
            }


            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            responseListener.onData(metaData);
        }
    }

}
