package com.lyh.fund.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lvyanghui
 * 2021/9/6 22:15
 */
@Service
public class FundService {

    @Autowired
    RestTemplate restTemplate;


    public void getFunds(){
        //4. 设置header的Get请求
        String url = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=all&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.17771342305527527";
        HttpHeaders headers = new HttpHeaders();

        headers.add("Host","fund.eastmoney.com");
        headers.add("Referer","http://fund.eastmoney.com/data/fundranking.html");
        headers.add("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36");
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<String>(headers), String.class);

        System.out.println("设置header的Get请求:" + response.getBody().substring(0,10));

    }
}
