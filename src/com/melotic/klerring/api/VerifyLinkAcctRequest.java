package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/23.
 */
public class VerifyLinkAcctRequest extends BaseRequest {
    private String pin;
    private String accountId;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String resourceName() {
        return "/api/linkedaccounts/" + accountId + "/verify";
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }
}
