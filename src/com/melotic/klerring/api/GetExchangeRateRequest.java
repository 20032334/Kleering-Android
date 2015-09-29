package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.ExchangeRateEntity;

/**
 * Created by penghui on 15/9/24.
 exchangeRate = "5.118102";
 fromCurrencyCode = CNY;
 toCurrencyCode = TWD;
 */
public class GetExchangeRateRequest extends BaseRequest{
    private String fCode;
    private String tCode;

    @Override
    public String resourceName() {
        return "/api/conversions/rate/%@/%@";
    }

    @Override
    public Class getResponseClass() {
        return ExchangeRateEntity.class;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode;
    }
}
