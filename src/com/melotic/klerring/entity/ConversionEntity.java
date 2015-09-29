package com.melotic.klerring.entity;

/**
 * Created by penghui on 15/9/24.
 @property (nonatomic,strong) NSString *conversionId;
 @property (nonatomic,assign) double fromAmount;
 @property (nonatomic,assign) double toAmount;
 @property (nonatomic,strong) NSString *exchangeRate;
 @property (nonatomic,assign) long createdAt;
 @property (nonatomic,assign) long updatedAt;
 */
public class ConversionEntity {
    private String conversionId;
    private Double fromAmount;
    private Double toAmount;
    private String exchangeRate;
    private Long createdAt;

    public String getConversionId() {
        return conversionId;
    }

    public void setConversionId(String conversionId) {
        this.conversionId = conversionId;
    }

    public Double getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Double fromAmount) {
        this.fromAmount = fromAmount;
    }

    public Double getToAmount() {
        return toAmount;
    }

    public void setToAmount(Double toAmount) {
        this.toAmount = toAmount;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
}
