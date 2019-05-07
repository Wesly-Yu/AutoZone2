package com.wesly.httpclient.demo;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.Charset;



public class MyHttpClient {
    @Test
    public void test01() throws IOException {
        //存放结果
        String result;
        HttpGet get = new HttpGet("http://car.schouqin.gov.cn:8085/index");
        //client 用于执行get方法
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        //getEntity 获取响应的所有内容；
        result = EntityUtils.toString(response.getEntity(),Charset.defaultCharset());
        System.out.println(result);

    }
}
