package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/23.
 */
public class ResendVerifyCodeRequest extends BaseRequest {
    private String username;

    @Override
    public String resourceName() {
        return "/api/resendverificationpin";
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
