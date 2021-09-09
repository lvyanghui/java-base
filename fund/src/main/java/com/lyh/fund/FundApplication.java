package com.lyh.fund;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lvyanghui
 * 2021/9/6 20:58
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lyh.fund.mapper")
public class FundApplication {

    public static void main(String[] args) {
        SpringApplication.run(FundApplication.class,args);
    }

}
