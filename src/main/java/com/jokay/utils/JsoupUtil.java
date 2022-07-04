package com.jokay.utils;

import com.sun.deploy.net.HttpUtils;
import org.apache.http.client.methods.HttpGet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupUtil {
    public static void main(String[] args) {
        String url = "https://www.shuquge.com/";
        HtmlUnitUtil htmlUnitUtil = new HtmlUnitUtil();
        String content = htmlUnitUtil.htmlUnitUrl(url);
        System.out.println(content);
        //
//        Document document = null;
//        try {
//            document = Jsoup.connect(url).get();
//            System.out.println(document.title());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Elements h2 = document.getElementsByTag("h2");
//        System.out.println(h2.size());
    }
}
