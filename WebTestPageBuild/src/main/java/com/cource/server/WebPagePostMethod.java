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
@Api(value = "/",description = "ȫ��POST�ӿڼ���")
public class WebPagePostMethod {
    //cookie������Ϊ�˴洢Cookie��Ϣ��
    private static Cookie cookie;
    //�û���½���ȡ��cookie��Ȼ����������Ľӿ�;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "��½�ɹ����ȡcookies��Ϣ")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName",required = true) String userName,
                        @RequestParam(value = "passWord",required = true) String passWord){
        if(userName.equals("admin") &&passWord.equals("a1234567")){
            cookie = new Cookie("login","true");
            response.addCookie(cookie);
            return "��½�ɹ�";
        }
        return "�û��������������";
    }
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    @ApiOperation(value = "��ȡ�û���Ϣ",httpMethod = "POST")
    public User getUserInfo(){

    }
}
