package com.lv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvyanghui on 2018/12/1.
 */
@RestController
@RequestMapping("/study")
public class HelloController {

    @Autowired
    private ApplicationContext context;
    @RequestMapping("/hello")
    @ResponseBody
    public String testHello(){
        return "hello";
    }

    @RequestMapping("/context")
    @ResponseBody
    public String testContext(){

        context.getBeanDefinitionNames();
        System.out.println(context.getApplicationName());
        return "context";
    }
}
