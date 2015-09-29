package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.BankAccountEntity;
import com.melotic.klerring.entity.DashBoardEntity;
import com.melotic.klerring.entity.TokenEntity;

/**
 * Created by penghui on 15/9/11.
 */
public class DashboardRequest extends BaseRequest {
    @Override
    public Class getResponseClass() {
        return DashBoardEntity.class;
    }

    @Override
    public String resourceName() {
        return "/api/dashboard";
    }
}
