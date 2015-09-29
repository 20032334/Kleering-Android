package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * Created by penghui on 15/9/24.
 currency =     {
 code = TWD;
 name = "New Taiwan Dollar";
 sign = "NT$";
 };
 depositLink = "http://mp.weixin.qq.com/s?__biz=MzIyMjAwMTc2Nw==&mid=208256069&idx=1&sn=89351ed8193cd98849b98edd655b0263&scene=0#rd";
 linkedAccountType = 1;
 name = "Taiwan Dollar Bank Account";
 */
public class SiteEntity extends BaseEntity{
    private String depositLink;
    private String linkedAccountType;
    private String name;
    private CurrencyEntity currency;

    public String getDepositLink() {
        return depositLink;
    }

    public void setDepositLink(String depositLink) {
        this.depositLink = depositLink;
    }

    public String getLinkedAccountType() {
        return linkedAccountType;
    }

    public void setLinkedAccountType(String linkedAccountType) {
        this.linkedAccountType = linkedAccountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CurrencyEntity getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEntity currency) {
        this.currency = currency;
    }
}
