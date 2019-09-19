package com.mr.merchant_provider.mapper;

import com.mr.take_domain_out.domain.Merchant;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MerchantMapper {

    //商家入驻
    int saveMerchant(Merchant mer);
}
