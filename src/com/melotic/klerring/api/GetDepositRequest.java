package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.DepositWithDrawEntity;

/**
 * Created by penghui on 15/9/23.
 */
public class GetDepositRequest extends BaseRequest {
    @Override
    public String resourceName() {
        return "/api/deposits";
    }

    @Override
    public Class getResponseClass() {
        return DepositWithDrawEntity.class;
    }
}
