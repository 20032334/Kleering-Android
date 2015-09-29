package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/23.
 */
public class PostDepositRequest extends BaseRequest {
    private String currencyAccountId;
    private String linkedAccountId;

    @Override
    public String resourceName() {
        return "/api/deposits";
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }

    public String getCurrencyAccountId() {
        return currencyAccountId;
    }

    public void setCurrencyAccountId(String currencyAccountId) {
        this.currencyAccountId = currencyAccountId;
    }

    public String getLinkedAccountId() {
        return linkedAccountId;
    }

    public void setLinkedAccountId(String linkedAccountId) {
        this.linkedAccountId = linkedAccountId;
    }
}
