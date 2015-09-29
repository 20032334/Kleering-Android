package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * Created by penghui on 15/9/23.
 @property (nonatomic,strong) NSString *currencyCode;
 @property (nonatomic,strong) NSString *linkedAccountType;

 @property (nonatomic,assign) NSInteger currencyTypeId;
 @property (nonatomic,assign) NSInteger CurrencyId;

 @property (nonatomic,strong) NSString *name;
 @property (nonatomic,strong) NSString *displayedName;
 @property (nonatomic,strong) NSString *icon;

 @property (nonatomic,strong) NSString *primaryIdentifierType;
 @property (nonatomic,strong) NSString *primaryIdentifierPrompt;

 @property (nonatomic,strong) NSString *secondIdentifierType;
 @property (nonatomic,strong) NSString *secondIdentifierPrompt;

 @property (nonatomic,strong) NSString *thirdIdentifierType;
 @property (nonatomic,strong) NSString *thirdIdentifierPrompt;

 @property (nonatomic,strong) NSString *fourthIdentifierType;
 @property (nonatomic,strong) NSString *fourthIdentifierPrompt;

 @property (nonatomic,strong) NSString *organizationAddressType;
 @property (nonatomic,strong) NSString *organizationAddressPrompt;

 @property (nonatomic,strong) NSString *fifthIdentifierType;
 @property (nonatomic,strong) NSString *fifthIdentifierPrompt;

 @property (nonatomic,strong) NSString *createdAt;
 @property (nonatomic,strong) NSString *updatedAt;
 */
public class CurrencyType extends BaseEntity {
    private String currencyCode;
    private String linkedAccountType;
    private String currencyTypeId;
    private String CurrencyId;
    private String name;
    private String displayedName;
    private String icon;

    private String primaryIdentifierType;
    private String primaryIdentifierPrompt;

    private String secondIdentifierType;
    private String secondIdentifierPrompt;

    private String thirdIdentifierType;
    private String thirdIdentifierPrompt;

    private String fourthIdentifierType;
    private String fourthIdentifierPrompt;

    private String organizationAddressType;
    private String organizationAddressPrompt;

    private String fifthIdentifierType;
    private String fifthIdentifierPrompt;

    private String createdAt;
    private String updatedAt;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getLinkedAccountType() {
        return linkedAccountType;
    }

    public void setLinkedAccountType(String linkedAccountType) {
        this.linkedAccountType = linkedAccountType;
    }

    public String getCurrencyTypeId() {
        return currencyTypeId;
    }

    public void setCurrencyTypeId(String currencyTypeId) {
        this.currencyTypeId = currencyTypeId;
    }

    public String getCurrencyId() {
        return CurrencyId;
    }

    public void setCurrencyId(String currencyId) {
        CurrencyId = currencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayedName() {
        return displayedName;
    }

    public void setDisplayedName(String displayedName) {
        this.displayedName = displayedName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPrimaryIdentifierType() {
        return primaryIdentifierType;
    }

    public void setPrimaryIdentifierType(String primaryIdentifierType) {
        this.primaryIdentifierType = primaryIdentifierType;
    }

    public String getPrimaryIdentifierPrompt() {
        return primaryIdentifierPrompt;
    }

    public void setPrimaryIdentifierPrompt(String primaryIdentifierPrompt) {
        this.primaryIdentifierPrompt = primaryIdentifierPrompt;
    }

    public String getSecondIdentifierType() {
        return secondIdentifierType;
    }

    public void setSecondIdentifierType(String secondIdentifierType) {
        this.secondIdentifierType = secondIdentifierType;
    }

    public String getSecondIdentifierPrompt() {
        return secondIdentifierPrompt;
    }

    public void setSecondIdentifierPrompt(String secondIdentifierPrompt) {
        this.secondIdentifierPrompt = secondIdentifierPrompt;
    }

    public String getThirdIdentifierType() {
        return thirdIdentifierType;
    }

    public void setThirdIdentifierType(String thirdIdentifierType) {
        this.thirdIdentifierType = thirdIdentifierType;
    }

    public String getThirdIdentifierPrompt() {
        return thirdIdentifierPrompt;
    }

    public void setThirdIdentifierPrompt(String thirdIdentifierPrompt) {
        this.thirdIdentifierPrompt = thirdIdentifierPrompt;
    }

    public String getFourthIdentifierType() {
        return fourthIdentifierType;
    }

    public void setFourthIdentifierType(String fourthIdentifierType) {
        this.fourthIdentifierType = fourthIdentifierType;
    }

    public String getFourthIdentifierPrompt() {
        return fourthIdentifierPrompt;
    }

    public void setFourthIdentifierPrompt(String fourthIdentifierPrompt) {
        this.fourthIdentifierPrompt = fourthIdentifierPrompt;
    }

    public String getOrganizationAddressType() {
        return organizationAddressType;
    }

    public void setOrganizationAddressType(String organizationAddressType) {
        this.organizationAddressType = organizationAddressType;
    }

    public String getOrganizationAddressPrompt() {
        return organizationAddressPrompt;
    }

    public void setOrganizationAddressPrompt(String organizationAddressPrompt) {
        this.organizationAddressPrompt = organizationAddressPrompt;
    }

    public String getFifthIdentifierType() {
        return fifthIdentifierType;
    }

    public void setFifthIdentifierType(String fifthIdentifierType) {
        this.fifthIdentifierType = fifthIdentifierType;
    }

    public String getFifthIdentifierPrompt() {
        return fifthIdentifierPrompt;
    }

    public void setFifthIdentifierPrompt(String fifthIdentifierPrompt) {
        this.fifthIdentifierPrompt = fifthIdentifierPrompt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
