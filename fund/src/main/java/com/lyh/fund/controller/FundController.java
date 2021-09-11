package com.lyh.fund.controller;

import com.github.pagehelper.PageInfo;
import com.lyh.fund.domain.FundDetailInfo;
import com.lyh.fund.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lvyanghui
 * 2021/9/6 21:29
 */
@RestController
public class FundController {

    @Autowired
    FundService service;

    @RequestMapping("/getFund")
    public String getFund(){
        return service.getFunds();
    }

    @RequestMapping("/addFund")
    public String addFund(){
        return service.insertFund();
    }

    @RequestMapping("/pageFund")
    public PageInfo<FundDetailInfo> pageFund(){
        return service.queryFundsByPage();
    }

    @RequestMapping("/getCode")
    public List<String> getCode(){
        return service.getCode();
    }
}
