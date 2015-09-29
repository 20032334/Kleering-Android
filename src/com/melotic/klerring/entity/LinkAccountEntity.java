package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * Created by penghui on 15/9/23.
 *
 @property (nonatomic,strong) NSString *currencyAccountId;
 @property (nonatomic,strong) NSString *accountIdentifier;
 @property (nonatomic,strong) NSString *accountNickname;
 @property (nonatomic,strong) NSString *linkAccountId;
 @property (nonatomic,strong) NSString *linkedAccountDataId;
 @property (nonatomic,assign) NSInteger canDeposit;
 @property (nonatomic,assign) NSInteger canWithdraw;
 @property (nonatomic,assign) double createdAt;
 @property (nonatomic,assign) NSInteger linkedAccountType;
 @property (nonatomic,assign) NSInteger status;

 @property (nonatomic,strong) NSString *field1;
 @property (nonatomic,strong) NSString *field2;
 @property (nonatomic,strong) NSString *field3;

 @property (nonatomic,strong) NSString *field4;
 @property (nonatomic,strong) NSString *field5;
 */
public class LinkAccountEntity extends BaseEntity {
    private String currencyAccountId;
    private String accountIdentifier;
    private String accountNickname;
    private String linkAccountId;
    private String linkedAccountDataId;
    private int canDeposit;
    private int canWithdraw;
    private double createdAt;
    private String linkedAccountType;
    private int status;

    private String field1;
    private String field2;
    private String field3;

    private String field4;
    private String field5;

    public String getCurrencyAccountId() {
        return currencyAccountId;
    }

    public void setCurrencyAccountId(String currencyAccountId) {
        this.currencyAccountId = currencyAccountId;
    }

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public String getAccountNickname() {
        return accountNickname;
    }

    public void setAccountNickname(String accountNickname) {
        this.accountNickname = accountNickname;
    }

    public String getLinkAccountId() {
        return linkAccountId;
    }

    public void setLinkAccountId(String linkAccountId) {
        this.linkAccountId = linkAccountId;
    }

    public String getLinkedAccountDataId() {
        return linkedAccountDataId;
    }

    public void setLinkedAccountDataId(String linkedAccountDataId) {
        this.linkedAccountDataId = linkedAccountDataId;
    }

    public int getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(int canDeposit) {
        this.canDeposit = canDeposit;
    }

    public int getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(int canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public double getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(double createdAt) {
        this.createdAt = createdAt;
    }

    public String getLinkedAccountType() {
        return linkedAccountType;
    }

    public void setLinkedAccountType(String linkedAccountType) {
        this.linkedAccountType = linkedAccountType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }
}
