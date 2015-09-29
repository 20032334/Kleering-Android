package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * Created by penghui on 15/9/23.
 @property (nonatomic,strong) NSString *transactionId;//交易ID

 @property (nonatomic,strong) NSString *fromCurrencyId;//从什么币种
 @property (nonatomic,strong) NSString *fromCurrencyCode;//从什么币种
 @property (nonatomic,strong) NSString *fromCurrencyName;//从什么币种
 @property (nonatomic,strong) NSString *fromCurrencySign;//从什么币种

 @property (nonatomic,strong) NSString *toCurrencyId;//从什么币种
 @property (nonatomic,strong) NSString *toCurrencyCode;//从什么币种
 @property (nonatomic,strong) NSString *toCurrencyName;//从什么币种
 @property (nonatomic,strong) NSString *toCurrencySign;//从什么币种

 @property (nonatomic,strong) NSString *payerId;//付款人ID
 @property (nonatomic,strong) NSString *payerEmail;
 @property (nonatomic,strong) NSString *payerFirstName;
 @property (nonatomic,strong) NSString *payerLastName;
 @property (nonatomic,strong) NSString *payerPhone;
 @property (nonatomic,strong) NSString *payerAvtarURL;

 @property (nonatomic,strong) NSString *payeeId;
 @property (nonatomic,strong) NSString *payeeEmail;//收款人ID
 @property (nonatomic,strong) NSString *payeeFirstName;
 @property (nonatomic,strong) NSString *payeeLastName;
 @property (nonatomic,strong) NSString *payeePhone;
 @property (nonatomic,strong) NSString *payeeAvtarURL;

 @property (nonatomic,assign) double fromAcmount;//从什么金额
 @property (nonatomic,assign) double toAmount;//到什么金额

 @property (nonatomic,strong) NSString *paymentType;//交易类型
 @property (nonatomic,strong) NSString *status;//交易状态

 @property (nonatomic,strong) NSString *exchangeRate;//汇率

 @property (nonatomic,strong) NSString *payeeNote;//
 @property (nonatomic,strong) NSString *payerNote;//

 @property (nonatomic,assign) long long createdAt;

 @property (nonatomic,strong) NSString *ConversionId;
 @property (nonatomic,assign) BOOL hasConversion;

 @property (nonatomic,strong) NSString *updatedAt;
 @property (nonatomic,strong) NSString *rejectedAt;
 @property (nonatomic,strong) NSString *cancelledAt;
 @property (nonatomic,strong) NSString *completedAt;
 */
public class TransactionEntity extends BaseEntity {
    private String transactionId;

    private String fromCurrencyId;
    private String fromCurrencyCode;
    private String fromCurrencyName;
    private String fromCurrencySign;

    private String toCurrencyId;
    private String toCurrencyCode;
    private String toCurrencyName;
    private String toCurrencySign;

    private String payerId;
    private String payerEmail;
    private String payerFirstName;
    private String payerLastName;
    private String payerPhone;
    private String payerAvtarURL;

    private String payeeId;
    private String payeeEmail;
    private String payeeFirstName;
    private String payeeLastName;
    private String payeePhone;
    private String payeeAvtarURL;

    private double fromAcmount;
    private double toAmount;

    private String paymentType;
    private String status;

    private String exchangeRate;
    private String payeeNote;
    private String payerNote;

    private double createdAt;
    private String ConversionId;
    private boolean hasConversion;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getFromCurrencyId() {
        return fromCurrencyId;
    }

    public void setFromCurrencyId(String fromCurrencyId) {
        this.fromCurrencyId = fromCurrencyId;
    }

    public String getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public String getFromCurrencyName() {
        return fromCurrencyName;
    }

    public void setFromCurrencyName(String fromCurrencyName) {
        this.fromCurrencyName = fromCurrencyName;
    }

    public String getFromCurrencySign() {
        return fromCurrencySign;
    }

    public void setFromCurrencySign(String fromCurrencySign) {
        this.fromCurrencySign = fromCurrencySign;
    }

    public String getToCurrencyId() {
        return toCurrencyId;
    }

    public void setToCurrencyId(String toCurrencyId) {
        this.toCurrencyId = toCurrencyId;
    }

    public String getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(String toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }

    public String getToCurrencyName() {
        return toCurrencyName;
    }

    public void setToCurrencyName(String toCurrencyName) {
        this.toCurrencyName = toCurrencyName;
    }

    public String getToCurrencySign() {
        return toCurrencySign;
    }

    public void setToCurrencySign(String toCurrencySign) {
        this.toCurrencySign = toCurrencySign;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayerEmail() {
        return payerEmail;
    }

    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail;
    }

    public String getPayerFirstName() {
        return payerFirstName;
    }

    public void setPayerFirstName(String payerFirstName) {
        this.payerFirstName = payerFirstName;
    }

    public String getPayerLastName() {
        return payerLastName;
    }

    public void setPayerLastName(String payerLastName) {
        this.payerLastName = payerLastName;
    }

    public String getPayerPhone() {
        return payerPhone;
    }

    public void setPayerPhone(String payerPhone) {
        this.payerPhone = payerPhone;
    }

    public String getPayerAvtarURL() {
        return payerAvtarURL;
    }

    public void setPayerAvtarURL(String payerAvtarURL) {
        this.payerAvtarURL = payerAvtarURL;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getPayeeEmail() {
        return payeeEmail;
    }

    public void setPayeeEmail(String payeeEmail) {
        this.payeeEmail = payeeEmail;
    }

    public String getPayeeFirstName() {
        return payeeFirstName;
    }

    public void setPayeeFirstName(String payeeFirstName) {
        this.payeeFirstName = payeeFirstName;
    }

    public String getPayeeLastName() {
        return payeeLastName;
    }

    public void setPayeeLastName(String payeeLastName) {
        this.payeeLastName = payeeLastName;
    }

    public String getPayeePhone() {
        return payeePhone;
    }

    public void setPayeePhone(String payeePhone) {
        this.payeePhone = payeePhone;
    }

    public String getPayeeAvtarURL() {
        return payeeAvtarURL;
    }

    public void setPayeeAvtarURL(String payeeAvtarURL) {
        this.payeeAvtarURL = payeeAvtarURL;
    }

    public double getFromAcmount() {
        return fromAcmount;
    }

    public void setFromAcmount(double fromAcmount) {
        this.fromAcmount = fromAcmount;
    }

    public double getToAmount() {
        return toAmount;
    }

    public void setToAmount(double toAmount) {
        this.toAmount = toAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getPayeeNote() {
        return payeeNote;
    }

    public void setPayeeNote(String payeeNote) {
        this.payeeNote = payeeNote;
    }

    public String getPayerNote() {
        return payerNote;
    }

    public void setPayerNote(String payerNote) {
        this.payerNote = payerNote;
    }

    public double getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(double createdAt) {
        this.createdAt = createdAt;
    }

    public String getConversionId() {
        return ConversionId;
    }

    public void setConversionId(String conversionId) {
        ConversionId = conversionId;
    }

    public boolean isHasConversion() {
        return hasConversion;
    }

    public void setHasConversion(boolean hasConversion) {
        this.hasConversion = hasConversion;
    }
}
