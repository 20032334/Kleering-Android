package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;

/**
 * Created by penghui on 15/9/24.
 */
public class SendReqRequest extends BaseRequest{

    @Override
    public String resourceName() {
        return "/api/payments/request";
    }

    @Override
    public Class getResponseClass() {
        return BaseRequest.class;
    }
}
