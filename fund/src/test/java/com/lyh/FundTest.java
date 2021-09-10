package com.lyh;

import com.lyh.fund.FundApplication;
import com.lyh.fund.service.FundService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by lvyanghui
 * 2021/9/9 22:14
 */
@SpringBootTest(classes = FundApplication.class)
public class FundTest {

    @Autowired
    FundService fundService;

    @Test
    public void insert(){
        fundService.insertFund();
    }

    @Test
    public void getFund(){
        fundService.getFunds();
    }
}
