package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TokenEntity;

/**
 * Created by penghui on 15/9/10.
 * 添加联系人
 */
public class AddContractRequest extends BaseRequest{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String phoneCountryCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    @Override
    public Class getResponseClass() {
        return TokenEntity.class;
    }

    @Override
    public String resourceName() {
        return "/api/contacts";
    }
}
