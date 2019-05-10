package com.cource.server;

import com.com.cource.bean.GetUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@Api(value = "/",description = "ȫ��POST�ӿڼ���")
@RequestMapping("v1")
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
    public String getUserInfo(HttpServletRequest request,
                               @RequestBody GetUser u){
        //��ȡcookie
        GetUser user = new GetUser();
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login")
                    && cookie.getValue().equals("true") &&u.getUserName().equals("admin")&&u.getPassWord().equals("a1234567")){
                user.setAge(20);
                user.setSex("man");
                user.setName("����");
                return user.toString();
            }
        }
        return "�������Ϸ�";
    }
}
