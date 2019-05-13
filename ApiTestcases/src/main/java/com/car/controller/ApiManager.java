package com.car.controller;


import com.car.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@Log4j2
@RestController//包含Controller和ReauqestBody两个方法
@Api(value = "v1",description = "用户管理接口")//v1为设置的第一个路径前的参数
@RequestMapping("v1") //定义url模板,从v1字段开始查找访问路径,与下方的RequestMapping对应
public class ApiManager {

    @Autowired  //配合Bean注解使用
    private SqlSessionTemplate template;
    @ApiOperation(value = "登陆接口",httpMethod = "POST")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //是否登录成功返回布尔值
    //HttpServletResponse  返回cookies
    public Boolean login(HttpServletResponse response, @RequestBody User user){
        int res = template.selectOne("login",user);//查询数据库中是否有user
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        log.info("查询到的结果是"+res);
        if (res==1){
            log.info("登陆的用户是:"+user.getUserName());
            return true;
        }
        return false;

    }
    @ApiOperation(value = "添加用户",httpMethod = "POST")
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public boolean addUser(HttpServletRequest request, @RequestBody User user){
        Boolean result = vervifyCookie(request);
        int defaultresult = 0;
        if(result!=null){
            defaultresult = template.insert("addUser",user);
        }
        if(defaultresult > 0){
            log.info("添加用户的数量是："+defaultresult);
            return true;
        }
        return false;
    }

    private Boolean vervifyCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            log.info("cookie为空");
            return false;
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")){
                log.info("Cookie验证通过");
                return true;
            }
        }return false;
    }
}
