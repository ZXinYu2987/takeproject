package com.mr.merchant_provider.controller;

import com.mr.merchant_provider.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MerchanController {


    @RequestMapping("toIndex")
    public String toIndex(){

        return "/index.html";
    }
    @RequestMapping("toMerchant")
    public String toMerchant(){

        return "/merchant_enter.html";
    }



}
