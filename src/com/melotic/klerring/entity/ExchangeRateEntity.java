package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * Created by penghui on 15/9/24.
 exchangeRate = "5.118102";
 fromCurrencyCode = CNY;
 toCurrencyCode = TWD;
 */
public class ExchangeRateEntity extends BaseEntity{
    private String exchangeRate;
    private String fromCurrencyCode;
    private String toCurrencyCode;

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public String getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(String toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }
}
