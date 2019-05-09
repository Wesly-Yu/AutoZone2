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

//RestController 表明是被扫描的类
@Api(value = "/",description = "这是所有的get方法")
@RestController
public class WebPageGetMethod {
    @RequestMapping(value = "/getCoookies",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法获取cookies信息",httpMethod = "GET")
    public  String getCookie(HttpServletResponse response){
        //HttpServerLetRequest:装请求信息类
        //HttpServerLetResponse:装响应信息类
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "获取到cookies";
    }
    /**
     * 要求客户端携带cookies访问的get请求
     */
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "要求客户端携带cookies访问的get请求",httpMethod = "GET")
    public String  getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            return "必须携带cookies信息";
        }
        for(Cookie cookie:cookies){
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")){
                return "这是一个需要携带cookies参数的get请求";
            }
        }
        return "已经携带cookies信息";
    }
    /**
     *
     *
     * 第一种需要携带参数才能访问的get请求
     * 模拟获取商品列表
     * 参数为商品名称和价格
     */
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "要携带参数才能访问的get请求",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start, @RequestParam  Integer end){
        Map<String,Integer> sellList = new HashMap<>();
        sellList.put("yeezh",1700);
        sellList.put("T恤",1200);
        sellList.put("supme",1900);
        return sellList;
    }
    /**
     *
     * 第二种携带参数访问的get请求
     * url---=ip:port/get/with/param/id/id
     *
     */
    @RequestMapping(value = "/get/with/param/{start}/{end}",method = RequestMethod.GET)
    public Map mySellList(@PathVariable Integer start,@PathVariable Integer end){
        Map<String,Integer> sellList = new HashMap<>();
        sellList.put("yeezh2",1700);
        sellList.put("T恤2",1200);
        sellList.put("supme2",1900);
        return sellList;

    }
}
