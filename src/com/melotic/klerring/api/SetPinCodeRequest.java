package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TokenEntity;

/**
 * Created by penghui on 15/9/10.
 */
public class SetPinCodeRequest extends BaseRequest{
    private String pinCode;
    private String confirmPinCode;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getConfirmPinCode() {
        return confirmPinCode;
    }

    public void setConfirmPinCode(String confirmPinCode) {
        this.confirmPinCode = confirmPinCode;
    }

    @Override
    public Class getResponseClass() {
        return TokenEntity.class;
    }

    @Override
    public String resourceName() {
        return "/api/resetpassword";
    }
}
