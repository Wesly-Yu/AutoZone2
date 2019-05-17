package com.wesly.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.Charset;

public class PostMethod {
    private CookieStore store;

    public  void PostTest() throws IOException {
        String url = "www.baidu,com";
        //声明一个client对象
        DefaultHttpClient client = new DefaultHttpClient();
        //声明一个方法：post
        HttpPost post = new HttpPost(url);
        //添加参数
        JSONObject para = new JSONObject();
        para.put("name","huahansan");
        para.put("age","18");
        //设置请求头信息,header
        post.setHeader("content-type","application/json");
        StringEntity entity = new StringEntity(para.toString(), Charset.forName("UTF-8"));
        post.setEntity(entity);  //Stringentity 将body参数转换为json字符串后传给post
        //声明一个对象来存储响应信息,StringEntity构造消息实体
        String result;
        //设置cookie信息
        client.setCookieStore(this.store);
        //执行post请求
        HttpResponse response =client.execute(post);
        //将响应结果字符串转换为json对象
        result = EntityUtils.toString(response.getEntity(),Charset.forName("UTF-8"));
        JSONObject resultjson = new JSONObject(result);
        //获取响应结果
        resultjson.get("huhansan");
        //处理结果
    }
}
