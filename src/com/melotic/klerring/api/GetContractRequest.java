package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;

/**
 * Created by penghui on 15/9/23.
 */
public class GetContractRequest extends BaseRequest {

    @Override
    public String resourceName() {
        return "/api/contacts";
    }

    @Override
    public Class getResponseClass() {
        return null;
    }
}
