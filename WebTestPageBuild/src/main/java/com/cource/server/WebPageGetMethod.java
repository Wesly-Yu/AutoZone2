package com.cource.server;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//RestController 表明是被扫描的类
@RestController
public class WebPageGetMethod {
    @RequestMapping(value = "/getCoookies",method = RequestMethod.GET)
    public  String getCookie(){
        //HttpServerLetRequest:装请求信息
        //HttpServerLetResponse:装返回值信息

        return "获取到cookies";
    }
}
