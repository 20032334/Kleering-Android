package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.BankInfoEntity;

/**
 * Created by penghui on 15/9/24.
 */
public class GetBankInfoRequest extends BaseRequest{
    private String  bankAccount;

    @Override
    public String resourceName() {
        return "/api/cnybanklinkedaccounts/bankinfo/" + bankAccount;
    }

    @Override
    public Class getResponseClass() {
        return BankInfoEntity.class;
    }
}
