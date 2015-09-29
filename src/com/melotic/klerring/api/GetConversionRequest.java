package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TransactionEntity;

/**
 * Created by penghui on 15/9/24.
 */
public class GetConversionRequest extends BaseRequest{

    @Override
    public String resourceName() {
        return "/api/conversions";
    }

    @Override
    public Class getResponseClass() {
        return TransactionEntity.class;
    }
}
