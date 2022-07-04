package com.jokay.utils;

import com.gargoylesoftware.htmlunit.*;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class HtmlUnitUtil {
    //初始化
    WebClient webClient;
    public HtmlUnitUtil() {
        webClient = new WebClient(BrowserVersion.CHROME);//新建一个模拟谷歌Chrome浏览器的浏览器客户端对象
        webClient.getOptions().setThrowExceptionOnScriptError(false);//当JS执行出错的时候是否抛出异常, 这里选择不需要
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);//当HTTP的状态非200时是否抛出异常, 这里选择不需要
        webClient.getOptions().setActiveXNative(false);
        webClient.getOptions().setCssEnabled(false);//是否启用CSS, 因为不需要展现页面, 所以不需要启用
        webClient.getOptions().setJavaScriptEnabled(true); //很重要，启用JS。有些网站要开启！
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());//很重要，设置支持AJAX
        webClient.getOptions().setTimeout(30000);
    }
    //获取某个url的web客户端
    public String htmlUnitUrl(String url) {
        try {
            WebRequest request = new WebRequest(new URL(url), HttpMethod.GET);
            Map<String, String> additionalHeaders = new HashMap<String, String>();
            additionalHeaders
                    .put("User-Agent",
                            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
            additionalHeaders.put("Accept-Language", "zh-CN,zh;q=0.9");
            additionalHeaders.put("Accept", "*/*");
            request.setAdditionalHeaders(additionalHeaders);
            // 获取某网站页面
            Page page = webClient.getPage(request);
            return page.getWebResponse().getContentAsString();
        } catch (Exception e) {

        }
        return null;
    }
}
