package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/23.
 */
public class RegisterTokenRequest extends BaseRequest {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String resourceName() {
        return "/api/zeropush/registerapn";
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }
}
