package com.cource.server;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//RestController �����Ǳ�ɨ�����
@Api(value = "/",description = "�������е�get����")
@RestController
public class WebPageGetMethod {
    @RequestMapping(value = "/getCoookies",method = RequestMethod.GET)
    @ApiOperation(value = "ͨ�����������ȡcookies��Ϣ",httpMethod = "GET")
    public  String getCookie(HttpServletResponse response){
        //HttpServerLetRequest:װ������Ϣ��
        //HttpServerLetResponse:װ��Ӧ��Ϣ��
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "��ȡ��cookies";
    }
    /**
     * Ҫ��ͻ���Я��cookies���ʵ�get����
     */
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "Ҫ��ͻ���Я��cookies���ʵ�get����",httpMethod = "GET")
    public String  getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            return "����Я��cookies��Ϣ";
        }
        for(Cookie cookie:cookies){
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")){
                return "����һ����ҪЯ��cookies������get����";
            }
        }
        return "�Ѿ�Я��cookies��Ϣ";
    }
    /**
     *
     *
     * ��һ����ҪЯ���������ܷ��ʵ�get����
     * ģ���ȡ��Ʒ�б�
     * ����Ϊ��Ʒ���ƺͼ۸�
     */
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "ҪЯ���������ܷ��ʵ�get����",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start, @RequestParam  Integer end){
        Map<String,Integer> sellList = new HashMap<>();
        sellList.put("yeezh",1700);
        sellList.put("T��",1200);
        sellList.put("supme",1900);
        return sellList;
    }
    /**
     *
     * �ڶ���Я���������ʵ�get����
     * url---=ip:port/get/with/param/id/id
     *
     */
    @RequestMapping(value = "/get/with/param/{start}/{end}",method = RequestMethod.GET)
    public Map mySellList(@PathVariable Integer start,@PathVariable Integer end){
        Map<String,Integer> sellList = new HashMap<>();
        sellList.put("yeezh2",1700);
        sellList.put("T��2",1200);
        sellList.put("supme2",1900);
        return sellList;

    }
}
