package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.LinkAccountEntity;

/**
 * Created by penghui on 15/9/23.
 */
public class GetlinkAccountRequest extends BaseRequest {
    @Override
    public String resourceName() {
        return "/api/linkedaccounts";
    }

    @Override
    public Class getResponseClass() {
        return LinkAccountEntity.class;
    }
}
