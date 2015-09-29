package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.CurrencyType;

/**
 * Created by penghui on 15/9/23.
 */
public class GetCurrencyType extends BaseRequest {
    @Override
    public String resourceName() {
        return "/api/linkedaccounts/types";
    }

    @Override
    public Class getResponseClass() {
        return CurrencyType.class;
    }
}
