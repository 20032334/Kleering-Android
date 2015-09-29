package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * Created by penghui on 15/9/11.
 */
public class BankAccountEntity extends BaseEntity {
    private String id;
    private double numLinkedAccounts;
    private double balance;
    private double lockedBalance;
    private CurrencyEntity currency;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getNumLinkedAccounts() {
        return numLinkedAccounts;
    }

    public void setNumLinkedAccounts(double numLinkedAccounts) {
        this.numLinkedAccounts = numLinkedAccounts;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLockedBalance() {
        return lockedBalance;
    }

    public void setLockedBalance(double lockedBalance) {
        this.lockedBalance = lockedBalance;
    }

    public CurrencyEntity getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEntity currency) {
        this.currency = currency;
    }
}
