package com.mr.merchant_provider.service.impl;

import com.mr.merchant_provider.mapper.MerchantMapper;
import com.mr.merchant_provider.service.MerchantService;
import com.mr.take_domain_out.domain.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("merser")
public class MarchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantMapper merchantMapper;

    @Override
    public int saveMerchant(Merchant mer) {
        mer.setMdate(new Date());
        return merchantMapper.saveMerchant(mer);
    }
}
