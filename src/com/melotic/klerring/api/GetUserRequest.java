package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TokenEntity;

/**
 * Created by penghui on 15/9/10.
 * [NSString stringWithFormat:@"/api/profile/phone?phoneCountryCode=%@&phoneNumber=%@",_countryCode,_phoneNumber];
 */
public class GetUserRequest extends BaseRequest {
    private String countryCode;
    private String phoneNumber;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Class getResponseClass() {
        return TokenEntity.class;
    }

    @Override
    public String resourceName() {
        return "/api/profile/phone?phoneCountryCode=" + countryCode +"&phoneNumber=" + phoneNumber;
    }
}
