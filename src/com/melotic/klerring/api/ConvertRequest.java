package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/24.
 #define  Conversion_From_Sign @"conversion_from_sign"
 #define  Conversion_To_Sign @"conversion_to_sign"

 #define  Conversion_From_CurrencyId @"fromCurrencyCode"
 #define  Conversion_To_Currency_Id @"toCurrencyCode"

 #define  Conversion_From_Amount @"fromAmount"
 #define  Conversion_Really_From_Amount @"reallyfromAmount"

 #define  Conversion_To_Amount @"toAmount"
 #define  Conversion_Really_To_Amount @"reallyToAmount"

 #define  Conversion_From_Currency @"fromCurrency"
 #define  Conversion_To_Currency @"toCurrency"
 #define  Conversion_Exchange_Rate @"exchangeRate"
 */
public class ConvertRequest extends BaseRequest{
    private String fromCurrencyCode;
    private String toCurrencyCode;
    private Integer fromAmount;
    private Integer toAmount;
    private String exchangeRate;

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

    public Integer getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Integer fromAmount) {
        this.fromAmount = fromAmount;
    }

    public Integer getToAmount() {
        return toAmount;
    }

    public void setToAmount(Integer toAmount) {
        this.toAmount = toAmount;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String resourceName() {
        return "/api/convert";
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }
}
