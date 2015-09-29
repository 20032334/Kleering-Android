package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/24.
 @property (nonatomic,strong) NSString *paymentId;
 @property (nonatomic,strong) NSString *fromCurrencyCode;
 @property (nonatomic,strong) NSString *exchangeRate;
 */
public class PayPaymentRequest extends BaseRequest {
    private String paymentId;
    private String fromCurrencyCode;
    private String pinCode;

    @Override
    public String resourceName() {
        return "/api/payments/"+ paymentId +"/payrequest";
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }

    public String getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
