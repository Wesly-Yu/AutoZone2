package com.cource.server;

import com.com.cource.bean.GetUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@Api(value = "/",description = "全部POST接口集合")
@RequestMapping("v1")
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
    public String getUserInfo(HttpServletRequest request,
                               @RequestBody GetUser u){
        //获取cookie
        GetUser user = new GetUser();
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login")
                    && cookie.getValue().equals("true") &&u.getUserName().equals("admin")&&u.getPassWord().equals("a1234567")){
                user.setAge(20);
                user.setSex("man");
                user.setName("黑子");
                return user.toString();
            }
        }
        return "参数不合法";
    }
}
