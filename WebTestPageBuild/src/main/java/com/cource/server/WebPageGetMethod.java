package com.cource.server;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//RestController �����Ǳ�ɨ�����
@RestController
public class WebPageGetMethod {
    @RequestMapping(value = "/getCoookies",method = RequestMethod.GET)
    public  String getCookie(){
        //HttpServerLetRequest:װ������Ϣ
        //HttpServerLetResponse:װ����ֵ��Ϣ

        return "��ȡ��cookies";
    }
}
