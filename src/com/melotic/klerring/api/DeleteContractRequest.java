package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TokenEntity;

/**
 * Created by penghui on 15/9/10.
 */
public class DeleteContractRequest extends BaseRequest{
    private String contractId;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    @Override
    public Class getResponseClass() {
        return TokenEntity.class;
    }

    @Override
    public String resourceName() {
        return "/api/contacts/"+contractId;
    }
}
