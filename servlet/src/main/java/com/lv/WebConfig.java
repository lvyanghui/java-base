package com.lv;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by lvyanghui on 2018/12/1.
 */
@Configuration
@ComponentScan("com.lv.controller")
@EnableWebMvc
public class WebConfig{
}
