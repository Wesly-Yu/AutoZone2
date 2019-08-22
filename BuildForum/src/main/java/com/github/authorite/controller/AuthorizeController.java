package com.github.authorite.controller;
import com.github.authorite.dto.AccessTokenDTO;
import com.github.authorite.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;
    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code,
                           @RequestParam(name = "state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_id("1c6819d3d068acda9639");
        accessTokenDTO.setState(state);
        accessTokenDTO.setRedirect_uri("http://localhost:8090/callback");
        githubProvider.getAccessToken(accessTokenDTO);
        return "login";
    }
}
