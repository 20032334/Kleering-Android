package com.melotic.klerring.entity;

/**
 * Created by penghui on 15/9/23.
 @property (nonatomic,strong) NSString *modelId;
 @property (nonatomic,strong) NSString *CurrencyAccountId;
 @property (nonatomic,strong) NSString *LinkedAccountId;

 @property (nonatomic,strong) NSString *name;
 @property (nonatomic,strong) NSString *sign;
 @property (nonatomic,strong) NSString *code;

 @property (nonatomic,assign) double amount;
 @property (nonatomic,assign) double createdAt;

 @property (nonatomic,assign) NSInteger status;
 @property (nonatomic,assign) NSInteger type;//0:deposite 1:withdraw
 */
public class DepositWithDrawEntity {
    private String modelId;
    private String CurrencyAccountId;
    private String LinkedAccountId;

    private String name;
    private String sign;
    private String code;

    private double amount;
    private double createdAt;

    private int status;
    private int type;

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getCurrencyAccountId() {
        return CurrencyAccountId;
    }

    public void setCurrencyAccountId(String currencyAccountId) {
        CurrencyAccountId = currencyAccountId;
    }

    public String getLinkedAccountId() {
        return LinkedAccountId;
    }

    public void setLinkedAccountId(String linkedAccountId) {
        LinkedAccountId = linkedAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(double createdAt) {
        this.createdAt = createdAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
