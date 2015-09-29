package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/23.
 * 验证手机号
 */
public class VerifyAccountRequest extends BaseRequest {
    private String username;
    private String pin;


    @Override
    public String resourceName() {
        return "/api/verifyaccount";
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }
}
