package com.lyh.fund.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

/**
 * Created by lvyanghui
 * 2021/9/6 22:13
 */
@Configuration
public class RestTemplateConfig {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Bean
    public RestTemplate restTemplate() {
        restTemplateBuilder.setConnectTimeout(Duration.ofSeconds(5));
        restTemplateBuilder.setReadTimeout(Duration.ofSeconds(30));
        return restTemplateBuilder.build();
    }
}
