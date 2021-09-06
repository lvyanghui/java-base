package com.lyh.fund.controller;

import com.lyh.fund.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvyanghui
 * 2021/9/6 21:29
 */
@RestController
public class HelloController {

    @Autowired
    FundService service;

    @RequestMapping("/hello")
    public String hello(String param){
        return "hello " + param;
    }

    @RequestMapping("/fund")
    public void getFund(){
        service.getFunds();
    }
}
