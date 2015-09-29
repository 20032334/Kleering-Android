package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TransactionEntity;

/**
 * Created by penghui on 15/9/23.
 */
public class GetPaymentsRequest extends BaseRequest {
    @Override
    public String resourceName() {
        return "/api/payments";
    }

    @Override
    public Class getResponseClass() {
        return TransactionEntity.class;
    }
}
