package com.mybatis.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Log4j
@RestController
@Api(value = "v1",description = "��ʾ1")
@RequestMapping("v1")
public class StoreDemo {

    //Autowired ��ʾ�Զ�����

    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "��ȡ�û���",httpMethod = "GET")
    public int getUSerCount(){
        return template.selectOne("getUserCount");
    }
}
