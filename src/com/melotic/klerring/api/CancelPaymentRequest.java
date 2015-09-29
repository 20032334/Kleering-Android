package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/24.
 */
public class CancelPaymentRequest extends BaseRequest{
    private  String paymentId;

    @Override
    public String resourceName() {
        return "/api/payments/"+ paymentId +"/cancel";
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }
}
