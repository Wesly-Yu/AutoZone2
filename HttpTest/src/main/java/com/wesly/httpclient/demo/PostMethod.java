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
        //����һ��client����
        DefaultHttpClient client = new DefaultHttpClient();
        //����һ��������post
        HttpPost post = new HttpPost(url);
        //��Ӳ���
        JSONObject para = new JSONObject();
        para.put("name","huahansan");
        para.put("age","18");
        //��������ͷ��Ϣ,header
        post.setHeader("content-type","application/json");
        StringEntity entity = new StringEntity(para.toString(), Charset.forName("UTF-8"));
        post.setEntity(entity);  //Stringentity ��body����ת��Ϊjson�ַ����󴫸�post
        //����һ���������洢��Ӧ��Ϣ,StringEntity������Ϣʵ��
        String result;
        //����cookie��Ϣ
        client.setCookieStore(this.store);
        //ִ��post����
        HttpResponse response =client.execute(post);
        //����Ӧ����ַ���ת��Ϊjson����
        result = EntityUtils.toString(response.getEntity(),Charset.forName("UTF-8"));
        JSONObject resultjson = new JSONObject(result);
        //��ȡ��Ӧ���
        resultjson.get("huhansan");
        //������
    }
}
