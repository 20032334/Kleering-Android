package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TransactionEntity;

/**
 * Created by penghui on 15/9/24.
 */
public class GetPaymentInfoRequest extends BaseRequest {
    private String paymentId;
    @Override
    public String resourceName() {
        return "/api/payments/" + paymentId;
    }

    @Override
    public Class getResponseClass() {
        return TransactionEntity.class;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
