package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TokenEntity;

/**
 * Created by penghui on 15/9/10.
 * 修改Pin码
 */
public class ResetPinRequest extends BaseRequest{
    private String pinCode;
    private String newPinCode;
    private String confirmNewPinCode;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getNewPinCode() {
        return newPinCode;
    }

    public void setNewPinCode(String newPinCode) {
        this.newPinCode = newPinCode;
    }

    public String getConfirmNewPinCode() {
        return confirmNewPinCode;
    }

    public void setConfirmNewPinCode(String confirmNewPinCode) {
        this.confirmNewPinCode = confirmNewPinCode;
    }

    @Override
    public Class getResponseClass() {
        return TokenEntity.class;
    }

    @Override
    public String resourceName() {
        return "/api/modifypincode";
    }
}
