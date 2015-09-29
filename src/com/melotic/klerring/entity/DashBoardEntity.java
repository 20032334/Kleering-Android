package com.melotic.klerring.entity;

/**
 * Created by penghui on 15/9/11.
 */
import com.melotic.klerring.base.BaseEntity;

import java.util.List;

public class DashBoardEntity extends BaseEntity{
    private List<BankAccountEntity> currencyAccounts;

    public List<BankAccountEntity> getCurrencyAccounts() {
        return currencyAccounts;
    }

    public void setCurrencyAccounts(List<BankAccountEntity> currencyAccounts) {
        this.currencyAccounts = currencyAccounts;
    }
}
