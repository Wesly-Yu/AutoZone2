package com.wesly.httpclient.demo;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.Charset;



public class MyHttpClient {
    //Get请求
    @Test
    public void test01() throws IOException {
        //存放结果
        String result;
        String path;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //client 用于执行get方法
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        int status_code = response.getStatusLine().getStatusCode();
        //getEntity 获取响应的所有内容,转换为string
        result = EntityUtils.toString(response.getEntity(),Charset.defaultCharset());
        //获取状态吗
        //获取当前执行文件所在的路径
        path =this.getClass().getResource(".").getPath();
        System.out.println(path);
        System.out.println(status_code);
    }
    @Test
    public void postTest(){
        //POST请求
        String result;
        String path;

    }
}
