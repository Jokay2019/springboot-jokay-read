package com.jokay.utils;

//import org.apache.http.HttpEntity;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;

public class HttpClientUtil {
//    public static String urlStr = "https://book.qidian.com/info/1021617576/";
//    public  static String urlStr2 = "http://q.10jqka.com.cn/index/index/board/all/field/zdf/order/desc/page/3/ajax/1/";
//    public static void main(String[] args) {
//       String re= doPost(urlStr2);
//        System.out.println(re);
//    }
//    public static String doGet(String url) {
//        CloseableHttpClient httpClient = null;
//        CloseableHttpResponse response = null;
//        String result = "";
//        httpClient = HttpClients.createDefault();
//        HttpGet httpGet = new HttpGet(url);
//        RequestConfig config = RequestConfig.custom()
//                .setConnectTimeout(15000)
//                .setConnectionRequestTimeout(35000)
//                .setSocketTimeout(60000)
//
//                .build();
//        httpGet.setConfig(config);
//        try {
//            response = httpClient.execute(httpGet);
//            HttpEntity entity = response.getEntity();
//            result = EntityUtils.toString(entity);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (response != null) {
//                    response.close();
//                    ;
//                }
//                if (httpClient != null) {
//                    httpClient.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return result;
//    }
//    public static String doPost(String url) {
//        CloseableHttpClient httpClient = null;
//        CloseableHttpResponse response = null;
//        String result = "";
//        httpClient = HttpClients.createDefault();
//        HttpPost httpPost = new HttpPost(url);
//        RequestConfig config = RequestConfig.custom()
//                .setConnectTimeout(15000)
//                .setConnectionRequestTimeout(35000)
//                .setSocketTimeout(60000)
//
//                .build();
//        httpPost.setConfig(config);
//        try {
//            response = httpClient.execute(httpPost);
//            HttpEntity entity = response.getEntity();
//            result = EntityUtils.toString(entity);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (response != null) {
//                    response.close();
//                    ;
//                }
//                if (httpClient != null) {
//                    httpClient.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return result;
//    }
}
