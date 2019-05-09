package com.cource.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;


@RestController
@Api(value = "/",description = "全部POST接口集合")
public class WebPagePostMethod {
    //cookie变量是为了存储Cookie信息的
    private static Cookie cookie;
    //用户登陆后获取到cookie，然后访问其他的接口;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登陆成功后获取cookies信息")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName",required = true) String userName,
                        @RequestParam(value = "passWord",required = true) String passWord){
        if(userName.equals("admin") &&passWord.equals("a1234567")){
            cookie = new Cookie("login","true");
            response.addCookie(cookie);
            return "登陆成功";
        }
        return "用户名或者密码错误";
    }
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户信息",httpMethod = "POST")
    public User getUserInfo(){

    }
}
